package gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import logic.*;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;

import data.DataInterface;

import java.awt.FlowLayout;

public class GUI implements ActionListener {

	private JFrame frame;
	private JTextField input;
	DefaultListModel<String> l1 = new DefaultListModel<>();
	JList<String> history = new JList<>(l1);
	HistoryLogic d = new HistoryLogic();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JComboBox<ZahlZS> zs = new JComboBox<ZahlZS>();
	JLabel error = new JLabel("---");
	JLabel output1 = new JLabel("-");
	JLabel output2 = new JLabel("-");
	JLabel zs1 = new JLabel("-");
	JLabel zs2 = new JLabel("-");

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton startButton = new JButton("Go!");
		startButton.setBounds(275, 13, 85, 77);
		frame.getContentPane().add(startButton);
		startButton.addActionListener(this);

		input = new JTextField();
		input.setText("");
		input.setBounds(12, 14, 116, 22);
		frame.getContentPane().add(input);
		input.setColumns(10);

		zs.setBounds(136, 13, 127, 22);
		frame.getContentPane().add(zs);

		output1.setBounds(12, 49, 251, 22);
		frame.getContentPane().add(output1);

		output2.setBounds(12, 76, 251, 22);
		frame.getContentPane().add(output2);

		zs1.setBounds(240, 49, 251, 22);
		frame.getContentPane().add(zs1);

		zs2.setBounds(240, 76, 251, 22);
		frame.getContentPane().add(zs2);

		frame.setResizable(false);

		history.setBounds(12, 111, 348, 296);
		frame.getContentPane().add(history);
		l1.addElement("       Eingabe                             Format");

		error.setBounds(12, 420, 348, 22);
		frame.getContentPane().add(error);

		input.setColumns(10);
		zs.setModel(new DefaultComboBoxModel<ZahlZS>(this.getStandardZS()));
		zs.setSelectedIndex(0);
		// auslesen des selektierten Zahlensystems
		// ZahlZS selectedZS = zs.getItemAt(zs.getSelectedIndex());
		// selectedZS.setInput(input.getText());

	}

	public void actionPerformed(ActionEvent e) {
		ZahlZS selectedZS = zs.getItemAt(zs.getSelectedIndex());
		selectedZS.setInput(input.getText());
		Calculator c = new Calculator();
		String[] results;

		if (selectedZS.getFormat() == 2) {
			Bin b = new Bin();
			if (b.checkinput(selectedZS.getInput()) == 1) {
				error.setText("Kein Wert eingetragen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (b.checkinput(selectedZS.getInput()) == 2) {
				error.setText("Eingabe darf maximal 5 Zeichen lang sein!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (b.checkinput(selectedZS.getInput()) == 3) {
				error.setText("Eingabe enthält ungültiges Zeichen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else {
				error.setText("---");
				results = c.getresult(selectedZS.getInput(),
						selectedZS.getFormat());
				output1.setText(results[0]);
				output2.setText(results[1]);
				zs1.setText("Dez");
				zs2.setText("Hex");
				l1.addElement(d.gethistory());
			}
		} else if (selectedZS.getFormat() == 10) {
			Dez de = new Dez();
			if (de.checkinput(selectedZS.getInput()) == 1) {
				error.setText("Kein Wert eingetragen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (de.checkinput(selectedZS.getInput()) == 2) {
				error.setText("Eingabe darf maximal 5 Zeichen lang sein!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (de.checkinput(selectedZS.getInput()) == 3) {
				error.setText("Eingabe enthält ungültiges Zeichen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else {
				error.setText("---");
				results = c.getresult(selectedZS.getInput(),
						selectedZS.getFormat());
				output1.setText(results[0]);
				output2.setText(results[1]);
				zs1.setText("Bin");
				zs2.setText("Hex");
				l1.addElement(d.gethistory());
			}

		} else {
			Hex h = new Hex();
			if (h.checkinput(selectedZS.getInput()) == 1) {
				error.setText("Kein Wert eingetragen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (h.checkinput(selectedZS.getInput()) == 2) {
				error.setText("Eingabe darf maximal 5 Zeichen lang sein!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else if (h.checkinput(selectedZS.getInput()) == 3) {
				error.setText("Eingabe enthält ungültiges Zeichen!");
				zs1.setText("-");
				zs2.setText("-");
				output1.setText("-");
				output2.setText("-");
			} else {
				error.setText("---");
				results = c.getresult(selectedZS.getInput(),
						selectedZS.getFormat());
				output1.setText(results[0]);
				output2.setText(results[1]);
				zs1.setText("Bin");
				zs2.setText("Dez");
				l1.addElement(d.gethistory());
			}

		}

	}

	private ZahlZS[] getStandardZS() {
		ZahlZS[] zs = new ZahlZS[3];
		zs[0] = new ZahlZS("", 2, "Binär");
		zs[1] = new ZahlZS("", 10, "Dezimal");
		zs[2] = new ZahlZS("", 16, "Hexadezimal");
		return zs;
	}

}
