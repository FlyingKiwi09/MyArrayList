
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		
		for (int i = 0; i < 8; i++) {
			list.add("number" + i);
		}
		
		list.add(5, "Hello");
		list.add(5, "Hello");
		list.add(5, "Hello");
		list.add(5, "Hello");
		list.add(5, "Hello");
		list.add(5, "Hello");
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
