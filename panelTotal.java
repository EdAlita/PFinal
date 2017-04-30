package PFinal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JPanel;

public class panelTotal extends JPanel{
	
	private Label lTotal; 
	
	public panelTotal (){
		super();
		this.setPreferredSize(new Dimension(200,100));
		this.setBackground(new Color(205,225,254));
		this.setFont(new Font("Default",Font.BOLD,18));
		
		this.lTotal= new Label("Credito Total:");
		this.lTotal.setPreferredSize(new Dimension(400,50));
		this.add(this.lTotal);
		
	}
	
}
