public class Menager extends BaseEmployee {

    private final int sallary = 5000;
    public int bonus;

    public Menager(String name, String surname, int baseSallary) {
        super(name, surname, baseSallary);
    }

    @Override
    int calculateMonthlySalary() {
        return getBaseSallary() + bonus;
    }

}
