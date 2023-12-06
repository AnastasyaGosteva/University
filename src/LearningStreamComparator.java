import java.util.Comparator;

public class LearningStreamComparator implements Comparator<LearningGroup> {

    @Override
    public int compare(LearningGroup o1, LearningGroup o2) {
        //return Integer.compare(o1.getLearningGroupList().size(), o2.getLearningGroupList().size());

        int resultOfComparing = Integer.compare(o1.getNumberOfStudents(), o2.getNumberOfStudents());
        if (resultOfComparing == 0) {
            return 0;
        } else if (resultOfComparing > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}

