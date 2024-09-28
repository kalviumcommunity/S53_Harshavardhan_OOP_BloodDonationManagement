
public class BloodRequest {
    private Hospital hospital;
    private BloodType bloodType;
    private int quantity;

    public BloodRequest(Hospital hospital, BloodType bloodType, int quantity) {
        this.hospital = hospital;
        this.bloodType = bloodType;
        this.quantity = quantity;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public int getQuantity() {
        return quantity;
    }
}
