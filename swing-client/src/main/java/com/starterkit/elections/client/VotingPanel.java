package com.starterkit.elections.client;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VotingPanel extends InnerPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -943192362775692872L;
	private static final Logger log = LoggerFactory
			.getLogger(VotingPanel.class);
	private ButtonGroup group;
	private JButton voteButton = new JButton("Vote");
	private VotingListener votingListener;
	private SubmitListener submitListener;

	/**
	 * Create the panel.
	 */
	public VotingPanel(Dimension dimension) {
		super(dimension);
		
		setLayout(new FlowLayout());
		
		// FIXME replace with dynamic list of candidates
		group = new ButtonGroup();
		JRadioButton code1 = new JRadioButton("Adam Kowalski");
		JRadioButton code2 = new JRadioButton("Jan Nowak");
		JRadioButton code3 = new JRadioButton("Roman Malinowski");
		
		group.add(code1);
		group.add(code2);
		group.add(code3);

		votingListener = new VotingListener();
		code1.addActionListener(votingListener);
		code2.addActionListener(votingListener);
		code3.addActionListener(votingListener);

		submitListener = new SubmitListener();
		voteButton.addActionListener(submitListener);
		voteButton.setEnabled(false);
		setLayout(new GridLayout(0, 4, 0, 0));

		this.add(code1);
		this.add(code2);
		this.add(code3);
		this.add(voteButton);

	}

	/** Listens to the radio buttons with candidates */
	class VotingListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// check if any candidate is selected, then enable submitting
			if (null != group.getSelection()) {
				voteButton.setEnabled(true);
			}
		}
	}

	/** Listens to the radio buttons with candidates */
	class SubmitListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			log.debug("Submitted: {}, selected '{}'", e.paramString(), group
					.getSelection().isSelected());
		}
	}

}
