package smyx;
/*****************
 * 构建窗口类
 * 菜单choice（控制）：1、开始 2、继续 3、结束
 * 菜单pattern（模式）:1、easy 2、love型 3、arrow箭头型 4、随机模式
 * 菜单speed（速度）：1、100 2、1000 3、5000
 * 菜单help（帮助）：1、abstract（游戏规则介绍）2、editor（制作者）
 * 红色栏：1、Number of remaining lives（剩余生命个数）2、step：生命演化步数
 * 表格栏 30*30
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class set_frame {
    JFrame iFrame;
    //游戏迭代速度
    static int speed = 1000;
    //剩余生命个数
    static int life = 0;
    //演化步数
    static int step_one = 0;
    myThread thread = null;
    static start_frame start_frame;
    //显示细胞状态面板
    static JPanel[][] jPanel;
    //模式一（love）
    static int pattern = 1;
    //显示生命个数面板
    static JPanel panel_1;
    static JLabel number;
    static JLabel step;
    static boolean end = true;
    public set_frame (int row ,int col) {
        //建立窗口
        iFrame = new JFrame("生命游戏");
        //初始化边界
        jPanel = new JPanel[row][col];
        iFrame.getContentPane().setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        iFrame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        number = new JLabel("剩余活细胞数: "+life+"               ");
        panel.add(number);
        
        step = new JLabel("step: "+step_one);
        panel.add(step);

        panel.setBackground(Color.red);
        panel_1 = new JPanel();
        iFrame.getContentPane().add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(new GridLayout(30, 30, 2, 2));
        //初始化所有界面为白色
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                jPanel[i][j] = new JPanel();
                jPanel[i][j].setBackground(Color.white);
                panel_1.add(jPanel[i][j]);
            }
        }
        
        //设置图形界面大小
        iFrame.setLocation(450, 180);
        iFrame.setSize(500, 500);        
        
        JMenuBar menuBar = new JMenuBar();
        iFrame.setJMenuBar(menuBar);
        
        JMenu choice = new JMenu("选择");
        menuBar.add(choice);
        
        JMenuItem start = new JMenuItem("开始");
        choice.add(start);
        start.addActionListener(new start());
        
        JMenuItem continue_one = new JMenuItem("继续");
        choice.add(continue_one);
        continue_one.addActionListener(new continue_one());
        
        
        JMenuItem stop = new JMenuItem("暂停");
        choice.add(stop);
        stop.addActionListener(new stop());
        
        JMenu pattern = new JMenu("模板选择");
        menuBar.add(pattern);
        
        JMenuItem easy = new JMenuItem("简单图形");
        pattern.add(easy);
        easy.addActionListener(new easy());
        
        JMenuItem love = new JMenuItem("love");
        pattern.add(love);
        love.addActionListener(new love());
        
        JMenuItem arrow = new JMenuItem("箭头");
        pattern.add(arrow);
        arrow.addActionListener(new arrow());
        
        JMenuItem random = new JMenuItem("随机图形");
        pattern.add(random);
        random.addActionListener(new random());
        
        
        JMenu speed = new JMenu("速度");
        menuBar.add(speed);
        
        JMenuItem speed_fast = new JMenuItem("快速");
        speed.add(speed_fast);
        speed_fast.addActionListener(new speed_fast());
        
        JMenuItem speed_middle = new JMenuItem("中速");
        speed.add(speed_middle);
        speed_middle.addActionListener(new speed_middle());
        
        JMenuItem speed_low = new JMenuItem("慢速");
        speed.add(speed_low);
        speed_low.addActionListener(new speed_low());
        
        iFrame.setVisible(true);
        
    }
    
    class myThread extends Thread{
        public myThread()    {    
        }
        public void run(){
            while(end)
            {
                life = 0;
                start_frame.judge.judge();
                try {
                    sleep(speed);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                for (int m = 1; m < start_frame.state_one.length - 1; m++)
                {
                    for (int n = 1; n < start_frame.state_one[m].length - 1; n++) 
                    {
                        if (start_frame.state_one[m][n]==true) {
                            life ++;
                        }
                    }
                }
                step_one++;
                number.setText("剩余活细胞: "+life+"               ");
                step.setText("代数: "+step_one);
                
                start_frame.set_color.paint();
                
                if (life==0) {
                    end = false;
                    JOptionPane.showMessageDialog(null, "生命演化结束：\n"
                            + "        经历代数为"+step_one);
                }
                
            }
        }
    }
    
        //控制游戏的开始
        class start implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //初始化逻辑地图
                if (pattern==1) {
                    start_frame.init_data.init_one();
                }else if (pattern==2) {
                    start_frame.init_data.init_two();
                }else if (pattern==3) {

                    start_frame.init_data.init_three();
                }else {
                    start_frame.init_data.init_zero();
                }
                //更新地图颜色
                start_frame.set_color.paint();
                //初始化步数和剩余生命个数
                life = 0;
                step_one = 0;
                end = true;
                //控制线程的开断
                if (thread != null)  
                    thread.stop();  
                thread = new myThread();  
                thread.start();  
            }
        }
        //控制游戏的继续
        class continue_one implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(thread!=null)
                    thread.stop();
                thread = new myThread();
                thread.start();
            }
            
        }
        //控制游戏的停止
        class stop implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //控制线程的开断
                if (thread != null)  
                    thread.stop();  
                thread = null;  
            }
            
        }
        //设置生命迭代速度（快速）
        class speed_fast implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                speed = 100;
            }
        }
        //设置生命迭代速度（中速）
        class speed_middle implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                speed = 1000;
            }
        }
        //设置生命迭代速度（慢速）
        class speed_low implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                speed = 5000;
            }
        }
        //模式中 love型
        class love implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                pattern = 1;
            }
            
        }
        //模式中 箭头型
        class arrow implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                pattern = 2;
            }
            
        }
        //随机模式
        class random implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                pattern = 3;
            }
            
        }
        //随机模式
                class easy implements ActionListener
                {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        pattern = 0;
                    }
                    
                }
}