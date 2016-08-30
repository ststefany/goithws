public class SpecialStudent extends CollegeStudent {
    private long secretKey;

    private String email;

    public SpecialStudent(String firstName, String lastName, Course[] coursesTaken, int group, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, coursesTaken, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
