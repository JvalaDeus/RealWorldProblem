import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class rwpForm extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		// creates the JFrame
		rwpForm form = new rwpForm();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setTitle("HiVolts Controls & Game Rules");
		form.setSize(540, 550);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		form.add(panel);
		panel.setBackground(Color.CYAN);
		form.setResizable(false);

		JLabel title1 = new JLabel("California State Parks OHMVR Division");
		title1.setBounds(60, 0, 1000, 25);
		title1.setFont(new Font("Serif", Font.PLAIN, 25));
		title1.setForeground(Color.BLACK);
		panel.add(title1);

		JLabel title2 = new JLabel(
				"Site Visit Report - Law Enforcement Projects");
		title2.setBounds(50, 25, 1000, 25);
		title2.setFont(new Font("Serif", Font.PLAIN, 25));
		title2.setForeground(Color.BLACK);
		panel.add(title2);

		JLabel grantee = new JLabel("1. Grantee: ");
		grantee.setBounds(5, 60, 100, 20);
		grantee.setFont(new Font("Serif", Font.PLAIN, 12));
		grantee.setForeground(Color.BLACK);
		panel.add(grantee);
		JTextField granteeJTF = new JTextField("");
		granteeJTF.setBounds(60, 60, 165, 20);
		panel.add(granteeJTF);

		JLabel DoV = new JLabel("2. Date(s) of Visit(s): ");
		DoV.setBounds(5, 60, 200, 60);
		DoV.setFont(new Font("Serif", Font.PLAIN, 12));
		DoV.setForeground(Color.BLACK);
		panel.add(DoV);
		JTextField DoVJTF = new JTextField("");
		DoVJTF.setBounds(110, 80, 120, 20);
		panel.add(DoVJTF);

		JLabel projectNum = new JLabel("3. Project Number: ");
		projectNum.setBounds(5, 60, 200, 100);
		projectNum.setFont(new Font("Serif", Font.PLAIN, 12));
		projectNum.setForeground(Color.BLACK);
		panel.add(projectNum);
		JTextField projectNumJTF = new JTextField("");
		projectNumJTF.setBounds(100, 100, 140, 20);
		panel.add(projectNumJTF);

		JLabel projectType = new JLabel("4. Project Type: ");
		projectType.setBounds(5, 60, 200, 140);
		projectType.setFont(new Font("Serif", Font.PLAIN, 12));
		projectType.setForeground(Color.BLACK);
		panel.add(projectType);
		JTextField projectTypeJTF = new JTextField("");
		projectTypeJTF.setBounds(90, 120, 150, 20);
		panel.add(projectTypeJTF);

		JLabel PPPo = new JLabel("5. Project Performace Period (original): ");
		PPPo.setBounds(5, 60, 200, 180);
		PPPo.setFont(new Font("Serif", Font.PLAIN, 12));
		PPPo.setForeground(Color.BLACK);
		panel.add(PPPo);
		
		JLabel from = new JLabel("From:");
		from.setBounds(235, 60, 200, 180);
		from.setFont(new Font("Serif", Font.PLAIN, 12));
		from.setForeground(Color.BLACK);
		panel.add(from);
		JTextField fromJTF = new JTextField("");
		fromJTF.setBounds(265, 140, 115, 20);
		panel.add(fromJTF);
		
		JLabel to = new JLabel("To:");
		to.setBounds(383, 60, 250, 180);
		to.setFont(new Font("Serif", Font.PLAIN, 12));
		to.setForeground(Color.BLACK);
		panel.add(to);
		JTextField toJTF = new JTextField("");
		toJTF.setBounds(405	, 140, 120, 20);
		panel.add(toJTF);

		JLabel siteVisitNum = new JLabel("Site Visit Num #: ");
		siteVisitNum.setBounds(275, 60, 100, 20);
		siteVisitNum.setFont(new Font("Serif", Font.PLAIN, 12));
		siteVisitNum.setForeground(Color.BLACK);
		panel.add(siteVisitNum);
		JTextField siteVisitNumJTF = new JTextField("");
		siteVisitNumJTF.setBounds(365, 60, 150, 20);
		panel.add(siteVisitNumJTF);

		JLabel grantAmount = new JLabel("Grant Amount: ");
		grantAmount.setBounds(275, 80, 100, 20);
		grantAmount.setFont(new Font("Serif", Font.PLAIN, 14));
		grantAmount.setForeground(Color.BLACK);
		panel.add(grantAmount);
		JTextField grantAmountJTF = new JTextField("");
		grantAmountJTF.setBounds(365, 80, 150, 20);
		panel.add(grantAmountJTF);
		
		JLabel grantCycle = new JLabel("Grant Cycle: ");
		grantCycle.setBounds(290, 100, 100, 20);
		grantCycle.setFont(new Font("Serif", Font.PLAIN, 12));
		grantCycle.setForeground(Color.BLACK);
		panel.add(grantCycle);
		JTextField grantCycleJTF = new JTextField("");
		grantCycleJTF.setBounds(355, 100, 150, 20);
		panel.add(grantCycleJTF);
		
		form.setVisible(true);
	}
}