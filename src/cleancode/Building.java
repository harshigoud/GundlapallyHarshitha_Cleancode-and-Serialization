package cleancode;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
class Construction extends JFrame implements ActionListener {
	JLabel Materialcost,Areaofhouse,cost,k;
	JTextField MaterialInput,AreaInput,Costoutput;
	JButton Constructioncost;
	JLabel StandardMaterial,AboveStandardMaterial,HighStandardMaterial,Automated;
	
Construction(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	setSize(450,450);
	
	k=new JLabel("Choose material cost which you want to use for construction from below");
	add(k);
	k.setBounds(5, 20, 450, 20);
	StandardMaterial =new JLabel("  1.StandardMaterial cost:1200");
	add(StandardMaterial);
	StandardMaterial.setBounds(20, 50, 450, 20);
	AboveStandardMaterial=new JLabel(" 2.AboveStandardMaterialcost:1500");
	add(AboveStandardMaterial);
	AboveStandardMaterial.setBounds(20, 80, 450, 20);
	HighStandardMaterial=new JLabel(" 3.HighStandardMaterialcost:1800");
	add(HighStandardMaterial);
	HighStandardMaterial.setBounds(20, 110, 450, 20);
	Automated=new JLabel("4.HighStandardMaterialcost and fully automated home:2500");
	add(Automated);
	Automated.setBounds(20, 140, 450, 20);
	
	Materialcost =new JLabel("Material cost:");
	add(Materialcost);
	Materialcost.setBounds(5, 170, 100, 20);
	MaterialInput=new JTextField(20);
	add(MaterialInput);
	MaterialInput.setBounds(100, 170, 150, 20);
	
	Areaofhouse =new JLabel("Area of house:");
	add(Areaofhouse);
	Areaofhouse.setBounds(5, 200, 100, 20);
	AreaInput=new JTextField(20);
	add(AreaInput);
	AreaInput.setBounds(100, 200, 150, 20);
	

	
	Constructioncost = new JButton("Calculate");
	add(Constructioncost);
	Constructioncost.setBounds(20, 240, 100, 20);
	
	cost=new JLabel("cost of house:");
	add(cost);
	cost.setBounds(5, 280, 100, 20);
	Costoutput=new JTextField(10);
	add(Costoutput);
	Costoutput.setBounds(100, 280, 150, 20);
	Costoutput.setEditable(false);
	Constructioncost.addActionListener(this);
	setVisible(true);

}
public void actionPerformed(ActionEvent ae) {

	try {
		float p = Float.parseFloat(MaterialInput.getText());
		float q = Float.parseFloat(AreaInput.getText());
		float a=p*q;
		Costoutput.setText(String.valueOf(a));
	}catch(NumberFormatException ex) {
		JOptionPane.showMessageDialog(this,ex.getMessage());
	}
	
	
}
}
public class Building{
	public static void main(String args[]) {
		
		Construction   j =new Construction();
	}
}

