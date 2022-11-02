package Veteriner.demo.Controllers;

import Veteriner.demo.Entities.Uye;
import Veteriner.demo.Services.UyeServices;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/Burak")
public class UyeControllers {

    @Autowired
    UyeServices uyeServices;


    @PostMapping("/register")
    public void CreateUye(@RequestBody Uye uye)
    {
        uyeServices.save(uye);
    }


    @GetMapping("/getUsers")
    public List<Uye> GetUye()
    {
        return uyeServices.GetUye();
    }

    @PutMapping("/update")
    public Uye UpdateUye(@RequestBody Uye uye)
    {
        return uyeServices.UpdateUye(uye);
    }

    @DeleteMapping("delete/{id}")
    public String DeleteUye (@PathVariable long id)
    {
        return uyeServices.deleteProduct(id);
    }

}
