/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barramarcheck;

import javax.swing.*;
import java.awt.*;

public class Barramarcheck extends   JFrame{


    public Barramarcheck () {

        super ("barra de menus");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// CREANDO ITEMS

        JMenu mu1 = new JMenu ("Favoritos");
        JMenuItem m1 = new JMenuItem ("Metallica");
        JMenuItem m2 = new JMenuItem ("Iron Maiden");
        JMenuItem m3 = new JMenuItem ("Disturbed");
        JMenuItem m4 = new JMenuItem ("Black Eyed Peas");
        JMenuItem m5 = new JMenuItem ("Emienm");
        JMenuItem m6 = new JMenuItem ("Sean Paul");
        JMenuItem m7 = new JMenuItem ("Nirvana");
        JMenuItem m8 = new JMenuItem ("Peal Jam");
        JMenuItem m9 = new JMenuItem ("Foo Fithers");
        JMenuItem m10 = new JMenuItem ("Guns And Roses");
        JMenuItem m11 = new JMenuItem ("Queen");
        JMenuItem m12 = new JMenuItem ("Mana");
        JMenuItem m13 = new JMenuItem ("Simple Plan");
        JMenuItem m14 = new JMenuItem ("Green Day");
        JMenuItem m15 = new JMenuItem ("The Machine Again");
// http://www.adslzone.net/postp2050064.html

// CREANDO MENUS


    JMenu menumetal = new JMenu ("Metal");
	
     
        menumetal.add(mu1);
        mu1.add(m1);
	menumetal.addSeparator();
	menumetal.add(m2);
	menumetal.addSeparator();
	menumetal.add(m3);


	JMenu menurap = new JMenu ("Rap/Hip Hop");

	menurap.add(m4);
	menurap.addSeparator();
	menurap.add(m5);
	menurap.addSeparator();
	menurap.add(m6);
	

	JMenu menugrunge = new JMenu ("Grunge");

	menugrunge.add(m7);
	menugrunge.addSeparator();
	menugrunge.add(m8);
	menugrunge.addSeparator();
	menugrunge.add(m9);


	JMenu menurock = new JMenu ("rock");

	menurock.add(m10);
	menurock.addSeparator();
	menurock.add(m11);
	menurock.addSeparator();
	menurock.add(m12);

	JMenu menupunk = new JMenu ("Punk");

	menupunk.add(m13);
	menupunk.addSeparator();
	menupunk.add(m14);
	menupunk.addSeparator();
	menupunk.add(m15);


	JMenuBar mbar = new JMenuBar ();

	mbar.add(menumetal);
	mbar.add(menurap);
	mbar.add(menugrunge);
	mbar.add(menurock);
	mbar.add(menupunk);



	// Diseñador

	BorderLayout diseñador = new BorderLayout();
	setLayout(diseñador);
	add("North",mbar);
	setJMenuBar(mbar);
	pack();
	setVisible(true);




























    }





    public static void main(String[] args) {



		Barramarcheck mj = new Barramarcheck ();



    }
}
