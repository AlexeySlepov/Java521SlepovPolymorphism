package TaskThree;

public class History extends Subject {

    public String period;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public History(String teacher, String period) {
        setName("History");
        setTeacher(teacher);
        this.period = period;
    }

    public void study() {
        super.study();
        System.out.print(", период истории - " + period + "\n");
    }
}
