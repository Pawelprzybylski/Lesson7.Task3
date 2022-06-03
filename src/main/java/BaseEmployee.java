public abstract class BaseEmployee {

    private String name;
    private String surname;
    private int baseSallary;


    public BaseEmployee(String name, String surname, int baseSallary) {
        this.name = name;
        this.surname = surname;
        this.baseSallary = baseSallary;
    }

    public int getBaseSallary() {
        return baseSallary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name='" + name + "" +
                ", surname='" + surname + "" +
                '}';
    }

    abstract int calculateMonthlySalary();
}
