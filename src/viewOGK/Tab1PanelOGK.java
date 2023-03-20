package viewOGK;


import javax.swing.*;

public class Tab1PanelOGK extends JPanel {
    public Tab1PanelOGK(){
        this.setLayout(null);

        JLabel tab1OGK = new JLabel("BASE 2 to Base 10 Conversions");
        tab1OGK.setBounds(0,0,300,40);
        tab1OGK.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(tab1OGK);

        JLabel base2labelOGK = new JLabel("Base 2: ");
        base2labelOGK.setBounds(5, 40, 50, 30);
        this.add(base2labelOGK);

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

        JButton refreshButtonOGK = new JButton("refresh");
        refreshButtonOGK.setBounds(200,220,80,30);
        this.add(refreshButtonOGK);

        refreshButtonOGK.addActionListener(e -> {
            if(inputTextFieldOGK.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Input is empty", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        });

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
            return Integer.parseInt(s, 2);
        } catch(NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
//inputTextField.setOpaque(true);
// inputTextField.setBackground(Color.BLUE);