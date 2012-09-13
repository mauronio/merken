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
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class MainWindow {

	private JFrame frame;
	private JTextField txtTest;
	private JTextField txtCommand;

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
		frame.setBounds(100, 100, 450, 516);
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
		
		JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
		internalFrame_1.setResizable(true);
		internalFrame_1.setMaximizable(true);
		internalFrame_1.setIconifiable(true);
		internalFrame_1.setClosable(true);
		internalFrame_1.setBounds(97, 182, 296, 293);
		desktopPane.add(internalFrame_1);
		internalFrame_1.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		internalFrame_1.getContentPane().add(scrollPane_1);
		
		JEditorPane dtrpnbold = new JEditorPane();
		dtrpnbold.setContentType("text/html");
		dtrpnbold.setText("<b>bold</b> and <i>Italik</i>");
		scrollPane_1.setViewportView(dtrpnbold);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		internalFrame_1.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, BorderLayout.EAST);
		
		txtCommand = new JTextField();
		txtCommand.setText("command");
		panel.add(txtCommand, BorderLayout.CENTER);
		txtCommand.setColumns(10);
		internalFrame_1.setVisible(true);
		internalFrame.setVisible(true);
	}
}
