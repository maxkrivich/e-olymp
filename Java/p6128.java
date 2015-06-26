import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static LinkedList list=new LinkedList();

	public static void pushFront(int a){
		list.addFirst(a);
		System.out.println("ok");
	}
	public static void pushBack(int a){
		list.addLast(a);
		System.out.println("ok");
	}
	public static void popFront(){
		System.out.println(list.getFirst().toString());
		list.removeFirst();
	}
	public static void popBack(){
		System.out.println(list.getLast().toString());
		list.removeLast();
	}
	public static void front(){
		System.out.println(list.getFirst());
	}
	public static void back(){
		System.out.println(list.getLast());
	}
	public static void size(){
		System.out.println(list.size());
	}
	public static void clear(){
		list.clear();
		System.out.println("ok");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String cmd=in.next();
			if("push_front".equals(cmd))
				pushFront(in.nextInt());
			if("push_back".equals(cmd))
				pushBack(in.nextInt());
			if ("pop_front".equals(cmd))
				popFront();
			if("pop_back".equals(cmd))
				popBack();
			if("front".equals(cmd))
				front();
			if("back".equals(cmd))
				back();
			if("size".endsWith(cmd))
				size();
			if("clear".equals(cmd))
				clear();
			if("exit".equals(cmd)){
				System.out.println("bye");
				break;
			}
			
			
		}
		
		
	}

}
