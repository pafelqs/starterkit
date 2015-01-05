package com.starterkit.elections.client;

import java.awt.EventQueue;

public class Application {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 new ApplicationFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
