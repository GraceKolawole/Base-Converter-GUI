package viewOGK;

import javax.swing.*;

public class Tab3PanelOGK extends JPanel{
    public Tab3PanelOGK() {
        this.setLayout(null);

        JLabel tab3OGK = new JLabel("BASE 8 to Base 10 Conversions");
        tab3OGK.setBounds(0,0,300,40);
        tab3OGK.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(tab3OGK);

        JLabel base8labelOGK = new JLabel("Base 8: ");
        base8labelOGK.setBounds(5, 40, 50, 30);
        this.add(base8labelOGK);

        JTextField inputTextFieldOGK = new JTextField();
        inputTextFieldOGK.setBounds(60, 40, 100, 30);
        this.add(inputTextFieldOGK);

        JButton convertOGK = new JButton("convert");
        convertOGK.setBounds(160,40,80,30);
        this.add(convertOGK);

        JLabel base10labelOGK = new JLabel("Base 10: ");
        base10labelOGK.setBounds(5, 100, 100, 30);
        this.add(base10labelOGK);

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
            outputTextFieldOGK.setText(String.valueOf(baseConverterOGK(inputTextFieldOGK.getText().trim())));
        });
    }
    private Integer baseConverterOGK(String s) {
        try {
            // return the converted base
            return Integer.parseInt(s, 8);
        } catch(NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
