import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Store store = Store.getInstance();
    public static CDTable cdTable;
    public MainFrame(){
        init();
    }

    public void init(){
        setLayout(new FlowLayout());
        setTitle("CD Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(570, 700));
        setLocationRelativeTo(null);
        setResizable(true);
        cdTable = new CDTable();
        add(new ButtonPanel());
        add(cdTable);
        add(new SearchPanel(), BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
