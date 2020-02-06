/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }

    //Sandeep's response on 02/05/2020//

    public Integer oneToNumber(Integer numberToSum){

        int i;
        sum=0;
        for (i=1; i<=numberToSum; i++)
        {
          sum+=i;
        }
        return sum;
    }

}
