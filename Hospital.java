import java.util.ArrayList;

public class Hospital {
    private String name;
    private String location;
    private String contactInfo;
    private ArrayList<BloodRequest> bloodRequests;
    private static int totalBloodRequests = 0;
    
    public Hospital(String name, String location, String contactInfo) {
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;
        this.bloodRequests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // New setter method for contactInfo
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
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
