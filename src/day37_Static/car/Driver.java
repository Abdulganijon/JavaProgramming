package day37_Static.car;

public class Driver {
    String name;
    long licenceNumber;
    char licenseType;

    public Driver(String name, long licenceNumber, char licenseType){
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenseType = licenseType;
    }

    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenseType=" + licenseType +
                '}';
    }
}
