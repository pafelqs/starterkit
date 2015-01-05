package com.starterkit.elections.client;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class ApplicationFrame extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = -3664925283648207706L;
	private LoginPanel loginPanel;
	private VotingPanel votingPanel;
	private Box box;

	private final int WINDOW_HEIGHT = 540;
	private final int WINDOW_WIDTH = 700;
	private final int INNER_PANEL_HEIGHT = 500;
	private final int INNER_PANEL_WIDTH = 700;

	/**
	 * Create the frame.
	 */
	public ApplicationFrame() {
		setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		setMinimumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		setLocationByPlatform(true);

		Dimension innerDimension = new Dimension(INNER_PANEL_WIDTH,
				INNER_PANEL_HEIGHT);

		loginPanel = new LoginPanel(innerDimension);

		votingPanel = new VotingPanel(innerDimension);

		box = new Box(BoxLayout.Y_AXIS);
		box.add(Box.createVerticalGlue());
		box.add(loginPanel);
//		box.add(votingPanel);
//		box.remove(loginPanel);
		box.add(Box.createVerticalGlue());
		add(box);

		// Display the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(getMinimumSize());
		pack();
		setVisible(true);
	}

}
