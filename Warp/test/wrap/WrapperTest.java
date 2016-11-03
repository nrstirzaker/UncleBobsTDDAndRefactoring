package wrap;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class WrapperTest {
	
	private void assertWrapped(String s, int l, String wrapped){
		Wrapper wrap = new Wrapper();
		assertThat(wrap.wrap(s,l), is(wrapped));
	}

	@Test
	public void wrapTest() {
		Wrapper wrap = new Wrapper();
		assertWrapped("",0,"");
		assertWrapped("A", 0, "");
		assertWrapped("A",1,"A\n");
		assertWrapped("A", 2, "A\n");
		assertWrapped("AB", 1, "A\nB");
		assertWrapped("AB", 2, "AB\n");
	}

}
