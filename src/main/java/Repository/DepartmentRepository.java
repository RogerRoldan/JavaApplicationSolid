package Repository;

import Interfaces.IRespository;
import Models.Departamento;
import RepositoryBase.File.DepartmentCrudFile;

import java.util.List;

public class DepartmentRepository implements IRespository<Departamento> {

    DepartmentCrudFile departmentCrudFile = new DepartmentCrudFile();

    @Override
    public Departamento Create(Departamento entity) {

        departmentCrudFile.Save(entity);
        return entity;
    }

    @Override
    public List<Departamento> GetAll() {
        List<Departamento> departamentos = departmentCrudFile.GetAll();
        return departamentos;
    }

    @Override
    public Departamento Update(Departamento entity) {
        departmentCrudFile.Update(entity);
        return entity;
    }

    @Override
    public void Delete(int id) {
        departmentCrudFile.Delete(id);
    }
}
