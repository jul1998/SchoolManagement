public class Student {
   private int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

    /**
     * To create a new student by initializing
     * Fees for every student is $30000 a year
     * Fees paid initially is 0
     * @param id is for student: unique
     * @param name name of the student
     * @param grade grade of the student
     */
   public Student(int id, String name, int grade){
       this.feesPaid = 0;
       this.feesTotal = 30000;
       this.id = id;
       this.name = name;
       this.grade = grade;


   }

    /**
     * Used to update student's grade
     * @param grade new grade of the student
     */
   public void setGrade(int grade){
       this.grade = grade;
   }

    /**
     * feesPaid  = 10.000 + 50.000 + 10.000
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     * @param fees
     */
   public void updateFeesPaid(int fees){
    feesPaid += fees;
    School.updateTotalMoneyEarned(fees);
   }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int getGrade(){
        return this.grade;
    }

    public int getFeesPaid(){
        return this.feesPaid;
    }

    public int getFeesTotal(){
        return this.feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
       return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + ". Total fees paid so far $" + feesPaid;
    }
}