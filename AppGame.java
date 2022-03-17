import java.awt.*;  
import java.util.*;  
import java.awt.event.*;

import javax.swing.BoxLayout;

public class AppGame {  

     AppGame() {  
        //  Frame code
        Frame f = new Frame("Number guessing game");
        f.setBackground(Color.decode("#f3f3f3"));
        f.setSize(1200,600);    
        f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));    
        f.setVisible(true);    
       
        // First panel code 
        Panel panelOne =new Panel();     
        panelOne.setBackground(Color.decode("#ffffff"));  
        panelOne.setLayout(new GridLayout(4,4));

        // Labels in grid 
        Label FirstP_one = new Label("1", Label.CENTER);
        panelOne.add(FirstP_one);          
        Label FirstP_two = new Label("3" , Label.CENTER);
        panelOne.add(FirstP_two);          
        Label FirstP_three = new Label("5" , Label.CENTER);
        panelOne.add(FirstP_three);          
        Label FirstP_four = new Label("7" , Label.CENTER);
        panelOne.add(FirstP_four);          
        Label FirstP_five = new Label("9" , Label.CENTER);
        panelOne.add(FirstP_five);          
        Label FirstP_six = new Label("11" , Label.CENTER);
        panelOne.add(FirstP_six);          
        Label FirstP_seven = new Label("13" , Label.CENTER);
        panelOne.add(FirstP_seven);          
        Label FirstP_eight = new Label("15" , Label.CENTER);
        panelOne.add(FirstP_eight);          
        Label FirstP_nine = new Label("17" , Label.CENTER);
        panelOne.add(FirstP_nine);          
        Label FirstP_ten = new Label("19" , Label.CENTER);
        panelOne.add(FirstP_ten);          
        Label FirstP_eleven = new Label("21" , Label.CENTER);
        panelOne.add(FirstP_eleven);          
        Label FirstP_twlve = new Label("23" , Label.CENTER);
        panelOne.add(FirstP_twlve);          
        Label FirstP_thirteen = new Label("25" , Label.CENTER);
        panelOne.add(FirstP_thirteen);          
        Label FirstP_forteen = new Label("27" , Label.CENTER);
        panelOne.add(FirstP_forteen);          
        Label FirstP_fifteen = new Label("29" , Label.CENTER);
        panelOne.add(FirstP_fifteen);          
        Label FirstP_sixteen = new Label("31" , Label.CENTER);
        panelOne.add(FirstP_sixteen);          
        f.add(panelOne);  

        // First Radio buttons
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox cbP_one_1 = new Checkbox("Yes", cbg1, false);
        Checkbox cbP_one_2 = new Checkbox("No", cbg1, false);
        f.add(cbP_one_1);
        f.add(cbP_one_2);


        // Second panel code 
        Panel panelTwo =new Panel();     
        panelTwo.setBackground(Color.decode("#ffffff"));  
        panelTwo.setLayout(new GridLayout(4,4));

        // Labels in grid 
        Label SecondP_one = new Label("2", Label.CENTER);
        panelTwo.add(SecondP_one);          
        Label SecondP_two = new Label("3", Label.CENTER);
        panelTwo.add(SecondP_two);          
        Label SecondP_three = new Label("6", Label.CENTER);
        panelTwo.add(SecondP_three);          
        Label SecondP_four = new Label("7", Label.CENTER);
        panelTwo.add(SecondP_four);          
        Label SecondP_five = new Label("10", Label.CENTER);
        panelTwo.add(SecondP_five);          
        Label SecondP_six = new Label("11", Label.CENTER);
        panelTwo.add(SecondP_six);          
        Label SecondP_seven = new Label("14", Label.CENTER);
        panelTwo.add(SecondP_seven);          
        Label SecondP_eight = new Label("15", Label.CENTER);
        panelTwo.add(SecondP_eight);          
        Label SecondP_nine = new Label("18", Label.CENTER);
        panelTwo.add(SecondP_nine);          
        Label SecondP_ten = new Label("19", Label.CENTER);
        panelTwo.add(SecondP_ten);          
        Label SecondP_eleven = new Label("22", Label.CENTER);
        panelTwo.add(SecondP_eleven);          
        Label SecondP_twlve = new Label("23", Label.CENTER);
        panelTwo.add(SecondP_twlve);          
        Label SecondP_thirteen = new Label("26", Label.CENTER);
        panelTwo.add(SecondP_thirteen);          
        Label SecondP_forteen = new Label("27", Label.CENTER);
        panelTwo.add(SecondP_forteen);          
        Label SecondP_fifteen = new Label("30", Label.CENTER);
        panelTwo.add(SecondP_fifteen);          
        Label SecondP_sixteen = new Label("31", Label.CENTER);
        panelTwo.add(SecondP_sixteen);          
        f.add(panelTwo);  

        // Second Radio buttons
        CheckboxGroup cbg2 = new CheckboxGroup();
        Checkbox cbP_two_1 = new Checkbox("Yes", cbg2, false);
        Checkbox cbP_two_2 = new Checkbox("No", cbg2, false);
        f.add(cbP_two_1);
        f.add(cbP_two_2);


        // Third panel code 
        Panel panelThree =new Panel();     
        panelThree.setBackground(Color.decode("#ffffff"));  
        panelThree.setLayout(new GridLayout(4,4));

        // Labels in grid 
        Label ThirdP_one = new Label("4", Label.CENTER);
        panelThree.add(ThirdP_one);          
        Label ThirdP_two = new Label("5", Label.CENTER);
        panelThree.add(ThirdP_two);          
        Label ThirdP_three = new Label("6", Label.CENTER);
        panelThree.add(ThirdP_three);          
        Label ThirdP_four = new Label("7", Label.CENTER);
        panelThree.add(ThirdP_four);          
        Label ThirdP_five = new Label("12", Label.CENTER);
        panelThree.add(ThirdP_five);          
        Label ThirdP_six = new Label("13", Label.CENTER);
        panelThree.add(ThirdP_six);          
        Label ThirdP_seven = new Label("14", Label.CENTER);
        panelThree.add(ThirdP_seven);          
        Label ThirdP_eight = new Label("15", Label.CENTER);
        panelThree.add(ThirdP_eight);          
        Label ThirdP_nine = new Label("20", Label.CENTER);
        panelThree.add(ThirdP_nine);          
        Label ThirdP_ten = new Label("21", Label.CENTER);
        panelThree.add(ThirdP_ten);          
        Label ThirdP_eleven = new Label("22", Label.CENTER);
        panelThree.add(ThirdP_eleven);          
        Label ThirdP_twlve = new Label("23", Label.CENTER);
        panelThree.add(ThirdP_twlve);          
        Label ThirdP_thirteen = new Label("28", Label.CENTER);
        panelThree.add(ThirdP_thirteen);          
        Label ThirdP_forteen = new Label("29", Label.CENTER);
        panelThree.add(ThirdP_forteen);          
        Label ThirdP_fifteen = new Label("30", Label.CENTER);
        panelThree.add(ThirdP_fifteen);          
        Label ThirdP_sixteen = new Label("31", Label.CENTER);
        panelThree.add(ThirdP_sixteen);          
        f.add(panelThree);  

        // Third Radio buttons
        CheckboxGroup cbg3 = new CheckboxGroup();
        Checkbox cbP_three_1 = new Checkbox("Yes", cbg3, false);
        Checkbox cbP_three_2 = new Checkbox("No", cbg3, false);
        f.add(cbP_three_1);
        f.add(cbP_three_2);


        // Fourth panel code 
        Panel panelFour =new Panel();     
        panelFour.setBackground(Color.decode("#ffffff"));  
        panelFour.setLayout(new GridLayout(4,4));

        // Labels in grid 
        Label ForthP_one = new Label("8", Label.CENTER);
        panelFour.add(ForthP_one);          
        Label ForthP_two = new Label("9", Label.CENTER);
        panelFour.add(ForthP_two);          
        Label ForthP_three = new Label("10", Label.CENTER);
        panelFour.add(ForthP_three);          
        Label ForthP_four = new Label("11", Label.CENTER);
        panelFour.add(ForthP_four);          
        Label ForthP_five = new Label("12", Label.CENTER);
        panelFour.add(ForthP_five);          
        Label ForthP_six = new Label("13", Label.CENTER);
        panelFour.add(ForthP_six);          
        Label ForthP_seven = new Label("14", Label.CENTER);
        panelFour.add(ForthP_seven);          
        Label ForthP_eight = new Label("15", Label.CENTER);
        panelFour.add(ForthP_eight);          
        Label ForthP_nine = new Label("24", Label.CENTER);
        panelFour.add(ForthP_nine);          
        Label ForthP_ten = new Label("25", Label.CENTER);
        panelFour.add(ForthP_ten);          
        Label ForthP_eleven = new Label("26", Label.CENTER);
        panelFour.add(ForthP_eleven);          
        Label ForthP_twlve = new Label("27", Label.CENTER);
        panelFour.add(ForthP_twlve);          
        Label ForthP_thirteen = new Label("28", Label.CENTER);
        panelFour.add(ForthP_thirteen);          
        Label ForthP_forteen = new Label("29", Label.CENTER);
        panelFour.add(ForthP_forteen);          
        Label ForthP_fifteen = new Label("30", Label.CENTER);
        panelFour.add(ForthP_fifteen);          
        Label ForthP_sixteen = new Label("31", Label.CENTER);
        panelFour.add(ForthP_sixteen);          
        f.add(panelFour);  

        // Forth Radio buttons
        CheckboxGroup cbg4 = new CheckboxGroup();
        Checkbox cbP_four_1 = new Checkbox("Yes", cbg4, false);
        Checkbox cbP_four_2 = new Checkbox("No", cbg4, false);
        f.add(cbP_four_1);
        f.add(cbP_four_2);

        // Fourth panel code 
        Panel panelFive =new Panel();     
        panelFive.setBackground(Color.decode("#ffffff"));  
        panelFive.setLayout(new GridLayout(4,4));

        // Labels in grid 
        Label FifthP_one = new Label("16", Label.CENTER);
        panelFive.add(FifthP_one);          
        Label FifthP_two = new Label("17", Label.CENTER);
        panelFive.add(FifthP_two);          
        Label FifthP_three = new Label("18", Label.CENTER);
        panelFive.add(FifthP_three);          
        Label FifthP_four = new Label("19", Label.CENTER);
        panelFive.add(FifthP_four);          
        Label FifthP_five = new Label("20", Label.CENTER);
        panelFive.add(FifthP_five);          
        Label FifthP_six = new Label("21", Label.CENTER);
        panelFive.add(FifthP_six);          
        Label FifthP_seven = new Label("22", Label.CENTER);
        panelFive.add(FifthP_seven);          
        Label FifthP_eight = new Label("23", Label.CENTER);
        panelFive.add(FifthP_eight);          
        Label FifthP_nine = new Label("24", Label.CENTER);
        panelFive.add(FifthP_nine);          
        Label FifthP_ten = new Label("25", Label.CENTER);
        panelFive.add(FifthP_ten);          
        Label FifthP_eleven = new Label("26", Label.CENTER);
        panelFive.add(FifthP_eleven);          
        Label FifthP_twlve = new Label("27", Label.CENTER);
        panelFive.add(FifthP_twlve);          
        Label FifthP_thirteen = new Label("28", Label.CENTER);
        panelFive.add(FifthP_thirteen);          
        Label FifthP_forteen = new Label("29", Label.CENTER);
        panelFive.add(FifthP_forteen);          
        Label FifthP_fifteen = new Label("30", Label.CENTER);
        panelFive.add(FifthP_fifteen);          
        Label FifthP_sixteen = new Label("31", Label.CENTER);
        panelFive.add(FifthP_sixteen);          
        f.add(panelFive);  

        // Fifth Radio buttons
        CheckboxGroup cbg5 = new CheckboxGroup();
        Checkbox cbP_five_1 = new Checkbox("Yes", cbg5, false);
        Checkbox cbP_five_2 = new Checkbox("No", cbg5, false);
        f.add(cbP_five_1);
        f.add(cbP_five_2);

        Vector<Integer> v = new Vector<Integer>(5);
        Label output = new Label("Your number is", Label.CENTER);

        // ITEM LISTNERS

        //? CHECKBOX PANEL 1 SET
        //* CASE TRUE
        cbP_one_1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(0,1);               
            }  
         });  

        //! CASE FALSE
        cbP_one_2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(0,0);               
            }  
         });  

        //? CHECKBOX PANEL 2 SET
        //* CASE TRUE
        cbP_two_1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(1,2);               
            }  
         });  

        //! CASE FALSE
        cbP_two_2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(1,0);               
            }  
         });  

        //? CHECKBOX PANEL 3 SET
        //* CASE TRUE
        cbP_three_1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(2,4);               
            }  
         });  

        //! CASE FALSE
        cbP_three_2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(2,0);               
            }  
         });  

        //? CHECKBOX PANEL 4 SET
        //* CASE TRUE
        cbP_four_1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(3,8);               
            }  
         });  

        //! CASE FALSE
        cbP_four_2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(3,0);               
            }  
         });  

        //? CHECKBOX PANEL 5 SET
        //* CASE TRUE
        cbP_five_1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(4,16);   
                int sum = 0;
                for (int i = 0; i < v.capacity(); i++) {
                    sum += v.get(i);
                }
          
                output.setText("Your number is: " + sum);
                Frame outputFrame = new Frame("Output"); 
                outputFrame.setVisible(true);
                outputFrame.setSize(400, 800);
                outputFrame.add(output);    
            }  
         });  

        //! CASE FALSE
        cbP_five_2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {  
                v.add(4,0);   
                int sum = 0;
                for (int i = 0; i < v.capacity(); i++) {
                    sum += v.get(i);
                }
          
                output.setText("Your number is: " + sum);
                Frame outputFrame = new Frame("Output"); 
                outputFrame.setVisible(true);
                outputFrame.setSize(400, 800);
                outputFrame.add(output); 
            }  
         });  
      

        // f.add(output);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }  


        public static void main(String args[]){  
            new AppGame();  
        }  
} 
