import java.util.Iterator;
import java.util.List;

public class LearningStreamIterator implements Iterator<LearningGroup> {

    private List<LearningGroup> learningGroupList;
    private int count;

    public LearningStreamIterator(LearningStream learningStream) {
        this.learningGroupList = learningStream.getLearningGroupList();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < learningGroupList.size();
    }

    @Override
    public LearningGroup next() {
        if(hasNext()){
            return learningGroupList.get(count++);
        }
        return null;
    }
}
