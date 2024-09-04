
import  java.time.LocalDate;



public class Donation {
    private BloodUnit bloodUnit;
    private LocalDate donationDate;

    public Donation(BloodUnit bloodUnit) {
        this.bloodUnit = bloodUnit;
        this.donationDate = LocalDate.now();
    }

    public BloodUnit getBloodUnit() {
        return bloodUnit;
    }

    public LocalDate getDonationDate() {
        return donationDate;
    }
}
