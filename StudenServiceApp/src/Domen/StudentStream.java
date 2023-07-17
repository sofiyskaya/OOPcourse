package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    public List<StudentGroup> stream;
    private Integer streamId;

    public StudentStream(List<StudentGroup> stream,Integer streamId) {
        this.stream = stream;
        this.streamId=streamId;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

     @Override
    public String toString() {
        return "Номер потока - " + getStreamId() + "\nКоличество групп - " + stream.size() + "\nСписок студентов" + stream.toString();
    }

     @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

             @Override
            public boolean hasNext() {

                if (counter < stream.size()) {
                    return true;
                } 
                else {
                    return false;
                }
            }

             @Override
            public StudentGroup next() {
                return stream.get(counter++);
            }
        };
    }
}