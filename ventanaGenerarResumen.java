package PFinal;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class ventanaGenerarResumen extends JFrame {

	public ventanaGenerarResumen(panelDatos pd) {
		super("Resumen de Tarjeta");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		panelGenerarResumen pgr = new panelGenerarResumen(pd,this);
		this.add(pgr);
		
		JScrollPane scroller = new JScrollPane(pgr);
		scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroller.setBounds(50, 30, 300, 50);
        scroller.setPreferredSize(new Dimension(600,400));
        scroller.setVisible(true);
		this.getContentPane().add(scroller, BorderLayout.CENTER);
        
		this.setResizable(false);
		this.setLocation(800, 200);
			
		this.pack();
		this.setVisible(true);
	}

}
