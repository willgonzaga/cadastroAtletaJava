/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Willey
 */
public class NumeroInvalidoException extends RuntimeException {
    public String getMessage() {
        return "Entrada de dados inválida";
    }
}
