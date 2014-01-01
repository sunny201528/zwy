package com.xgs.zwy.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 系统配置面板
 * @author n-194
 *
 */
public class CopyOfSystemSettingPanel extends JPanel {
private JLabel label = null;
private JTextField textField = null;
private JButton button = null;
private JButton saveButton = null;
private JFileChooser fileChooser = null;
	public CopyOfSystemSettingPanel(){
		init();
	}
	
	private void init(){
		 label = new JLabel();
		 label.setText("输出文件的路径");
		 textField = new JTextField(12);
		 textField.setEditable(false);
		 textField.setText("");
		 button = new JButton();
		 button.setText("请选择文件输出目录");
		 final JPanel  panel = this;
		 /**
		  * 选择输出目录事件
		  */
		 button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// 设定只能选择到文件夹
				fileChooser.setSelectedFile(new File(""));
				int state = fileChooser.showOpenDialog(panel);// 此句是打开文件选择器界面的触发语句
				if (state == 1) {
					textField.setText("");
					return;// 撤销则返回
				} else {
					File f = fileChooser.getSelectedFile();// f为选择到的目录
					textField.setText(f.getAbsolutePath());
				}
			}
		});
		 
		 saveButton = new JButton();
		 saveButton.setText("保存");
		 //ThreadLocalVariable.getSystemSetting().getOutPath()
		 this.add(label);
		 this.add(textField);
		 this.add(button);
		 this.add(saveButton);
//		 panel.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame JFrame= new JFrame("iiii");
		JFrame.add(new CopyOfSystemSettingPanel());
		JFrame.setVisible(true)
		 ;
	}
}
