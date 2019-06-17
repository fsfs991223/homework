package smyx;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;

public class state_oneTest1 {
    static boolean [][] state_one;
    static JPanel[][] jPanel;
    boolean [][] b;

	@Test
	public void testJudge() 
	{	
		state_one[0][0]=true;
	    state_one[0][1]=true;
	    state_one[0][2]=true;
	    state_one[1][0]=true;
	    state_one[1][1]=true;
	    state_one[1][2]=true;
	    state_one[2][0]=true;
	    state_one[2][1]=true;
	    state_one[2][2]=true;
	    b[0][0]=true;
	    b[0][1]=false;
	    b[0][2]=true;
        b[1][0]=false;
     	b[1][1]=false;
	    b[1][2]=false;
        b[2][0]=true;
	    b[2][1]=false;
	    b[2][2]=true;
	    start_frame.set_color.paint();
        start_frame.judge.judge();
		assertEquals(b, state_one);
	}

}