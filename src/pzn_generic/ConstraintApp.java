package pzn_generic;

public class ConstraintApp {
	public static void main(String[] args) {
		
		NumberData<Integer> integerNumberData = new NumberData<>(1);
		NumberData<Long> longNumberData = new NumberData<>(10L);
		
		// NumberData<String> stringNumberData = new NumberData<String>("eko"); // ERROR
		
	}
	
	public static class NumberData<T extends Number> {
		private T data;

		public NumberData(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
			this.data.doubleValue(); 		
		}
	}
}
