/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NestedIf {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int adate =  Integer.parseInt(st.nextToken()),
            amonth = Integer.parseInt(st.nextToken()), 
            ayear = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()," ");
        int edate = Integer.parseInt(st.nextToken()),
            emonth = Integer.parseInt(st.nextToken()), 
            eyear = Integer.parseInt(st.nextToken()), fine = 0;
        
        if(ayear == eyear) {
            if(amonth == emonth) {
                if(adate <= edate) {
                    fine = 0;
                } else {
                    fine = (adate - edate) * 15;
                }
            } else if(amonth < emonth) {
                fine = 0;
            } else {
            	fine = (amonth - emonth) * 500;
            }
        } else if(ayear < eyear) {
            fine = 0;
        } else {
        	fine = 10000;
        }
        System.out.println(fine);
    }
}