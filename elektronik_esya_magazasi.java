package java_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class elektronik_esya_magazasi {

	private JFrame frmElektronikE;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1_1;
	private JTextField textField_2_1;
	private JTextField textField_3_1;
	private JTextField textField_4_1;
	private JTextField textField_5_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elektronik_esya_magazasi window = new elektronik_esya_magazasi();
					window.frmElektronikE.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public elektronik_esya_magazasi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElektronikE = new JFrame();
		frmElektronikE.getContentPane().setBackground(new Color(153, 180, 209));
		frmElektronikE.setTitle("Elektronik E\u015Fya Ma\u011Fazas\u0131");
		frmElektronikE.setBounds(100, 100, 1055, 661);
		frmElektronikE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElektronikE.getContentPane().setLayout(null);
		
		JLabel lbl = new JLabel("\u00DCR\u00DCNLER");
		lbl.setForeground(SystemColor.text);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 27));
		lbl.setBounds(90, 28, 176, 33);
		frmElektronikE.getContentPane().add(lbl);
		
		JLabel lblSepet = new JLabel("SEPET");
		lblSepet.setForeground(Color.WHITE);
		lblSepet.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblSepet.setBounds(423, 28, 129, 33);
		frmElektronikE.getContentPane().add(lblSepet);
		
		JLabel lblFatura = new JLabel("FATURA");
		lblFatura.setForeground(Color.WHITE);
		lblFatura.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblFatura.setBounds(768, 28, 150, 33);
		frmElektronikE.getContentPane().add(lblFatura);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(238, 232, 170));
		separator.setForeground(new Color(238, 232, 170));
		separator.setBounds(339, 49, 12, 496);
		frmElektronikE.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(238, 232, 170));
		separator_1.setBackground(new Color(238, 232, 170));
		separator_1.setBounds(693, 49, 12, 496);
		frmElektronikE.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Para birimi se\u00E7iniz :");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(13, 73, 150, 33);
		frmElektronikE.getContentPane().add(lblNewLabel);
		
		JRadioButton radio_btn_tl = new JRadioButton("TL");
		radio_btn_tl.setBackground(SystemColor.activeCaption);
		radio_btn_tl.setForeground(SystemColor.text);
		radio_btn_tl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		radio_btn_tl.setBounds(165, 69, 72, 41);
		frmElektronikE.getContentPane().add(radio_btn_tl);
		
		JRadioButton radio_btn_usd = new JRadioButton("USD");
		radio_btn_usd.setForeground(Color.WHITE);
		radio_btn_usd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		radio_btn_usd.setBackground(SystemColor.activeCaption);
		radio_btn_usd.setBounds(240, 69, 91, 41);
		frmElektronikE.getContentPane().add(radio_btn_usd);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio_btn_tl);
		bg.add(radio_btn_usd);
		
		JLabel lblBlgsayarlar = new JLabel("B\u0130LG\u0130SAYARLAR");
		lblBlgsayarlar.setForeground(Color.WHITE);
		lblBlgsayarlar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBlgsayarlar.setBounds(13, 112, 150, 33);
		frmElektronikE.getContentPane().add(lblBlgsayarlar);
		
		JLabel lblIlemciler = new JLabel("\u0130\u015ELEMC\u0130LER");
		lblIlemciler.setForeground(Color.WHITE);
		lblIlemciler.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIlemciler.setBounds(13, 193, 150, 33);
		frmElektronikE.getContentPane().add(lblIlemciler);
		
		JLabel lblPcaksesuarlar = new JLabel("PC-AKSESUARLARI");
		lblPcaksesuarlar.setForeground(Color.WHITE);
		lblPcaksesuarlar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPcaksesuarlar.setBounds(13, 274, 150, 33);
		frmElektronikE.getContentPane().add(lblPcaksesuarlar);
		
		JLabel lblEkranKartlar = new JLabel("EKRAN KARTLARI");
		lblEkranKartlar.setForeground(Color.WHITE);
		lblEkranKartlar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEkranKartlar.setBounds(13, 349, 150, 33);
		frmElektronikE.getContentPane().add(lblEkranKartlar);
		
		JLabel lblAnaKartlar = new JLabel("ANA KARTLAR");
		lblAnaKartlar.setForeground(Color.WHITE);
		lblAnaKartlar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAnaKartlar.setBounds(13, 423, 150, 33);
		frmElektronikE.getContentPane().add(lblAnaKartlar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"se\u00E7iniz", "ASUS", "LENOVO", "HP", "DELL", "ACER"}));
		comboBox.setBounds(23, 153, 290, 33);
		frmElektronikE.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"se\u00E7iniz", "i3", "i5", "i7"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox_1.setBounds(23, 229, 290, 33);
		frmElektronikE.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"se\u00E7iniz", "MOUSE", "KLAVYE", "KULAKLIK", "M\u0130KROFON", "YAZICI", "HOPARL\u00D6R"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox_2.setBounds(23, 307, 290, 33);
		frmElektronikE.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"se\u00E7iniz", "NVIDIA GTX 930", "AMD Raedon RX580", "GTX 1080 ti"}));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox_3.setBounds(23, 387, 290, 33);
		frmElektronikE.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"se\u00E7iniz", "ASUS p8h61-m lx", "Gigabyte h81m-d", "ESC v61-sh"}));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		comboBox_4.setBounds(23, 461, 290, 33);
		frmElektronikE.getContentPane().add(comboBox_4);
		
		JButton btn_urun = new JButton("SEPETE EKLE");
		btn_urun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tl=0,usd=0,kdv1=0,kdv2=0;
				kdv1=tl+(tl*(18/100));
			    kdv2=usd+(usd*(18/100));			
				
				if(radio_btn_tl.isSelected()== false && radio_btn_usd.isSelected()== false){
					
					JOptionPane.showMessageDialog(frmElektronikE,"    Para Birimi Secmediniz !!!   ","  UYARI  ",JOptionPane.WARNING_MESSAGE);
				}
				
				textField_1.setText(comboBox.getSelectedItem().toString());
				textField_2.setText(comboBox_1.getSelectedItem().toString());
				textField_3.setText(comboBox_2.getSelectedItem().toString());
				textField_4.setText(comboBox_3.getSelectedItem().toString());
				textField_5.setText(comboBox_4.getSelectedItem().toString());
				
				int []bilgisayar = new int[]{0,3000 ,3500 , 4000 ,4500 ,2000};
	            int i;
	            for(i=0; i<=6; i++){
	        	   if(comboBox.getSelectedIndex() == i){
	        		   if(radio_btn_tl.isSelected()==true){
	        	         textField_1_1.setText(""+bilgisayar[i]);
	        	   }
	        		   else if(radio_btn_usd.isSelected()==true){
	        			   textField_1_1.setText(""+bilgisayar[i]/4);
	        	   }
	           }
	            int []islemci = new int []{0,2000,2500,3000};
	            int j;
	            for(j=0; j<=4;j++){
	            	if(comboBox_1.getSelectedIndex() == j){
	            		if(radio_btn_tl.isSelected()==true){
	            		textField_2_1.setText(""+islemci[j]);
	            		}
	            		else if(radio_btn_usd.isSelected()==true){
	            			textField_2_1.setText(""+islemci[j]/4);
	            		}
	            	}            	
	            }
	            int []aksesuar = new int []{0,100,150,150,200,500,300};
	            int k;
	            for(k=0; k<=7; k++){
	            	if(comboBox_2.getSelectedIndex()==k){
	            		if(radio_btn_tl.isSelected()==true){
	            		textField_3_1.setText(""+aksesuar[k]);
	            		}
	            		else if(radio_btn_usd.isSelected()==true){
	            			textField_3_1.setText(""+aksesuar[k]/4);
	            		}
	            	}
	            }
	            int []ekran = new int []{0,400,420,450};
	            int l;
	            for(l=0; l<=4 ; l++){
	            	if(comboBox_3.getSelectedIndex()==l){
	            		if(radio_btn_tl.isSelected()==true){
	            		textField_4_1.setText(""+ekran[l]);
	            		}
	            		else if(radio_btn_usd.isSelected()==true){
	            			textField_4_1.setText(""+ekran[l]/4);
	            		}
	            	}
	            }
	            int []ana = new int []{0,450,500,550};
	            int m;
	            for(m=0; m<=4; m++){
	            	if(comboBox_4.getSelectedIndex()==m){
	            		if(radio_btn_tl.isSelected()==true){
	            		textField_5_1.setText(""+ana[m]);
	            		}
	            		else if(radio_btn_usd.isSelected()==true){
	            			textField_5_1.setText(""+ana[m]/4);
	            		}
	            	}
	            }	            
			}
	            comboBox.setSelectedIndex(0);
	            comboBox_1.setSelectedIndex(0);
	            comboBox_2.setSelectedIndex(0);
	            comboBox_3.setSelectedIndex(0);
	            comboBox_4.setSelectedIndex(0);
			}
		});
		btn_urun.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn_urun.setBounds(150, 504, 169, 33);
		frmElektronikE.getContentPane().add(btn_urun);
		
		JLabel lblUsd = new JLabel("*1.00 USD =4.00 TL esas al\u0131nm\u0131\u015Ft\u0131r.");
		lblUsd.setForeground(Color.WHITE);
		lblUsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsd.setBounds(23, 540, 290, 33);
		frmElektronikE.getContentPane().add(lblUsd);
		
		JLabel lblfiyatlarimizaKdv = new JLabel("*Fiyatlarimiza (%18) KDV dahildir.");
		lblfiyatlarimizaKdv.setForeground(Color.WHITE);
		lblfiyatlarimizaKdv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblfiyatlarimizaKdv.setBounds(361, 489, 290, 33);
		frmElektronikE.getContentPane().add(lblfiyatlarimizaKdv);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_1.setEditable(false);
		textField_1.setBounds(352, 105, 218, 39);
		frmElektronikE.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(352, 160, 218, 39);
		frmElektronikE.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(352, 211, 218, 39);
		frmElektronikE.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_4.setColumns(10);
		textField_4.setBounds(352, 267, 218, 39);
		frmElektronikE.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(352, 320, 218, 39);
		frmElektronikE.getContentPane().add(textField_5);
		
		textField_1_1 = new JTextField();
		textField_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textField_1_1.setEditable(false);
		textField_1_1.setColumns(10);
		textField_1_1.setBounds(581, 105, 98, 39);
		frmElektronikE.getContentPane().add(textField_1_1);
		
		textField_2_1 = new JTextField();
		textField_2_1.setEditable(false);
		textField_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textField_2_1.setColumns(10);
		textField_2_1.setBounds(581, 160, 98, 39);
		frmElektronikE.getContentPane().add(textField_2_1);
		
		textField_3_1 = new JTextField();
		textField_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textField_3_1.setEditable(false);
		textField_3_1.setColumns(10);
		textField_3_1.setBounds(581, 211, 98, 39);
		frmElektronikE.getContentPane().add(textField_3_1);
		
		textField_4_1 = new JTextField();
		textField_4_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textField_4_1.setEditable(false);
		textField_4_1.setColumns(10);
		textField_4_1.setBounds(581, 267, 98, 39);
		frmElektronikE.getContentPane().add(textField_4_1);
		
		textField_5_1 = new JTextField();
		textField_5_1.setEditable(false);
		textField_5_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textField_5_1.setColumns(10);
		textField_5_1.setBounds(581, 320, 98, 39);
		frmElektronikE.getContentPane().add(textField_5_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBounds(708, 89, 277, 417);
		frmElektronikE.getContentPane().add(textPane);
		
		JButton btn_fatura = new JButton("FATURA");
		btn_fatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField_1_1.getText());
				int b=Integer.parseInt(textField_2_1.getText());
				int c=Integer.parseInt(textField_3_1.getText());
				int d=Integer.parseInt(textField_4_1.getText());
				int f=Integer.parseInt(textField_5_1.getText());
				int toplam=a+b+c+d+f;
				
				
				
				textPane.setText("*ELEKTRONIK ESYA MAGAZASI*" + "\n" +"\n"+ "Bilgisayar  (+%18 KDV) : "+ textField_1_1.getText() +"\n"+"Islemci (+%18 KDV) :"+
				textField_2_1.getText() +"\n"+"Aksesuar (+%18 KDV) :"+textField_3_1.getText() +"\n"+"Ekran Karti (+%18 KDV) :"+textField_4_1.getText() +"\n"+
				"Ana Kart (+%18 KDV) :"+textField_5_1.getText() +"\n"+"\n"+
			    "-----------------------------"+"\n"+"Toplam KDV     :"+"\n"+"KDV'siz Toplam"+"\n"+"-----------------------------"+"\n"+"Genel Toplam : "+ toplam +"\n"
				+"-----------------------------"+"\n"+"**Bizi tercih ettiginiz icin tesekkur ederiz.**"+
				"\n"+"Yine bekleriz. :)");
				
				
				
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_1_1.setText(null);
				textField_2_1.setText(null);
				textField_3_1.setText(null);
				textField_4_1.setText(null);
				textField_5_1.setText(null);

				
			}
		});
		btn_fatura.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn_fatura.setBounds(383, 387, 256, 69);
		frmElektronikE.getContentPane().add(btn_fatura);
		
		
		
		
	}
}
