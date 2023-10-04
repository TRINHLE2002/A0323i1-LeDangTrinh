package codegym.ungdungquanlykhunghiduongfurama.model;

public class Position {
    private String postision;

    public Position() {
    }

    public Position(String postision) {
        this.postision = postision;
    }

    public String getPostision() {
        return postision;
    }

    public void setPostision(String postision) {
        this.postision = postision;
    }

    @Override
    public String toString() {
        return "Position{" +
                "postision='" + postision + '\'' +
                '}';
    }
}
