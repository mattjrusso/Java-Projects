import javax.swing.*;

public class ArrayWork {

    public static void main(String[] args) {

        // obtain an integer from user to define the size of the array
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter array size"));

        // create an empty array of size 'size'
        int[] numlist = new int[size];

        // populate the array with random numbers between 1 and 100
        for (int i = 0; i < numlist.length; i++) {

            numlist[i] = (int) (Math.random() * 100 + 1);
        }

        // print entire array to a single JOptionPane
        String msg = "";
        for (int i = 0; i < numlist.length; i++) {

            msg += numlist[i] + "\n";
        }

        // get sum for sum and average
        int sum = 0;
        for (int i = 0; i < size; i++) {

            sum += numlist[i];
        }

        // multiply numbers
        int mult = numlist[0];
        for (int i = 0; i < size; i++) {

            mult *= numlist[i];

        }

        JOptionPane.showMessageDialog(null, msg);

        // show menu to user
        char menuchoice = showMenu();

        // all menu options
        while (menuchoice != 'q') {

            if (menuchoice == 'a') {

                JOptionPane.showMessageDialog(null, "the sum of the numbers is " + sum);

            } else if (menuchoice == 'm') {
                JOptionPane.showMessageDialog(null, "the product of the numbers is " + mult);

            } else if (menuchoice == 'v') {

                JOptionPane.showMessageDialog(null, "the average of the numbers is " + sum / size);

            } else if (menuchoice == 'x') {
                int max = numlist[0];
                for (int i = 1; i < numlist.length; i++) {

                    if (numlist[i] > max) {
                        max = numlist[i];
                    }
                }
                JOptionPane.showMessageDialog(null, "The maximum value is " + max);
            } else if (menuchoice == 'i') {
                int min = numlist[0];
                for (int i = 1; i < numlist.length; i++) {

                    if (numlist[i] < min) {
                        min = numlist[i];
                    }
                }

                JOptionPane.showMessageDialog(null, "The minimum value is " + min);
            } else {

                JOptionPane.showMessageDialog(null, "Invalid option");
            }
        }

    } // ends main

    public static char showMenu() {

        String menumsg = "What would you like to do with the numbers in your array?\n\n";
        menumsg += "(a)dd\n";
        menumsg += "(m)ultiply\n";
        menumsg += "a(v)erage\n";
        menumsg += "ma(x)imum value\n";
        menumsg += "m(i)nimum value\n";
        menumsg += "(q)uit\n";

        return JOptionPane.showInputDialog(menumsg).toLowerCase().charAt(0);
    }

} // ends class