package solera.task.java.custom.task.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import solera.task.java.custom.task.interfaces.ICustomTableService;
import solera.task.java.custom.task.models.CustomTableHeisuSilviu;
import solera.task.java.custom.task.repository.CustomRepository;

@Service
public class CustomTableService implements ICustomTableService{
@Autowired 
private CustomRepository customTableRepository;

@Override
public List<CustomTableHeisuSilviu> getAll() {
return this.customTableRepository.findAll();
}
@Override
public void postData(CustomTableHeisuSilviu data) {
	
		this.customTableRepository.save(data);
	
	
}

}