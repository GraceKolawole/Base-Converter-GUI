package viewOGK;

import javax.swing.*;

public class Tab5PanelOGK extends JPanel{
    public Tab5PanelOGK(){
            this.setLayout(null);

            JLabel tab2OGK = new JLabel("BASE 16 to Base 10 Conversions");
            tab2OGK.setBounds(0,0,300,40);
            tab2OGK.setHorizontalAlignment(SwingConstants.CENTER);
            this.add(tab2OGK);

            JLabel base10labelOGK = new JLabel("Base 16: ");
            base10labelOGK.setBounds(5, 40, 100, 30);
            this.add(base10labelOGK);

            JTextField inputTextFieldOGK = new JTextField();
            inputTextFieldOGK.setBounds(60, 40, 100, 30);
            this.add(inputTextFieldOGK);

            JButton convertOGK = new JButton("convert");
            convertOGK.setBounds(160,40,80,30);
            this.add(convertOGK);

            JLabel base2labelOGK = new JLabel("Base 10: ");
            base2labelOGK.setBounds(5, 100, 100, 30);
            this.add(base2labelOGK);

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
                return Integer.parseInt(s, 16);
            } catch(NumberFormatException | NullPointerException e) {
                return null;
            }
        }
}
