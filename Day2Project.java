import java.util.ArrayList;
public class Day2Project {
    public static void main(String []args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(0);
        list1.add(1);
        list1.add(8);
        
        
        arrayListToInt(list1);
    }
    
    public static void arrayListToInt(ArrayList<Integer>list1){
        int t = list1.size();
        int l =1;
        int num = 0;
        for(int i = 0; i<list1.size(); i++){
            for(int j =1; j<t; j++){
                
                l*=10;
                
            }
            
            num+=( list1.get(i))*l;
            t--;
            l=1;
            
            
        }
        System.out.print(num);
    }
}
