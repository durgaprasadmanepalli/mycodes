class Student extends Branch {
    String studentName;
    int studentId;
    String studentPlace;

    public Student(String collageName, int collageId, String collagePlace, String branchName, int branchId,
            int onOfStaf, String studentName, int studentId, String studentPlace) {
        super(collageName, collageId, collagePlace, branchName, branchId, onOfStaf);
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentPlace = studentPlace;
    }

    public void dispalyStudentDetails() {
        System.out.println("Student Name = " + studentName);
        System.out.println("Student Id = " + studentId);
        System.out.println("Student Location = " + studentPlace);
        super.dispalyCollageDetails();
        super.dispalyBranchDetails();
    }

    public static void main(String args[]) {
        Student stu1 = new Student("Nagarjuna", 1, "Bangalore", "Civil Engneering", 25, 10, "Imran", 122, "Kurnool");

        stu1.dispalyStudentDetails();
        // stu1.dispalyCollageDetails();
        // stu1.dispalyBranchDetails();
    }
}