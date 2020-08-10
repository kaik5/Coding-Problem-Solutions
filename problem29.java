package Abs;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;

//Each method has one iteration, so the overall time complexity is O(n).
public class TestAlgo
{
    public static void main(String[] args)
    {
        String str = "AAAABBBCCDAAA";
           
        String str2 = "4A2B3C4D";

        encode(str);
        System.out.println();
        decode(str2);

    }



    public static void encode(String x)
    {
        char[] charArr = x.toCharArray();

        int counter = 1;
        for(int i = 0; i < charArr.length - 1; i++)
        {
            //if the current char and the next char are the same
            if(charArr[i] == charArr[i + 1])
            {
                counter++;

                if(i == charArr.length - 2)
                {
                    System.out.print(counter);
                    System.out.print(charArr[i]);
                }

            }
            //reset counter
            else
            {
                System.out.print(counter);
                System.out.print(charArr[i]);
                counter = 1;

                if(i == charArr.length - 2)
                {
                    System.out.print(1);
                    System.out.print(charArr[i + 1]);
                }
            }
        }

    }
    
        public static void decode(String x)
    {

        for(int i = 0; i < x.length(); i++)
        {
            if(Character.isDigit(x.charAt(i)))
            {

                int num = x.charAt(i) - 48;
                char[] temp = new char[num];
                Arrays.fill(temp, x.charAt(i + 1));

                System.out.print(String.valueOf(temp));
            }
        }
    }

}
