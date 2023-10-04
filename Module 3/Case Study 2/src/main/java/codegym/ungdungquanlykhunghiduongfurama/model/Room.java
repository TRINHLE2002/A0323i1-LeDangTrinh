package codegym.ungdungquanlykhunghiduongfurama.model;

public class Room extends Service{
    private String free_service;

    public Room() {
    }

    public Room(String service_name, double service_are, double service_cost, int service_max_people, int rent_type_id, String free_service) {
        super(service_name, service_are, service_cost, service_max_people, rent_type_id);
        this.free_service = free_service;
    }

    public String getFree_service() {
        return free_service;
    }

    public void setFree_service(String free_service) {
        this.free_service = free_service;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "free_service='" + free_service + '\'' +
                '}';
    }
}
