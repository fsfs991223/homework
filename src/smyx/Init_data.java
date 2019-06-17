package smyx;
//ÉèÖÃÒ»Ğ©×´Ì¬
public class Init_data {
	 static boolean[][] state;
	    static int rand;
	    public Init_data(boolean[][] state_one)
	    {
	        state = state_one;
	    }

	    public void init_one()
	    {
	        for(int i=1;i<state.length;i++)
	        {
	            for(int j=1;j<state[i].length-1;j++)
	            {
	                state[i][j] = false;
	            }
	        }
	        
	        //LOVE
	        //L
	        state[9][3] = true;
	        state[10][3] = true;
	        state[11][3] = true;
	        state[12][3] = true;
	        state[13][3] = true;
	        state[14][3] = true;
	        state[14][4] = true;
	        state[14][5] = true;

	        //O
	        state[9][8] = true;
	        state[10][7] = true;
	        state[11][7] = true;
	        state[12][7] = true;
	        state[13][7] = true;
	        state[14][8] = true;
	        state[10][9] = true;
	        state[11][9] = true;
	        state[12][9] = true;
	        state[13][9] = true;
	        
	        //V
	        state[9][11] = true;
	        state[10][12] = true;
	        state[11][13] = true;
	        state[12][14] = true;
	        state[13][15] = true;
	        state[14][16] = true;
	        state[13][17] = true;
	        state[12][18] = true;
	        state[11][19] = true;
	        state[10][20] = true;
	        state[9][21] = true;
	        
	        
	        //E
	        state[9][23] = true;
	        state[9][24] = true;
	        state[9][25] = true;
	        state[9][26] = true;
	        state[10][23] = true;
	        state[11][23] = true;
	        state[12][23] = true;
	        state[12][24] = true;
	        state[12][25] = true;
	        state[12][26] = true;
	        state[13][23] = true;
	        state[14][23] = true;
	        state[15][23] = true;
	        state[15][24] = true;
	        state[15][25] = true;
	        state[15][26] = true;
	        
	    
	    }
	    
	    public void init_two()
	    {
	        for(int i=1;i<state.length;i++)
	        {
	            for(int j=1;j<state[i].length-1;j++)
	            {
	                state[i][j] = false;
	            }
	        }

	        state[23][3] = true;
	        state[23][4] = true;
	        state[23][5] = true;
	        state[22][3] = true;
	        state[22][4] = true;
	        state[22][5] = true;
	        state[21][3] = true;
	        state[21][4] = true;
	        state[21][5] = true;
	        state[20][3] = true;
	        state[20][4] = true;
	        state[20][5] = true;
	        state[19][3] = true;
	        state[19][4] = true;
	        state[19][5] = true;
	        state[18][3] = true;
	        state[18][4] = true;
	        state[18][5] = true;
	        state[17][3] = true;
	        state[17][4] = true;
	        state[17][5] = true;
	        state[16][3] = true;
	        state[16][4] = true;
	        state[16][5] = true;
	        
	        
	        
	        state[16][6] = true;
	        state[16][7] = true;
	        state[16][8] = true;
	        state[16][9] = true;
	        state[16][10] = true;
	        state[16][11] = true;
	        state[16][12] = true;
	        state[16][13] = true;
	        state[17][6] = true;
	        state[17][7] = true;
	        state[17][8] = true;
	        state[17][9] = true;
	        state[17][10] = true;
	        state[17][11] = true;
	        state[17][12] = true;
	        state[17][13] = true;
	        state[18][6] = true;
	        state[18][7] = true;
	        state[18][8] = true;
	        state[18][9] = true;
	        state[18][10] = true;
	        state[18][11] = true;
	        state[18][12] = true;
	        state[18][13] = true;
	        
	        state[15][9] = true;
	        state[14][9] = true;
	        state[13][9] = true;
	        state[12][9] = true;
	        state[11][9] = true;
	        state[10][9] = true;
	        state[9][9] = true;
	        state[9][8] = true;
	        state[9][7] = true;
	        state[9][6] = true;
	        state[9][5] = true;
	        
	        state[15][10] = true;
	        state[14][10] = true;
	        state[13][10] = true;
	        state[12][10] = true;
	        state[11][10] = true;
	        state[10][10] = true;
	        state[9][10] = true;

	        state[15][11] = true;
	        state[14][11] = true;
	        state[13][11] = true;
	        state[12][11] = true;
	        state[11][11] = true;
	        state[10][11] = true;
	        state[9][11] = true;
	        
	        state[15][12] = true;
	        state[14][12] = true;
	        state[13][12] = true;
	        state[12][12] = true;
	        state[11][12] = true;
	        state[10][12] = true;
	        state[9][12] = true;
	        
	        state[15][13] = true;
	        state[14][13] = true;
	        state[13][13] = true;
	        state[12][13] = true;
	        state[11][13] = true;
	        state[10][13] = true;
	        state[9][13] = true;
	        state[9][14] = true;
	        state[9][15] = true;
	        state[9][16] = true;
	        state[9][17] = true;

	        state[3][11] = true;
	        state[4][10] = true;state[4][11] = true;state[4][12] = true;
	        state[5][9] = true;state[5][10] = true;state[5][11] = true;state[5][12] = true;state[5][13] = true;
	        state[6][8] = true;state[6][9] = true;state[6][10] = true;state[6][11] = true;state[6][12] = true;state[6][13] = true;state[6][14] = true;
	        state[7][7] = true;state[7][8] = true;state[7][9] = true;state[7][10] = true;state[7][11] = true;state[7][12] = true;state[7][13] = true;state[7][14] = true;state[7][15] = true;
	        state[8][6] = true;state[8][7] = true;state[8][8] = true;state[8][9] = true;state[8][10] = true;state[8][11] = true;state[8][12] = true;state[8][13] = true;state[8][14] = true;state[8][15] = true;state[8][16] = true;
	        
	    }
	    
	    public void init_three()
	    {
	        for(int i=1;i<state.length;i++)
	        {
	            for(int j=1;j<state[i].length-1;j++)
	            {
	                rand = (int) (Math.random()*100);
	                if (rand<50) {
	                    state[i][j] = false;
	                }
	                else
	                    state[i][j] = true;
	            }
	        }
	    }
	    public void init_zero()
	    {
	        for(int i=1;i<state.length;i++)
	        {
	            for(int j=1;j<state[i].length-1;j++)
	            {
	                state[i][j] = false;
	            }
	        }
	        state[9][3] = true;
	        state[9][4] = true;
	        state[9][6] = true;
	        state[9][7] = true;
	        state[9][5] = true;
	        state[10][5] = true;
	        state[11][5] = true;
	        state[12][5] = true;
	        state[13][5] = true;
	        state[14][5] = true;
	        state[14][4] = true;
	        state[14][6] = true;
	        state[14][3] = true;
	        state[14][7] = true;

	    }
	}


