package timedRecord;

import java.util.ArrayList;
import java.util.List;

public class TimedRecordApp {

	public static void main(String[] args) {
		
		List<TimedRecord> lst = new ArrayList<>();
		
		TimedRecord timed1 = new TimedRecordImpl(2, 5);
		TimedRecord timed2 = new TimedRecordImpl(4, 10);
		TimedRecord timed3 = new TimedRecordImpl(2, 8);
		TimedRecord timed4 = new TimedRecordImpl(8, 12);
		
		
		lst.add(timed1);
		lst.add(timed2);
		lst.add(timed3);
		lst.add(timed4);
		
		lst.add(new TimedRecordImpl(8, 15));
		
		//for i from 0 to the end of lst - 1 
		//get element i
		// for j for all elements after i elemnt to the end of list
		
		//if startJ is between startI AND endI OR endJ is between startI and endI OR startJ < startI && endJ > endI
		//OR startI < startJ && endI > endJ
		//there is a overlap
		//else no overlap
		
		System.out.println("List: " + lst + System.lineSeparator());
		lst.forEach(System.out::println);
		
		for (int i = 0; i <= lst.size() - 2; i++) {
			
			long startI = lst.get(i).getStart();
			
			long endI = lst.get(i).getEnd();
			
			for (int j = i+1; j <= lst.size() - 1; j++) {
				
				long startJ = lst.get(j).getStart();
				
				long endJ = lst.get(j).getEnd();
				
				if ((startI <= startJ && startJ < endI) || (startI < endJ && endJ <= endI) || (startJ <= startI && endJ >= endI) || (startI < startJ && endI >= endJ) ) {
					System.out.println("There is overlap between " + lst.get(i) + " and " + lst.get(j));
				}  else {
					System.out.println("There is NO overlap between " + lst.get(i) + " and " + lst.get(j));
				}
			}
			
		}

	}

}
