import java.util.Vector;
import java.util.Date;

class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insNumber, double bonus) {
        super(name, salary, hireDate, insNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addToTeam(Employee e) { 
        team.add(e); 
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            int res = super.compareTo(other);
            if (res == 0) return Double.compare(this.bonus, ((Manager) other).bonus);
            return res;
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return "Manager[" + super.toString() + ", bonus=" + bonus + ", teamSize=" + team.size() + "]";
    }
}