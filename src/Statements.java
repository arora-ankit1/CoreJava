public class Statements {
    enum DAY{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        System.out.println(DAY.SUNDAY);

      /*  if (i<j) {
            System.out.println("i is less than j.");
        } else if(i>j) {
            System.out.println("i is less than equal to j.");
        } else if(i==j) {
            System.out.println("i is  equal to j.");
        } else {
            System.out.println("not numbers");
        }*/

        switch (DAY.FRIDAY) {
            case MONDAY:
            {
                System.out.println("i is 1 .");
//                break;
            }
            case TUESDAY:
            {
                System.out.println("i is 2");
                break;
            }
            case WEDNESDAY:
            {
                System.out.println("i is 3");
                break;
            }
            case THURSDAY:
                System.out.println("i is 4");
                break;
            case FRIDAY:
                System.out.println("i is 5");
                break;
            default:
                System.out.println("not numbers");

        }


    }
}
