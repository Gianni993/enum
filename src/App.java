public class App {
    public static void main(String[] args) throws Exception {
        Rettangolo rettangolo1= new Rettangolo(10,15);
        Triangolo triangolo1 = new Triangolo(10, 15);

        triangolo1.calcolaArea(triangolo1.base,triangolo1.altezza);
        rettangolo1.calcolaArea(rettangolo1.base, rettangolo1.altezza);

        

          
        
    }
}
