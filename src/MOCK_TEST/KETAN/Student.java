package MOCK_TEST.KETAN;

class Student{
    String name;
    int roll_number;
    int Average_Score;
    public static void main(String args[])
    {

        int mark[] = new int[3],i;
        float sum=0;
        float avg;

        for(i=0; i<3; i++)
        {
            sum = sum + mark[i];
        }

        avg= sum/3;


        System.out.print("Average Marks = " +avg);
    }
}
