package viewOGK;
import javax.swing.*;
import java.awt.*;

public class BaseConverterGUIOGK extends JFrame {
    public BaseConverterGUIOGK(){

        this.setTitle("Base Converter GUI");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabelOGK = new JLabel("WELCOME GUEST");
        welcomeLabelOGK.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabelOGK.setBounds(0,10, 400,25);

        this.add(welcomeLabelOGK);

        JTabbedPane tabbedPaneOGK = new JTabbedPane();
        tabbedPaneOGK.setBounds(50,40,300,300);
        tabbedPaneOGK.setBackground(Color.BLUE);
        tabbedPaneOGK.addTab("Tab 1", new Tab1PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 2", new Tab2PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 3", new Tab3PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 4", new Tap4PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 5", new Tab5PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 6", new Tab6PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));
        tabbedPaneOGK.addTab("Tab 7", new Tab7PanelOGK());
        tabbedPaneOGK.setBackgroundAt(0, Color.decode("#f0d4c3"));

        this.getContentPane().setBackground(Color.decode("#966050"));
        this.add(tabbedPaneOGK);
        this.setVisible(true);
    }
}
