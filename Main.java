import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList of donors
        List<Donor> donors = new ArrayList<>();

        donors.add(new Donor("John Doe", "A+", "1234567890"));
        donors.add(new Donor("Jane Smith", "B-", "9876543210"));

        for (Donor donor : donors) {
            System.out.println("Name: " + donor.getName());
            System.out.println("Blood Type: " + donor.getBloodType());
            System.out.println("Contact Info: " + donor.getContactInfo());
            System.out.println();
        }
    }
}