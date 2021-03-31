package linkedstk;

public class LinkedStkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedNode<String> lk = new LinkedNode<>();
		lk.push("Hello");
		lk.push("hi");
		lk.push("da");
		lk.push("ok");
		lk.push("qw");
		lk.print();
		System.out.println("=================================");
		lk.pop();
		lk.print();
	}

}
