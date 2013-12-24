package com.xgs.zwy.ui;

import java.io.File;
import java.util.Date;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import com.xgs.zwy.constant.Constants;
import com.xgs.zwy.domain.CDHead;
import com.xgs.zwy.service.ExpTxtService;
import com.xgs.zwy.service.impl.ExpTxtlServiceImpl;
import com.xgs.zwy.util.ConstantUtils;
import com.xgs.zwy.util.DataValidator;
import com.xgs.zwy.vo.Item;


public class CDHeadDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7118404032443794000L;
	public CDHeadDialog(final String inPath,final String outPath){

		jDialog = new javax.swing.JDialog(this);
		dialog_Panel = new javax.swing.JPanel();
		billNO_Label = new javax.swing.JLabel();
		billNO_TextField = new javax.swing.JTextField();
		voyageName_Label = new javax.swing.JLabel();
		voyageName_TextField = new javax.swing.JTextField();
		i_E_Flag_Label = new javax.swing.JLabel();
		i_E_Flag_ComboBox = new javax.swing.JComboBox();
		totalCount_Label = new javax.swing.JLabel();
		totalCount_TextField = new javax.swing.JTextField();
		totalWT_Label = new javax.swing.JLabel();
		totalWT_TextField = new javax.swing.JTextField();
		i_E_Date_Label = new javax.swing.JLabel();
		i_E_Date_mp = new DateChooser("yyyy-MM-dd");
		i_E_Port_Label = new javax.swing.JLabel();
		i_E_Port_TextField = new javax.swing.JTextField();
		destinationPort_Label = new javax.swing.JLabel();
		destinationPort_TextField = new javax.swing.JTextField();
		trafMode_Label = new javax.swing.JLabel();
		trafMode_ComboBox = new javax.swing.JComboBox();
		dialog_Button3 = new javax.swing.JButton();
		dialog_Button4 = new javax.swing.JButton();


		jDialog.setModal(true);
		jDialog.setLocationRelativeTo(null); 

		dialog_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		billNO_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		billNO_Label.setText("总运单号：");

		voyageName_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		voyageName_Label.setText("运输工具名称：");

		i_E_Flag_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		i_E_Flag_Label.setText("进出口标示：");

		Item<String, String>[] i_e_Flag = ConstantUtils.map2Array(
				Constants.I_E_FLAG, true);
		i_E_Flag_ComboBox
				.setModel(new javax.swing.DefaultComboBoxModel(i_e_Flag));

		totalCount_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		totalCount_Label.setText("主单件数：");

		totalWT_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		totalWT_Label.setText("主单重量：");

		i_E_Date_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		i_E_Date_Label.setText("进出港日期：");

		i_E_Port_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		i_E_Port_Label.setText("进出口岸代码：");

		destinationPort_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		destinationPort_Label.setText("起运港/抵运地：");

		trafMode_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		trafMode_Label.setText("运输方式：");
		Item<String, String>[] trafModes = ConstantUtils.map2Array(
				Constants.TRAFMODE, false);
		trafMode_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(
				trafModes));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				dialog_Panel);
		dialog_Panel.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				trafMode_Label,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				115,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(25,
																				25,
																				25)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								i_E_Date_Label,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								totalWT_Label,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								totalCount_Label,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								voyageName_Label,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								i_E_Flag_Label,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								billNO_Label,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGap(10,
																												10,
																												10)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																destinationPort_Label,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																i_E_Port_Label,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))))))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																billNO_TextField,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																205,
																Short.MAX_VALUE)
														.addComponent(
																voyageName_TextField)
														.addComponent(
																i_E_Flag_ComboBox,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																totalCount_TextField)
														.addComponent(
																totalWT_TextField)
														.addComponent(
																i_E_Date_mp,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																i_E_Port_TextField)
														.addComponent(
																destinationPort_TextField)
														.addComponent(
																trafMode_ComboBox,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(28, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(34, 34, 34)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																billNO_Label)
														.addComponent(
																billNO_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																voyageName_Label)
														.addComponent(
																voyageName_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																i_E_Flag_Label)
														.addComponent(
																i_E_Flag_ComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																totalCount_Label)
														.addComponent(
																totalCount_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																totalWT_Label)
														.addComponent(
																totalWT_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																i_E_Date_Label)
														.addComponent(
																i_E_Date_mp,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																i_E_Port_Label)
														.addComponent(
																i_E_Port_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																destinationPort_Label)
														.addComponent(
																destinationPort_TextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																trafMode_Label)
														.addComponent(
																trafMode_ComboBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(33, Short.MAX_VALUE)));

		dialog_Button3.setText("确定");
		dialog_Button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("调用方法");
				/** 总运单号 */
				String billNO = billNO_TextField.getText();
				if(DataValidator.isNull(billNO)){
					JOptionPane.showMessageDialog(null, "总运单号 必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				/** 运输工具名称 */
				String voyageName = voyageName_TextField.getText();
				
				if(DataValidator.isNull(voyageName)){
					JOptionPane.showMessageDialog(null, "运输工具名称必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				Item item = (Item) i_E_Flag_ComboBox.getSelectedItem();
				if(DataValidator.isNull(item)||DataValidator.isNull(item.getKey())){
					JOptionPane.showMessageDialog(null, "进出口标志必须选择", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				/** 进出口标志 */
				String i_E_Flag = item.getKey().toString();
				/** 主单件数 */
				if(DataValidator.isNull(totalCount_TextField.getText())){
					JOptionPane.showMessageDialog(null, "主单件数 必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				long totalCount = Long.valueOf(totalCount_TextField.getText());
				/** 主单重量 */
				if(DataValidator.isNull(totalWT_TextField.getText())){
					JOptionPane.showMessageDialog(null, "主单重量必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				double totalWT = Double.valueOf(totalWT_TextField.getText());
				/** 进出口日期 */
				Date i_E_Date = i_E_Date_mp.getDate();
				/** 进出口岸代码 */
				String i_E_Port = i_E_Port_TextField.getText();
				if(DataValidator.isNull(i_E_Port)){
					JOptionPane.showMessageDialog(null, "进出口岸代码必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				/** 起运港(递运港) */
				String destinationPort = destinationPort_TextField.getText();
				if(DataValidator.isNull(destinationPort)){
					JOptionPane.showMessageDialog(null, "起运港(递运港)必须填写", "提示信息！",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				/** 运输方式代码 */
				String trafMode = ((Item) trafMode_ComboBox.getSelectedItem())
						.getKey().toString();

				cdHead = new CDHead();
				cdHead.setBillNO(billNO);
				cdHead.setDestinationPort(destinationPort);
				cdHead.setI_E_Date(i_E_Date);
				cdHead.setI_E_Flag(i_E_Flag);
				cdHead.setI_E_Port(i_E_Port);
				cdHead.setTotalCount(totalCount);
				cdHead.setTotalWT(totalWT);
				cdHead.setTrafMode(trafMode);
				cdHead.setVoyageName(voyageName);
				ExpTxtService service = null;
				
				service = new ExpTxtlServiceImpl();
				
				try {
					service.createExpXml(inPath, outPath, cdHead);
					jDialog.dispose();
					String  msg = "文件输出成功，保存目录为："+outPath+File.separator+billNO+"bg.txt";
					if("I".equalsIgnoreCase(cdHead.getI_E_Flag())){
						 msg = msg+"和 "+billNO+"cd.txt";
					}
					 JOptionPane.showMessageDialog(null,msg,"提示信息！",JOptionPane.INFORMATION_MESSAGE);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(),
							"对不起，出错了！", JOptionPane.ERROR_MESSAGE);
					ex.printStackTrace();
				}
			}
		});

		dialog_Button4.setText("取消");
		dialog_Button4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("quxiao");
				jDialog.dispose();
			}
		});

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(
				jDialog.getContentPane());
		jDialog.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout
				.setHorizontalGroup(jDialog1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jDialog1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jDialog1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																dialog_Panel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jDialog1Layout
																		.createSequentialGroup()
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)
																		.addComponent(
																				dialog_Button3)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				dialog_Button4)
																		.addGap(21,
																				21,
																				21)))
										.addContainerGap()));
		jDialog1Layout
				.setVerticalGroup(jDialog1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jDialog1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												dialog_Panel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jDialog1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																dialog_Button4)
														.addComponent(
																dialog_Button3))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		
		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 399,
				Short.MAX_VALUE));
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("舱单信息");
		jDialog.pack();
		jDialog.setVisible(true);
	}
	
	private javax.swing.JButton dialog_Button3;
	private javax.swing.JButton dialog_Button4;
	private javax.swing.JComboBox i_E_Flag_ComboBox;
	private DateChooser i_E_Date_mp;
	private javax.swing.JComboBox trafMode_ComboBox;
	private javax.swing.JLabel billNO_Label;
	private javax.swing.JLabel voyageName_Label;
	private javax.swing.JLabel i_E_Flag_Label;
	private javax.swing.JLabel totalCount_Label;
	private javax.swing.JLabel totalWT_Label;
	private javax.swing.JLabel i_E_Date_Label;
	private javax.swing.JLabel i_E_Port_Label;
	private javax.swing.JLabel destinationPort_Label;
	private javax.swing.JLabel trafMode_Label;
	private javax.swing.JPanel dialog_Panel;
	private javax.swing.JTextField totalWT_TextField;
	private javax.swing.JTextField i_E_Port_TextField;
	private javax.swing.JTextField destinationPort_TextField;
	private javax.swing.JTextField billNO_TextField;
	private javax.swing.JTextField voyageName_TextField;
	private javax.swing.JTextField totalCount_TextField;
	private JDialog jDialog;

	private CDHead cdHead;
	
	public static void main(String[] args) {
		new CDHeadDialog(null, null);
	}
}
