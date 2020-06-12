package weatherpkg;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class layout extends JPanel
{
	private Predictor myPredictor = new Predictor();
	private JTextField t1;
	private JTextField t2;
	private JTextField timef;
	
	public double ftoc(double ab)
	{
		ab =(ab -32)*(5.0/9.0);
		BigDecimal b = new BigDecimal(ab);
		ab = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return ab;
	}
	public layout() {
		
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JComboBox byear = new JComboBox();
		byear.setBounds(132, 0, 89, 27);
		byear.setModel(new DefaultComboBoxModel(new String[] {"2017"}));
		byear.setToolTipText("2017\n");
		add(byear);
		
		JComboBox bmonth = new JComboBox();
		bmonth.setBounds(6, 0, 68, 27);
		
		bmonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		add(bmonth);
		
		JComboBox bday = new JComboBox();
		bday.setBounds(68, 0, 68, 27);
		bday.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		add(bday);
		
		JSlider slider = new JSlider();
		slider.setBounds(6, 161, 438, 46);
		slider.setMaximum(24);
		slider.setMajorTickSpacing(6);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setValue(12);
	
		
		add(slider);
		
		JCheckBox cwind = new JCheckBox("Wind");
		cwind.setBounds(233, 71, 68, 23);
		add(cwind);
		
		JCheckBox cwr = new JCheckBox("WindDirection\n");
		cwr.setBounds(231, 109, 128, 23);
		add(cwr);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdc = new JRadioButton("C\n");
		rdc.setBounds(171, 59, 50, 23);
		add(rdc);
		bg.add(rdc);
		
		
		JRadioButton rdf = new JRadioButton("F\n");
		rdf.setBounds(132, 59, 43, 23);
		add(rdf); 
		bg.add(rdf);
		rdf.setSelected(true);
		
		JLabel NTem = new JLabel("Tem\n");
		NTem.setBounds(95, 76, 61, 44);
		add(NTem);
		
		JLabel lblNewLabel = new JLabel("PICTURE\n");
		lblNewLabel.setBounds(26, 68, 61, 61);
		add(lblNewLabel);
		
		JLabel l1 = new JLabel("Temperture\n");
		l1.setBounds(6, 39, 195, 20);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(301, 70, 89, 26);
		add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(353, 108, 79, 26);
		add(t2);
		t2.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(6, 133, 43, 16);
		add(lblTime);
		
		timef = new JTextField();
		timef.setBounds(45, 128, 79, 26);
		add(timef);
		timef.setColumns(10);
		timef.setText(slider.getValue()+":00");
		
		JLabel pl12 = new JLabel("New label");
		pl12.setBounds(108, 226, 16, 16);
		add(pl12);
		
		JLabel pl13 = new JLabel("New label");
		pl13.setBounds(157, 226, 61, 16);
		add(pl13);
		
		JLabel pl14 = new JLabel("New label");
		pl14.setBounds(275, 226, 61, 16);
		add(pl14);
		
		JLabel pl15 = new JLabel("New label");
		pl15.setBounds(371, 226, 61, 16);
		add(pl15);
		
		JLabel pl21 = new JLabel("New label");
		pl21.setBounds(6, 254, 70, 16);
		add(pl21);
		
		JLabel pl22 = new JLabel("New label");
		pl22.setBounds(108, 254, 16, 16);
		add(pl22);
		
		JLabel pl23 = new JLabel("New label");
		pl23.setBounds(157, 254, 61, 16);
		add(pl23);
		
		JLabel pl11 = new JLabel("New label");
		pl11.setBounds(6, 226, 70, 16);
		add(pl11);
		
		JLabel pl24 = new JLabel("New label");
		pl24.setBounds(275, 254, 61, 16);
		add(pl24);
		
		JLabel pl25 = new JLabel("New label");
		pl25.setBounds(371, 254, 61, 16);
		add(pl25);
		
		JLabel pl31 = new JLabel("New label");
		pl31.setBounds(6, 283, 70, 16);
		add(pl31);
		
		JLabel pl32 = new JLabel("New label");
		pl32.setBounds(108, 283, 16, 16);
		add(pl32);
		
		JLabel pl33 = new JLabel("New label");
		pl33.setBounds(157, 283, 61, 16);
		add(pl33);
		
		JLabel pl34 = new JLabel("New label");
		pl34.setBounds(275, 282, 61, 16);
		add(pl34);
		
		JLabel pl35 = new JLabel("New label");
		pl35.setBounds(371, 283, 61, 16);
		add(pl35);
		
		JLabel pl41 = new JLabel("New label");
		pl41.setBounds(6, 311, 70, 16);
		add(pl41);
		
		JLabel pl42 = new JLabel("New label");
		pl42.setBounds(108, 311, 16, 16);
		add(pl42);
		
		JLabel pl43 = new JLabel("New label");
		pl43.setBounds(157, 311, 61, 16);
		add(pl43);
		
		JLabel pl44 = new JLabel("New label");
		pl44.setBounds(275, 310, 61, 16);
		add(pl44);
		
		JLabel pl45 = new JLabel("New label");
		pl45.setBounds(371, 311, 61, 16);
		add(pl45);
		
		JButton btnNewButton = new JButton("Start\n");
		btnNewButton.setBounds(231, -1, 96, 29);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int m = bmonth.getSelectedIndex()+1;
				int d = bday.getSelectedIndex()+1;
				int y = 2016;
				int m11 = bmonth.getSelectedIndex()+1;
				int d11 = bday.getSelectedIndex()+1;
				int y11 = 2016;
				slider.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						timef.setText(slider.getValue()+":00");
						int value1 = slider.getValue();
						if(value1 ==0)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}
						if(value1 ==1)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}if(value1 ==2)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}if(value1 ==3)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}if(value1 ==4)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}if(value1 ==5)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==6)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
							t1.setText(myPredictor.prewind(m11, d11, y11, value1)+"");
							t2.setText(myPredictor.prewinddir(m11, d11, y11, value1)+"");
						}if(value1 ==7)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==8)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==9)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==10)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 == 11)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==12)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==13)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==14)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==15)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==16)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==17)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==18)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==19)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==20)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==21)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==22)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==23)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}if(value1 ==24)
						{
							NTem.setText(myPredictor.pre(m11, d11, y11, value1)+"");
							if(rdc.isSelected())
							{
								double abc = ftoc(myPredictor.pre(m11, d11, y11,value1));
								NTem.setText(""+abc);
							}
						}
						
					}	
				});
				NTem.setText(""+ myPredictor.predictAverageDailyTemp(m,d, 2015));
				if(myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()>75)
				{
					l1.setText("Sunshine");
					lblNewLabel.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_sun.jpg")));
				}
				else if (myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()< 50)
			 
				{
					l1.setText("Snow Day NO CLASS!");
					l1.setForeground(Color.RED);
					lblNewLabel.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_snow.jpg")));
				}
				else
				{
					l1.setText("Cloudy");
					
					lblNewLabel.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_cloudy.jpg")));
				}
				if(rdc.isSelected())
				{
					double tempt = myPredictor.predictAverageDailyTemp(m,d, 2016).getAverageFarenheit();
					tempt =(tempt -32)*(5.0/9.0);
					BigDecimal b = new BigDecimal(tempt);
					tempt = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					NTem.setText(""+tempt);
				}
				
				if(cwind.isSelected())
				{
					t1.setText(""+myPredictor.predictAverageDailyWind(m, d, y).getSpeed());
				}
				else
					t1.setText("");
				if(cwr.isSelected())
				{
					int dir = myPredictor.predictAverageDailyWind(m, d, y).getDirection();
					if((dir >0) && (dir <90))
					{
						t2.setText("EAST");
					}
					if((dir >=90) && (dir <180))
					{
						t2.setText("NORTH");
					}
					if((dir >=180) && (dir <270))
					{
						t2.setText("WEST");
					}
					if((dir >=270) && (dir <360))
					{
						t2.setText("SOUTH");
					}
					
				}
				else
					t2.setText("");
				
				d = d+1;
				if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
					if(d>31)
					{
						d=1;
						m=m+1;
					}
				}
				else if((m==4)||(m==6)||(m==9)||(m==11))
				{
					if(d>30)
					{
						d =1;
						m = m +1;
					}
				}
				else 
				{
					if(d>28)
					{
						d =1;
						m = m+1;
					}
				}
				pl11.setText(m+"/"+d+"/"+y);
				pl13.setText(""+ myPredictor.predictAverageDailyTemp(m, d, y));
				if(rdc.isSelected())
				{
					double tempt = myPredictor.predictAverageDailyTemp(m,d, y).getAverageFarenheit();
					tempt =(tempt -32)*(5.0/9.0);
					BigDecimal b = new BigDecimal(tempt);
					tempt = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					pl13.setText(""+tempt);
				}
				if(myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()>75)
				{
			
					pl12.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_sun.jpg")));
				}
				else if (myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()< 50)
			 
				{
					pl12.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_snow.jpg")));
				}
				else
				{
				
					pl12.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_rsz_cloudy.jpg")));
				}
				pl14.setText(myPredictor.predictAverageDailyWind(m, d, y).getSpeed()+" MPH");
				int dir = myPredictor.predictAverageDailyWind(m, d, y).getDirection();
				if((dir >0) && (dir <90))
				{
					pl15.setText("EAST");
				}
				if((dir >=90) && (dir <180))
				{
					pl15.setText("NORTH");
				}
				if((dir >=180) && (dir <270))
				{
					pl15.setText("WEST");
				}
				if((dir >=270) && (dir <360))
				{
					pl15.setText("SOUTH");
				}
				
				d = d+1;
				if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
					if(d>31)
					{
						d=1;
						m=m+1;
					}
				}
				else if((m==4)||(m==6)||(m==9)||(m==11))
				{
					if(d>30)
					{
						d =1;
						m = m +1;
					}
					
				}
				else 
				{
					if(d>28)
					{
						d =1;
						m = m+1;
					}
				}
				pl21.setText(m+"/"+d+"/"+y);
				pl23.setText(""+ myPredictor.predictAverageDailyTemp(m, d, y));
				if(rdc.isSelected())
				{
					double tempt = myPredictor.predictAverageDailyTemp(m,d, y).getAverageFarenheit();
					tempt =(tempt -32)*(5.0/9.0);
					BigDecimal b = new BigDecimal(tempt);
					tempt = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					pl23.setText(""+tempt);
				}
				if(myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()>75)
				{
			
					pl22.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_sun.jpg")));
				}
				else if (myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()< 50)
			 
				{
					pl22.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_snow.jpg")));
				}
				else
				{
				
					pl22.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_rsz_cloudy.jpg")));
				}
				pl24.setText(myPredictor.predictAverageDailyWind(m, d, y).getSpeed()+" MPH");
				dir = myPredictor.predictAverageDailyWind(m, d, y).getDirection();
				if((dir >0) && (dir <90))
				{
					pl25.setText("EAST");
				}
				if((dir >=90) && (dir <180))
				{
					pl25.setText("NORTH");
				}
				if((dir >=180) && (dir <270))
				{
					pl25.setText("WEST");
				}
				if((dir >=270) && (dir <360))
				{
					pl25.setText("SOUTH");
				}
				
				d = d+1;
				if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
					if(d>31)
					{
						d=1;
						m=m+1;
					}
				}
				else if((m==4)||(m==6)||(m==9)||(m==11))
				{
					if(d>30)
					{
						d =1;
						m = m +1;
					}
					
				}
				else 
				{
					if(d>28)
					{
						d =1;
						m = m+1;
					}
				}
				pl31.setText(m+"/"+d+"/"+y);
				pl33.setText(""+ myPredictor.predictAverageDailyTemp(m, d, y));
				if(rdc.isSelected())
				{
					double tempt = myPredictor.predictAverageDailyTemp(m,d, y).getAverageFarenheit();
					tempt =(tempt -32)*(5.0/9.0);
					BigDecimal b = new BigDecimal(tempt);
					tempt = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					pl33.setText(""+tempt);
				}
				if(myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()>75)
				{
			
					pl32.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_sun.jpg")));
				}
				else if (myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()< 50)
			 
				{
					pl32.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_snow.jpg")));
				}
				else
				{
				
					pl32.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_rsz_cloudy.jpg")));
				}
				pl34.setText(myPredictor.predictAverageDailyWind(m, d, y).getSpeed()+" MPH");
				dir = myPredictor.predictAverageDailyWind(m, d, y).getDirection();
				if((dir >0) && (dir <90))
				{
					pl35.setText("EAST");
				}
				if((dir >=90) && (dir <180))
				{
					pl35.setText("NORTH");
				}
				if((dir >=180) && (dir <270))
				{
					pl35.setText("WEST");
				}
				if((dir >=270) && (dir <360))
				{
					pl35.setText("SOUTH");
				}
				
				d = d+1;
				if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
					if(d>31)
					{
						d=1;
						m=m+1;
					}
				}
				else if((m==4)||(m==6)||(m==9)||(m==11))
				{
					if(d>30)
					{
						d =1;
						m = m +1;
					}
					
				}
				else 
				{
					if(d>28)
					{
						d =1;
						m = m+1;
					}
				}
				pl41.setText(m+"/"+d+"/"+y);
				pl43.setText(myPredictor.predictAverageDailyTemp(m, d, y)+"");
				if(rdc.isSelected())
				{
					double tempt = myPredictor.predictAverageDailyTemp(m,d, y).getAverageFarenheit();
					tempt =(tempt -32)*(5.0/9.0);
					BigDecimal b = new BigDecimal(tempt);
					tempt = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					pl43.setText(""+tempt);
				}
				if(myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()>75)
				{
			
					pl42.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_sun.jpg")));
				}
				else if (myPredictor.predictAverageDailyTemp(m,d, 2015).getAverageFarenheit()< 50)
			 
				{
					pl42.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_1rsz_snow.jpg")));
				}
				else
				{
				
					pl42.setIcon(new ImageIcon(layout.class.getResource("/weatherpkg/rsz_rsz_cloudy.jpg")));
				}
				pl44.setText(myPredictor.predictAverageDailyWind(m, d, y).getSpeed()+" MPH");
				dir = myPredictor.predictAverageDailyWind(m, d, y).getDirection();
				if((dir >0) && (dir <90))
				{
					pl45.setText("EAST");
				}
				if((dir >=90) && (dir <180))
				{
					pl45.setText("NORTH");
				}
				if((dir >=180) && (dir <270))
				{
					pl45.setText("WEST");
				}
				if((dir >=270) && (dir <360))
				{
					pl45.setText("SOUTH");
				}
				
			}
			
		});
		add(btnNewButton);
		
	
		
		
		

		
		
		
	}
}



