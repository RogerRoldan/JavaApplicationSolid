package Repository;

import Interfaces.IRespository;
import Models.Municipio;
import RepositoryBase.File.MunicipalityCrudFile;

import java.util.List;

public class MunicipalityRepository implements IRespository<Municipio>{

    MunicipalityCrudFile municipalityCrudFile = new MunicipalityCrudFile();

    @Override
    public Municipio Create(Municipio entity) {
        municipalityCrudFile.Save(entity);
        return entity;
    }

    @Override
    public List<Municipio> GetAll() {
        return municipalityCrudFile.GetAll();
    }

    @Override
    public Municipio Update(Municipio entity) {
        return municipalityCrudFile.Update(entity);
    }

    @Override
    public void Delete(int id) {
    municipalityCrudFile.Delete(id);
    }
}
