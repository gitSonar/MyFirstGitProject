package HelloPkj;

public class HelloWorldTest extends junit.framework.TestCase {
	 public void testNothing() {
	    }
	    
	    public void testWillAlwaysPass() {
	    	String actual = "HelloWorld";
	        assertEquals("HelloWorld", actual);
	    }
	    
	    public void testWillAlwaysFail() {
	    	String actual = "Hello World";
	        assertEquals("HelloWorld", actual);
	    }
	    public void testWillAlwaysPass1() {
	    	String actual = "Hello World";
	        assertEquals("Hello World", actual);
	    }
	    
	   
}
