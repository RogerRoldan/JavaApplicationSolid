package Repository;

import Interfaces.IRespository;
import Models.Programa;
import RepositoryBase.File.ProgramCrudFile;

import java.util.List;

public class ProgramRepository implements IRespository<Programa>{

    ProgramCrudFile programCrudFile = new ProgramCrudFile();

    @Override
    public Programa Create(Programa entity) {
        programCrudFile.Save(entity);
        return entity;
    }

    @Override
    public List<Programa> GetAll() {
        return programCrudFile.GetAll();
    }

    @Override
    public Programa Update(Programa entity) {
        return programCrudFile.Update(entity);
    }

    @Override
    public void Delete(int id) {
        programCrudFile.Delete(id);
    }
}
