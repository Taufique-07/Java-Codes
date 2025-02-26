
class Employee${
    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;

    public Employee$ (String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo) {
        this.name = name;
        this.addressInfo = addressInfo;
        this.insuranceInfo = insuranceInfo;
    }

    public void showInfo () {
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+this.addressInfo.street + " " + this.addressInfo.state + this.addressInfo.city + " " + this.addressInfo.postalCode + " " );
    }

}

class InsuranceInfo {
    String policyName;
    int policyID;

    public InsuranceInfo(String policyName, int policyID) {
        this.policyName = policyName;
        this.policyID = policyID;
    }
}

class AddressInfo {
    String street;
    String city;
    String state;
    String postalCode;

    public AddressInfo (String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
}

public class Lab6_Practice {
    public static void main(String[] args) {
        AddressInfo addressInfo = new AddressInfo("DIU Street","Dhaka","Bangladesh","5463");
        InsuranceInfo insuranceInfo = new InsuranceInfo("Life",546);
        Employee$ employee$ = new Employee$("Dhaka",addressInfo,insuranceInfo);
        employee$.showInfo();
    }


}


