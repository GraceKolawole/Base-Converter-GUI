package viewOGK;

import javax.swing.*;

public class Tap4PanelOGK extends JPanel{
    public Tap4PanelOGK(){
        this.setLayout(null);

        JLabel tab4OGK = new JLabel("BASE 10 to Base 8 Conversions");
        tab4OGK.setBounds(0,0,300,40);
        tab4OGK.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(tab4OGK);

        JLabel base10labelOGK = new JLabel("Base 10: ");
        base10labelOGK.setBounds(5, 40, 100, 30);
        this.add(base10labelOGK);

        JTextField inputTextFieldOGK = new JTextField();
        inputTextFieldOGK.setBounds(60, 40, 100, 30);
        this.add(inputTextFieldOGK);

        JButton convertOGK = new JButton("convert");
        convertOGK.setBounds(160,40,80,30);
        this.add(convertOGK);

        JLabel base8labelOGK = new JLabel("Base 8: ");
        base8labelOGK.setBounds(5, 100, 50, 30);
        this.add(base8labelOGK);

        JTextField outputTextFieldOGK = new JTextField();
        outputTextFieldOGK.setBounds(60, 100, 100, 30);
        outputTextFieldOGK.setEditable(false);
        this.add(outputTextFieldOGK);

        convertOGK.addActionListener(e -> {
            if(inputTextFieldOGK.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Input is empty", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            outputTextFieldOGK.setText(baseConverterOGK(inputTextFieldOGK.getText().trim()));
        });

    }
    private String baseConverterOGK(String i) {
        try {
            // return the converted base
            return Integer.toString(Integer.parseInt(i), 8);
        } catch(NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
