package MultilevelInheritance;

public class branches extends college {
    String branchname;
    int branchid;
    int branchtotalstaff;

    public branches(String collegename, int collegeid, String collegeplace, String branchname, int branchid,
            int branchtotalstaff) {
        super(collegename, collegeid, collegeplace);
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchtotalstaff = branchtotalstaff;
    }
}