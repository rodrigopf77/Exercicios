package aula;

public class Wrapper {
    
    public static void main(String[] args) {
        
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 10000L;
        
        System.out.println(b.byteValue());
        System.out.println(b);
        System.out.println(2 + " Concatenando String e números " + i.toString());
//        System.out.println(i);
//        
        Float f = 123.10F;
        System.out.println(f);
        
        Double d = 1234.5678;
        System.out.println(d);
        
        Boolean bo = Boolean.parseBoolean("true");//Nesse exemplo estamos atribuindo um valor é que originalmente
        //é uma String para booleano por isso usamos o Wrapper
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        
        
        Character c = '#'; //Corresponde ao char
        System.out.println(c + "...");
    
        String s2 = c.toString(); //Convertendo caracter para String
        
    
        
    }
    
}
