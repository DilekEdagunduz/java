package Veteriner.demo.Services;

import Veteriner.demo.Entities.Uye;
import Veteriner.demo.Repositories.UyeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UyeServices {
    @Autowired
    UyeRepository uyeRepository;
    //private  static Map <String,Uye> UyeRepo=new HashMap<>();
    /*static {
       Uye uye=new Uye();
       uye.setName("deneme");
       UyeRepo.put();
    }
    public Collection<Uye> gtr() {
       // return UyeRepo.values();
    }
*/
    public void save(Uye uye) {
        uyeRepository._Save(uye);
    }
    public List<Uye> GetUye()
    {
        return uyeRepository.findAll();
    }
    public String deleteProduct(long id) {
        uyeRepository.deleteById(id);
        return "product removed !! " + id;
    }

    public Uye UpdateUye(Uye uye)
    {
        Uye existingUye = uyeRepository.findById(uye.getId()).orElse(null);
        existingUye.setName(uye.getName());
        return uyeRepository.save(existingUye);
    }
}
