import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrayTriplets {
    int numOne =0;
    int numTwo =0;
    public List<Integer> CompareArrayTriplets1(){
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(11);
        num1.add(23);
        
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(12);
        num2.add(9);
        num2.add(23);

        for(int i =0; i < num1.size(); i++)
        {
          if(num1.get(i)<num2.get(i))
          {
               numTwo +=1;
          }
          else if (num1.get(i)>num2.get(i)) 
          {
               numOne +=1;
          }
        }
return Arrays.asList(numOne, numTwo);
    }

}
