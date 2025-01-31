import java.util.ArrayList;
public class ArrayListSum {
   //st<Integer>();
    public int ArrayListGetSum(){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(11);
        num.add(23);
        num.add(6);
        num.add(10);
        int sum=0;
        for(int i=0; i<num.size(); i++)
        {
           sum += num.get(i);
        }

        return sum;

    }
}
