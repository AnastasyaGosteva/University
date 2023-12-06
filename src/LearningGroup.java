public class LearningGroup implements Comparable<LearningGroup>{
    private int numberGroup;
    private int numberOfStudents;

    public LearningGroup(int numberGroup, int numberOfStudents) {
        this.numberGroup = numberGroup;
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "LearningGroup{" +
                "numberGroup=" + numberGroup +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    @Override
    public int compareTo(LearningGroup o) {
        return Integer.compare(this.numberOfStudents, o.numberOfStudents);
    }
}
