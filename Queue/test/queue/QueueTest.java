package queue;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void createEmptyQueue() {
		Queue queue = new Queue();
		assertThat(queue.size(), is(0));
	}
	
	@Test
	public void addToEmptyQueue(){
		Queue queue = new Queue();
		queue.add(0);
		
		assertThat(queue.size(), is(1));
		
	}

	@Test(expected = Queue.UnderFlow.class)
	public void removeFromEmptyQueue(){
		Queue queue = new Queue();
		queue.remove();
		
	}
	
	@Test 
	public void removeFromoExistingQueueLengthOne(){
		Queue queue = new Queue();
		queue.add(0);
		
		queue.remove();
		
		assertThat(queue.size(), is(0));
		
	}
	
	

}
