package testpk;

public class StringTest {

	public static void main(String[] args) {
		String taskName = "12345(abc)(2)";
		int start = taskName.lastIndexOf("(");
		int end = taskName.lastIndexOf(")");
		String substring = taskName.substring(start+1, end);
		String substring2 = taskName.substring(0, start);
		String substring3 = taskName.substring(taskName.lastIndexOf("("), taskName.length());
		
		String taskName2 = "12345";
		int start2 = taskName2.lastIndexOf("(");
		int end2 = taskName2.lastIndexOf(")");
		
		System.out.println(start);
		System.out.println(end);
		System.out.println(substring);
		System.out.println(substring2);
		System.out.println(substring3);
		System.out.println(start2);
		System.out.println(end2);
		
	}
}
