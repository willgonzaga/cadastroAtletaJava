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
public class CampoVazioException extends RuntimeException {
    public String getMessage() {
        return "O campo não pode estar vazio";
    }
}
