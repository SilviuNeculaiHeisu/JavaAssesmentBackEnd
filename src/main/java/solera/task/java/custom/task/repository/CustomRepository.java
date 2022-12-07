package solera.task.java.custom.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import solera.task.java.custom.task.models.CustomTableHeisuSilviu;



@Repository
public interface CustomRepository extends JpaRepository<CustomTableHeisuSilviu, Integer>{

}
