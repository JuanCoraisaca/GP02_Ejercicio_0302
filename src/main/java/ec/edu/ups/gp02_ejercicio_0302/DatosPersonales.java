/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.gp02_ejercicio_0302;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class DatosPersonales extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    
    
    public DatosPersonales(String title) throws HeadlessException {
        super(title);
        this.setSize(500,300);
        this.setLocation(80,10);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(10,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanelList.get(0).setLayout(new BoxLayout(this.jPanelList.get(0), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanelList.get(1).setLayout(new BoxLayout(this.jPanelList.get(1), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanelList.get(2).setLayout(new BoxLayout(this.jPanelList.get(2), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanelList.get(3).setLayout(new BoxLayout(this.jPanelList.get(3), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanelList.get(4).setLayout(new BoxLayout(this.jPanelList.get(4), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanelList.get(5).setLayout(new BoxLayout(this.jPanelList.get(5), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanelList.get(6).setLayout(new BoxLayout(this.jPanelList.get(6), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanelList.get(7).setLayout(new BoxLayout(this.jPanelList.get(7), BoxLayout.X_AXIS));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanelList.get(8).setLayout(new BoxLayout(this.jPanelList.get(8), BoxLayout.X_AXIS));
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("APELLIDOS: "));
        this.jLabelList.add(new JLabel("Coraisaca Lojano"));
        this.jLabelList.add(new JLabel("NOMBRES : "));
        this.jLabelList.add(new JLabel("Juan Carlos"));
        this.jLabelList.add(new JLabel("NACIONALIDAD: "));
        this.jLabelList.add(new JLabel("Ecuatoriana"));
        this.jLabelList.add(new JLabel("GENERO: "));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("CORREO ELECTRONICO PERSONAL: "));
        this.jLabelList.add(new JLabel("juancoraisaca11@gmail.com"));
        this.jLabelList.add(new JLabel("Fecha Nacimiento: "));
        this.jLabelList.add(new JLabel("11/10/1999"));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("(07)4060380"));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("0958701280"));
        this.jLabelList.add(new JLabel("WhatsApp: "));

        
        
        
        
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(1).add(this.jLabelList.get(3));
        this.jPanelList.get(2).add(this.jLabelList.get(4));
        this.jPanelList.get(2).add(this.jLabelList.get(5));
        this.jPanelList.get(3).add(this.jLabelList.get(6));
        this.jPanelList.get(3).add(this.jLabelList.get(7));
        this.jPanelList.get(4).add(this.jLabelList.get(8));
        this.jPanelList.get(4).add(this.jLabelList.get(9));
        this.jPanelList.get(5).add(this.jLabelList.get(10));
        this.jPanelList.get(5).add(this.jLabelList.get(11));
        this.jPanelList.get(6).add(this.jLabelList.get(12));
        this.jPanelList.get(6).add(this.jLabelList.get(13));
        this.jPanelList.get(7).add(this.jLabelList.get(14));
        this.jPanelList.get(7).add(this.jLabelList.get(15));
        this.jPanelList.get(8).add(this.jLabelList.get(16));
    }
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(8).add(this.jTextFieldList.get(0));
    }
    
    
}
