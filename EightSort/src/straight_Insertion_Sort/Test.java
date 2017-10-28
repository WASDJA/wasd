package straight_Insertion_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	// 1
	public static List<Integer> sort(List<Integer> l) {
		if (l.size() == 0)
			return l;
		Integer pivot = l.get(0);
		List<Integer> lLower = new ArrayList<Integer>();
		List<Integer> lHigher = new ArrayList<Integer>();
		for (Integer e : l) {
			if (e < pivot) {
				lLower.add(e);
			}
			if (e > pivot) {
				lHigher.add(e);
			}
		}
		List<Integer> sorted = new ArrayList<Integer>();
		sorted.addAll(sort(lLower));
		sorted.add(pivot);
		sorted.addAll(sort(lHigher));
		return sorted;
	}

	// 2
	public static List<Integer> sort(List<Integer> l, int i) {
		String tab = "-";
		for (int j = 0; j < i; j++) {
			tab += "-";
		}
		int size = l.size();
		if (size == 0)
			return l;
		// pivot ÊàÖá£»ÖÐÐÄµã£»
		Integer pivot = l.get(0);
		System.out.println(tab + "pivot: " + pivot);
		List<Integer> lLower = new ArrayList<Integer>();
		List<Integer> lHigher = new ArrayList<Integer>();
		for (Integer e : l) {
			if (e < pivot) {
				lLower.add(e);
			}
			if (e > pivot) {
				lHigher.add(e);
			}
		}
		System.out.println(tab + "Lower: " + lLower);
		System.out.println(tab + "Higher: " + lHigher);
		List<Integer> sorted = new ArrayList<Integer>();
		sorted.addAll(sort(lLower, i++));
		sorted.add(pivot);
		sorted.addAll(sort(lHigher, i++));
		System.out.println(tab + "Lower+pivot+Higher: " + sorted);
		return sorted;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		List<Integer> a = Arrays.asList(3, 5, 7, 4, 23, 4, 56, 23, 6, 1, 81);
		System.out.println(sort(a, 0));
		long endTinme = System.currentTimeMillis();
		System.out.println("TIME£º" + (endTinme - startTime) + "mS");
	}
}
