
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("World");
		list.add("again");
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.set(2, "change");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		list.clear();
		System.out.println("After clear");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
