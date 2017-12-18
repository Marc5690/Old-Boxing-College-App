import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.*;
//import java.util.Timer;
//import javax.swing.Timer.*;

import javax.swing.event.*;

public class Boxers extends JFrame implements ChangeListener,ActionListener,Runnable{
	
	private static final long serialVersionUID = 0;
	JMenuBar m=new JMenuBar();
	int Selected=0;
	
	ImageIcon a=new ImageIcon("src/Joe-Frazier.jpg");
	ImageIcon b=new ImageIcon("src/Frank-Bruno.jpg");
	ImageIcon c=new ImageIcon("src/mike-tyson.jpg");
	ImageIcon d=new ImageIcon("src/Lennox-Lewis.jpg");
	ImageIcon e=new ImageIcon("src/George-Foreman.jpg");
	ImageIcon f=new ImageIcon("src/Leon-Spinks.jpg");
	ImageIcon g=new ImageIcon("src/Muhammad_Ali.jpg");
	ImageIcon h=new ImageIcon("src/Ricky-Hatton.jpg");
	ImageIcon i=new ImageIcon("src/Rocky-Graziano.jpg");
	ImageIcon j=new ImageIcon("src/sugar.jpg");
	Icon[] pics = {a,b,c,d,e,f,g,h,i,j};
	private JLabel ImageLabel=new JLabel(pics[Selected]);
	
	String SJF = ("Smokin' Joe Frazier"); 
	String FB = ("Frank Bruno"); 
	String MT = ("Mike Tyson"); 
	String LL = ("Lennox Lewis"); 
	String GF = ("George Foreman"); 
	String LS = ("Leon Spinks"); 
	String MA = ("Muhammad Ali"); 
	String RH = ("Ricky Hatton"); 
	String RG = ("Rocky Graziano"); 
	String SRR = ("Sugar-Ray Robinson"); 
	String[]Box = {SJF,FB,MT,LL,GF,LS,MA,RH,RG,SRR};
	
	String BioSJF = new String ("Frazier was a popular champion, ranked among the best ever heavy weights; reprising himself in cameo roles in several Hollywood films, and professionally is most famous for his trilogy of fights with Muhammad Ali, with him winning one, and Ali two.Frazier had a bullying fighting style, depending on bobbing, weaving and power punching. He is perhaps most famous for his vicious left hooks. Compared to Ali's style, he was close enough to the ideal bruiser that some in the press and media characterized the bouts as the answer to the classic question: What happens when a boxer meets with a brawler?");
	String BioFB = new String ("Bruno became a professional boxer in 1980, quickly racking up a streak of twenty-one consecutive wins by knockout. This streak caught the attention of international boxing magazines, such as The Ring, KO Magazine, Boxing Illustrated, Ring En Español. In March 1984, however, future World Heavyweight Champion, American James 'Bonecrusher' Smith, then a boxing journeyman, halted that streak when he defeated Bruno by knockout in the tenth and final round of their bout, with Bruno leading on all three judges' cards.");
	String BioMT = new String ("Michael Gerard Tyson (born June 30, 1966) is a retired American boxer. Tyson was the undisputed heavyweight champion and holds the record as the youngest boxer to win the WBC, WBA and IBF world heavyweight titles. He won the WBC title when he was 20 years, 4 months and 22 days old, after defeating Trevor Berbick by a TKO in the second round. Throughout his career, Tyson became well-known for his ferocious and intimidating boxing style as well as his controversial behavior both inside and outside the ring.He was the first heavyweight boxer to hold the WBA, WBC and IBF titles simultaneously. Tyson is considered to have been one of the greatest heavyweight boxers of all time.");
	String BioLL = new String ("Lewis was born on September 2, 1965, in West Ham, London, England to Jamaican-born parents. At birth he weighed 10 pounds 10 ounces (4.8 kg), and was given the name Lennox by the doctor, who said he looked like a Lennox. Lewis moved to Kitchener, Ontario, Canada in 1977 at the age of 12. He attended Cameron Heights Collegiate Institute for high school, where he excelled in Canadian football, soccer and basketball.At the age of 18, Lewis represented Canada as a super heavyweight at the 1984 Summer Olympics in Los Angeles. He advanced to the quarter-finals, where he lost a decision to American Tyrell Biggs, the eventual gold medalist.");
	String BioGF = new String ("George Edward Foreman (born January 10, 1949) is an American two-time former World Heavyweight Boxing Champion, Olympic gold medalist, and successful entrepreneur.His most notable fights in his early career were his knockout against Joe Frazier in 1973 and his loss to Muhammad Ali in The Rumble in the Jungle in 1974. He later became the oldest man ever to become heavyweight boxing champion of the world when, at age 45, he knocked out Michael Moorer, age 26, to reclaim the title he held 20 years earlier. He has been named one of the 25 greatest fighters of all time by Ring magazine. Nicknamed Big George he is now a successful businessman and an ordained Christian minister who has his own church.");
	String BioLS = new String ("Leon Spinks is a former American boxer. He had an overall record of 26 wins, 17 losses and 3 draws as a professional, with 14 knockout wins. While still an amateur, he also became a member of the United States Marine Corps. Spinks went from being Heavyweight Champion Of The World (when he defeated Muhammad Ali by a 15-round split decision, on February 15, 1978) to being homeless in little more than a decade.He won the gold medal in the light heavyweight division during the 1976 Summer Olympics in Montreal, alongside brother Michael Spinks, who also won a gold medal in those games. Two years earlier, at the inaugural 1974 World Amateur Boxing Championships in Havana, Cuba, he captured the gold medal.");
	String BioMA = new String ("Muhammad Ali is a former American boxer and three-time World Heavyweight Champion, who is widely considered one of the greatest heavyweight championship boxers of all time.Nicknamed The Greatest, Ali was involved in several historic boxing matches. Notable among these are three with rival Joe Frazier and one with George Foreman, whom he beat by knockout to win the world heavyweight title for the second time. He was also known for his pre-match hype, where he would trash talk opponents on television and in person some time before the match, often with rhymes. These personality quips and idioms, along with an unorthodox fighting technique, made him a cultural icon.");
	String BioRH = new String ("Richard John Hatton MBE, more commonly known as Ricky 'the Hitman' Hatton, (born 6 October 1978, in Stockport, Greater Manchester, England), is a British professional boxer. He is a two-time IBF and IBO light welterweight champion, having relinquished the IBF belt, only to move down a weight class and beat Juan Urango.He was the WBA Welterweight Champion, but relinquished this title on 31 August 2006. Hatton is also the former WBU, WBA Light Welterweight Champion and WBC, WBA, WBO Inter-Continental Light Welterweight Champion, and former Ring magazine Junior Welterweight Champion.");
	String BioRG = new String ("Rocky Graziano, born Thomas Rocco Barbella in New York City, was an outstanding Italian-American boxer. Graziano was considered one of the greatest knockout artists in boxing history, often displaying the capacity to take his opponent out with a single punch. He was ranked 23rd on Ring Magazine's list of the greatest punchers of all time.He was the son of a boxer, known as 'Fighting Nick Bob', and was born in Brooklyn. He later moved to Little Italy in New York's Lower East Side. He grew up as a street fighter and learned to look after himself before he could read or write. He spent years in reform school, jail, and Catholic protectories.");
	String BioSRR =  new String("Sugar Ray Robinson Biography");
	String[] Bio = {BioSJF,BioFB,BioMT,BioLL,BioGF,BioLS,BioMA,BioRH,BioRG,BioSRR};
	JTextArea tf=new JTextArea(Bio[Selected]); 
	
