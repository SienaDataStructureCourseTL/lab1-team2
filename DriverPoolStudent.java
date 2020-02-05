import java.util.Scanner;
import java.util.Scanner;

/**
 * This program is used to unit test the Pool class.
 * The format of the dollar amount is not important.
 * You should not be concerned that there are no 
 * dollar signs or there are more than two decimal
 * places.
 * 
 * @author Aimen HARIZI and ashley abrams
 * @version Spring 2019
 */
public class DriverPoolStudent
{
    public static void main(String args[])
    {
        //1.  Create a Pool object.
        Pool p = new Pool();
        
         //2.  Test bounds of the range for pool days
        //2A. day - lower bound test 
        System.out.println("Lower bound day:");
        System.out.println();

        System.out.println("Expected: False");
        System.out.println(p.addEntry(0,0, "day1", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(1,0, "day2", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(2,0, "day3", 10.0));

        System.out.println();

        //2B. day - mid-range test
        System.out.println("Mid-range day:");
        System.out.println();

        System.out.println("Expected: True");
        System.out.println(p.addEntry(4,0, "day4", 10.0));

        System.out.println();

        //2C. day - upper bound test
        System.out.println("Upper bound day:");
        System.out.println();

        System.out.println("Expected: False");
        System.out.println(p.addEntry(8,0, "day5", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(7,0, "day6", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(6,0, "day7", 10.0));

        System.out.println();
        System.out.println();

        //3.  Test the bounds of the range for pool hours
        //3A. hour - lower bound test
        System.out.println("Lower bound hour:");
        System.out.println();

        System.out.println("Expected: False");
        System.out.println(p.addEntry(3,-1, "hour1", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(3,1, "hour2", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(3,2, "hour3", 10.0));

        System.out.println();

        //3B. hour - mid-range test
        System.out.println("Mid range hour:");
        System.out.println();

        System.out.println("Expected: True");
        System.out.println(p.addEntry(1,15, "hour4", 10.0));

        System.out.println();

        //3C. hour - upper bound test
        System.out.println("Upper bound hour:");
        System.out.println();

        System.out.println("Expected: False");
        System.out.println(p.addEntry(1,24, "hour5", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(1,23, "hour6", 10.0));
        System.out.println("Expected: True");
        System.out.println(p.addEntry(1,22, "hour7", 10.0));

        System.out.println();
        System.out.println();

        //4A.  Test pool total; total is based on the pool entries above
        System.out.println("Pool Total:");
        System.out.println("Expected: 100.0");
        System.out.println(p.poolTotal());

        System.out.println();

        //4B.  Test pool total with a new pool and no entries.
        Pool p1 = new Pool();
        System.out.println("Pool Total:");
        System.out.println("Expected: 0.0");
        System.out.println(p1.poolTotal());

        System.out.println();

        //5A.  Test getWinner - winner exists
        System.out.println("Winner Exists:");
        System.out.println("Expected: day2: 10.0");
        System.out.println(p.getWinner(1, 0));

        System.out.println();

        //5B.  Test getWinner - no winner
        System.out.println("Winner Does Not Exist:");
        System.out.println("Expected: null");
        System.out.println(p.getWinner(5, 5));

        System.out.println();

        //6.   print the complete matrix
        System.out.println("\n" + p);

        /*
         * 7. 
         * Use the Pool object, p, you created above.  If there are entries 
         * still available (there should be lots!), ask the user to pick a day 
         * and time.  Keep asking until they have picked one that is not 
         * already used (is null).  Then, add the user to the pool.  You 
         * will need their name and the amount they would like to enter.
         * You only need to enter one user in the pool.
         */
        Scanner sc = new Scanner(System.in);

        int day;
        int hour;
        String name;
        Double amount;
        int count=0;
        

        System.out.println("Enteryour name:");
        name= sc.next();
        
        System.out.println("Enteryour amount:");
        amount= sc.nextDouble();
        
        System.out.println("Enteryour day:");
        day= sc.nextInt();
        
        System.out.println("Enteryour hour:");
        hour= sc.nextInt();
        
        while(count== 0 ){
            if( p.getWinner(day, hour) == null){
        System.out.println(p.addEntry(day,hour, name, amount));
        count++;
    }else{
        System.out.println("Time filled: shose another day oor time");
        System.out.println("Enter day:");
        day= sc.nextInt();
        
        System.out.println("Enter hour:");
        hour= sc.nextInt();
    }
    
    
    }
    System.out.println("\n" + p);
    }
}
