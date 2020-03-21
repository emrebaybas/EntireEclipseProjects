package hash;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("EMRE");
		hs.add("BAYBAS");
		hs.add("BETHESDA");
		hs.add("BETHESDA"); // this will be ignored since it's duplicate

		System.out.println(hs);
		

	}

}
