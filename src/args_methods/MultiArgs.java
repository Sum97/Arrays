package args_methods;


import java.util.Scanner;

public class MultiArgs {
	public static void main(String[] args) {
		try(Scanner  kb=new Scanner(System.in)){
			CustomArray<String> str=new CustomArray<>();//custom arrayList
		for(int i=0;i<8;i++) // length must be declared
		{
		System.out.println("Enter String");
		str.add(kb.nextLine());//unlimited add 
		}
		System.out.println("CustomArray Methods");
		MethodHandler.getArgs(str.getAsGeneric());//Generic Type call
		System.out.println("Args Methods 1D");
        MethodHandler.exmArgs(str.getAsObjects());//Object Type
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
}
