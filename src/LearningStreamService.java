import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearningStreamService {
    private LearningStream learningStream;

    public LearningStreamService(LearningStream learningStream) {
        this.learningStream = learningStream;
    }

    public LearningStream getLearningStream() {
        return learningStream;
    }

    public List<LearningGroup> getSortedLearningStream() {
        List<LearningGroup> learningGroupList = new ArrayList<>(learningStream.getLearningGroupList());
        Collections.sort(learningGroupList);
        return learningGroupList;
    }

    /*public List<LearningGroup> getSortedStudentStreamByNum() {
        List<LearningGroup> learningGroupList = new ArrayList<>(learningStream.getLearningGroupList());
        learningGroupList.sort(new LearningStreamComparator());
        return learningGroupList;
    }*/
}

