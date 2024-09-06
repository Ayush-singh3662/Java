public class Student {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("DSA", 100);
        subs[0].setmarksObtained(89);
        subs[1] = new Subject("DAA", 100);
        subs[1].setmarksObtained(92);
        subs[2] = new Subject("OS", 100);
        subs[2].setmarksObtained(96);
        for(Subject s : subs) {
            System.out.println(s);
        }
    }
}

class Subject {
    private String subName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subName, int maxMarks) {
        this.subName = subName;
        this.maxMarks = maxMarks;
    }

    public String getsubName() {
        return subName;
    }
    public int getmarksObtained() {
        return marksObtained;
    }
    public void setmarksObtained(int marks) {
        marksObtained = marks;
    }
    public String toString() {
        return "Subject Name : "+getsubName()+"\nMarks Obtained: "+getmarksObtained();
    }
}
