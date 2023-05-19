import java.util.*;

class Meeting {
    int start;
    int end;
    int position;

    Meeting(int start, int end, int position) {
        this.start = start;
        this.end = end;
        this.position = position;
    }
}

class MyComparator implements Comparator<Meeting> {
    public int compare(Meeting o1, Meeting o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        return 0;
    }
}

public class MaximumMeetingInOneRoom {

    public static void findMaximumMeetings(ArrayList<Meeting> meetings) {
        ArrayList<Integer> m = new ArrayList<>();

        int minTime = 0;

        Collections.sort(meetings, new MyComparator());

        m.add(meetings.get(0).position);

        minTime = meetings.get(0).end;

        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start > minTime) {
                m.add(meetings.get(i).position);
                minTime = meetings.get(i).end;
            }
        }

        for (int i = 0; i < m.size(); i++) {
            System.out.println("Meeting number " + (m.get(i) + 1));
        }
    }

    public static void start() {
        System.out.println("Maximum Meetings Possible in One Room");

        int startTimes[] = { 11, 3, 0, 5, 8, 5 };
        int endTimes[] = { 2, 4, 9, 7, 9, 9 };

        ArrayList<Meeting> meet = new ArrayList<>();

        for (int i = 0; i < startTimes.length; i++) {
            meet.add(new Meeting(startTimes[i], endTimes[i], i));
        }

        findMaximumMeetings(meet);
    }
}
