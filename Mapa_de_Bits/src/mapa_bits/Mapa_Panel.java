package mapa_bits;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Mapa_Panel extends JPanel{
	public BufferedImage img;
	Color ColorMapa=new Color(0,0,0);
	public int[][][] colores;
	public Mapa_Panel() {
	}
	public void colocarImagen(BufferedImage img) {
		this.img=img;
		colores=new int[img.getWidth()][img.getHeight()][3];
	}
	
	public void guardarColores(){
		Color nuevo;
		for(int i=0;i<img.getWidth();i++) {
			for(int j=0;j<img.getHeight();j++) {
				nuevo=new Color(img.getRGB(i, j));
				colores[i][j][0]=nuevo.getRed();
				colores[i][j][1]=nuevo.getGreen();
				colores[i][j][2]=nuevo.getBlue();
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<img.getWidth();i++) {
			for(int j=0;j<img.getHeight();j++) {
				g.setColor(new Color(img.getRGB(i, j)));
				g.fillRect(i, j, i, j);	
			}
		}
	}
}
