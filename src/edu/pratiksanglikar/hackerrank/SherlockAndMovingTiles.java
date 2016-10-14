/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Pratik Sanglikar
 *
 */
public class SherlockAndMovingTiles {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long l = Long.parseLong(st.nextToken()), 
            s1 = Long.parseLong(st.nextToken()),
            s2 = Long.parseLong(st.nextToken());
        StringBuffer sb = new StringBuffer();
        int q = Integer.parseInt(br.readLine().trim());
        if(s1 > s2) {
            long temp = s1;
            s1 = s2;
            s2 = temp;
        }
        double d1 = Math.sqrt(2) * l, distance1 = 0, distance2 = 0, diff = 0;
        long t = 0;
        while(q-- > 0) {
            t = Long.parseLong(br.readLine().trim());
            distance1 = calculateDistance(s1, t);
            distance2 = calculateDistance(s2, t);
            diff = distance2 - distance1;
            if(diff >= d1) {
                sb.append(0.000 + "\n");
            } else {
                sb.append((diff * diff / 2) + "\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    static double calculateDistance(long speed, long time) {
        return speed * time;
    }
}
