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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;

public class MainWindow {

	private JFrame frmMerken;
	private JTextField txtCommand;

	private Collection childWindows;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmMerken.setVisible(true);
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
		
		frmMerken = new JFrame();
		frmMerken.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmMerken.setTitle("merken");
		frmMerken.setBounds(100, 100, 653, 516);
		frmMerken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDesktopPane desktopPane = new JDesktopPane();
		frmMerken.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
		internalFrame_1.setResizable(true);
		internalFrame_1.setMaximizable(true);
		internalFrame_1.setIconifiable(true);
		internalFrame_1.setClosable(true);
		internalFrame_1.setBounds(23, 161, 296, 293);
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
		
		JMenuBar menuBar = new JMenuBar();
		frmMerken.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createBaseWindow(desktopPane);
			}
		});
		
		mnFile.add(mntmNew);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		internalFrame_1.setVisible(true);
		
		createBaseWindow(desktopPane);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	
	private void createBaseWindow(JDesktopPane desktopPane) {
		BaseWindow newWindow = new BaseWindow();
		desktopPane.add(newWindow);
		newWindow.setVisible(true);
	}
}
