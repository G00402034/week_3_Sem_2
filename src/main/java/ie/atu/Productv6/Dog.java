package ie.atu.Productv6;

public class Dog extends Animal{

    private String vaccination;
    private String shedding;
    private String neuttered;

    public Dog() {
        super();
        vaccination = "";
        shedding = "";
        neuttered = "";
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeuttered() {
        return neuttered;
    }

    public void setNeuttered(String neuttered) {
        this.neuttered = neuttered;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccination='" + vaccination + '\'' +
                ", shedding='" + shedding + '\'' +
                ", neuttered='" + neuttered + '\'' +
                '}';
    }
}
