
public class Day2Project {
    public static void main (String[]args){
        import java.util.ArrayList;
	public class MyPart{
		public static void main(String []args){

						 convertToArrayList(9018);
		}
		public static void convertToArrayList(int x){
						ArrayList<Integer> list = new ArrayList<>();

						int intSize = 0;

						int temp = x;

						while(temp > 0){
							intSize++;
							list.add(0);
							temp /= 10;
						}

						while(x > 0){
							list.set(intSize - 1, x % 10);
							x /= 10;
							intSize--;
							}

						System.out.print(list);
					}
					}
        
      
    }  
}
