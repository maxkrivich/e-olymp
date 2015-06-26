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
		if(check()){
		System.out.println(list.getFirst());
		list.removeFirst();
		}else 
			System.out.println("error");
	}
	public static void popBack(){
		if(check()){
		System.out.println(list.getLast());
		list.removeLast();
		}
		else 
			System.out.println("error");
	}
	public static void front(){
		if(check())
			System.out.println(list.getFirst());
		else
			System.out.println("error");
	}
	public static void back(){
		if(check())
		System.out.println(list.getLast());
		else
			System.out.println("error");
	}
	public static void size(){
		System.out.println(list.size());
	}
	public static void clear(){
		list.clear();
		System.out.println("ok");
	}
	public static boolean check(){
		return list.size()>0?true:false;
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
