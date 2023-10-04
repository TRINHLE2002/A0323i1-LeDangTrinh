package codegym.ungdungquanlykhunghiduongfurama.model;

public class Service {
    private String service_name;
    private double service_are;
    private double service_cost;
    private int service_max_people;
    private int rent_type_id;

    public Service() {
    }

    public Service(String service_name, double service_are, double service_cost, int service_max_people, int rent_type_id) {
        this.service_name = service_name;
        this.service_are = service_are;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.rent_type_id = rent_type_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public double getService_are() {
        return service_are;
    }

    public void setService_are(double service_are) {
        this.service_are = service_are;
    }

    public double getService_cost() {
        return service_cost;
    }

    public void setService_cost(double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(int rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    @Override
    public String toString() {
        return "service{" +
                "service_name='" + service_name + '\'' +
                ", service_are=" + service_are +
                ", service_cost=" + service_cost +
                ", service_max_people=" + service_max_people +
                ", rent_type_id=" + rent_type_id +
                '}';
    }
}
