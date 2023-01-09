package MultilevelInheritance;

public class students extends branches {
    String studentname;
    String studentplace;
    int studentid;
    private String collegename;
    private String collegeid;

    public students(String collegename, int collegeid, String collegeplace, String branchname, int branchid,
            int branchtotalstaff, String studentname, String studentplace, int studentid) {
        super(collegename, collegeid, collegeplace, branchname, branchid, branchtotalstaff);
        this.studentname = studentname;
        this.studentplace = studentplace;
        this.studentid = studentid;
    }

    public void showStudentDetails() {
        System.out.println("---Student Details---");
        System.out.println("Student name: " + this.studentname);
        System.out.println("Student Place: " + this.studentplace);
        System.out.println("Student ID: " + this.studentid);
    }

    public void showBranchDetails() {
        System.out.println("---Branch Details---");
        System.out.println("Branch name: " + this.branchname);
        System.out.println("Branch ID: " + this.branchid);
        System.out.println("Branch total staff: " + this.branchtotalstaff);
    }

    public void showCollegeDetails() {
        System.out.println("---College Details---");
        System.out.println("College name: " + this.collegename);
        System.out.println("College ID: " + this.collegeid);
        System.out.println("College Place: " + this.collegeplace);
    }

    public static void main(String args[]) {
        students s1 = new students("XYZ College", 123, "amalapuram", "IT", 10, 15, "prasad", "Mumbai", 52);
        s1.showStudentDetails();
        s1.showBranchDetails();
        s1.showCollegeDetails();
    }

}
