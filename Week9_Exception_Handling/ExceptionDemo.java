public class ExceptionDemo {
    public static void main(String[] args) throws NumberFormatException {
        try{
            double a = Integer.parseInt(args[0]);
            double b = Integer.parseInt(args[1]);
            double c = Integer.parseInt(args[2]);
            double x1 = ((-b)+Math.sqrt(((b*b)-(4*a*c))))/(2*a);
            double x2 = ((-b)-Math.sqrt(((b*b)-(4*a*c))))/(2*a);
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);
        }
        catch(NumberFormatException ex){
            System.out.println("Please input data in number format only.");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Please enter 3 numbers as a a, b and c repectively.");
        }
        
        
    }
    
    
    
}
