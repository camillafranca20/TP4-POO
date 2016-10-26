/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.cadastros;

import java.util.ArrayList;

/**
 *
 * @author Camilla
 */
public class database {
    private static ArrayList<clientes> clientes = new ArrayList<>();
    
    public static ArrayList<clientes> getClientes(){
        return clientes;
    }
    
     private static ArrayList<fornecedores> fornecedores = new ArrayList<>();
    
    public static ArrayList<fornecedores> getFornecedores(){
        return fornecedores;
    }
}
