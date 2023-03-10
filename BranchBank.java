class BranchBank extends MainBranch {
    String branchName;
    String branchId;
    long branchPhno;
    private float branchIntrest;

    public BranchBank(String name, String id, long phno, long bankTotalFund, float bankIntrest, String branchName,
            String branchId, long branchPhno, long branchTotalFund, float branchIntrest) {
        super(bankTotalFund, bankIntrest);

        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchIntrest = branchIntrest;
    }

    public static void main(String arg[]){
        //MainBranch bank1 = new MainBranch("Axis", "Axis1", 1234567891, 10000000, 5);
        BranchBank bank2 = new BranchBank("Axis", "Axis2", 1234567591, 1000000, 4, "Axis Bank", "Axis1", 123546897, 500000, 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Ammount");
        long loan = sc.nextInt();
        bank2.checkloan(loan, bank2.branchIntrest);
        //bank2.totalIntrest(bank2.branchIntrest);
    }
