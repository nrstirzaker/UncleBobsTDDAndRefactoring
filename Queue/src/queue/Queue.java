package queue;

public class Queue {

	private Integer size = 0;
	
	public Integer size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void add(int element){
		size++;
	}

	public class UnderFlow extends RuntimeException{
		
	}

	public void remove() {
		if(size ==0){
			throw new UnderFlow();
		}
		
		--size;
	}
	
}
