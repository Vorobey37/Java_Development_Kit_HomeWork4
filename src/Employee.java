public class Employee {

    private int id;
    private long phoneNumber;
    private String name;
    private float experience;

    public Employee(int id, long phoneNumber, String name, float experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public float getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
