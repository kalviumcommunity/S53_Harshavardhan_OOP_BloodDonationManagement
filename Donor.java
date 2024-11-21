import java.util.ArrayList;
import java.util.List;

public class Donor extends Person{
    private BloodType bloodType;
    private ArrayList<Donation> donations;
    private static int totalDonations = 0;
    

    public Donor(String name, BloodType bloodType, String contactInfo) {
        super(name, contactInfo);
        this.bloodType = bloodType;
        this.donations = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return "Donor: " + super.getName() + ", Blood Type: " + bloodType;
    }

    public String getName() {
        return super.getName();
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public String getContactInfo() {
        return super.getContactInfo();
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public int getTotalDonations(){
        return totalDonations;
    }
    // New setter method for contactInfo
    public void setContactInfo(String contactInfo) {
        super.setContactInfo(contactInfo);
    }


    public void addDonation(Donation donation) {
        donations.add(donation);
        totalDonations++;
    }
}


