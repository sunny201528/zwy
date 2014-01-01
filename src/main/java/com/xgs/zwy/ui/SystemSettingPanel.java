package com.xgs.zwy.ui;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.xgs.zwy.base.ThreadLocalVariable;
import com.xgs.zwy.domain.SystemSetting;
import com.xgs.zwy.service.SystemSettingService;
import com.xgs.zwy.service.impl.SystemSettingServiceImpl;

/**
 * 系统配置面板
 * @author n-194
 *
 */
public class SystemSettingPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 540063687222333073L;
	private javax.swing.JButton inSelectFilePathBnt;
    private javax.swing.JTextField inputPath1;
    private javax.swing.JLabel inputPathLable;
    private javax.swing.JTextField outputPath;
    private javax.swing.JLabel outputPathLable;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectFilePathBnt;
private JFileChooser fileChooser = null;

private SystemSettingService systemSettingService = new SystemSettingServiceImpl();
	public SystemSettingPanel(){
		init();
	}
	
	private void init(){

        outputPathLable = new javax.swing.JLabel();
        outputPath = new javax.swing.JTextField();
        selectFilePathBnt = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        inputPathLable = new javax.swing.JLabel();
        inputPath1 = new javax.swing.JTextField();
        inSelectFilePathBnt = new javax.swing.JButton();

        outputPathLable.setText("文件输出目录：");

        selectFilePathBnt.setText("选择");
        selectFilePathBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFilePathBntActionPerformed(evt);
            }
        });

        saveButton.setText("保存设置");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	saveButtonActionPerformed(evt);
            }
        });
        inputPathLable.setText("文件输入目录：");


        inSelectFilePathBnt.setText("选择");
        initValue(ThreadLocalVariable.getSystemSetting());
        inSelectFilePathBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inSelectFilePathBntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputPathLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPath1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inSelectFilePathBnt))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputPathLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectFilePathBnt))
                    .addGroup(layout.createSequentialGroup()))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPathLable)
                    .addComponent(inputPath1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inSelectFilePathBnt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputPathLable)
                    .addComponent(outputPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectFilePathBnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(90, 90, 90))
        );
   
		
	}
	protected void inSelectFilePathBntActionPerformed(ActionEvent evt) {
		getfilePath2Text(fileChooser,inputPath1);
		
	}

	protected void selectFilePathBntActionPerformed(ActionEvent evt) {
		getfilePath2Text(fileChooser,outputPath);
		
	}

	private void getfilePath2Text(JFileChooser fileChooser, JTextField textField ) {
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// 设定只能选择到文件夹
		fileChooser.setSelectedFile(new File(""));
		int state = fileChooser.showOpenDialog(this);// 此句是打开文件选择器界面的触发语句
		if ( JFileChooser.CANCEL_OPTION == state) {
			textField.setText("");
			return;// 撤销则返回
		} else {
			File f = fileChooser.getSelectedFile();// f为选择到的目录
			textField.setText(f.getAbsolutePath());
		}
	}

	
	protected void saveButtonActionPerformed(ActionEvent evt) {
		if (inputPath1==null||inputPath1.getText()==null||inputPath1.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "请选择输入文件的路径！", "提示信息！",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (outputPath==null||outputPath.getText()==null||outputPath.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "请选择输出文件的路径！", "提示信息！",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		SystemSetting systemSetting =new SystemSetting();
		systemSetting.setOutPath(outputPath.getText().trim());
		systemSetting.setInPath(inputPath1.getText().trim());
		
		try {
			systemSettingService.saveOrUpdate(systemSetting);
			ThreadLocalVariable.setSystemSetting(systemSetting);
			JOptionPane.showMessageDialog(null, "保存成功了！", "提示信息！",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "保存失败！请联系管理员！", "提示信息！",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}

	public void initValue(SystemSetting setting){
		if(setting!=null){
			outputPath.setText(setting.getOutPath());
			inputPath1.setText(setting.getInPath());
		}
	}
	public static void main(String[] args) {
		JFrame JFrame= new JFrame("iiii");
		JFrame.add(new SystemSettingPanel());
		JFrame.setVisible(true)
		 ;
	}
}
