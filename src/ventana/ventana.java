package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
class Ventana extends JFrame {
    private JPanel panel;
    private JButton boton;
    private JTextField cajaTexto;
    private JLabel saludo;

    public Ventana() {
        this.setSize(500, 500);//Tamaño de ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chan");//poner titulo ventana
        //setBounds(350,120,450,100);//posicion x, posicion y , tamaño , tamaño
        setLocationRelativeTo(null);//pantalla centro de pantalla
        setMinimumSize(new Dimension(350, 350));//Tamaño minimo}
        //this.getContentPane().setBackground(Color.YELLOW);//establever color de ventana
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPaneles();
        //colocarBotones();
        //  colocarEtiquetas();
        //colocarRadioBotonoes();
        colocarCajasDeTecto();
        // colocarAreaDeTexto();
        // colocarListasDesplegables();
        colocarBoton();
    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel();//vrear etiqueta
        etiqueta.setText("Rusia");//establecer textoen la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//establecer la alineacion horizontal del texto
        etiqueta.setForeground(Color.YELLOW);//color texto
        panel.add(etiqueta);//agregar etiqueta al panel
        panel.setLayout(null);//dasactivar diseño
        etiqueta.setOpaque(true);//pa pintar el fondo de  la etiqueta
        //etiqueta.setFont(null);//establecer fuente de letra del txt
        //etiqueta.setFont(new Font (), Font.BOLD, 15);
        etiqueta.setBackground(Color.BLACK);//color fondo etiqueta, pero hya que desactivar el diseño por defecto
        etiqueta.setBounds(250, 100, 40, 30);//posicion(etiqueta) en x , y , tamaño, tamaño

        //Etiqueta 3 - etiqueta tipo imagen
        /*
        JLabel etiqueta2 = new JLabel(new ImageIcon("3UPnpKbm_400x400.jpeg"));
        etiqueta2.setBounds(50,50,1200,600);
        panel.add(etiqueta2);
        */

    /*
        JLabel etiqueta2 = new JLabel();
       etiqueta2.setIcon(new ImageIcon("3UPnpKbm_400x400.jpeg"));
        etiqueta2.setBounds(50,50,1200,600);
        panel.add(etiqueta2);
    */
        //o
        ImageIcon image = new ImageIcon("3UPnpKbm_400x400.jpeg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(200, 100, 1200, 600);
        etiqueta2.setIcon(new ImageIcon(image.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//cambiar tamaño imagen
        panel.add(etiqueta2);

    }

    private void colocarPaneles() {
        panel = new JPanel();//crear panel
        panel.setLayout(null);//desactivar diseño
        this.getContentPane().add(panel);//se agrega panel a la ventana

    }
    /*
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//creacion panel
        this.getContentPane().add(panel);//Se agrega panel a la ventana
        //panel.setBackground(Color.RED);//color panel

    }

     */

    private void colocarBotones() {
        //boton 1 texto
        JButton boton1 = new JButton();
        boton1.setText("кликните сюда");//colocar text al boton
        boton1.setBounds(90, 200, 304, 36);
        boton1.setEnabled(true);//Establecer el encendido del boton
        boton1.setMnemonic('a');//establecer alt + letra (pa hacer click)
        boton1.setForeground(Color.RED);//color de la letra del botn
        boton1.setFont(new Font("verbena", Font.BOLD, 30));//Establecemenos la fuente del boton
        panel.add(boton1);
        //boton 3 imagen
        JButton boton2 = new JButton();
        boton2.setOpaque(true);
        boton2.setBounds(100, 300, 300, 300);
        ImageIcon a = new ImageIcon("alerta.jpg");
        boton2.setIcon(new ImageIcon(a.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.yellow);
        panel.add(boton2);
    }

    private void colocarRadioBotonoes() {
        JRadioButton radioBoton1 = new JRadioButton("opcion 1", true);//boton marcador
        radioBoton1.setBounds(50, 100, 100, 50);
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("opcion 2", false);//boton desmarcado
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("opcion 3", false);//boton desmarcado
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);

        radioBoton1.setEnabled(false);//hacer que un boton este disponible o no

        //pa que se marque solo 1

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);

    }

    private void colocarCajasDeTecto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("escribir aqui");
        System.out.println("Txt en la caja: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }

    private void colocarAreaDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("aca escribir");
        areaTexto.append("\n aca abajo ");//añadir mas txt al area
        areaTexto.setEditable(true);//se puede modificar el contenido que esyaba antes
        System.out.println("el texto es " + areaTexto.getText());
        panel.add(areaTexto);
    }

    private void colocarListasDesplegables() {
        String[] colores = {"rojo", "amarillo", "morado", "verde", "negro", "azul", "celeste"};
        JComboBox listaDesplegable = new JComboBox(colores);
        listaDesplegable.setBounds(20, 20, 100, 30);
        listaDesplegable.addItem("caballo");//agregar una item a la lista
        listaDesplegable.setSelectedItem("morado");//elegir que se va a mostrar primero
        panel.add(listaDesplegable);

    }

    private void colocarBoton() {
        boton = new JButton("Generar");
        boton.setBounds(150, 100, 150, 50);
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 40);
        panel.add(saludo);
        //agregar evento tipo actionLIstener
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("hola "+cajaTexto.getText());
            }

        };

        boton.addActionListener(oyenteDeAccion);
    }
}
