package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;

public class appwdw {

	private JFrame frame;
	private JTextField alokasiWaktuField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	
	private JCheckBox chckbxJatimPark;
	private JCheckBox chckbxBatuScretZoo;
	private JCheckBox chckbxEcogreenpark;
	private JCheckBox chckbxAlunAlunBatu;
	private JCheckBox chckbxParalayang;
	private JCheckBox chckbxCobanRondo;
	private JCheckBox chckbxSelecta;
	private JCheckBox chckbxSengkaling;
	private JCheckBox chckbxPantaiBanyuAnjlok;
	private JCheckBox chckbxPantaiGoaCina;
	private JCheckBox chckbxPantaiNgliyep;
	private JCheckBox chckbxPantaiSendangBiru;
	private JCheckBox chckbxPantaiBalekambang;
	private JCheckBox chckbxHawai;
	private JCheckBox chckbxAlunalunMalang;
	private char[] lokasiPilih = {'F','F','F','F','F','F','F','F','F','F','F','F','F','F','F',};
	
	private JComboBox comboBox;
	
	String titikAwal, AW,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O;
	int alokasiWaktuinteger, lokasiA, lokasiB, lokasiC, lokasiD, lokasiE, lokasiF, lokasiG, lokasiH, lokasiI, lokasiJ, lokasiK, lokasiL, lokasiM, lokasiN, lokasiO;
	public int[] sendWaktuWisata;
	public int jumlahLokasiTerpilih=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appwdw window = new appwdw();
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
	public appwdw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 781, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTotalA = new JLabel("Total Alokasi Waktu Wisata");
		lblTotalA.setBounds(16, 17, 188, 14);
		frame.getContentPane().add(lblTotalA);
		
		JLabel lblTitikAwal = new JLabel("Titik Awal");
		lblTitikAwal.setBounds(16, 42, 188, 14);
		frame.getContentPane().add(lblTitikAwal);
		
		JLabel lblTujuanWisata = new JLabel("Tujuan Wisata");
		lblTujuanWisata.setBounds(16, 67, 188, 14);
		frame.getContentPane().add(lblTujuanWisata);
		
		alokasiWaktuField = new JTextField();
		alokasiWaktuField.setBounds(173, 14, 56, 20);
		frame.getContentPane().add(alokasiWaktuField);
		alokasiWaktuField.setColumns(10);
		
		chckbxJatimPark = new JCheckBox("A. Jatim Park 1");
		chckbxJatimPark.setBounds(12, 88, 163, 23);
		frame.getContentPane().add(chckbxJatimPark);
		
		chckbxBatuScretZoo = new JCheckBox("B. Batu Scret Zoo");
		chckbxBatuScretZoo.setBounds(12, 114, 192, 23);
		frame.getContentPane().add(chckbxBatuScretZoo);
		
		chckbxEcogreenpark = new JCheckBox("C. Ecogreenpark");
		chckbxEcogreenpark.setBounds(12, 140, 125, 23);
		frame.getContentPane().add(chckbxEcogreenpark);
		
		chckbxAlunAlunBatu = new JCheckBox("D. Alun-alun Batu");
		chckbxAlunAlunBatu.setBounds(12, 166, 163, 23);
		frame.getContentPane().add(chckbxAlunAlunBatu);
		
		chckbxParalayang = new JCheckBox("E. Paralayang");
		chckbxParalayang.setBounds(12, 192, 147, 23);
		frame.getContentPane().add(chckbxParalayang);
		
		chckbxCobanRondo = new JCheckBox("F. Coban Rondo");
		chckbxCobanRondo.setBounds(12, 218, 176, 23);
		frame.getContentPane().add(chckbxCobanRondo);
		
		chckbxSelecta = new JCheckBox("G. Selecta");
		chckbxSelecta.setBounds(12, 244, 97, 23);
		frame.getContentPane().add(chckbxSelecta);
		
		chckbxSengkaling = new JCheckBox("H. Sengkaling");
		chckbxSengkaling.setBounds(12, 270, 147, 23);
		frame.getContentPane().add(chckbxSengkaling);
		
