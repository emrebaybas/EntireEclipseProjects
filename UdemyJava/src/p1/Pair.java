package p1;

public class Pair <T> {

	private T first;
	private T second;
		
	public Pair() {
		super();
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public Object getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	public Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
}
