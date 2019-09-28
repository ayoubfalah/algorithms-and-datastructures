import java.util.Arrays;
import java.util.List;

public class SearchEngine{

	private static final int NOT_IN_LIST = -1;
	private static int contains(List list, String key){
		
		for(int i=0; i < list.size(); i++){
			if(key.equals(list.get(i))){
				return i;
				}
			}
			return NOT_IN_LIST;

		}
	public static void main(String args[]){
		List list = Arrays.asList("a", "b", "aa", "ab", "bb", "ba");
		String key = "ab";
		int index = contains(list, key);
		System.out.println(index);
		}
	}
