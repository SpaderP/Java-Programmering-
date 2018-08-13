//filnamn Direkt3.java
/* Längst upp måste vi börja med att importera två paket som innehåller massa grafiska klasser vi kan använda oss av, exempelvis färger. */
import java.awt.*;
import javax.swing.*;
/*När vi kör vår applet är det här den börjar. Här Anroppar vi JApplet som gör det möjligt att köra från webbläsaren. Efter class står filens namn*/
public class Direkt3 extends JApplet {
public void init() {
/*Här under deklarerar vi vår variabel till ett litet L som ser ut som en etta:) och CENTER är vart texten ska vara placerad.*/
JLabel l = new JLabel("Patrick Pereira", JLabel.CENTER);add(l);
l.setOpaque(true);//OM man vill ha en ogenskinlig bakgrund skriver man true=sant
l.setBackground(Color.black);// Här bestämmer man vilken bakgrundsfärg man vill ha.
l.setForeground(new Color(255,175,175));/* Här bestämmer man vilken färg man vill ha på testen. Vill man ha egen färg kan man hitta på tre siffror mellan 0-255*/
l.setFont(new Font("Serif", Font.ITALIC, 34));/*här bestämmer man vilken typ av text man vill ha. det skriver man inom parantes. Font bestämmer man om man ska ha
kursiv eller fet och sista siffran är storleken */
}
}
// och allt om igen två gåmger till med lite ändringar i typsnitt storlek och färg.
