/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Breno-
 */
public class Concurso {
    
    private int codConcurso;
    private String numeroConcurso;
    
    public String getNumeroConcurso() {
        return numeroConcurso;
    }

    public void setNumeroConcurso(String numeroConcurso) {
        this.numeroConcurso = numeroConcurso;
    }
    

    public int getCodConcurso() {
        return codConcurso;
    }

    public void setCodConcurso(int codConcurso) {
        this.codConcurso = codConcurso;
    }

    
    @Override
    public String toString() {
        return this.getNumeroConcurso();
    }
    
}
