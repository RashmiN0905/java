import java.util.ArrayList;
class addMethod {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();// adding the elements
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		ArrayList a2 = new ArrayList();// adding the elements into the list
		a2.add(60);
		a2.add(50);
		a2.add(70);
		a2.add(80);
		a2.add(a1);
		System.out.println(a2);

		ArrayList a3 = new ArrayList();// adding the collection into the list
		a3.add(60);
		a3.add(50);
		a3.add(70);
		a3.add(80);
		a3.addAll(a1);
		System.out.println(a3);//[60, 50, 70, 80, 10, 20, 30, 40]

		ArrayList a4 = new ArrayList();// adding the collection into the list
		a4.add(1);
		a4.add(2);
		a4.add(3);
		a4.add(8);
		a4.addAll(a1);
		a4.add(0,a3);
		a4.add(2,"Rashmi");
		System.out.println(a4);
	}

}