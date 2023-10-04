package codegym.ungdungquanlykhunghiduongfurama.model;

public class AccommodationService {
    private String attach_service_name;
    private String attach_service_unit;
    private double attach_service_cost;

    public AccommodationService() {
    }

    public AccommodationService(String attach_service_name, String attach_service_unit, double attach_service_cost) {
        this.attach_service_name = attach_service_name;
        this.attach_service_unit = attach_service_unit;
        this.attach_service_cost = attach_service_cost;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public String getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(String attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public double getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(double attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    @Override
    public String toString() {
        return "AccommodationService{" +
                "attach_service_name='" + attach_service_name + '\'' +
                ", attach_service_unit='" + attach_service_unit + '\'' +
                ", attach_service_cost=" + attach_service_cost +
                '}';
    }
}
