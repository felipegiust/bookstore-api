
package br.com.bookstore.api.autor;

/**
 *
 * @author Felipe
 */
enum Genero {
    MASCULINO('M'),
    FEMININO('F');
    
    private char genero;
        
     Genero(char genero){
         this.genero=genero;
     }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
        
}
