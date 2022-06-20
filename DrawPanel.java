import java.awt.*;
import javax.swing.*;

 class DrawPanel extends JPanel{
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	//font wheel
	g.drawOval(100,200,90,90);
	g.drawOval(110,210,70,70);
	g.setColor(Color.black);
	g.fillOval(138,237,14,14);
	//smoke	
	g.drawOval(480,240,10,8);
	g.drawOval(487,233,10,11);
	g.drawOval(498,170,20,31);
	g.drawOval(570,120,20,31);
	//back wheel
	g.drawOval(300,200,90,90);
	g.drawOval(310,210,70,70);	
	g.fillOval(338,237,14,14);
	//bottom line middle
	g.drawLine(190,244,300,244);
	g.drawLine(194,234,296,234);
	//bottom line front
	g.drawLine(100,244,34,244);
	g.drawLine(96,234,40,234);
	//bottom line back
	g.drawLine(394,234,460,234);
	//vertical line font
	g.drawLine(34,244,50,185);
	g.drawLine(41,234,60,188);
	g.drawLine(96,234,120,188);
	//vertical line font
	g.drawLine(193,234,176,179);
	//vertical line back
	g.drawLine(396,234,380,189);
	//vertical line back
	g.drawLine(296,234,320,188);
	g.drawLine(340,167,346,157);

	//vertical line back;
	g.drawLine(440,168,460,234);
	//uper vertical line font
	g.drawLine(50,185,145,165);
	//uper vertical line back
	g.drawLine(345,155,440,168);
	//font mirror
	g.drawLine(145,165,190,110);
	g.drawLine(160,155,190,120);
	//font mirror-horizontal line
	g.drawLine(160,155,240,155);
	g.drawLine(190,120,240,120);
	g.drawLine(240,155,240,120);
	g.drawLine(268,155,268,120);
	g.drawLine(268,120,305,120);
	g.drawLine(268,155,320,155);
	g.drawLine(320,155,306,120);
	g.drawRect(210,160,27,7);
	g.drawRect(294,160,27,6);
	g.drawLine(390,250,410,250);
	g.drawLine(390,240,410,240);
	g.drawRect(410,238,35,15);
	g.drawLine(445,250,460,250);
	g.drawLine(445,240,460,240);
	g.drawLine(440,239,440,233);
	g.drawLine(415,239,415,233);
	g.drawLine(320,180,330,160);
	g.drawLine(85,230,95,210);
	g.drawLine(76,230,86,210);
	g.drawLine(56,230,66,210);
	//back mirror
	g.drawLine(300,110,345,155);
	//top horizontal line
	g.drawLine(190,110,300,110);
	//middle holizontal-line back
	g.drawLine(345,168,440,168);
	//midde holizantal-line font
	g.drawLine(58,189,139,189);
	g.drawLine(120,187,180,184);
	g.drawLine(320,189,380,189);
	//middle vertical line
	g.drawLine(240,234,   260,110);	
	
}

	public static void main(String[] args){
		DrawPanel panel = new DrawPanel();
		JPanel panel1=new JPanel();
		panel1.setSize(600,30);
		panel1.setBackground(Color.gray);
		
		

		JLabel file=new JLabel("File".toUpperCase());
		JLabel element=new JLabel("element".toUpperCase());

		// file.setHorizontalAlignment(JLabel.LEFT);
		

		file.setForeground(Color.white);
		


		element.setForeground(Color.white);
		JFrame application=new JFrame("sketcher".toUpperCase());
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1.add(file);
		panel1.add(element);
		application.add(panel1);
		application.add(panel);
		
		 
		application.setSize(600,600); 
		application.setVisible(true);

	}
}