package BesantTech;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
	tm.put(101,"tm");
	tm.put(101, "tm");
	tm.put(104, "tm");
	//tm.put(104, 56);         //(key/values)
	//tm.put(null, 877);    Do not accept null in keys,it accepts only in values
	tm.put(500, null);
	//tm.put(500, 't');
	tm.remove(500);
	System.out.println(tm);
	hm.put(105, "hm");
	hm.put(105, "hm");
	hm.put(106, null);
	hm.put(107, null);
	hm.put(null, "thy");
	hm.put(null, "fgh");
	hm.put(109, "hash");
	System.out.println(hm);
		}
	}