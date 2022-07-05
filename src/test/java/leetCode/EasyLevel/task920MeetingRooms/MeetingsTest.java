package leetCode.EasyLevel.task920MeetingRooms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingsTest {
    List<Interval> intervalList = Arrays.asList(new Interval(0, 15),
            new Interval(10, 30),
            new Interval(15, 20));
    List<Interval> intervalList1 = Arrays.asList(new Interval(5, 8),
            new Interval(9, 15));

    @Test
    void getFalseAttemedMettings() {
        assertEquals(false, new Meetings().canAttendMeetings(intervalList));
    }

    @Test
    void getTrueAttemedMettings() {
        assertEquals(true, new Meetings().canAttendMeetings(intervalList1));
    }


}