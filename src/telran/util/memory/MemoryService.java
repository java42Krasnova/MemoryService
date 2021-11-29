package telran.util.memory;

public class MemoryService {
public static int getMaxAvailableMemory(){
	long maxMemory = Runtime.getRuntime().maxMemory();
	int right = maxMemory> Integer.MAX_VALUE?  Integer.MAX_VALUE: (int) maxMemory;
	int left = 0;
	int maxSize = 0;
	int middle = 0;
	byte ar[] ;
	while (left <= right) {
		middle = (int)((long)left+right)/2;
		try { 	
			ar = new byte[middle];
			maxSize = middle;
			left = middle + 1;
			ar=null;
		} catch (Throwable e) {
			right = middle-1;
		}
	}
	return maxSize;

}
}
