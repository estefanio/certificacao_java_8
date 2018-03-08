package generics.methods;

import java.util.ArrayList;
import java.util.List;

class Utilities {
	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
		List<?> wildCardList = new ArrayList<Integer>();
	}
}