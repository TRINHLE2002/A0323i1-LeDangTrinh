package codegym.ungdungquanlykhunghiduongfurama.model;

public class Division {
    private String division;

    public Division() {
    }

    public Division(String division) {
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Division{" +
                "division='" + division + '\'' +
                '}';
    }
}
