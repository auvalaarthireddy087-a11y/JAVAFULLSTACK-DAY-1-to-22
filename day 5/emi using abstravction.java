import java.time.Year;
abstract class EMIPurchase {
    protected double itemCost;
    protected int tenureMonths;
    protected int targetYear;
    public EMIPurchase(double itemCost, int tenureMonths, int targetYear) {
        this.itemCost = itemCost;
        this.tenureMonths = tenureMonths;
        this.targetYear = targetYear;
    }
    public void executeBillingAudit() {
        boolean isLeap = Year.isLeap(this.targetYear);
        double emiAmount = calculateMonthlyEMI();
        double totalPayout = emiAmount * tenureMonths;
        double dynamicInterestCost = totalPayout - itemCost;
        System.out.println("ASSET ACQUISITION BILLING LOG: " + this.targetYear);
        System.out.printf("Base Sticker Cost     : ₹%,.2f\n", itemCost);
        System.out.printf("Selected Duration     : %d Months\n", tenureMonths);
        System.out.printf("Calculated Monthly EMI: ₹%,.2f / month\n", emiAmount);
        System.out.printf("Total Financing Payout: ₹%,.2f\n", totalPayout);
        System.out.printf("Net Interest Premium  : ₹%,.2f\n", dynamicInterestCost);
        if (isLeap) {
            System.out.println("SYSTEM STATUS: Leap Year Checked -> [TRUE]");
            System.out.println("BILLING TRIGGER: Invoice forced to 29th of February.");
        } else {
            System.out.println("SYSTEM STATUS: Leap Year Checked -> [FALSE]");
            System.out.println("BILLING TRIGGER: Standard end-of-month (28th) processing applied.");
        }
    }
    public abstract double calculateMonthlyEMI();
}
class StandardFinancedEMI extends EMIPurchase {
    private double annualInterestRate;
    public StandardFinancedEMI(double itemCost, int tenureMonths, int targetYear, double annualInterestRate) {
        super(itemCost, tenureMonths, targetYear);
        this.annualInterestRate = annualInterestRate;
    }
    @Override
    public double calculateMonthlyEMI() {
        double monthlyRate = this.annualInterestRate / 12;
        return (itemCost * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) 
                / (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }
}
class NoCostEMI extends EMIPurchase {
    public NoCostEMI(double itemCost, int tenureMonths, int targetYear) {
        super(itemCost, tenureMonths, targetYear);
    }
    @Override
    public double calculateMonthlyEMI() {
        return itemCost / tenureMonths;
    }
}
public class Main {
    public static void main(String[] args) {
        double acPrice = 65000.0;
        int chosenTenure = 24;
        System.out.println(">>> RUNNING SCENARIO A: STANDARD FINANCE (NON-LEAP YEAR)");
        EMIPurchase standardAccount = new StandardFinancedEMI(acPrice, chosenTenure, 2026, 0.14);
        standardAccount.executeBillingAudit();
        System.out.println(">>> RUNNING SCENARIO B: NO-COST PROMO (LEAP YEAR RUNNER)");
        EMIPurchase promoAccount = new NoCostEMI(acPrice, chosenTenure, 2028);
        promoAccount.executeBillingAudit();
    }
}