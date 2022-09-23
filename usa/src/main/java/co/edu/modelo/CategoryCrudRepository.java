/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JaliNet
 */
@Repository
public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
    
}
