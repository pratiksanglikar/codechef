package edu.pratiksanglikar.hackerrank.stats;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map;

public class Stats0 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim()), mode = 0;
		DecimalFormat df = new DecimalFormat("#0.0");
		double[] array = new double[n];
		double mean, median;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			array[i] = Double.parseDouble(st.nextToken());
		}
		mean = getMean(array);
		median = getMedian(array);
		mode = getMode(array);
		System.out.println(df.format(mean));
		System.out.println(df.format(median));
		System.out.println(mode);
	}

	private static double getMean(double[] array) {
		double mean = 0.0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (sum / array.length);
	}

	private static double getMedian(double[] array) {
		Arrays.sort(array);
		if (array.length % 2 != 0) {
			return array[array.length / 2];
		} else {
			return (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
			// 1 2 3 4 5 6
			// 0 1 2 3 4 5
		}
	}

	private static int getMode(double[] array) {
		TreeMap<Double, Integer> map = new TreeMap<Double, Integer>();
		double mode = array[0];
		int maxVal = 0;
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		for(Map.Entry<Double, Integer> entry: map.entrySet()) {
			if(entry.getValue() > maxVal) {
				maxVal = entry.getValue();
				mode = entry.getKey();
			}
		}
		return (int) mode;
	}
}