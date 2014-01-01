package com.xgs.zwy.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.xgs.zwy.ui.main.mainFrame;

public class LoginWindows extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7118404032443794000L;
	public LoginWindows(){
		jLabel1 = new javax.swing.JLabel();
		accuont = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		pwd = new javax.swing.JPasswordField();
		loginButton = new javax.swing.JButton();
		canalLoginButton = new javax.swing.JButton();
		 jLabel1.setText("账号：");

	        jLabel2.setText("密码：");

	        loginButton.setText("登陆");

	        canalLoginButton.setText("取消");
	    
	        loginButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String accountStr = accuont.getText();
					String pwdStr = pwd.getText();
					dispose();
				
					new mainFrame().setVisible(true);;
//					if("sinoair".equals(accountStr)&&"ljr2006511".equals(pwdStr)){
//						dispose();
//						new MainWindows();
//					
//					}else{
//						JOptionPane.showMessageDialog(null, "账号或密码错误！", "提示信息！",
//								JOptionPane.ERROR_MESSAGE);
//					}
					
				}
			});
	        canalLoginButton.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		System.exit(0);
	        	}
	        });
	        javax.swing.GroupLayout loginDialogLayout = new javax.swing.GroupLayout(getContentPane());
	       getContentPane().setLayout(loginDialogLayout);
	        loginDialogLayout.setHorizontalGroup(
	            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(loginDialogLayout.createSequentialGroup()
	                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(loginDialogLayout.createSequentialGroup()
	                        .addGap(64, 64, 64)
	                        .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel1)
	                            .addComponent(jLabel2))
	                        .addGap(40, 40, 40)
	                        .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(accuont, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
	                            .addComponent(pwd)))
	                    .addGroup(loginDialogLayout.createSequentialGroup()
	                        .addGap(126, 126, 126)
	                        .addComponent(loginButton)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(canalLoginButton)))
	                .addContainerGap(99, Short.MAX_VALUE))
	        );
	        loginDialogLayout.setVerticalGroup(
	            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(loginDialogLayout.createSequentialGroup()
	                .addGap(43, 43, 43)
	                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(accuont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(31, 31, 31)
	                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(loginButton)
	                    .addComponent(canalLoginButton))
	                .addContainerGap(19, Short.MAX_VALUE))
	        );
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); 
	        setTitle("登陆");
	       pack();
	       setVisible(true);
	}
	
	
	private javax.swing.JButton loginButton;
	private javax.swing.JTextField accuont;
	private javax.swing.JPasswordField pwd;
	private javax.swing.JButton canalLoginButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
}
