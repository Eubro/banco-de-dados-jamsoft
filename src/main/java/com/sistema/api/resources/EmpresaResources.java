
package com.sistema.api.resources;

import com.sistema.api.models.Empresa;
import com.sistema.api.repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmpresaResources {
    
    @Autowired
    EmpresaRepository empresarepository;  
    
    @GetMapping("/empresas")
    public  List<Empresa> listaEmpresas(){
                
        return empresarepository.findAll();
    }
    
    @GetMapping("/empresa/{id}")
    public Empresa listaEmpresaUnica(@PathVariable(value="id") long id){
        return empresarepository.findById(id);
    }
    
    @PostMapping("/empresas")
    public Empresa salvaEmpresa(@RequestBody Empresa empresa){
         return empresarepository.save(empresa);
    }
    @DeleteMapping("/empresa/{id}")
    public void deletaEmpresa(@PathVariable(value = "id")long id){
     
            empresarepository.deleteById(id);
            
    }
     @PutMapping("/empresa/{id}")
    public Empresa atualizaEmpresa(@PathVariable(value = "id")Empresa empresa){
             
        return  empresarepository.save(empresa);
    }

    
}
