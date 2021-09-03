package mapa_bits;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mapa_Pantalla extends JFrame{
	Panel_Imagen panel=new Panel_Imagen(this);
	public Mapa_Pantalla() {
		setVisible(true);
		setSize(786,239);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Mapa de BitMap");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		componentes();
	}
	
	private void componentes() {
		setLayout(null);
		panel.setBounds(0, 0, this.getWidth(),this.getHeight());
		panel.setBackground(Color.BLACK);
		add(panel);
	}
}