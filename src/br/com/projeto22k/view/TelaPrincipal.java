package br.com.projeto22k.view;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;

import br.com.projeto22k.dao.AlunoDAO;
import br.com.projeto22k.model.Aluno;
import java.awt.Toolkit;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_3;
	private JLabel lblCurso;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JLabel lblDisciplina_1;
	private JPanel panel_1;
	private JPanel boletimPanel;
	private JTextField txtCinciaDaComputao;
	private JComboBox comboBox;
	private JComboBox comboBox_Campus;
	private JPanel panel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNomeDoAluno_1;
	private JLabel lblCurso_1;
	private JLabel lblDisciplina_2;
	private JLabel lblSemestre_1;
	private JTextField txtRgm;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtRua;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblDisciplina_4;
	private JLabel lblSemestre_2;
	private JTextField txtNumero;
	private JLabel lblDisciplina_3;
	private JTextField txtComplemento;
	private JTextField txtMunicipio;
	private JLabel lblDisciplina_5;
	private JTextField txtUf;
	private JLabel lblDisciplina_6;
	private JLabel lblCurso_2;
	private JComboBox comboBox_Curso;
	private JComboBox comboBox_2;
	private JLabel lblSemestre_5;
	private JLabel lblSemestre_4;
	private JComboBox comboBox_Periodo;
	private JLabel label;
	private JComboBox comboBox_Semestre;
	private JComboBox comboBox_Turma;
	private JComboBox comboBox_6;
	private JLabel lblDisciplina_7;
	private JLabel lblDisciplina_8;
	private JLabel lblDisciplina_9;
	private JTable table;
	private JScrollPane scrollPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_9;
	private JButton btnDelete1;
	private JButton btnAlterar1;
	private JButton btnSalvar1;
	private JTable table_1;
	private JPanel panel_6;
	private JLabel lblDisciplina_10;
	private JLabel lblDisciplina_11;
	private JLabel lblDisciplina_12;
	private JScrollPane scrollPane_1;
	private JTextField txtError1;
	private JTextField txtError3;
	private JTextField txtError4;
	private JTextField txtError2;
	private JPanel panel_7;
	private JLabel lblNewLabel_6;
	private JTextField txtRgm1;
	private JLabel lblNomeDoAluno_3;
	private JTextField txtNome1;
	private JButton txtBuscar1;
	private JButton txtBuscardisciplina;
	private JLabel lblNewLabel;

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
	 * @throws Exception 
	 */
	public TelaPrincipal() throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\paulo\\OneDrive\\Área de Trabalho\\IMAGENS PROJETO\\LOGO.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu);

		mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar?");
			        if (resposta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			        } else if (resposta == JOptionPane.NO_OPTION) {
			            JOptionPane.showMessageDialog(null, "Fechar");
			        }
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK | InputEvent.ALT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);

		mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_1);

		mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);

		mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
		        if (resposta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
		        } else if (resposta == JOptionPane.NO_OPTION) {
		            JOptionPane.showMessageDialog(null, "Dados não excluídos!");
		        }
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===== Fechar programa
				System.exit(0);
				//=====
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);

		mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);

		mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========================================
					JOptionPane.showMessageDialog(null, "Informações do Menu");
				//==========================================
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Lato", Font.PLAIN, 18));
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tabbedPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.setBounds(10, 103, 1064, 373);
		contentPane.add(tabbedPane);
		
				panel_4 = new JPanel();
				panel_4.setForeground(Color.WHITE);
				panel_4.setLayout(null);
				panel_4.setBackground(Color.WHITE);
				tabbedPane.addTab("Dados pessoais", null, panel_4, null);
				
						lblNewLabel_1 = new JLabel("RGM");
						lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
						lblNewLabel_1.setBounds(25, 25, 66, 20);
						panel_4.add(lblNewLabel_1);
						
								lblNomeDoAluno_1 = new JLabel("Nome do Aluno");
								lblNomeDoAluno_1.setFont(new Font("Lato", Font.PLAIN, 18));
								lblNomeDoAluno_1.setBounds(275, 21, 145, 28);
								panel_4.add(lblNomeDoAluno_1);
								
										lblCurso_1 = new JLabel("E-mail");
										lblCurso_1.setFont(new Font("Dialog", Font.PLAIN, 18));
										lblCurso_1.setBounds(25, 103, 66, 28);
										panel_4.add(lblCurso_1);
										
												lblDisciplina_2 = new JLabel("CEP");
												lblDisciplina_2.setFont(new Font("Lato", Font.PLAIN, 18));
												lblDisciplina_2.setBounds(25, 182, 155, 28);
												panel_4.add(lblDisciplina_2);
												
														lblSemestre_1 = new JLabel("Rua");
														lblSemestre_1.setFont(new Font("Lato", Font.PLAIN, 18));
														lblSemestre_1.setBounds(275, 182, 372, 28);
														panel_4.add(lblSemestre_1);
														
																txtRgm = new JTextField();																
																txtRgm.setFont(new Font("Lato", Font.PLAIN, 18));
																txtRgm.setColumns(10);
																txtRgm.setBounds(25, 52, 180, 40);
																panel_4.add(txtRgm);
																
																		txtNome = new JTextField();
																		txtNome.setFont(new Font("Lato", Font.PLAIN, 18));
																		txtNome.setColumns(10);
																		txtNome.setBounds(275, 52, 372, 40);
																		panel_4.add(txtNome);
																		
																				txtEmail = new JTextField();
																				txtEmail.setFont(new Font("Lato", Font.PLAIN, 18));
																				txtEmail.setColumns(10);
																				txtEmail.setBounds(25, 131, 316, 40);
																				panel_4.add(txtEmail);
																				
																						txtRua = new JTextField();
																						txtRua.setFont(new Font("Lato", Font.PLAIN, 18));
																						txtRua.setColumns(10);
																						txtRua.setBounds(275, 210, 372, 40);
																						panel_4.add(txtRua);
																						
																								lblNewLabel_2 = new JLabel("CPF");
																								lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 18));
																								lblNewLabel_2.setBounds(702, 26, 66, 20);
																								panel_4.add(lblNewLabel_2);
																								
																										lblNewLabel_3 = new JLabel("Data de nascimento");
																										lblNewLabel_3.setFont(new Font("Lato", Font.PLAIN, 16));
																										lblNewLabel_3.setBounds(702, 103, 180, 20);
																										panel_4.add(lblNewLabel_3);
																										
																												lblNewLabel_4 = new JLabel("Telefone");
																												lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 18));
																												lblNewLabel_4.setBounds(372, 103, 275, 20);
																												panel_4.add(lblNewLabel_4);
																												
																														lblSemestre_2 = new JLabel("Número");
																														lblSemestre_2.setFont(new Font("Lato", Font.PLAIN, 18));
																														lblSemestre_2.setBounds(702, 182, 180, 28);
																														panel_4.add(lblSemestre_2);
																														
																																txtNumero = new JTextField();
																																txtNumero.setFont(new Font("Lato", Font.PLAIN, 18));
																																txtNumero.setColumns(10);
																																txtNumero.setBounds(702, 210, 180, 40);
																																panel_4.add(txtNumero);
																																
																																		lblDisciplina_3 = new JLabel("Complemento");
																																		lblDisciplina_3.setFont(new Font("Lato", Font.PLAIN, 18));
																																		lblDisciplina_3.setBounds(25, 261, 155, 28);
																																		panel_4.add(lblDisciplina_3);
																																		
																																				txtComplemento = new JTextField();
																																				txtComplemento.setFont(new Font("Lato", Font.PLAIN, 18));
																																				txtComplemento.setColumns(10);
																																				txtComplemento.setBounds(25, 289, 316, 40);
																																				panel_4.add(txtComplemento);
																																				
																																						txtMunicipio = new JTextField();
																																						txtMunicipio.setFont(new Font("Lato", Font.PLAIN, 18));
																																						txtMunicipio.setColumns(10);
																																						txtMunicipio.setBounds(372, 289, 275, 40);
																																						panel_4.add(txtMunicipio);
																																						
																																								lblDisciplina_5 = new JLabel("Município");
																																								lblDisciplina_5.setFont(new Font("Lato", Font.PLAIN, 18));
																																								lblDisciplina_5.setBounds(372, 261, 275, 28);
																																								panel_4.add(lblDisciplina_5);
																																								
																																										txtUf = new JTextField();
																																										txtUf.setFont(new Font("Lato", Font.PLAIN, 18));
																																										txtUf.setColumns(10);
																																										txtUf.setBounds(702, 289, 180, 40);
																																										panel_4.add(txtUf);
																																										
																																												lblDisciplina_6 = new JLabel("UF");
																																												lblDisciplina_6.setFont(new Font("Lato", Font.PLAIN, 18));
																																												lblDisciplina_6.setBounds(702, 261, 155, 28);
																																												panel_4.add(lblDisciplina_6);
																																												
																																												JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
																																												txtCpf.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtCpf.setBounds(702, 52, 180, 40);
																																												panel_4.add(txtCpf);
																																												
																																												JFormattedTextField txtTelefone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
																																												txtTelefone.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtTelefone.setBounds(372, 131, 275, 40);
																																												panel_4.add(txtTelefone);
																																												
																																												JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter("####-##-##"));
																																												txtData.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtData.setBounds(702, 131, 180, 40);
																																												panel_4.add(txtData);
																																												
																																												JFormattedTextField txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
																																												txtCep.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtCep.setBounds(25, 210, 180, 40);
																																												panel_4.add(txtCep);
																																												
																																												txtError1 = new JTextField();
																																												txtError1.setForeground(Color.BLACK);
																																												txtError1.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtError1.setText("Aluno não localizado...");
																																												txtError1.setBounds(28, 476, 210, 20);
																																												panel_4.add(txtError1);
																																												txtError1.setColumns(10);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Cursos", null, panel_3, null);
		panel_3.setLayout(null);

		lblDisciplina = new JLabel("Campus");
		lblDisciplina.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina.setBounds(27, 11, 155, 28);
		panel_3.add(lblDisciplina);

		lblSemestre = new JLabel("Período");
		lblSemestre.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre.setBounds(27, 245, 155, 28);
		panel_3.add(lblSemestre);

		comboBox_Campus = new JComboBox();
		comboBox_Campus.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Campus.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Universidade Cidade de São Paulo - Tatuapé", "Universidade Cidade de São Paulo - Pinheiros", "Universidade Cidade de São Paulo - Online"}));
		comboBox_Campus.setBounds(27, 38, 650, 40);
		panel_3.add(comboBox_Campus);

		lblCurso_2 = new JLabel("Curso");
		lblCurso_2.setFont(new Font("Lato", Font.PLAIN, 18));
		lblCurso_2.setBounds(27, 89, 155, 28);
		panel_3.add(lblCurso_2);

		comboBox_Curso = new JComboBox();
		comboBox_Curso.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Analise e desenvolvimento de sistemas", "Ciência da computação", "Engenharia de software"}));
		comboBox_Curso.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Curso.setBounds(27, 116, 650, 40);
		panel_3.add(comboBox_Curso);

		lblSemestre_5 = new JLabel("Semestre");
		lblSemestre_5.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre_5.setBounds(247, 245, 155, 28);
		panel_3.add(lblSemestre_5);

		lblSemestre_4 = new JLabel("Turma");
		lblSemestre_4.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre_4.setBounds(467, 244, 155, 28);
		panel_3.add(lblSemestre_4);

		comboBox_Periodo = new JComboBox();
		comboBox_Periodo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Matutino", "Diurno", "Noturno"}));
		comboBox_Periodo.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Periodo.setBounds(27, 272, 210, 40);
		panel_3.add(comboBox_Periodo);

		label = new JLabel("New label");
		label.setBounds(548, 366, -227, -36);
		panel_3.add(label);

		comboBox_Semestre = new JComboBox();
		comboBox_Semestre.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°", "9°", "10°"}));
		comboBox_Semestre.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Semestre.setBounds(247, 273, 210, 40);
		panel_3.add(comboBox_Semestre);

		comboBox_Turma = new JComboBox();
		comboBox_Turma.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "A", "B", "C", "D", "E"}));
		comboBox_Turma.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Turma.setBounds(467, 272, 210, 40);
		panel_3.add(comboBox_Turma);
		
		txtError2 = new JTextField();
		txtError2.setText("Aluno não localizado...");
		txtError2.setForeground(Color.BLACK);
		txtError2.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtError2.setColumns(10);
		txtError2.setBounds(10, 465, 210, 20);
		panel_3.add(txtError2);
		
		JComboBox comboBoxDisciplina1 = new JComboBox();
		comboBoxDisciplina1.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Programação orientada a objetos", "Matemática discrete"}));
		comboBoxDisciplina1.setFont(new Font("Dialog", Font.PLAIN, 18));
		comboBoxDisciplina1.setBounds(27, 194, 650, 40);
		panel_3.add(comboBoxDisciplina1);
		
		JLabel lblDisciplina_13 = new JLabel("Disciplina");
		lblDisciplina_13.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblDisciplina_13.setBounds(27, 167, 155, 28);
		panel_3.add(lblDisciplina_13);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Notas e faltas", null, panel, null);
		panel.setLayout(null);

		lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Lato", Font.PLAIN, 18));
		lblCurso.setBounds(28, 11, 66, 28);
		panel.add(lblCurso);

		lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina.setBounds(28, 90, 155, 28);
		panel.add(lblDisciplina);

		lblSemestre = new JLabel("Semestre");
		lblSemestre.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre.setBounds(414, 90, 155, 28);
		panel.add(lblSemestre);

		lblDisciplina_1 = new JLabel("Notas");
		lblDisciplina_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_1.setBounds(28, 168, 155, 28);
		panel.add(lblDisciplina_1);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Programação orientada a objetos", "Matemática discrete"}));
		comboBox.setBounds(28, 117, 350, 40);
		panel.add(comboBox);

		lblDisciplina_4 = new JLabel("Lista de presença");
		lblDisciplina_4.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_4.setBounds(414, 169, 155, 28);
		panel.add(lblDisciplina_4);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Analise e desenvolvimento de sistemas", "Ciência da computação", "Engenharia de software"}));
		comboBox_2.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_2.setBounds(28, 39, 350, 40);
		panel.add(comboBox_2);

		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "2019-6", "2019-2", "2019-8", "2020-3", "2021-2", "2022-9", "2022-8", "2023-3"}));
		comboBox_6.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_6.setBounds(414, 118, 239, 40);
		panel.add(comboBox_6);
										
										scrollPane_1 = new JScrollPane();
										scrollPane_1.setBounds(414, 208, 373, 153);
										panel.add(scrollPane_1);
										
										table_1 = new JTable();
										scrollPane_1.setViewportView(table_1);
										AlunoDAO alonpres = new AlunoDAO();
										Object[][] aluno = {};
										table_1.setModel(new DefaultTableModel(
											new Object[][] {
											},
											new String[] {
												"Data", "Presen\u00E7a"
											}
										));
										table_1.getColumnModel().getColumn(0).setPreferredWidth(101);
										table_1.getColumnModel().getColumn(1).setPreferredWidth(97);
										table_1.setRowHeight(30);
										table_1.setFont(new Font("Dialog", Font.PLAIN, 16));
										table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
										
										panel_6 = new JPanel();
										panel_6.setBounds(28, 207, 350, 153);
										panel.add(panel_6);
										panel_6.setLayout(null);
										
												lblDisciplina_7 = new JLabel("A1");
												lblDisciplina_7.setBounds(10, 22, 155, 28);
												panel_6.add(lblDisciplina_7);
												lblDisciplina_7.setFont(new Font("Lato", Font.BOLD, 16));
												
														lblDisciplina_8 = new JLabel("A2");
														lblDisciplina_8.setBounds(10, 60, 155, 28);
														panel_6.add(lblDisciplina_8);
														lblDisciplina_8.setFont(new Font("Lato", Font.BOLD, 16));
														
																lblDisciplina_9 = new JLabel("AF");
																lblDisciplina_9.setBounds(10, 93, 155, 28);
																panel_6.add(lblDisciplina_9);
																lblDisciplina_9.setFont(new Font("Lato", Font.BOLD, 16));
																
																lblDisciplina_10 = new JLabel("4,75");
																lblDisciplina_10.setFont(new Font("Lato", Font.PLAIN, 18));
																lblDisciplina_10.setBounds(168, 22, 155, 28);
																panel_6.add(lblDisciplina_10);
																
																lblDisciplina_11 = new JLabel("3,8");
																lblDisciplina_11.setFont(new Font("Lato", Font.PLAIN, 18));
																lblDisciplina_11.setBounds(168, 60, 155, 28);
																panel_6.add(lblDisciplina_11);
																
																lblDisciplina_12 = new JLabel("0");
																lblDisciplina_12.setFont(new Font("Lato", Font.PLAIN, 18));
																lblDisciplina_12.setBounds(168, 93, 155, 28);
																panel_6.add(lblDisciplina_12);
																
																txtError3 = new JTextField();
																txtError3.setText("Aluno não localizado...");
																txtError3.setForeground(Color.BLACK);
																txtError3.setFont(new Font("Dialog", Font.PLAIN, 18));
																txtError3.setColumns(10);
																txtError3.setBounds(28, 476, 210, 20);
																panel.add(txtError3);
																
																txtBuscardisciplina = new JButton("");
																txtBuscardisciplina.setIcon(new ImageIcon("C:\\Users\\paulo\\OneDrive\\Área de Trabalho\\22k\\22k\\image\\search.png"));
																txtBuscardisciplina.setBackground(Color.WHITE);
																txtBuscardisciplina.setBounds(682, 117, 105, 45);
																panel.add(txtBuscardisciplina);

		boletimPanel = new JPanel();
		boletimPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Boletim", null, boletimPanel, null);
		boletimPanel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 21, 888, 62);
		boletimPanel.add(scrollPane);

		table = new JTable();
		table.setRowHeight(30);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setFont(new Font("Lato", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"123456789", "Paulo Corazim da Joanes Maria Pinto", "Ciencia da computacao", "analise de desenvolvimento de sistemas", "1,75", "4", "N", "5,75", "5"},
			},
			new String[] {
				"RGM", "Aluninhos", "Curso", "Disciplinas", "A1", "A2", "AF", "M\u00E9dia Final", "Faltas"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		txtError4 = new JTextField();
		txtError4.setText("Aluno não localizado...");
		txtError4.setForeground(Color.BLACK);
		txtError4.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtError4.setColumns(10);
		txtError4.setBounds(10, 476, 210, 20);
		boletimPanel.add(txtError4);
		
		panel_7 = new JPanel();
		panel_7.setBounds(12, 8, 1064, 81);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		lblNewLabel_6 = new JLabel("RGM");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(146, -4, 66, 40);
		panel_7.add(lblNewLabel_6);
		
		txtRgm1 = new JTextField();
		txtRgm1.setFont(new Font("Dialog", Font.PLAIN, 19));
		txtRgm1.setColumns(10);
		txtRgm1.setBounds(146, 35, 180, 40);
		panel_7.add(txtRgm1);
		
		lblNomeDoAluno_3 = new JLabel("Nome do Aluno");
		lblNomeDoAluno_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNomeDoAluno_3.setBounds(399, -4, 145, 40);
		panel_7.add(lblNomeDoAluno_3);
		
		txtNome1 = new JTextField();
		txtNome1.setFont(new Font("Dialog", Font.PLAIN, 18));
		txtNome1.setColumns(10);
		txtNome1.setBounds(399, 35, 372, 40);
		panel_7.add(txtNome1);
		
		txtBuscar1 = new JButton("");
		txtBuscar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AlunoDAO alunoproc = new AlunoDAO();

					Aluno alun = alunoproc.procurarAluno(Integer.parseInt(txtRgm1.getText()));
					txtNome1.setText(alun.getNome());
					txtRgm.setText(String.format("%d",alun.getRgm()));
					txtNome.setText(alun.getNome());
					txtCpf.setText(alun.getCpf());
					txtEmail.setText(alun.getEmail());
					txtTelefone.setText(alun.getTelefone());
					txtData.setText(alun.getDtaNascimento());
					txtCep.setText(alun.getCep());
					txtRua.setText(alun.getRua());
					txtNumero.setText(alun.getNumero());
					txtComplemento.setText(alun.getComplemento());
					txtMunicipio.setText(alun.getMunicipio());
					txtUf.setText(alun.getUf());
					comboBox_Campus.setSelectedIndex(alun.getCampus());
					comboBox_Curso.setSelectedIndex(alun.getCurso());
					comboBoxDisciplina1.setSelectedIndex(alun.getDisciplina());
					comboBox_Periodo.setSelectedIndex(alun.getPeriodo());
					comboBox_Semestre.setSelectedIndex(alun.getSemestre());
					comboBox_Turma.setSelectedIndex(alun.getTurma());
					comboBox_2.setSelectedIndex(alun.getCurso());
					comboBox.setSelectedIndex(alun.getDisciplina());
					
					
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
			}
				}
		});
		txtBuscar1.setIcon(new ImageIcon("C:\\Users\\paulo\\OneDrive\\Área de Trabalho\\22k\\22k\\image\\search.png"));
		txtBuscar1.setBackground(Color.WHITE);
		txtBuscar1.setBounds(923, 25, 105, 45);
		panel_7.add(txtBuscar1);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\paulo\\OneDrive\\Área de Trabalho\\22k\\22k\\image\\logo.png"));
		lblNewLabel.setBounds(10, 11, 90, 63);
		panel_7.add(lblNewLabel);
		
				btnSalvar1 = new JButton("");
				btnSalvar1.setBounds(924, 487, 105, 45);
				contentPane.add(btnSalvar1);
				btnSalvar1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//==================== Informando que foi salva
						 int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar?");
					        if (resposta == JOptionPane.YES_OPTION) {
					            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
					        } else if (resposta == JOptionPane.NO_OPTION) {
					            JOptionPane.showMessageDialog(null, "Fechar");
					        }
					      //==========================================
					}
				});
				btnSalvar1.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Documentos\\22k\\image\\save.png"));
				btnSalvar1.setBackground(Color.WHITE);
				
						btnAlterar1 = new JButton("");
						btnAlterar1.setBounds(809, 487, 105, 45);
						contentPane.add(btnAlterar1);
						btnAlterar1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
							}
						});
						btnAlterar1.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Documentos\\22k\\image\\editing.png"));
						btnAlterar1.setBackground(Color.WHITE);
						
								btnDelete1 = new JButton("");
								btnDelete1.setBounds(694, 487, 105, 45);
								contentPane.add(btnDelete1);
								btnDelete1.setBackground(Color.WHITE);
								btnDelete1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										//===================== Informando que foi excluido
										 int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
									        if (resposta == JOptionPane.YES_OPTION) {
									            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
									        } else if (resposta == JOptionPane.NO_OPTION) {
									            JOptionPane.showMessageDialog(null, "Dados não excluídos!");
									        }
									      //==========================================
									}
								});
								btnDelete1.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Documentos\\22k\\image\\delete.png"));
		table.getColumnModel().getColumn(0).setPreferredWidth(69);
		table.getColumnModel().getColumn(1).setPreferredWidth(133);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(146);
		table.getColumnModel().getColumn(4).setPreferredWidth(40);
		table.getColumnModel().getColumn(5).setPreferredWidth(28);
		table.getColumnModel().getColumn(6).setPreferredWidth(29);
		table.getColumnModel().getColumn(7).setPreferredWidth(35);
	}
}
