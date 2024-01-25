import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StreamService {
    Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public List<Stream> getSortedStreamBySize() {
        List<Stream> groupList = new ArrayList<>(stream.groupList);
        groupList.sort(new StreamComparator());
        return groupList;

    }

}
