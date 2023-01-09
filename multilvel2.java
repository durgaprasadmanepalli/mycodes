package MultilevelInheritance;

import inheritance.multilevel;

public class multilvel2 extends multilevel {
    String branchname;
    int branchid;
    int branchtotalstaff;

    public multilvel2(String collegename, int collegeid, String collegeplace, String branchname, int branchid,
            int branchtotalstaff) {
        super(collegename, collegeid, collegeplace);
        this.branchname = branchname;
        this.branchid = branchid;
        this.branchtotalstaff = branchtotalstaff;
    }

}