		chckbxHawai = new JCheckBox("I. Hawai Water Park");
		chckbxHawai.setBounds(350, 88, 192, 23);
		frame.getContentPane().add(chckbxHawai);
		
		chckbxAlunalunMalang = new JCheckBox("J. Alun-Alun Malang");
		chckbxAlunalunMalang.setBounds(350, 114, 188, 23);
		frame.getContentPane().add(chckbxAlunalunMalang);
		
		chckbxPantaiBalekambang = new JCheckBox("K. Pantai Balekambang");
		chckbxPantaiBalekambang.setBounds(350, 140, 192, 23);
		frame.getContentPane().add(chckbxPantaiBalekambang);
		
		chckbxPantaiSendangBiru = new JCheckBox("L. Pantai Sendang Biru");
		chckbxPantaiSendangBiru.setBounds(350, 166, 192, 23);
		frame.getContentPane().add(chckbxPantaiSendangBiru);
		
		chckbxPantaiNgliyep = new JCheckBox("M. Pantai Ngliyep");
		chckbxPantaiNgliyep.setBounds(350, 192, 163, 23);
		frame.getContentPane().add(chckbxPantaiNgliyep);
		
		chckbxPantaiGoaCina = new JCheckBox("N. Pantai Goa Cina");
		chckbxPantaiGoaCina.setBounds(350, 218, 176, 23);
		frame.getContentPane().add(chckbxPantaiGoaCina);
		
