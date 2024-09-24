import java.util.ArrayList;
import java.util.List;

public class Donor {
    private String name;
    private BloodType bloodType;
    private String contactInfo;
    private ArrayList<Donation> donations;

    public Donor(String name, BloodType bloodType, String contactInfo) {
        this.name = name;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
        this.donations = new ArrayList<>();
        this.donations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void addDonation(Donation donation) {
        donations.add(donation);
    }
}


