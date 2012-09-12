package merken.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class MainWindow {

	private JFrame frame;
	private JTextField txtTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setResizable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setBorder(new LineBorder(new Color(0, 0, 0)));
		internalFrame.setBounds(55, 50, 290, 130);
		desktopPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtTest = new JTextField();
		txtTest.setText("test");
		internalFrame.getContentPane().add(txtTest, BorderLayout.SOUTH);
		txtTest.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		internalFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextPane txtpnPeneu = new JTextPane();
		txtpnPeneu.setText("peneu");
		scrollPane.setViewportView(txtpnPeneu);
		internalFrame.setVisible(true);
	}
}
