package smyx;
/*涂色类
 * 根据state[][]中各个表格的状态进行涂色
 * 底色为白色，活跃生命为黑色
 */
import java.awt.Color;

import javax.swing.JPanel;

public class set_color {
    static boolean [][] state_one;
    static JPanel[][] jPanel;
    //初始化类
    public set_color(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    //设置颜色
    public static void paint()
    {
            
        //循环判断状态设置颜色
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<2;j++)
            {
                if (state_one[i][j]==true) {
                jPanel[i][j].setBackground(Color.black);
                }
                else{
                    jPanel[i][j].setBackground(Color.white);
                }
            }
        }
    }
}