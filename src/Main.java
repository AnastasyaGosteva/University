import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LearningStream> allLeaningGroup = new ArrayList<>();

        List<LearningGroup> learningGroupList3 = new ArrayList<>();
        LearningStream learningStream3 = new LearningStream(learningGroupList3);
        learningStream3.addLearningGroup(new LearningGroup(411, 35));
        Collections.sort(learningGroupList3, Comparator.comparingInt(LearningGroup::getNumberOfStudents)); //сортировка групп в потоке по количеству струдентов

        List<LearningGroup> learningGroupList1 = new ArrayList<>();
        LearningStream learningStream1 = new LearningStream(learningGroupList1);
        learningStream1.addLearningGroup(new LearningGroup(411, 35));
        learningStream1.addLearningGroup(new LearningGroup(412, 33));
        learningStream1.addLearningGroup(new LearningGroup(413, 30));
        learningStream1.addLearningGroup(new LearningGroup(414, 37));
        learningStream1.addLearningGroup(new LearningGroup(415, 28));
        learningStream1.addLearningGroup(new LearningGroup(416, 33));
        Collections.sort(learningGroupList1, Comparator.comparingInt(LearningGroup::getNumberOfStudents));


        List<LearningGroup> learningGroupList2 = new ArrayList<>();
        LearningStream learningStream2 = new LearningStream(learningGroupList2);
        learningStream2.addLearningGroup(new LearningGroup(512, 30));
        learningStream2.addLearningGroup(new LearningGroup(512, 33));
        learningStream2.addLearningGroup(new LearningGroup(513, 29));
        learningStream2.addLearningGroup(new LearningGroup(514, 281));
        Collections.sort(learningGroupList2, Comparator.comparingInt(LearningGroup::getNumberOfStudents));

        System.out.println();
        allLeaningGroup.add(learningStream1);
        allLeaningGroup.add(learningStream2);
        allLeaningGroup.add(learningStream3);

        Comparator<LearningStream> learningStreamComparator = Comparator.comparingInt(stream -> stream.getLearningGroupList().size());
        Collections.sort(allLeaningGroup, learningStreamComparator);
        for (LearningStream learningStream : allLeaningGroup) {
            LearningStreamService service = new LearningStreamService(learningStream);
            for (LearningGroup learningGroup : learningStream) {
                System.out.println(learningGroup);
            }
            System.out.println();
        }
    }
}