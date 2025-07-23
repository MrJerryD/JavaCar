package entity;

public class Cars {

    private int countOfSeats;
    private int costForRent;
    private boolean free;
    private TransmissionType transmissionType;

    public Cars(int countOfSeats, int costForRent, boolean free, TransmissionType transmissionType) {
        this.countOfSeats = countOfSeats;
        this.costForRent = costForRent;
        this.free = free;
        this.transmissionType = transmissionType;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public int getCostForRent() {
        return costForRent;
    }

    public void setCostForRent(int costForRent) {
        this.costForRent = costForRent;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}
