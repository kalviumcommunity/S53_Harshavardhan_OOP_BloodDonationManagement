import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList of donors
        List<Donor> donors = new ArrayList<>();
        Hospital hospital = new Hospital("City Hospital", "123 Main Street", "555-1234");


        donors.add(new Donor("John Doe",BloodType.A_POSITIVE, "1234567890"));
        donors.add(new Donor("Jane Smith", BloodType.B_NEGATIVE, "9876543210"));

        for (Donor donor : donors) {
            System.out.println("Name: " + donor.getName());
            System.out.println("Blood Type: " + donor.getBloodType());
            System.out.println("Contact Info: " + donor.getContactInfo());
            System.out.println(donor.getTotalDonations());
            System.out.println("VS");

            donor.getDetails();
        }

        
        System.out.println("Hospital Name: " + hospital.getName());
        BloodRequest request = new BloodRequest(hospital, BloodType.A_POSITIVE , 2);
        hospital.addBloodRequest(request);
        System.out.println(hospital.totalBloodRequests());


        
        // Simulate a donation
        // donor.donateBlood(BloodType.A_POSITIVE, 2);
        // hospital.receiveBlood(BloodType.A_POSITIVE, 2);
    }
}