/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* All Possible factors of given number. */

class GreedyIntervalSchedular {
    
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<Interval>();
        list.add(new Interval(1,4));
        list.add(new Interval(3,4));
        list.add(new Interval(5,9));
        list.add(new Interval(2,7));
        list.add(new Interval(6,8));        
        System.out.println(greedyIntervalSchedular(list));        
    }
    
    private static int greedyIntervalSchedular(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());
        Interval prev = intervals.get(0);
        int count = 1;
        for(int i=1; i<intervals.size();i++) {
            if(intervals.get(i).getStartTime() >= prev.getFinishTime()) {
            	System.out.println("[" + intervals.get(i).getStartTime() + ", " + intervals.get(i).getFinishTime() + "]");
                count++;
                prev = intervals.get(i);
            }
        }
        return count;
    }    
}

class Interval {
    private int start_time;
    private int end_time;
    
    public Interval(int start_time, int end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
    }
    
    public int getFinishTime() {
    	return this.end_time;
    }
    
    public int getStartTime() {
        return this.start_time;
    }
}

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval o1, Interval o2) {
        Integer first = new Integer(o1.getStartTime());
        Integer second = new Integer(o2.getStartTime());
        return first.compareTo(second);
    }
}
