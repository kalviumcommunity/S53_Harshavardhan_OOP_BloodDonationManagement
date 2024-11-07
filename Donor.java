import java.util.ArrayList;
import java.util.List;

public class Donor {
    private String name;
    private BloodType bloodType;
    private String contactInfo;
    private ArrayList<Donation> donations;
    private static int totalDonations = 0;
    

    public Donor(String name, BloodType bloodType, String contactInfo) {
        this.name = name;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
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

    public int getTotalDonations(){
        return totalDonations;
    }
    // New setter method for contactInfo
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }


    public void addDonation(Donation donation) {
        donations.add(donation);
        totalDonations++;
    }
}


