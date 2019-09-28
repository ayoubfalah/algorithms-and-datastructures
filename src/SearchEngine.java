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
	private static Interval binarySearch(List<String> list, String key){
		int d = -1;
		int f = list.size();
		while(d+1 < f){
			int i = (d+f)/2;
			if(key.compareTo(list.get(i)) == 0) return new Interval(i,i);
			else if(key.compareTo(list.get(i)) > 0) d = i;
			else f = i;
			}
		return new Interval(d,f);
		}

	private static String longestCommenPrefix(String u, String v){

	    return "TODO";
	}
	private static Interval quickerBinarySearch(List<String> list, String key){
		int d = -1;
		int f = list.size();
		int m = key.length();
		while(d+1 < f){
			int i = (d+f)/2;
			String lcp = longestCommenPrefix(key, list.get(i));
			int l = lcp.length();
			int n = list.get(i).length();
			if(l == m && l == n) return new Interval(i,i);
			else if(l == n || (l < m && key.charAt(l) < list.get(i).charAt(l))) d = i;
			else f = i;
			}
		return new Interval(d,f);
		}
	public static void main(String args[]){
		List list = Arrays.asList("a", "b", "aa", "ab", "bb", "ba");
		String key = "ab";
		Interval location = binarySearch(list, key);
		System.out.println(location);
		}
	}
