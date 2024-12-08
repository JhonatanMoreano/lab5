package com.laboratorio5.lab5.repository;

import com.laboratorio5.lab5.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC
 */
public interface FormularioRepository extends JpaRepository<Formulario, Long> {
    // Aqui se pueden agregar consultas personalizadas si fuera necesario.
}
