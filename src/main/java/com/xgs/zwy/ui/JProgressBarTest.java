package com.xgs.zwy.ui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class JProgressBarTest  extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 636115331511697232L;
	public JProgressBarTest() {
        super();
        setTitle("正在运行……");
//        setBounds(100,100,350,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setText("正在运行,请稍等……");
        JProgressBar progressBar = new JProgressBar();
//        progressBar.setStringPainted(true);  //显示提示信息
//        progressBar.setIndeterminate(false);   //确定进度的进度条
        progressBar.setIndeterminate(true);   //不确定进度的进度条
        //progressBar.setString("升级中...");    //确定信息时加上此条，则提示升级中，没有%比，如是不加上这个，则会提示%
        setLayout(new FlowLayout(2,15,15));
        add(label);
        add(progressBar);  //布局处理
        pack();
//        new Progress(progressBar,button2).start();   //自定义类progress
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        JProgressBarTest jProgressBarTest = new JProgressBarTest();
        jProgressBarTest.setVisible(true);
    }

}
//class Progress extends Thread{//自定义类progress
//    private final int []progressValue = {6,18,27,39,51,66,81,100};
//    private JProgressBar progressBar;
//    private JButton button;
//    public Progress(JProgressBar progressBar,JButton button)
//    {
//        this.progressBar = progressBar;
//        this.button =button;
//    }
//    public void run()
//    {
//        for(int i=0;i<progressValue.length;i++)
//        {
//            try
//            {
//                Thread.sleep(1000);
//            }catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//            progressBar.setValue(progressValue[i]);  //进度值
//        }
//        progressBar.setIndeterminate(false);  //采用确定的进度条
//        //progressBar.setIndeterminate(true);   //不确定进度的进度条
//        progressBar.setString("升级完成.");  //提示信息
//        button.setEnabled(true);  //按钮可用
//    }
//}