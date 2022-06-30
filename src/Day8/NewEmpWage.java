package Day8;

public class NewEmpWage {

	public static final int Part_Time = 1;
    public static final int Full_Time = 2;
    public static final int Rate_Per_Hrs = 20;
    public static final int Working_Days = 20;
    public static final int Max_Hrs = 100;
    public static void main(String[] args){
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        presentOrAbsent();
        dailyEmpWage(empHrs);
        dailyEmpWageUsingSwitch( empHrs);
        empWageForMonth(empHrs);
        empWageWithInLimit(empHrs);
    }
    static void presentOrAbsent() {
        int empPresentCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empPresentCheck == 1) {
            System.out.println("Employee Is Present");

        } else {
            System.out.println("Employee Is Absent");
        }

    }
    static void dailyEmpWage(int empHrs){
        int empWage=0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if(empCheck==Full_Time){
            empHrs=8;
        }
        else if(empCheck==Part_Time){
            empHrs=4;
        }
        else{
            empHrs=0;
        }
        empWage=empHrs*Rate_Per_Hrs;
        System.out.println("Daily Employee Wage= " +empWage);
    }
    static void dailyEmpWageUsingSwitch(int empHrs){
        int empWage=0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case Part_Time:
                empHrs = 4;
                break;
            case Full_Time:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage=empHrs*Rate_Per_Hrs;
        System.out.println("Daily Employee Wage Using Switch Case= " +empWage);

    }
    static void empWageForMonth(int empHrs){
        //Variables
        int totalEmpWage=0;
        int empWage=0;
        //Computation
        for(int day=0;day<Working_Days;day++){
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Part_Time:
                    empHrs = 4;
                    break;
                case Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage=empHrs*Rate_Per_Hrs;
            totalEmpWage +=empWage;
        }
        System.out.println("Total Employee Wages For A Month = " +totalEmpWage);


    }
    static void empWageWithInLimit(int empHrs){
        int  totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= Max_Hrs && totalWorkingDays < Working_Days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Part_Time:
                    empHrs = 4;
                    break;
                case Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Employee Hours : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * Rate_Per_Hrs;
        System.out.println("Total Employee Wage Till The Condition is : " + totalEmpWage);

    }

}