package smyx;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class set_colorTest {

    static boolean [][] state_one;
    static JPanel[][] jPanel;
    int [][] b;

	@Test
	public void testPaint() {
		state_one[0][0]=true;
	    state_one[0][1]=false;
	    state_one[1][0]=true;
	    state_one[1][1]=false;
	    b[0][0]=1;
	    b[0][1]=1;//bug
        b[1][0]=1;
     	b[1][1]=1;//bug
	    start_frame.set_color.paint();
		assertEquals(b, state_one);
}
}
