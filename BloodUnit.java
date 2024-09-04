

import java.time.LocalDate;



public class BloodUnit {
    private BloodType bloodType;
    private int quantity;
    private LocalDate expirationDate;

    public BloodUnit(BloodType bloodType, int quantity, LocalDate expirationDate) {
        this.bloodType = bloodType;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
