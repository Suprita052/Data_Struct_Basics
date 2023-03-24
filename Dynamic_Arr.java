package DATASTRUCT;

import java.util.ArrayList;

public class Dynamic_Arr {
	
	
	private int arr[];
	private int capacity;
	private int current;
	
	
	public Dynamic_Arr() {
		arr = new int[1];
		capacity = 1;
		current = 0;
	}
	
	
	
	
	public void push(int data) {
		if(current == capacity) {
			int temp[] = new int[2*capacity];
			for(int i = 0;i<current;i++) {
				temp[i] = arr[i];
			}		
			capacity *= 2;
			arr = null;
			arr = temp;
		}
		arr[current] = data;
		current++;
	}
	
	
	
	
	void push(int data , int index) {
		if(index == current)
			push(data);
		else
			{
			arr[index] = data;			
			}	
		
	}
	
	
	
	
	int get(int index) {
		if(index<current)
			return arr[index];
		return -1;
	}
		
	
	
	
	
	
	void remove(int i) {
		for(int j = i ; j<current-1;j++)
			arr[j] = arr[j+1];
		current = current-1;
	}
	
	
	
	
	int getcapacity() {
		return capacity;
	}
	
	
	
	
	
	void print() {
		for(int i = 0; i<current ; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	int size() {
		return current;
	}
	
	
	void pop() {
		current--;
	}
	
	
	public static void main(String args[]) {
		
		Dynamic_Arr v = new Dynamic_Arr();
		v.push(10);
		v.push(61);
		v.push(80);
		v.push(98);
//		System.out.println(v.size());
//		System.out.println(v.getcapacity());
		
		v.push(0);
		v.print();
//		System.out.println(v.getcapacity());
		
		v.pop();
		
		v.remove(2);
		v.print();
		
	}
	
	
	
	
	
		
}

