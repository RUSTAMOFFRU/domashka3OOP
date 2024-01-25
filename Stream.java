import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    List<StudentGroup> studentGroupList = new ArrayList<>();
    public Object streamList;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public Integer size() {
        return studentGroupList.size();
    }

}