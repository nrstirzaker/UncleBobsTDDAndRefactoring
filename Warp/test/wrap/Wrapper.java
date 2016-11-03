package wrap;

public class Wrapper {

	public String wrap(String input, int delim_position) {
		StringBuffer buffer =  new StringBuffer(input);
		
		if (delim_position == 0)
			return "";
		else if(delim_position > buffer.length())
		else{
			String output = buffer.substring(0, delim_position) + "\n" + buffer.substring(1);
			return output;
		}
		
		
	}

}
