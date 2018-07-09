/*
import java.util.ArrayList;
import java.util.Scanner;

public class MyStack extends ArrayList{

	public void push(Object str){
		add(str);
	}

	public Object pop(){
		if (isEmpty()){
			return null;
		}
		Object bb=get(size()-1);
		remove(bb);
		return bb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_VALUE = 5;
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int count = MAX_VALUE;
			MyStack stack = new MyStack();
			while (count > 0) {
				stack.push(input.next());
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

}*/



import java.util.ArrayList;
import java.util.Scanner;

public class MyStack {
	private ArrayList<Object> list =new ArrayList<Object>();

	public void push(Object str){
		list.add(str);
	}

	public Object pop(){
		int l=list.size()-1;
		Object str= list.get(l);
		list.remove(str);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_VALUE = 5;
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int count = MAX_VALUE;
			MyStack stack = new MyStack();
			while (count > 0) {
				stack.push(input.next());
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
