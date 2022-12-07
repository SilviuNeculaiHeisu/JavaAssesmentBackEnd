package solera.task.java.custom.task.interfaces;

import java.util.List;

import solera.task.java.custom.task.models.CustomTableHeisuSilviu;

public interface ICustomTableService {
public List<CustomTableHeisuSilviu>getAll();
public void postData(CustomTableHeisuSilviu data);
}
