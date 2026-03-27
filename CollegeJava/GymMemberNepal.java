import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class GymMember {

    // Attributes
    private String memberName;
    private String membershipType;   // Monthly, Quarterly, Yearly
    private double monthlyFee;
    private LocalDate joinDate;

    // Constructor
    public GymMember(String memberName, String membershipType, double monthlyFee, LocalDate joinDate) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.monthlyFee = monthlyFee;
        this.joinDate = joinDate;
    }

    // Method: calculateAnnualFee()
    public double calculateAnnualFee() {
        double yearly = monthlyFee * 12;
        double vat = yearly * 0.13; // 13% Nepali VAT
        return yearly + vat;
    }

    // Method: getDiscountedFee()
    public double getDiscountedFee(double discountPercent) {
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }

    // Method: isEligibleForDiscount()
    public boolean isEligibleForDiscount() {
        long months = ChronoUnit.MONTHS.between(joinDate, LocalDate.now());
        return months > 6;
    }

    // Method: displayMemberInfo()
    public void displayMemberInfo() {
        System.out.println("----- Fitness Nepal, Dharan -----");
        System.out.println("सदस्यको नाम: " + memberName);
        System.out.println("Membership प्रकार: " + membershipType);
        System.out.println("Monthly शुल्क: Rs. " + monthlyFee);
        System.out.println("Join Date: " + joinDate);
        System.out.println("वार्षिक शुल्क (VAT सहित): Rs. " + calculateAnnualFee());
        System.out.println("६ महिनाभन्दा बढी सदस्य? " + (isEligibleForDiscount() ? "हो" : "होइन"));
        System.out.println("-----------------------------------");
    }
}
public class GymMemberNepal {

    public static void main(String[] args) {

        // Basic member (Rs. 1500)
        GymMember m1 = new GymMember(
                "Anamika Limbu",
                "Monthly",
                1500,
                LocalDate.of(2024, 1, 10)
        );

        // Premium member (Rs. 2500)
        GymMember m2 = new GymMember(
                "Bikash Rai",
                "Quarterly",
                2500,
                LocalDate.of(2024, 9, 1)
        );

        // VIP member (Rs. 4000)
        GymMember m3 = new GymMember(
                "Sita Gurung",
                "Yearly",
                4000,
                LocalDate.of(2023, 5, 15)
        );

        // Display info
        m1.displayMemberInfo();
        m2.displayMemberInfo();
        m3.displayMemberInfo();

        // Test discounted fee
        System.out.println("Discounted Fee for Students (10%): Rs. " + m1.getDiscountedFee(10));
    }
}

