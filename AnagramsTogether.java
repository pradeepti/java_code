package java_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnagramsTogether {

	private static void AnagramsofStringTogether(String[] strarray) {
		HashMap<String, ArrayList<Integer>> mymap = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < strarray.length; i++) {
			String newstr = sortStr(strarray[i]);
			if (mymap.containsKey(newstr)) {
				ArrayList<Integer> temp = mymap.get(newstr);
				temp.add(i);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				mymap.put(newstr, list);
			}

		}
		Iterator newit = mymap.entrySet().iterator();
		while (newit.hasNext()) {
			List<Integer> list = new ArrayList<Integer>();
			Map.Entry pairs = (Map.Entry) newit.next();
			list.addAll((Collection<? extends Integer>) (pairs.getValue()));
			for (int m : list) {
				System.out.print(strarray[m] + "\t");
			}
			System.out.println();
		}
	}

	private static String sortStr(String str) {
		char[] chararray = str.toCharArray();

		Arrays.sort(chararray);
		return new String(chararray);
	}

	public static void main(String[] args) {
		String[] str = { "abc", "def", "cba", "dfe", "def", "fed", "sfe", "werwe", "rr", "fes" };
		AnagramsofStringTogether(str);
	}

}
