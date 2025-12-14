package task;
public class EleventhTask {
    public enum Axis {X,Y}

    /**
     *
     * @param symbol символ для отображения.
     * @param length длина линии.
     * @param axis направление по оси (выберите X или Y).
     */
   public static void print(char symbol,int length,Axis axis){
        switch (axis){
            case X ->{for(int i =0; i<length;i++) System.out.print(symbol);}
            case Y -> {for(int i =0; i<length;i++) System.out.println(symbol);}
        }
        System.out.println();
    }
}
