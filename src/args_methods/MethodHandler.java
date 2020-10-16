package args_methods;

public class MethodHandler {

	public static <T> void getArgs(T[] strings)
	{
		for( Object object:strings)
		{
			if(object==null)
				break;
			System.out.print(object+"\t");
		}
		System.out.println();
	}
	
	
	
	public static void exmArgs(Object ... obejct)
	{
		for( Object object:obejct)
		{
			if(object==null)
				break;
			System.out.print(object+"\t");
		}
		System.out.println();
	}
	

	public static void exmArgss(Object [] ... obejct)// 2-D Array
	{
		for( Object []object:obejct)
		{
			for(Object object2:object) {
			if(object2==null)
				break;
			System.out.print(object2+"\t");
			}
		}
		System.out.println();
	}
}
