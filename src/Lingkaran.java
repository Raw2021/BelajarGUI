import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JPanel LingkaranPanel;
    private JTextField tfjarijari;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;
    private JTextField tfLuas;


    public Lingkaran() {
        hitungButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Membuat variabel
                double jarijari, luas;
                double phi = 3.14;

                // Mengambil input dari text field
                jarijari = Double.parseDouble( tfjarijari.getText() );

                // Hitung luas
                luas = phi * (jarijari * jarijari);

                //Hasil
                tfLuas.setText( String.valueOf( luas ) );


            }
        } );

        batalButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfjarijari.setText("");
                tfLuas.setText("");
                tfjarijari.requestFocus();

            }
        } );
        keluarButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit( 0 );
            }
        } );
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Lingkaran" );
        frame.setContentPane( new Lingkaran().LingkaranPanel );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }
}
