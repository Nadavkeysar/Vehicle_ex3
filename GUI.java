/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

/**
 *
 * @author Administrator
 */
public class GUI extends JFrame{
   private JLabel titleLabel;
    private JList<Vehicle> vehicleList;
    private DefaultListModel<Vehicle> vehicleListModel;
    private JButton addButton;
    private JButton buyButton;
    private JButton testDriveButton;
    private JButton resetButton;
    private JButton flagChangeButton;
    private JButton exitButton;
   // private Vehicle vehicles;
    private List<Vehicle> vehicles;
    private String flag;
    
    public GUI(){
     List<Object> vehicles = new ArrayList<>();        
        setTitle("Vehicle Agency System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600, 400));
        
        initializeComponents();
        addComponentsToFrame();
        attachListeners();
        
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
}
    
     private void initializeComponents() {
        titleLabel = new JLabel("Vehicle Agency System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        
        
        vehicleListModel = new DefaultListModel<>();
        vehicleList = new JList<>(vehicleListModel);
        vehicleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        vehicleList.setFixedCellHeight(40);
        
        addButton = new JButton("Add Vehicle");
        buyButton = new JButton("Buy");
        testDriveButton = new JButton("Test Drive");
        resetButton = new JButton("Reset");
        flagChangeButton = new JButton("Change Flag");
        exitButton = new JButton("Exit");
    }
    
    private void addComponentsToFrame() {
        JPanel topPanel = new JPanel();
        topPanel.add(titleLabel);
        
        JScrollPane scrollPane = new JScrollPane(vehicleList);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(buyButton);
        buttonPanel.add(testDriveButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(flagChangeButton);
        buttonPanel.add(exitButton);
        
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
       
    private void attachListeners() {
    exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitButtonClicked();
            }
        });
    
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetButtonClicked();
            }
        });

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonClicked();
            }
        });
    
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                testDriveButtonClicked();
            }
        });
 
    
        flagChangeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                flagChangeButtonClicked();
            }
        });
        
           buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyButtonClicked();
            }
        });
    }
    
    public void buyButtonClicked(){
        JFrame frame = new JFrame("Buy Vehicle");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
        String buy =JOptionPane.showInputDialog(frame,"Enter the model you want to buy");   
        for(int i=0; i<vehicles.size(); i++){
            if(buy == vehicles.get(i).getModel())
                vehicles.get(i).setBuy(true);
            JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f,"Successfully purchase.","Alert",JOptionPane.INFORMATION_MESSAGE);     
                break;
        }
                 frame.setSize(400,400);  
                frame.setLayout(null);  
                frame.setVisible(true);  

    
    }
    
    public void flagChangeButtonClicked(){
    JFrame frame = new JFrame("Flag Change");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                DefaultListModel<String> l1 = new DefaultListModel<>();  
                l1.addElement("Israel");
                l1.addElement("USA");
                l1.addElement("Germany");
                l1.addElement("Italy");
                l1.addElement("Greece");
                l1.addElement("Soomalia");
                l1.addElement("Pirate Flag");
                JLabel label = new JLabel("Select a Flag");
                label.setSize(500,100); 
                JList<String> list = new JList<>(l1);  
                list.setBounds(150,150, 150,150); 
                //panel.add(list);
                frame.add(label);
                frame.add(list);
                 frame.setSize(400,400);  
                frame.setLayout(null);  
                frame.setVisible(true);  

                
        MouseListener mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
             String selectedItem = (String) list.getSelectedValue();
             flag = selectedItem;
             JFrame f = new JFrame();
             JOptionPane.showMessageDialog(f,"Successfully updated.","Alert",JOptionPane.INFORMATION_MESSAGE);     

            }
                }
                                };

                                        }

    public void testDrive(){//performTestDrive() {
    Vehicle selectedVehicle = getSelectedVehicle();
    String lifetime =JOptionPane.showInputDialog(frame,"Enter engine lifetime");       

    if (selectedVehicle != null) {
        String distanceStr = JOptionPane.showInputDialog("Enter the distance for the test drive (in kilometers):");

        try {
            double distance = Double.parseDouble(distanceStr);
    
    double fuelConsumed = selectedVehicle.calculateFuelConsumption(distance);

            String message = "Test drive completed:\n" +
                    "Vehicle: " + selectedVehicle.toString() + "\n" +
                    "Distance traveled: " + distance + " km\n" +
                    "Fuel consumed: " + fuelConsumed + " liters";

            displayMessage(message);
        } catch (NumberFormatException e) {
            displayMessage("Invalid distance value. Please enter a valid number.");
        }
    } else {
        displayMessage("No vehicle selected for test drive.");
    }
}

        private void addButtonClicked(){
            JFrame frame = new JFrame("Add Vehicle");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                try 
                {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                        DefaultListModel<String> l1 = new DefaultListModel<>();  
                l1.addElement("Jeep");
                l1.addElement("Frigate");
                l1.addElement("Spy Glider");
                l1.addElement("Toy Glider");
                l1.addElement("CruiseShip");
                l1.addElement("Bicycle");
                JLabel label = new JLabel("Select a vehicle you want to add");
                label.setSize(500,100); 
                JList<String> list = new JList<>(l1);  
                list.setBounds(150,150, 100,100); 
                //panel.add(list);
                frame.add(label);
                frame.add(list);
                 frame.setSize(400,400);  
                frame.setLayout(null);  
                frame.setVisible(true);  

                Scanner scanner = new Scanner(System.in);
                MouseListener mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
             String selectedItem = (String) list.getSelectedValue();
               switch (selectedItem) {
                        case "Jeep":
                            String model =JOptionPane.showInputDialog(frame,"Enter model");       
                            String fuel =JOptionPane.showInputDialog(frame,"Enter average fuel consumption");       
                            String speed =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            String lifetime =JOptionPane.showInputDialog(frame,"Enter engine lifetime");       
 try {
    vehicles.add(new Jeep(model, Double.parseDouble(fuel), Double.parseDouble(speed), Double.parseDouble(lifetime)));
} catch (NumberFormatException ex) {
    // Handle the error caused by parsing invalid input
    System.out.println("Invalid input format. Please enter numeric values for fuel, speed, and lifetime.");
} catch (Exception ex) {
    // Handle any other exceptions that may occur
    System.out.println("An error occurred while adding the vehicle: " + ex.getMessage());
}
//                           vehicles.add(new Jeep(model, Double.parseDouble(fuel), Double.parseDouble(speed), Double.parseDouble(lifetime)));
                            break;

                        case "Frigate":
                            String fmodel =JOptionPane.showInputDialog(frame,"Enter model");       
                            String passengers =JOptionPane.showInputDialog(frame,"Enter max passengers");       
                            String fspeed =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            String wind =JOptionPane.showInputDialog(frame,"Enter wind");       
                            vehicles.add(new Frigate(fmodel, Integer.parseInt(passengers), Double.parseDouble(fspeed), Boolean.parseBoolean(wind)));
                            break;

                        case "Spy Glider":
                            String distance =JOptionPane.showInputDialog(frame,"Enter distance");       
                            String speed1 =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            vehicles.add(new SpyGlider(Double.parseDouble(distance), Double.parseDouble(speed1)));
                            break;

                        case "Toy Glider":
                            String distance1 =JOptionPane.showInputDialog(frame,"Enter distance");       
                            String speed2 =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            double toyGliderMaxSpeed = scanner.nextDouble();
                            vehicles.add(new ToyGlider(Double.parseDouble(distance1), Double.parseDouble(speed2)));
                            break;

                        case "CruiseShip":
                            String model1 =JOptionPane.showInputDialog(frame,"Enter model");       
                            String speed3 =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            String passenger1 =JOptionPane.showInputDialog(frame,"Enter max passengers");       
                            String flag =JOptionPane.showInputDialog(frame,"Enter flag");       
                            vehicles.add(new CruiseShip(model1,Integer.parseInt(passenger1),Double.parseDouble(speed3),flag));
                            break;

                         case "Bicycle":
                            String model4 =JOptionPane.showInputDialog(frame,"Enter model");       
                            String speed4 =JOptionPane.showInputDialog(frame,"Enter max speed");       
                            String passenger4 =JOptionPane.showInputDialog(frame,"Enter max passengers");       
                            vehicles.add(new Bicycle(model4,Integer.parseInt(passenger4),Double.parseDouble(speed4),2,"paved"));
                            break;

                        default:
                            System.out.println("Invalid vehicle type.");
                            break;
                    }

             
        }  
           
    }
};
list.addMouseListener(mouseListener);

 }
                  

    
        private void exitButtonClicked(){
            System.exit(0);
        }
        
        private void resetButtonClicked() {
            vehicleListModel.clear();
             JFrame f=new JFrame();  
             JOptionPane.showMessageDialog(f,"Successfully reset.","Alert",JOptionPane.INFORMATION_MESSAGE);     
               

        }
        public static void main(String[] args) {
            GUI g = new GUI();
        }
}