	private JTabbedPane tp=new JTabbedPane();
	public JSlider slider=new JSlider();
	private JPanel thepan=new JPanel();
	private JPanel Cbox=new JPanel();
	private JPanel ImagePanel=new JPanel();
	private JPanel BioPanel=new JPanel();
	
	private JCheckBox CheckBox=new JCheckBox("Show Slider",true);
	private JCheckBox CheckBox2=new JCheckBox("SlideShow",false);
	JComboBox cb=new JComboBox(Box);
	
	public Boxers(){
		setTitle("Legendary Boxers");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.white);
		getContentPane().setSize(1000,1000);
		getContentPane().add(thepan);
		getContentPane().add(slider,BorderLayout.EAST);
		getContentPane().add(CheckBox);
		getContentPane().add(CheckBox2);
		getContentPane().add(tp);
		
		slider.setValue(0);
		slider.addChangeListener(this);
		slider.setOrientation(JSlider.VERTICAL);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(9);
		slider.setSnapToTicks(true);		
		
	    ImagePanel.add(ImageLabel);
	    
		Cbox.add(cb);
		Cbox.add(CheckBox);
		Cbox.add(CheckBox2);
		
		tp.addTab("Photo", ImagePanel);
		tp.addTab("Biography", BioPanel);
		tp.addTab("Index and Options", Cbox);
		
		tf.setLineWrap(true); 
	    tf.setWrapStyleWord(true);
	    tf.setEditable(false);
	    tf.setVisible(true);
	    tf.setSize(400,400);
	    
	    CheckBox.setVisible(true);
	    CheckBox.addActionListener(this);
	    CheckBox2.setVisible(true);
	    CheckBox2.addActionListener(this);
	    cb.addActionListener(this);
	    cb.addActionListener(this);
	    
	    JMenu men=new JMenu("Help");
		JMenuItem AL1 = men.add("how to use");
		JMenuItem AL2 = men.add("Exit");
		m.add(men);
		this.setJMenuBar(m);
		AL1.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e){
		    		JOptionPane.showMessageDialog(null,"This is an application that shows you a number of Boxing Legends images and their Biographys. You can change the selected boxer via the drop-down menu in the options tab or use the slider to the right of the menu.");
		    	}
		    });
		AL2.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e){
		    		System.exit(0);
		    	}
		    });
		
		    setSize(250,250);
			setVisible(true);
	}

	public void change(){
		JTextArea tf=new JTextArea(Bio[Selected]); 
		ImagePanel.removeAll();
		ImagePanel.add(ImageLabel=new JLabel(pics[Selected]));
		BioPanel.removeAll();
		BioPanel.add(tf); 
		tf.setLineWrap(true); 
	    tf.setWrapStyleWord(true);
	    tf.setEditable(false);
	    tf.setVisible(true);
	    tf.setSize(400,400);
	    ImagePanel.repaint();
	    validateTree();	    
	}
		
	public void run(){
			for(int y = 0;y==y+1;y++)
				slider.setValue(y);
	}
	
	public void actionPerformed(ActionEvent e){
	
	     if(e.getSource()==CheckBox) {slider.setVisible(CheckBox.isSelected());}
	     
	     else if(e.getSource()==cb)
	     {Selected=cb.getSelectedIndex(); change();}
	     
	     else if(e.getSource()==CheckBox2)
	     {run();}
	     }
	     
    public void stateChanged(ChangeEvent e) {
		 if(e.getSource()==slider){Selected=slider.getValue();change();}
		 }
   
	public static void main (String[] args){
		JOptionPane.showMessageDialog(null,"SportsStar Application Version 1.0 by Marc Laffan");	
		new Boxers();
	}
}
