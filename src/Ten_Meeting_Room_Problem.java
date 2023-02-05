import java.util.*;

class Meeting {
    private int start;
    private int end;
    public Meeting(int a, int b) {
        this.start = a;
        this.end = b;
    }
    public int getStartTime() {
        return this.start;
    }

    public int getEndTime() {
        return this.end;
    }
}

class MeetingComparator implements Comparator<Meeting> {
    public int compare(Meeting a, Meeting b) {
        return a.getEndTime() - b.getEndTime();
    }
}

public class Ten_Meeting_Room_Problem {
    public static void start() {
        System.out.println("\nInside Tenth Module");
        ArrayList<Integer> startTimes = new ArrayList<>(Arrays.asList(1, 3, 0, 5, 8, 5));
        ArrayList<Integer> endTimes = new ArrayList<>(Arrays.asList(2, 4, 6, 7, 9, 9));
        
        ArrayList<Meeting> meetings = new ArrayList<>();
        
        for(int i = 0; i < startTimes.size(); i++) {
            Meeting newMeeting = new Meeting(startTimes.get(i), endTimes.get(i));
            meetings.add(newMeeting);
        }
        
        Collections.sort(meetings, new MeetingComparator());

        int endTime = meetings.get(0).getEndTime();

        System.out.println("Possible Meeting Timings Are");

        for(int i = 1; i < meetings.size(); i++) {
            if(meetings.get(i).getStartTime() > endTime){
                System.out.println(meetings.get(i).getStartTime() + " to " + meetings.get(i).getEndTime());
                endTime = meetings.get(i).getEndTime();
            }
        }
    }
}