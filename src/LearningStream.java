import java.util.Iterator;
import java.util.List;

public class LearningStream implements Iterable<LearningGroup>{
    private List<LearningGroup> learningGroupList;

    public LearningStream(List<LearningGroup> learningGroupList) {
        this.learningGroupList = learningGroupList;
    }

    public List<LearningGroup> getLearningGroupList() {
        return learningGroupList;
    }

    public void setLearningGroupList(List<LearningGroup> learningGroupList) {
        this.learningGroupList = learningGroupList;
    }

    public void addLearningGroup(LearningGroup learningGroup){
        learningGroupList.add(learningGroup);
    }

    @Override
    public Iterator<LearningGroup> iterator() {
        return new LearningStreamIterator(this);
    }
}
