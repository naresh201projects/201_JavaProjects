package JavaBasicPrograms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FilterDuplicates {
    public static void main(String[] args) {
      
    	FilterDuplicates duplicates =new FilterDuplicates();
    	
    	duplicates.DuplicateFromArray();
    	duplicates.DuplicateFromArrayList();
    }
    
    public void DuplicateFromArray() {
    	  // Sample array with duplicate elements
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 3, 10};

        HashSet<Integer> uniqueSet = new HashSet<>();
        
        int i=0;
        
        System.out.print("All Array values: ");
        for (int element : array) {
            uniqueSet.add(element);
            System.out.print( array[i++]+", ");
        }

        System.out.println("\n"+"Unique IntArray[]: "+uniqueSet);
       
    }
    
    public void DuplicateFromArrayList() {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	int dups=5;
    	for(int i=1;i<=9;i++) {
    		list.add(i);
    		list.add(dups++);
    	}
    	System.out.println("All List Values: "+list);
    	
    	HashSet<Integer> uniqueSet= new HashSet<Integer>();
    	
    	for (Integer element : list) {
			uniqueSet.add(element);
		}
    	
    	System.out.println("Unique ArrayList: "+uniqueSet);
    }
}