// ***************************************************************
//   Table.java
//
//   Prints a list of student names with their hometowns
//   and intended major
// ***************************************************************
public class Table
{
    public static void main() {
        makeTable();
    }
        
    public static void makeTable() {
        makeHeader();
        labelColumns();
        populateRows();
    }
        
    public static void makeHeader() {
        System.out.println ("\t---------------------");
        System.out.println ("\t==\tStudent\t==");
        System.out.println ("\t---------------------");
    }
        
    public static void labelColumns() {
        System.out.println ("Name\t\tLab\tBonus\tTotal");
        System.out.println ("----\t\t---\t-----\t-----");
    }
        
    public static void populateRows() {
        populateOneRow("Joe\t", 40, 7);
        populateOneRow("William\t", 50, 8);
        populateOneRow("Mary Sue", 39, 10);
        populateOneRow("Edward\t", 2, 12);
        populateOneRow("Riley\t", 68, 34);
    }
        
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }
}