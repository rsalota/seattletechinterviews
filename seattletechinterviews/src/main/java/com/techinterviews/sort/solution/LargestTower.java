package com.techinterviews.sort.solution;

import java.util.Arrays;
import java.util.List;

import com.techinterviews.lists.LinkedList;

class HeightWeight {
	public int height;
	public int weight;
};

public class LargestTower {

	/**
	 * shorter and lighter
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		HeightWeight h1 = new HeightWeight();
		h1.height = 10;
		h1.weight = 10;

		HeightWeight h2 = new HeightWeight();
		h2.height = 1;
		h2.weight = 1;

		HeightWeight h3 = new HeightWeight();
		h3.height = 190;
		h3.weight = 190;

		HeightWeight h4 = new HeightWeight();
		h4.height = 200;
		h4.weight = 200;

		HeightWeight h5 = new HeightWeight();
		h5.height = 180;
		h5.weight = 180;

		List<HeightWeight> hw = new java.util.LinkedList<HeightWeight>();
		hw.add(h1);
		hw.add(h2);
		hw.add(h3);
		hw.add(h4);
		hw.add(h5);
		int max=0;
		int length = LargestTower.makeTower(hw);
		System.out.println(length);

	}

	public static int makeTower(List<HeightWeight> dimension) {
		
		if (dimension.size() == 0) {
			return 0;
		}
		int maxSize=0;
		for(int i=0;i<dimension.size();i++){
			HeightWeight base = dimension.get(i);
			int l = makeTower(dimension, base);
			if (maxSize < l){
				maxSize=l;
			}
		}
		return maxSize;
	}
	
	public static int makeTower(List<HeightWeight> dimension,HeightWeight base) {
		int maxSize = 0;
		for (int j = 0; j < dimension.size(); j++) {
			if (dimension.get(j) == base){
				continue;
			}
			if (base.height > dimension.get(j).height
					&& base.weight > dimension.get(j).weight) {
				int tsize = makeTower(dimension,dimension.get(j));
				if (tsize + 1 > maxSize) {
					maxSize = tsize + 1;
				}
			}
		}
		return maxSize;
	}
}
