/**
 * 
 */
package edu.pratiksanglikar.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pratik Sanglikar
 *
 */
public class FileRead {
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("abc.txt"))));
		System.out.println(br.readLine());
	}
}
