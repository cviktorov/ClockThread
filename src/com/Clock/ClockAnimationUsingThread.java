package com.Clock;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClockAnimationUsingThread extends StillClock implements Runnable {
	private Thread thread;
	/**
	 * Create the panel.
	 */
	public ClockAnimationUsingThread() {
		setLayout(null);

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				setCurrentTime();
				repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//

		}

	}
}
