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
import java.awt.List;
import javax.swing.JList;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.awt.event.InputEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNomeDoAluno;
	private JLabel lblCurso;
	private JLabel lblDisciplina;
	private JLabel lblSemestre;
	private JLabel lblDisciplina_1;
	private JPanel panel_1;
	private JPanel boletimPanel;
	private JTextField textField;
	private JTextField txtPauloCorazimDa;
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
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_9;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("Aluno");
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

		mnNewMenu_1 = new JMenu("Notas e faltas");
		menuBar.add(mnNewMenu_1);

		mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar?");
			        if (resposta == JOptionPane.YES_OPTION) {
			            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			        } else if (resposta == JOptionPane.NO_OPTION) {
			            JOptionPane.showMessageDialog(null, "Fechar");
			        }
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);

		mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmNewMenuItem_6);

		mntmNewMenuItem_8 = new JMenuItem("Editar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
				mntmNewMenuItem_7 = new JMenuItem("Excluir");
				mntmNewMenuItem_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//==========================================
						int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
				        if (resposta == JOptionPane.YES_OPTION) {
				            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				        } else if (resposta == JOptionPane.NO_OPTION) {
				            JOptionPane.showMessageDialog(null, "Dados não excluídos!");
				        }
				      //==========================================
					}
				});
				mnNewMenu_1.add(mntmNewMenuItem_7);

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
		tabbedPane.setBounds(10, 16, 1064, 512);
		contentPane.add(tabbedPane);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Cursos", null, panel_3, null);
		panel_3.setLayout(null);

		lblDisciplina = new JLabel("Campus");
		lblDisciplina.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina.setBounds(28, 26, 155, 28);
		panel_3.add(lblDisciplina);

		lblSemestre = new JLabel("Período");
		lblSemestre.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre.setBounds(28, 182, 155, 28);
		panel_3.add(lblSemestre);

		comboBox_Campus = new JComboBox();
		comboBox_Campus.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Campus.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Universidade Cidade de São Paulo - Tatuapé", "Universidade Cidade de São Paulo - Pinheiros", "Universidade Cidade de São Paulo - Online"}));
		comboBox_Campus.setBounds(28, 53, 650, 40);
		panel_3.add(comboBox_Campus);

		lblCurso_2 = new JLabel("Curso");
		lblCurso_2.setFont(new Font("Lato", Font.PLAIN, 18));
		lblCurso_2.setBounds(28, 104, 155, 28);
		panel_3.add(lblCurso_2);

		comboBox_Curso = new JComboBox();
		comboBox_Curso.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Analise e desenvolvimento de sistemas", "Ciência da computação", "Engenharia de software"}));
		comboBox_Curso.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Curso.setBounds(28, 131, 650, 40);
		panel_3.add(comboBox_Curso);

		lblSemestre_5 = new JLabel("Semestre");
		lblSemestre_5.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre_5.setBounds(248, 182, 155, 28);
		panel_3.add(lblSemestre_5);

		lblSemestre_4 = new JLabel("Turma");
		lblSemestre_4.setFont(new Font("Lato", Font.PLAIN, 18));
		lblSemestre_4.setBounds(468, 181, 155, 28);
		panel_3.add(lblSemestre_4);

		comboBox_Periodo = new JComboBox();
		comboBox_Periodo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Matutino", "Diurno", "Noturno"}));
		comboBox_Periodo.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Periodo.setBounds(28, 209, 210, 40);
		panel_3.add(comboBox_Periodo);

		label = new JLabel("New label");
		label.setBounds(548, 366, -227, -36);
		panel_3.add(label);

		comboBox_Semestre = new JComboBox();
		comboBox_Semestre.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°", "9°", "10°"}));
		comboBox_Semestre.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Semestre.setBounds(248, 210, 210, 40);
		panel_3.add(comboBox_Semestre);

		comboBox_Turma = new JComboBox();
		comboBox_Turma.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "A", "B", "C", "D", "E"}));
		comboBox_Turma.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_Turma.setBounds(468, 209, 210, 40);
		panel_3.add(comboBox_Turma);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Notas e faltas", null, panel, null);
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
		lblSemestre.setBounds(414, 183, 155, 28);
		panel.add(lblSemestre);

		lblDisciplina_1 = new JLabel("Notas");
		lblDisciplina_1.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_1.setBounds(28, 279, 155, 28);
		panel.add(lblDisciplina_1);

		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 19));
		textField.setBounds(28, 53, 180, 40);
		panel.add(textField);
		textField.setColumns(10);

		txtPauloCorazimDa = new JTextField();
		txtPauloCorazimDa.setFont(new Font("Lato", Font.PLAIN, 18));
		txtPauloCorazimDa.setColumns(10);
		txtPauloCorazimDa.setBounds(281, 53, 372, 40);
		panel.add(txtPauloCorazimDa);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Programação orientada a objetos", "Matemática discrete"}));
		comboBox.setBounds(28, 210, 350, 40);
		panel.add(comboBox);

		lblDisciplina_4 = new JLabel("Lista de presença");
		lblDisciplina_4.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_4.setBounds(414, 279, 155, 28);
		panel.add(lblDisciplina_4);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "Analise e desenvolvimento de sistemas", "Ciência da computação", "Engenharia de software"}));
		comboBox_2.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_2.setBounds(28, 132, 350, 40);
		panel.add(comboBox_2);

		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção...", "2019-6", "2019-2", "2019-8", "2020-3", "2021-2", "2022-9", "2022-8", "2023-3"}));
		comboBox_6.setFont(new Font("Lato", Font.PLAIN, 18));
		comboBox_6.setBounds(414, 211, 239, 40);
		panel.add(comboBox_6);

		lblDisciplina_7 = new JLabel("A1");
		lblDisciplina_7.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_7.setBounds(28, 334, 155, 28);
		panel.add(lblDisciplina_7);

		lblDisciplina_8 = new JLabel("A2");
		lblDisciplina_8.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_8.setBounds(28, 373, 155, 28);
		panel.add(lblDisciplina_8);

		lblDisciplina_9 = new JLabel("AF");
		lblDisciplina_9.setFont(new Font("Lato", Font.PLAIN, 18));
		lblDisciplina_9.setBounds(28, 412, 155, 28);
		panel.add(lblDisciplina_9);

		btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Área de Trabalho\\Projeto MVC\\22k\\image\\delete.png"));
		btnNewButton.setBounds(28, 451, 105, 45);
		panel.add(btnNewButton);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Área de Trabalho\\Projeto MVC\\22k\\image\\editing.png"));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(176, 451, 105, 45);
		panel.add(btnNewButton_1);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Área de Trabalho\\Projeto MVC\\22k\\image\\exchange.png"));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(309, 451, 105, 45);
		panel.add(btnNewButton_2);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\fehlp\\OneDrive\\Área de Trabalho\\Projeto MVC\\22k\\image\\save.png"));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(464, 451, 105, 45);
		panel.add(btnNewButton_3);

		boletimPanel = new JPanel();
		boletimPanel.setBackground(Color.WHITE);
		tabbedPane.addTab("Boletim", null, boletimPanel, null);
		boletimPanel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 22, 830, 190);
		boletimPanel.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Lato", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null, null, null, null},
				{null, null, null, "", null, null, null, null, null},
				{null, null, null, null, null, null, null, null, ""},
				{null, null, null, null, null, null, null, null, null},
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
								lblNomeDoAluno_1.setBounds(248, 22, 145, 28);
								panel_4.add(lblNomeDoAluno_1);
								
										lblCurso_1 = new JLabel("E-mail");
										lblCurso_1.setFont(new Font("Lato", Font.PLAIN, 18));
										lblCurso_1.setBounds(28, 104, 66, 28);
										panel_4.add(lblCurso_1);
										
												lblDisciplina_2 = new JLabel("CEP");
												lblDisciplina_2.setFont(new Font("Lato", Font.PLAIN, 18));
												lblDisciplina_2.setBounds(28, 183, 155, 28);
												panel_4.add(lblDisciplina_2);
												
														lblSemestre_1 = new JLabel("Rua");
														lblSemestre_1.setFont(new Font("Lato", Font.PLAIN, 18));
														lblSemestre_1.setBounds(248, 183, 155, 28);
														panel_4.add(lblSemestre_1);
														
																txtRgm = new JTextField();
																txtRgm.setFont(new Font("Lato", Font.PLAIN, 18));
																txtRgm.setColumns(10);
																txtRgm.setBounds(28, 53, 180, 40);
																panel_4.add(txtRgm);
																
																		txtNome = new JTextField();
																		txtNome.setFont(new Font("Lato", Font.PLAIN, 18));
																		txtNome.setColumns(10);
																		txtNome.setBounds(248, 53, 372, 40);
																		panel_4.add(txtNome);
																		
																				txtEmail = new JTextField();
																				txtEmail.setFont(new Font("Lato", Font.PLAIN, 18));
																				txtEmail.setColumns(10);
																				txtEmail.setBounds(28, 132, 316, 40);
																				panel_4.add(txtEmail);
																				
																						txtRua = new JTextField();
																						txtRua.setFont(new Font("Lato", Font.PLAIN, 18));
																						txtRua.setColumns(10);
																						txtRua.setBounds(248, 211, 372, 40);
																						panel_4.add(txtRua);
																						
																								lblNewLabel_2 = new JLabel("CPF");
																								lblNewLabel_2.setFont(new Font("Lato", Font.PLAIN, 16));
																								lblNewLabel_2.setBounds(658, 27, 66, 20);
																								panel_4.add(lblNewLabel_2);
																								
																										lblNewLabel_3 = new JLabel("Data de nascimento");
																										lblNewLabel_3.setFont(new Font("Lato", Font.PLAIN, 16));
																										lblNewLabel_3.setBounds(658, 104, 180, 20);
																										panel_4.add(lblNewLabel_3);
																										
																												lblNewLabel_4 = new JLabel("Telefone");
																												lblNewLabel_4.setFont(new Font("Lato", Font.PLAIN, 16));
																												lblNewLabel_4.setBounds(399, 104, 180, 20);
																												panel_4.add(lblNewLabel_4);
																												
																														lblSemestre_2 = new JLabel("Número");
																														lblSemestre_2.setFont(new Font("Lato", Font.PLAIN, 18));
																														lblSemestre_2.setBounds(658, 183, 180, 28);
																														panel_4.add(lblSemestre_2);
																														
																																txtNumero = new JTextField();
																																txtNumero.setFont(new Font("Lato", Font.PLAIN, 18));
																																txtNumero.setColumns(10);
																																txtNumero.setBounds(658, 211, 180, 40);
																																panel_4.add(txtNumero);
																																
																																		lblDisciplina_3 = new JLabel("Complemento");
																																		lblDisciplina_3.setFont(new Font("Lato", Font.PLAIN, 18));
																																		lblDisciplina_3.setBounds(28, 273, 155, 28);
																																		panel_4.add(lblDisciplina_3);
																																		
																																				txtComplemento = new JTextField();
																																				txtComplemento.setFont(new Font("Lato", Font.PLAIN, 18));
																																				txtComplemento.setColumns(10);
																																				txtComplemento.setBounds(28, 301, 316, 40);
																																				panel_4.add(txtComplemento);
																																				
																																						txtMunicipio = new JTextField();
																																						txtMunicipio.setFont(new Font("Lato", Font.PLAIN, 18));
																																						txtMunicipio.setColumns(10);
																																						txtMunicipio.setBounds(399, 301, 221, 40);
																																						panel_4.add(txtMunicipio);
																																						
																																								lblDisciplina_5 = new JLabel("Município");
																																								lblDisciplina_5.setFont(new Font("Lato", Font.PLAIN, 18));
																																								lblDisciplina_5.setBounds(399, 273, 155, 28);
																																								panel_4.add(lblDisciplina_5);
																																								
																																										txtUf = new JTextField();
																																										txtUf.setFont(new Font("Lato", Font.PLAIN, 18));
																																										txtUf.setColumns(10);
																																										txtUf.setBounds(658, 301, 180, 40);
																																										panel_4.add(txtUf);
																																										
																																												lblDisciplina_6 = new JLabel("UF");
																																												lblDisciplina_6.setFont(new Font("Lato", Font.PLAIN, 18));
																																												lblDisciplina_6.setBounds(658, 273, 155, 28);
																																												panel_4.add(lblDisciplina_6);
																																												
																																												JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
																																												txtCpf.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtCpf.setBounds(658, 53, 180, 40);
																																												panel_4.add(txtCpf);
																																												
																																												JFormattedTextField txtTelefone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
																																												txtTelefone.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtTelefone.setBounds(399, 132, 180, 40);
																																												panel_4.add(txtTelefone);
																																												
																																												JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
																																												txtData.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtData.setBounds(658, 132, 180, 40);
																																												panel_4.add(txtData);
																																												
																																												JFormattedTextField txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
																																												txtCep.setFont(new Font("Dialog", Font.PLAIN, 18));
																																												txtCep.setBounds(28, 211, 180, 40);
																																												panel_4.add(txtCep);
		table.getColumnModel().getColumn(0).setPreferredWidth(69);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(97);
	}
}
