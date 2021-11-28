package telran.util.memory;

public class MemoryService {
public static int getMaxAvailableMemory(){
	long maxMemory = Runtime.getRuntime().maxMemory();
	int right = maxMemory> Integer.MAX_VALUE?  Integer.MAX_VALUE: (int) maxMemory;
	int left = 0;
	int maxSize = 0;
	byte ar[] ;
	while (left <= right) {
		maxSize = (left+right)/2;
		ar = null;
		try { 
			ar = new byte[maxSize];
			left = maxSize + 1;
		} catch (Throwable e) {
			right = maxSize-1;
		}
	}
	return maxSize;

}
}
