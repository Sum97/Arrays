package args_methods;

public class CustomArray<T> {

	private int initialLenght=5;
	private Object[] objects = new Object[initialLenght];


	public boolean add(T t) {
		if (currentLenght() < objects.length) {
			objects[currentLenght()] = t;
			return true;
		} else {
			increamentObj();
			add(t);
			return true;
		}
	}

	private void increamentObj() {
		initialLenght+=(objects.length / 2);
		Object[] object = new Object[initialLenght];
		for (int j = 0; j < objects.length; j++) {
			object[j] = objects[j];
		}
		objects = object;
	}

	private int currentLenght() {
		int lenght = 0;
		for (Object object : objects) {
			if (object == null)
				return lenght;
			lenght++;
		}

		return lenght;

	}

	@SuppressWarnings({ "unchecked", "hiding" })
	public<T> T[] getAsGeneric() {
		return (T[]) objects;
	}

	@SuppressWarnings("unchecked")
	public T get(int index)
	{
		return (T) (objects[index]==null?null:objects[index]);
	}
	
	
	public Object[] getAsObjects() {
		return objects;
	}
}
