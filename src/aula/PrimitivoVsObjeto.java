package aula;

public class PrimitivoVsObjeto {
    
    public static void main(String[] args) {
        
        //Tudo em java é objeto, exceto os tipos primitivos
        //Ao criar objetos de determinada classe você abre a possibilidade de ter atributos e objetos
        
        String s1 = new String();
        
        String s = "Texto";
        s.toUpperCase();
        
        //Wrappers são a versão Objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);
        
    }
    
}
