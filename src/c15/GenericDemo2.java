package c15;

public class GenericDemo2 {
	public static void main(String[] args) {
		
	}
	
	// workaround of this runtime limitation is to use "Class<T>" tokens for runtime type checks
	public <T> void createWithTypeToken(Class<T> type) {
		try {
			T intance = type.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
