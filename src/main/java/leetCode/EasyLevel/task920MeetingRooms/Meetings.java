package leetCode.EasyLevel.task920MeetingRooms;

import java.util.Comparator;
import java.util.List;

public class Meetings {

    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(s -> s.start));

        for(int i = 0; i < intervals.size() - 1; i++) {
            Interval interval1 = intervals.get(i);
            Interval interval2 = intervals.get(i + 1);

            if(interval1.end > interval2.start) {
                return false;
            }
        }
        return true;
    }
}
