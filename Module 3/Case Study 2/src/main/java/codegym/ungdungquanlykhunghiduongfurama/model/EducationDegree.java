package codegym.ungdungquanlykhunghiduongfurama.model;

public class EducationDegree {
    private String education_degree;

    public EducationDegree() {
    }

    public EducationDegree(String education_degree) {
        this.education_degree = education_degree;
    }

    public String getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(String education_degree) {
        this.education_degree = education_degree;
    }

    @Override
    public String toString() {
        return "EducationDegree{" +
                "education_degree='" + education_degree + '\'' +
                '}';
    }
}
