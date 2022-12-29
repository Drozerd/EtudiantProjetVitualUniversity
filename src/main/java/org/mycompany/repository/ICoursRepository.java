package org.mycompany.repository;

import org.mycompany.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursRepository extends JpaRepository<Cours, Integer> {

}
