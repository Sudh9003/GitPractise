import java.util.Arrays;

public class Password {

	public static void main(String[] args) {
		
		
		String s= "Sudhanshu Sinha";
		System.out.println(s.replace(" ",""));
		String name[]= s.split(" ");
		System.out.println(name[0]);
		String fName= s.split(" ")[0];
		System.out.println(fName);
		
		
		
		
		int i;
		for(i=0;i<name.length;i++);
		{
		System.out.print(name[i]);
		//System.out.print(Arrays.toString(name));
		}
		
	}
	public void newFunction() {
		System.out.println("New Function Added");
	}
	}