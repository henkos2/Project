package project;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * The Window class represents the application window where two sorting algorithms are compared.
 */
public class Window extends JFrame implements ActionListener {
	
	private JLabel quantityLabel;
    private JTextField quantityField;
    private JButton sortButton;
    private JTextArea resultArea;
    
    /**
     * Constructs an instance of the Window class.
     */
    public Window() {     
        super("Sorting Algorithm Comparison");            
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        setLayout(new FlowLayout());    
        
        quantityLabel = new JLabel("Number of Elements:");
        add(quantityLabel);

        quantityField = new JTextField(10);
        add(quantityField);

        sortButton = new JButton("Sort");
        sortButton.addActionListener(this);
        add(sortButton);

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane);
        
        setVisible(true);
    }

    /**
     * Handles the sort button click event.
     *
     * @param e The action event.
     *   
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Sort")) {
            
        	int quantity = Integer.parseInt(quantityField.getText());

            Unsort unsort = new Unsort();
            Sortbub sortbub = new Sortbub();
            Sortselec sortselec = new Sortselec();
            Files files = new Files();

            LinkedList<Integer> unsorted = unsort.draw(quantity);

            long startTime = System.currentTimeMillis();
            LinkedList<Integer> bubled = sortbub.bubbleSort(unsorted);
            long endTime = System.currentTimeMillis();
            long bubleduration = endTime - startTime;

            startTime = System.currentTimeMillis();
            LinkedList<Integer> selected = sortselec.selectionSort(unsorted);
            endTime = System.currentTimeMillis();
            long selectedduration = endTime - startTime;

            files.writing(unsorted,bubled,selected);
            
            resultArea.setText("");
            resultArea.append("Bubble Sort Duration: " + bubleduration + " milliseconds\n");
            resultArea.append("Selection Sort Duration: " + selectedduration + " milliseconds\n");

            if (bubleduration < selectedduration) {
                resultArea.append("Bubble Sort was faster by " + (selectedduration - bubleduration) + " milliseconds.\n");
            } else if (selectedduration < bubleduration) {
                resultArea.append("Selection Sort was faster by " + (bubleduration - selectedduration) + " milliseconds.\n");
            } else {
                resultArea.append("Both sorting algorithms took the same amount of time.\n");
            }
            
            resultArea.append("Unsorted numbers: " + files.reader(0) + "\n");
            resultArea.append("Sorted numbers: " + files.reader(1) + "\n");
            
        }
    }
}
