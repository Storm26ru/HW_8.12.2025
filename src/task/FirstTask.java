package task;
import javax.swing.*;

public class FirstTask {
    private String string = "\"Your time is limited,\n" +
            "\tso don`t waste it\n" +
            "\t\tliving someone else`s life\"\n" +
            "\t\t\tSteve Jobs\n";
    public void print(){
        System.out.print("\"Your time is limited,\n" +
                             "\tso don`t waste it\n" +
                                 "\t\tliving someone else`s life\"\n" +
                                     "\t\t\tSteve Jobs\n");
        JOptionPane.showMessageDialog(null,String.format("%s",string),"Цитата",JOptionPane.INFORMATION_MESSAGE);
    }
}