		chckbxPantaiBanyuAnjlok = new JCheckBox("O. Pantai Banyu Anjlok");
		chckbxPantaiBanyuAnjlok.setBounds(350, 244, 192, 23);
		frame.getContentPane().add(chckbxPantaiBanyuAnjlok);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 88, 56, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(221, 114, 56, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(221, 140, 56, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(221, 166, 56, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(221, 192, 56, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(221, 218, 56, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(221, 244, 56, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(221, 270, 56, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(546, 88, 56, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(546, 114, 56, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(546, 140, 56, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(546, 166, 56, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(546, 192, 56, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(546, 218, 56, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(546, 244, 56, 20);
		frame.getContentPane().add(textField_15);
		
		JLabel lblJam = new JLabel("Jam");
		lblJam.setBounds(239, 17, 36, 14);
		frame.getContentPane().add(lblJam);
		
		JLabel lblMenit = new JLabel("menit");
		lblMenit.setBounds(287, 91, 36, 14);
		frame.getContentPane().add(lblMenit);
		
		JLabel label = new JLabel("menit");
		label.setBounds(287, 117, 36, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("menit");
		label_1.setBounds(287, 169, 36, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("menit");
		label_2.setBounds(287, 143, 36, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("menit");
		label_3.setBounds(287, 273, 36, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("menit");
		label_4.setBounds(287, 247, 36, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("menit");
		label_5.setBounds(287, 221, 36, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("menit");
		label_6.setBounds(287, 195, 36, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("menit");
		label_7.setBounds(612, 91, 36, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("menit");
		label_8.setBounds(612, 117, 36, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("menit");
		label_9.setBounds(612, 143, 36, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("menit");
		label_10.setBounds(612, 169, 36, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("menit");
		label_11.setBounds(612, 195, 36, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("menit");
		label_12.setBounds(612, 221, 36, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("menit");
		label_13.setBounds(612, 247, 36, 14);
		frame.getContentPane().add(label_13);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A. JATIM PARK 1", "B. BATU SCREET ZOO", "C. ECOGREENPARK", "D. ALUN-ALUN BATU", "E. PARALAYANG", "F. COBAN RONDO", "G. SELECTA", "H. SENGKALING", "I. HAWAI WATER PARK", "J. ALUN-ALUN MALANG", "K. PANTAI BALAIKAMBANG", "L. PANTAI SENDANG BIRU", "M. PANTAI NGLIYEP", "N. PANTAI GOA CINA", "O. PANTAI BANYU ANJLOK"}));
		comboBox.setBounds(173, 39, 188, 20);
		frame.getContentPane().add(comboBox);
		
				
		JButton btnNewButton = new JButton("Hasil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AW = alokasiWaktuField.getText();
				alokasiWaktuinteger = Integer.parseInt(AW);
				if(alokasiWaktuinteger>9){
					System.out.println("ERROR");
				}else{
					createFrame();
					titikAwal = comboBox.getSelectedItem().toString();
					
					
					
					System.out.println(AW);
					A = textField_1.getText();
					System.out.println(A);
					B = textField_2.getText();
					System.out.println(B);
					C = textField_3.getText();
					System.out.println(C);
					D = textField_4.getText();
					System.out.println(D);
					E = textField_5.getText();
					System.out.println(E);
					F = textField_6.getText();
					System.out.println(F);
					G = textField_7.getText();
					System.out.println(G);
					H = textField_8.getText();
					System.out.println(H);
					I = textField_9.getText();
					System.out.println(I);
					J = textField_10.getText();
					System.out.println(J);
					K = textField_11.getText();
					System.out.println(K);
					L = textField_12.getText();
					System.out.println(L);
					M = textField_13.getText();
					System.out.println(M);
					N = textField_14.getText();
					System.out.println(N);
					O = textField_15.getText();
					System.out.println(O);
					
					if(chckbxJatimPark.isSelected() == true)
					{
						lokasiPilih[0] = 'T';
						lokasiA = Integer.parseInt(A);
					}
					if(chckbxBatuScretZoo.isSelected()==true)
					{
						lokasiPilih[1] = 'T';
						lokasiB = Integer.parseInt(B);
					}
					if (chckbxEcogreenpark.isSelected()==true)
					{
						lokasiPilih[2] = 'T';
						lokasiC = Integer.parseInt(C);
					}
					if (chckbxAlunAlunBatu.isSelected()==true)
					{
						lokasiPilih[3] = 'T';
						lokasiD = Integer.parseInt(D);
					}
					if (chckbxParalayang.isSelected()==true)
					{
						lokasiPilih[4] = 'T';
						lokasiE = Integer.parseInt(E);
					}
					if (chckbxCobanRondo.isSelected()==true)
					{
						lokasiPilih[5] = 'T';
						lokasiF = Integer.parseInt(F);
					}
					if (chckbxSelecta.isSelected()==true)
					{
						lokasiPilih[6] = 'T';
						lokasiG = Integer.parseInt(G);
					}
					if (chckbxSengkaling.isSelected()==true)
					{
						lokasiPilih[7] = 'T';
						lokasiH = Integer.parseInt(H);
					}
					if (chckbxHawai.isSelected()==true)
					{
						lokasiPilih[8] = 'T';
						lokasiI = Integer.parseInt(I);
					}
					if (chckbxAlunalunMalang.isSelected()==true)
					{
						lokasiPilih[9] = 'T';
						lokasiJ = Integer.parseInt(J);
					}
					if (chckbxPantaiBalekambang.isSelected()==true)
					{
						lokasiPilih[10] = 'T';
						lokasiK = Integer.parseInt(K);
					}
					if (chckbxPantaiSendangBiru.isSelected()==true)
					{
						lokasiPilih[11] = 'T';
						lokasiL = Integer.parseInt(L);
					}
					if (chckbxPantaiNgliyep.isSelected()==true)
					{
						lokasiPilih[12] = 'T';
						lokasiM = Integer.parseInt(M);
					}
					if (chckbxPantaiGoaCina.isSelected()==true)
					{
						lokasiPilih[13] = 'T';
						lokasiN = Integer.parseInt(N);
					}
					if (chckbxPantaiBanyuAnjlok.isSelected()==true)
					{
						lokasiPilih[14] = 'T';
						lokasiO = Integer.parseInt(O);
					}
					System.out.println(lokasiPilih);
				}
		
			}
		});
		btnNewButton.setBounds(546, 350, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void createFrame()
    {
        EventQueue.invokeLater(new Runnable()
        {
        	
            @Override
            public void run()
            {
            	Knapsack1 knapsack = new Knapsack1();
            	int[] simpanIDLokasi = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            	int[] waktuBerkunjungLokasi = {lokasiA, lokasiB, lokasiC, lokasiD, lokasiE, lokasiF, lokasiG, lokasiH, lokasiI, lokasiJ, lokasiK, lokasiL, lokasiM, lokasiN, lokasiO};
            	int[] titikLokasiTerpilih = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            	int[] waktuLokasiTerpilih = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            	String[] namaWisata = {"A. JATIM PARK 1", "B. BATU SCREET ZOO", "C. ECOGREENPARK", "D. ALUN-ALUN BATU", "E. PARALAYANG", "F. COBAN RONDO", "G. SELECTA", "H. SENGKALING", "I. HAWAI WATER PARK", "J. ALUN-ALUN MALANG", "K. PANTAI BALAIKAMBANG", "L. PANTAI SENDANG BIRU", "M. PANTAI NGLIYEP", "N. PANTAI GOA CINA", "O. PANTAI BANYU ANJLOK"};
            	int jumlahLok=0;
            	for(int i=0;i<=14;i++){
            		if(lokasiPilih[i] == 'T'){
            			simpanIDLokasi[jumlahLok] = i;
            			waktuLokasiTerpilih[jumlahLok] = waktuBerkunjungLokasi[i];
            			jumlahLok++;
            		}
            	}
            	jumlahLokasiTerpilih = jumlahLok;
            	sendWaktuWisata = new int[jumlahLok];
            	StringBuilder sbcontent=new StringBuilder();
            	for(int j=0;j<jumlahLok;j++){
            		titikLokasiTerpilih[j] = simpanIDLokasi[j];
            		//sendWaktuWisata[j] = waktuLokasiTerpilih[j];
            		sbcontent.append("Lokasi "+(j+1)+" : "+(namaWisata[titikLokasiTerpilih[j]])+"\n"+"Alokasi Waktu : "+waktuLokasiTerpilih[j]+" menit"+"\n");
            	}
            	
            	System.out.println(sendWaktuWisata[0]);
            	
                JFrame frame = new JFrame("Hasil Rute");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                sbcontent.append("\nAlokasi Waktu :"+alokasiWaktuinteger+ " jam"+"\nTitik Awal :"+titikAwal+"\nJumlah Wisata Terpilih :"+jumlahLok);
                String content = sbcontent.toString();
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                panel.setOpaque(true);
                JTextArea textArea = new JTextArea(content, 15, 50);
                textArea.setWrapStyleWord(true);
                textArea.setEditable(false);
                textArea.setFont(Font.getFont(Font.SANS_SERIF));
                
                //knapsack.rumus(titikAwal, alokasiWaktu, tujuanWisata)
                
                JScrollPane scroller = new JScrollPane(textArea);
                scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                JPanel inputpanel = new JPanel();
                inputpanel.setLayout(new FlowLayout());
                //JTextField input = new JTextField(20);
                //JButton button = new JButton("Enter");
                DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                panel.add(scroller);
                //inputpanel.add(input);
                //inputpanel.add(button);
                panel.add(inputpanel);
                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
                frame.setResizable(false);
                //input.requestFocus();
            }
        });
    }
	/*public JTextArea getTextAreaHasil()
	{
	     return jTextArea;
	}*/
	public void Knapsack() {
		int[] waktukunjung = {' ', ' ', ' ', ' ', ' '};
		int[] waktutempuh = {' ', ' ', ' ', ' ', ' '};
		waktutempuh[0] = 3; //A-B
		waktutempuh[1] = 4; //A-C
		waktutempuh[2] = 6; //A-D
		waktutempuh[3] = 1; //B-C
		waktutempuh[4] = 7; //B-D
		
		waktukunjung[0] = 60; //A-B
		waktukunjung[1] = 30; //A-C
		waktukunjung[2] = 45; //A-D
		waktukunjung[3] = 60; //B-C
		waktukunjung[4] = 60; //B-D
		
		int[] waktutotal= {' ', ' ', ' ', ' ', ' '};;
		for (int i=0;i<=4;i++){
			waktutotal[i] = waktutempuh[i]+waktukunjung[i];
		}
		
	}
}
