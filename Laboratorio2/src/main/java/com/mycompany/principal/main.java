/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principal;

import com.mycompany.entity.Productos;
import com.mycompany.sesion.ProductosJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory ext= Persistence.createEntityManagerFactory("laboratorio");
        ProductosJpaController pjc= new ProductosJpaController(ext);
        Productos p = new Productos();
        p.setNombre("Mantequilla");
        p.setPrecio(BigDecimal.valueOf(13.87));
        pjc.create(p);
    }
    
}
