public class Main {
    
        public static void main(String[] args) {
            //Getting Array Sum
            ArraySum as =new ArraySum();
            int asResult = as.calculateArraySum();
            System.out.println("Array Sum: " +asResult);

            //Getting ArrayList Sum
            ArrayListSum als = new ArrayListSum();
            int aslResult = als.ArrayListGetSum();
            System.out.println("ArrayList Sum: "+ aslResult);

            //ArrayListComparisson 
            CompareArrayTriplets cat = new CompareArrayTriplets();
            System.out.println(cat.CompareArrayTriplets1());
    
        } 
    
}
