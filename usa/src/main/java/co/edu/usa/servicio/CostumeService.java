/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.servicio;

import co.edu.usa.servicio.*;
import co.edu.usa.modelo.Costume;
import co.edu.usa.modelo.Costume;
import co.edu.usa.modelo.CostumeRepository;
import co.edu.usa.modelo.CostumeRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JaliNet
 */
@Service
public class CostumeService {
    @Autowired
    CostumeRepository costumeRepository;
    
  public List<Costume> getAll() {return (List<Costume>) costumeRepository.getAll();};
  
  public Optional<Costume> getCostume(int id) {return costumeRepository.getCostume(id);};
  
  public Costume save(Costume costume) { 
       if (costume.getIdCostume()== null){
           return costumeRepository.save(costume);
       }
       else
       {
          Optional<Costume> co =  costumeRepository.getCostume(costume.getIdCostume());
          if (co.isEmpty()){
              return costumeRepository.save(costume);
          }
          else
          {
              return costume;
          }
       }
 
    }

  public Costume update (Costume costume){
        if (costume.getIdCostume() != null){
            Optional<Costume> e = costumeRepository.getCostume(costume.getIdCostume());
            if (!e.isEmpty()){
                if (costume.getName()!= null){
                    e.get().setName(costume.getName());
                }
                if (costume.getBrand()!= null){
                    e.get().setBrand(costume.getBrand());
                }
                if (costume.getYear()!= null){
                    e.get().setYear(costume.getYear());
                }
                if (costume.getCategory()!= null){
                    e.get().setCategory(costume.getCategory());
                }
                costumeRepository.save(e.get());
                return e.get();
            }
            else
            {
                return costume;
            }
        }
        else
        {
            return costume;
        }
    }
  
  public boolean deleteCostume (int id){
      Boolean aBoolean = getCostume(id).map(
              costume->{
            costumeRepository.delete(costume);
            return true;
        }).orElse(false);
        return aBoolean;
  }
    
     /* 
      public List<CategoryAmount> getTopCostumeByCategory(){
        List<Object[]> report= costumeRepository.getTopByCategory();
        List<CategoryAmount>res=new ArrayList<>();
        for(int i=0;i<report.size();i++){
            res.add(new CategoryAmount((Category)report.get(i)[0],(Long) report.get(i)[1]));
        }
        return res;
      }
    */
}
