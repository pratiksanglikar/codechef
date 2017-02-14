package edu.pratiksanglikar.linkedin;

import java.io.*;
import java.util.*;

public class MyHashtable<K, V> {

	class HashEntry<K, V> {
		final K key;
		V value;
		HashEntry<K, V> next;

		int hash;

		public HashEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public HashEntry<K, V> getNext() {
			return next;
		}

		public void setNext(HashEntry<K, V> entry) {
			this.next = entry;
		}

	}

	private final int MAX_SIZE = 16;
	private List<HashEntry> list;

	public static void main(String args[]) throws Exception {
		new TestHarness(new MyHashtable<String, String>()).run();
	}

	public MyHashtable() {
		list = new ArrayList<HashEntry>(MAX_SIZE);
	}

	public void put(K key, V value) {
		if (key == null || value == null) {
			return;
		}
		int hash = hash(key);
		hash = hash % MAX_SIZE;
		HashEntry<K, V> entry = new HashEntry<K, V>(key, value);
		if (list.get(hash) == null) {
			list.add(hash, entry);
		} else {
			// hash collision handling
			HashEntry entry1 = list.get(hash);
			while (entry1.getNext() != null) {
				entry1 = entry1.getNext();
			}
			entry1.setNext(entry);
		}
	}

	private int hash(K key) {
		return key.hashCode();
	}

	public V get(K key) {
		if (key == null) {
			return null;
		}
		int hash = hash(key);
		hash = hash % MAX_SIZE;
		HashEntry<K, V> entry = this.list.get(hash);
		if (key.equals(entry.getKey())) {
			return entry.getValue();
		} else {
			while (entry.getNext() != null) {
				entry = entry.getNext();
				if (entry.getKey().equals(key)) {
					return entry.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * A helper class that tests MyHashtable by feeding it puts and gets from
	 * STDIN.
	 */
	public static class TestHarness {
		final static MyHashtable<String, String> hashtable = new MyHashtable<String, String>();

		public TestHarness(MyHashtable<String, String> hashtable) {
			hashtable = hashtable;
		}
		
		public static void main(String[] args) {
			run();
		}

		public static void run() {
			Scanner scanner = new Scanner(System.in);
			while (scanner.hasNext()) {
				String k = scanner.next();
				String v = null;
				if (k.contains("=")) {
					String[] split = k.split("\\=");
					k = split[0];
					v = split[1];
				}
				if (v == null) {
					System.out.println(hashtable.get(k));
				} else {
					hashtable.put(k, v);
				}
			}
		}
	}
}