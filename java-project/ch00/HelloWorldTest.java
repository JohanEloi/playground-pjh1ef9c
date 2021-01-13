package ch00;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest{
    @Test
    public void testRep(){
        try{
            String rep = HelloWorld.getRep();
            assertEquals("Hello World!",rep);
        }
        catch (AssertionError ae) {
			success(false);
			msg("Oops! ", ae.getMessage());
			msg("Hint ", " ??? ");
		}
    }

    private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}
}
