/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaControl {
    ArrayList<Atleta> array;
    int codigoatl = 1;
    public AtletaControl() {
        array = new ArrayList<>();
    }
    
    public int cadAtleta(String nome, double peso, double altura, int idade) {
        Atleta atleta = new Atleta(codigoatl,nome,peso,altura,idade);
        array.add(atleta);
        codigoatl++;
        return 1;
    }
    
    public double mediaPeso() {
        int cont = 0;
        double peso = 0;
        for(Atleta atl: array) {
            cont++;
            peso += atl.getPeso();
        }
        peso /= cont;
        return peso;
    }
    
    public String atletaMaisAlto() {
        int codigo = 0;
        String nome = "";
        double peso = 0;
        double altura = 0;
        int idade = 0;
        for(Atleta atl: array) {
            if(altura < atl.getAltura()) {
                codigo = atl.getCodigo();
                nome = atl.getNome();
                peso = atl.getPeso();
                altura = atl.getAltura();
                idade = atl.getIdade();
            }
        }
        return "Atleta nº "+ codigo + "\nNome: " + nome + "\nPeso: " + peso + "\nAltura: " + altura + "\nIdade: " + idade;
    }
    
    public int qtdMaiorIdade() {
        int qtdMaior = 0;
        for(Atleta atl: array) {
            if(atl.getIdade() >= 18) {
                qtdMaior++;
            }
        }
        return qtdMaior;
    }
    
    public int qtdMenorIdade() {
        int qtdMenor = 0;
        for(Atleta atl: array) {
            if(atl.getIdade() < 18) {
                qtdMenor++;
            }
        }
        return qtdMenor;
    }
    
    public String listarCadastrados() { 
        String mensagem = "";
        for(Atleta atl: array) {
            mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
        }
        return mensagem;
    }
    
    public String buscarPorCodigo(int codigoBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getCodigo() == codigoBusca) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public String buscarPorNome(String nomeBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getNome().equals(nomeBusca)) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public String buscarPorPeso(double pesoBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getPeso() == pesoBusca) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public String buscarPorAltura(double alturaBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getAltura() == alturaBusca) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public String buscarPorIdade(int idadeBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getIdade() == idadeBusca) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public String buscarGeral(int codigo, String nomeBusca, double pesoBusca, double alturaBusca, int idadeBusca) {  
        String mensagem = "";
        for(Atleta atl: array) {
            if(atl.getCodigo() == codigo && atl.getNome().equals(nomeBusca) && atl.getPeso() == pesoBusca && atl.getAltura() == alturaBusca && atl.getIdade() == idadeBusca) {
                mensagem += "Atleta nº " + atl.getCodigo() + "\nNome: " + atl.getNome() + "\nPeso: " +  atl.getPeso() + "\nAltura: " + atl.getAltura() + "\nIdade: " + atl.getIdade() + "\n\n";
            }
        }
        return mensagem;
    }
    
    public boolean excluirPorCodigo(int codigoBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getCodigo() == codigoBusca) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public boolean excluirPorNome(String nomeBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getNome().equals(nomeBusca)) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public boolean excluirPorPeso(double pesoBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getPeso() == pesoBusca) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public boolean excluirPorAltura(double alturaBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getAltura() == alturaBusca) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public boolean excluirPorIdade(int idadeBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getIdade() == idadeBusca) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public boolean excluirPorEspec(int codigo, String nomeBusca, double pesoBusca, double alturaBusca, int idadeBusca) {
        boolean achou = false;
        for(Atleta atl: array) {
            if(atl.getCodigo() == codigo && atl.getNome().equals(nomeBusca) && atl.getPeso() == pesoBusca && atl.getAltura() == alturaBusca && atl.getIdade() == idadeBusca) {
                array.remove(atl);
                achou = true;
                break;
            }
        }
        return achou;
    }
}
