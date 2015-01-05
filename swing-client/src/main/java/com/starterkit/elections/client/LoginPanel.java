package com.starterkit.elections.client;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPanel extends InnerPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1854106531107446613L;
	private static final Logger log = LoggerFactory.getLogger(LoginPanel.class);

	private JLabel zipCodeLabel = new JLabel("Zip code");
	private JLabel peselLabel = new JLabel("PESEL");
	private JTextField peselField = new JTextField(11);
	private JComboBox zipCodeComboBox = new JComboBox();
	private JButton loginButton = new JButton("Login");

	private ZipCodeListener zipCodeListener;
	private PeselListener peselListener;
	private LoginListener loginListener;

	/**
	 * Create the panel.
	 */
	public LoginPanel(Dimension dimension) {
		super(dimension);

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		// layout.setVerticalGroup(layout
		// .createSequentialGroup()
		// .addGroup(
		// layout.createParallelGroup(
		// GroupLayout.Alignment.BASELINE)
		// .addComponent(zipCodeLabel)
		// .addComponent(zipCodeComboBox)
		// .addGroup(
		// layout.createParallelGroup(GroupLayout.Alignment.LEADING))));

		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(zipCodeLabel).addComponent(zipCodeComboBox)
				.addComponent(peselLabel).addComponent(peselField));
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(zipCodeLabel).addComponent(zipCodeComboBox)
				.addComponent(peselLabel).addComponent(peselField));

		// add(zipCodeLabel);
		// add(zipCodeComboBox);
		// add(peselLabel);
		// add(peselField);
		loginListener = new LoginListener();
		loginButton.addActionListener(loginListener);
		// add(loginButton);
	}

	public class ZipCodeListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}

	}

	public class PeselListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

		}
	}

	public class LoginListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// changing panel
			log.debug("Fake login (!)");

		}

	}

}
