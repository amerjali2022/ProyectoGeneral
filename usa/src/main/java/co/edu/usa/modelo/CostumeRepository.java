/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.modelo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JaliNet
 */
@Repository
public class CostumeRepository {
    @Autowired
  private CostumeCrudRepository costumeCrudRepository;
  
  public List<Costume> getAll() {return (List<Costume>) costumeCrudRepository.findAll();};
  
  public Optional<Costume> getCostume(int id) {return costumeCrudRepository.findById(id);};
  
  public Costume save(Costume costume) { return costumeCrudRepository.save(costume);};
  
  public void delete(Costume costume ) {costumeCrudRepository.delete(costume);};

}
