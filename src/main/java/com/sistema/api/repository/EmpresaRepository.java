package com.sistema.api.repository;

import com.sistema.api.models.Empresa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
    Empresa findById(long id);
    
    
}
