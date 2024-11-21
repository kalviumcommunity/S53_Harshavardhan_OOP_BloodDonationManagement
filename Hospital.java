import java.util.ArrayList;

public class Hospital extends Person{
    private String location;
    private ArrayList<BloodRequest> bloodRequests;
    private static int totalBloodRequests = 0;
    
    public Hospital(String name, String location, String contactInfo) {
        super(name, contactInfo);
        this.location = location;
        this.bloodRequests = new ArrayList<>();
    }

    
    @Override
    public String getDetails() {
        return "Hospital: " + super.getName() + ", Location: " + location;
    }


    public String getName() {
        return super.getName();
    }

    public String getLocation() {
        return location;
    }

    public String getContactInfo() {
        return super.getContactInfo();
    }

    // New setter method for contactInfo
    public void setContactInfo(String contactInfo) {
        super.setContactInfo(contactInfo);
    }

    public int totalBloodRequests(){
        return totalBloodRequests;
    }

    public ArrayList<BloodRequest> getBloodRequests() {
        return bloodRequests;
    }

    public static void increamentTotalDonations(){
        totalBloodRequests++;
    }

    public void addBloodRequest(BloodRequest bloodRequest) {
        bloodRequests.add(bloodRequest);
        increamentTotalDonations();
    }
}
