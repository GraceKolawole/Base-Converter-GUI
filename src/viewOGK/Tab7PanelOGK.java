package viewOGK;

import javax.swing.*;
import java.awt.*;

public class Tab7PanelOGK extends JPanel{
    public Tab7PanelOGK(){
        this.setLayout(null);

        JLabel tab1OGK = new JLabel("Custom Conversions");
        tab1OGK.setBounds(0,0,300,40);
        tab1OGK.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(tab1OGK);

        JLabel numberInputlabelOGK = new JLabel("From Base:");
        numberInputlabelOGK.setBounds(5, 40, 70, 30);
        this.add(numberInputlabelOGK);

        JTextField fromBaseTextFieldOGK = new JTextField();
        fromBaseTextFieldOGK.setBounds(90, 40, 100, 30);
        this.add(fromBaseTextFieldOGK);

        JLabel toBaselabelOGK = new JLabel("To Base:");
        toBaselabelOGK.setBounds(5, 70, 100, 30);
        this.add(toBaselabelOGK);

        JTextField toBaseTextFieldOGK = new JTextField();
        toBaseTextFieldOGK.setBounds(90, 70, 100, 30);
        this.add(toBaseTextFieldOGK);

        JLabel numberlabelOGK = new JLabel("Numbers:");
        numberlabelOGK.setBounds(5, 100, 100, 30);
        this.add(numberlabelOGK);

        JTextField numberinputTextFieldOGK = new JTextField();
        numberinputTextFieldOGK.setBounds(90,100,100,30);
        this.add(numberinputTextFieldOGK);

        JButton convertOGK = new JButton("convert");
        convertOGK.setBounds(195,100,80,30);
        convertOGK.setBackground(Color.decode("#f0d4c3"));
        convertOGK.setForeground(Color.decode("#f0d4c3"));
        this.add(convertOGK);
        convertOGK.setOpaque(true);

        JLabel outputLabelOGK = new JLabel("Output: ");
        outputLabelOGK.setBounds(5, 150, 100, 30);
        this.add(outputLabelOGK);

        JTextField outputTextFieldOGK = new JTextField();
        outputTextFieldOGK.setBounds(90, 150, 100, 30);
        outputTextFieldOGK.setEditable(false);
        this.add(outputTextFieldOGK);

        convertOGK.addActionListener(e -> {
            if(numberinputTextFieldOGK.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Input is empty", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(fromBaseTextFieldOGK.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Input is empty", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(toBaseTextFieldOGK.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Input is empty", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            outputTextFieldOGK.setText(baseConverterOGK(numberinputTextFieldOGK.getText().trim(), fromBaseTextFieldOGK.getText().trim(), toBaseTextFieldOGK.getText().trim()));
        });
    }
    private String baseConverterOGK(String OGK, String fromBaseOGK, String toBaseOGK) {
        try {
            // return the converted base
            return Integer.toString(Integer.parseInt(OGK, Integer.parseInt(fromBaseOGK)), Integer.parseInt(toBaseOGK));
        } catch(NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
