package br.com.projeto22k.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNomeDoAluno;
	private JLabel lblCurso;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JLabel lblDisciplina_1;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField txtPauloCorazimDa;
	private JTextField txtCinciaDaComputao;
	private JTextField txtN;
	private JComboBox comboBox;
	private JPanel panel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNomeDoAluno_1;
	private JLabel lblCurso_1;
	private JLabel lblDisciplina_2;
	private JLabel lblSemestre_1;
	private JLabel lblDisciplina_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtJosefernandopscostagmailcom;
	private JTextField textField_4;
	private JComboBox comboBox_1;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Lato", Font.PLAIN, 18));
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tabbedPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.setBounds(10, 11, 1064, 539);
		contentPane.add(tabbedPane);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Dados pessoais", null, panel_4, null);
		
		lblNewLabel_1 = new JLabel("RGM");
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(28, 27, 66, 20);
		panel_4.add(lblNewLabel_1);
		
		lblNomeDoAluno_1 = new JLabel("Nome do Aluno");
		lblNomeDoAluno_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblNomeDoAluno_1.setBounds(281, 22, 145, 28);
		panel_4.add(lblNomeDoAluno_1);
		
		lblCurso_1 = new JLabel("Curso");
		lblCurso_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblCurso_1.setBounds(28, 104, 66, 28);
		panel_4.add(lblCurso_1);
		
		lblDisciplina_2 = new JLabel("Disciplina");
		lblDisciplina_2.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_2.setBounds(28, 183, 155, 28);
		panel_4.add(lblDisciplina_2);
		
		lblSemestre_1 = new JLabel("Semestre");
		lblSemestre_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre_1.setBounds(473, 183, 155, 28);
		panel_4.add(lblSemestre_1);
		
		lblDisciplina_3 = new JLabel("Disciplina");
		lblDisciplina_3.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_3.setBounds(28, 261, 155, 28);
		panel_4.add(lblDisciplina_3);
		
		textField_1 = new JTextField();
		textField_1.setText("1729772030");
		textField_1.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(28, 53, 180, 40);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("João Fernando Pereira da Silva Costa");
		textField_2.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(281, 53, 372, 40);
		panel_4.add(textField_2);
		
		txtJosefernandopscostagmailcom = new JTextField();
		txtJosefernandopscostagmailcom.setText("josefernandopscosta@gmail.com");
		txtJosefernandopscostagmailcom.setFont(new Font("Lato", Font.PLAIN, 18));
		txtJosefernandopscostagmailcom.setColumns(10);
		txtJosefernandopscostagmailcom.setBounds(28, 132, 316, 40);
		panel_4.add(txtJosefernandopscostagmailcom);
		
		textField_4 = new JTextField();
		textField_4.setText("3°");
		textField_4.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(473, 211, 180, 40);
		panel_4.add(textField_4);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_1.setBounds(28, 210, 398, 40);
		panel_4.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setText("123.456.789-09");
		textField_5.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(696, 53, 180, 40);
		panel_4.add(textField_5);
		
		lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(696, 27, 66, 20);
		panel_4.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setText("01/01/1999");
		textField_3.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(620, 130, 180, 40);
		panel_4.add(textField_3);
		
		lblNewLabel_3 = new JLabel("Data de nascimento");
		lblNewLabel_3.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(620, 104, 180, 20);
		panel_4.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(399, 104, 180, 20);
		panel_4.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setText("+55  (11) 93011-4118");
		textField_6.setFont(new Font("Lato", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(399, 130, 195, 40);
		panel_4.add(textField_6);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("Cursos", null, panel_1, null);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Notas e faltas", null, panel_2, null);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Boletim", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 27, 66, 20);
		panel.add(lblNewLabel);
		
		lblNomeDoAluno = new JLabel("Nome do Aluno");
		lblNomeDoAluno.setFont(new Font("Lato", Font.PLAIN, 18));
		lblNomeDoAluno.setBounds(281, 14, 145, 28);
		panel.add(lblNomeDoAluno);
		
		lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Lato", Font.PLAIN, 18));
		lblCurso.setBounds(28, 104, 66, 28);
		panel.add(lblCurso);
		
		lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina.setBounds(28, 183, 155, 28);
		panel.add(lblDisciplina);
		
		lblSemestre = new JLabel("Semestre");
		lblSemestre.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre.setBounds(473, 183, 155, 28);
		panel.add(lblSemestre);
		
		lblDisciplina_1 = new JLabel("Disciplina");
		lblDisciplina_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_1.setBounds(28, 261, 155, 28);
		panel.add(lblDisciplina_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Lato", Font.PLAIN, 18));
		textField.setText("1729772030");
		textField.setBounds(28, 53, 180, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		txtPauloCorazimDa = new JTextField();
		txtPauloCorazimDa.setText("João Fernando Pereira da Silva Costa");
		txtPauloCorazimDa.setFont(new Font("Lato", Font.PLAIN, 18));
		txtPauloCorazimDa.setColumns(10);
		txtPauloCorazimDa.setBounds(281, 53, 372, 40);
		panel.add(txtPauloCorazimDa);
		
		txtCinciaDaComputao = new JTextField();
		txtCinciaDaComputao.setText("Ciência da Computação");
		txtCinciaDaComputao.setFont(new Font("Lato", Font.PLAIN, 18));
		txtCinciaDaComputao.setColumns(10);
		txtCinciaDaComputao.setBounds(28, 132, 398, 40);
		panel.add(txtCinciaDaComputao);
		
		txtN = new JTextField();
		txtN.setText("3°");
		txtN.setFont(new Font("Lato", Font.PLAIN, 18));
		txtN.setColumns(10);
		txtN.setBounds(473, 211, 180, 40);
		panel.add(txtN);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Programação Orientada a Objetos"}));
		comboBox.setBounds(28, 210, 398, 40);
		panel.add(comboBox);
	}
}
