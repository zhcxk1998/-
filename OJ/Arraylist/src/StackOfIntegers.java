
import java.util.ArrayList;

import java.util.Scanner;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 2;

	public StackOfIntegers(){
		elements=new int[DEFAULT_CAPACITY];
		size=0;
	}

	public void push(int num){
		if (elements.length>=DEFAULT_CAPACITY){
			int[] bb=new int[1+elements.length];
			for (int i=0; i<elements.length;i++){
				bb[i]=elements[i];
			}
			elements=bb;
		}
		elements[size++]=num;
//		System.out.println("这是elements长度："+elements.length);

	}
	public int pop(){
		int num=elements[--size];
		return num;
	}


	public static void main(String[] args) {

		final int MAX_VALUE = 5;
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int count = MAX_VALUE;
			StackOfIntegers stack = new StackOfIntegers();
			while (count > 0) {
				stack.push(input.nextInt());
				count--;
			}
			count = MAX_VALUE;
			while (count > 0) {
				System.out.print(stack.pop());
				if (count != 1)
					System.out.print(" ");
				count--;
			}
			System.out.println();

		}

	}

}


