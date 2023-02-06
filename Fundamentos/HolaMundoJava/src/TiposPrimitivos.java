
public class TiposPrimitivos {
    public static void main(String args[]){
        /*
        Tipos primitivos enteros; byte, short, int, long
        */
        byte numeroByte = (byte)129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor minimo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);   
        System.out.println("valor minimo byte:" + Short.MIN_VALUE);
        System.out.println("valor maximo byte:" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo long:" + Long.MAX_VALUE);
        
        /*
        Tipos primitivos de tipo flotantes; float, double
        */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo duble: " + Double.MAX_VALUE);
    }
    
}
