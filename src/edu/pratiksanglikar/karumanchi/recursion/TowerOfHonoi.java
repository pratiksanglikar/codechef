/**
 * 
 */
package edu.pratiksanglikar.karumanchi.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Given the number of disks - n, list out steps to move disks from tower A to tower B.
 *  
 * @author Pratik Sanglikar
 *
 */
public class TowerOfHonoi {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final String towerA = "TOWER-A", towerB = "TOWER-B", towerC = "TOWER-C"; 
	private static int numberOfSteps = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int numberOfDisks = Integer.parseInt(br.readLine());
		move(numberOfDisks, towerA, towerB, towerC);
		System.out.println("Done!");
	}
	
	/**
	 * @param numberOfDisks
	 * @param towera2
	 * @param towerb2
	 * @param towerc2
	 */
	private static void move(int numberOfDisks, String sourceTower, String destinationTower, String auxilaryTower) {
		if(numberOfDisks == 1) {
			System.out.println(numberOfSteps++ + ") Move disk from " + sourceTower + " to " + destinationTower);
			return;
		}
		move(numberOfDisks - 1, sourceTower, auxilaryTower, destinationTower);
		System.out.println(numberOfSteps++ + ") Move disk from " + sourceTower + " to " + destinationTower);
		move(numberOfDisks - 1, auxilaryTower, destinationTower, sourceTower);
		return;
	}
}
