package com.techinterviews.backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TowerBuilding {
	
	public static class Tuple implements Comparable<TowerBuilding.Tuple>{
		int height;
		int weight;
		
		public int compareTo(Tuple o) {
			
			if (o.height > height){
				return -1;
			}else if (o.height == height){
				return 0;
			}
			return 1;
		}
		
		public String toString(){
			return "height : " + height + " weight " + weight;
		}
	}
	
	public static List<TowerBuilding.Tuple> algorithm(TowerBuilding.Tuple [] tuples){
		Arrays.sort(tuples);
		List<List<TowerBuilding.Tuple>> tuplesK= findLongestIncreasingWeightSubSequence(tuples);
		List<TowerBuilding.Tuple> max=null;
		for(List<TowerBuilding.Tuple> tupleK : tuplesK){
			if (max == null || max.size() < tupleK.size()){
				max= tupleK;
			}
		}
		return max;
	}
	
	/**
	 * Longest increasing subsequence algorithm 
	 *  
	 * @param tuples
	 * @return
	 */
	public static List<List<TowerBuilding.Tuple>> findLongestIncreasingWeightSubSequence(TowerBuilding.Tuple [] tuples){
		List<List<TowerBuilding.Tuple>> possibleTowerBuildings= new ArrayList<List<TowerBuilding.Tuple>>(tuples.length);
		List<TowerBuilding.Tuple> tuple0 = new LinkedList<TowerBuilding.Tuple>();
		tuple0.add(tuples[0]);
		possibleTowerBuildings.add(tuple0);
		
		for(int i=1;i< tuples.length;i++){
			List<TowerBuilding.Tuple> max=null;
			for (int j=0;j<possibleTowerBuildings.size();j++){
				List<TowerBuilding.Tuple> tupleK =possibleTowerBuildings.get(j);
				if (tupleK.get(tupleK.size()-1).weight < tuples[i].weight){
					if (max==null || tupleK.size() > max.size()){
						max=tupleK;
					}
				}
			}
			List<TowerBuilding.Tuple> newMax=new ArrayList<TowerBuilding.Tuple>();
			if (max != null){
				newMax=new ArrayList<TowerBuilding.Tuple>(max.size());
				newMax.addAll(max);
			}
			newMax.add(tuples[i]);
			possibleTowerBuildings.add(newMax);
		}
		return possibleTowerBuildings;
	}
	
		
	public static void main(String args[]){
		
		TowerBuilding.Tuple t1 = new TowerBuilding.Tuple();
		t1.height=1;
		t1.weight=6;
		
		TowerBuilding.Tuple t3 = new TowerBuilding.Tuple();
		t3.height=2;
		t3.weight=7;

		TowerBuilding.Tuple t2 = new TowerBuilding.Tuple();
		t2.height=3;
		t2.weight=9;
		
		TowerBuilding.Tuple[] ts= new TowerBuilding.Tuple[3];
		ts[0]=t2;
		ts[1]=t1;
		ts[2]=t3;
		
		System.out.println(TowerBuilding.algorithm(ts));
	}
	

}
