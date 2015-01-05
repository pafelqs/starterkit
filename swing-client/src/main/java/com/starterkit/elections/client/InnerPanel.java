package com.starterkit.elections.client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public abstract class InnerPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InnerPanel(Dimension dimension) {
		super();
		setPreferredSize(dimension);
		setMaximumSize(dimension);
		setMinimumSize(dimension);
		
		// FIXME Remove after testing
		setBackground(Color.LIGHT_GRAY); // for debug only
	}

}
