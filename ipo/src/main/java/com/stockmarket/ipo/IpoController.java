package com.stockmarket.ipo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/ipo")
@RestController
public class IpoController {
    private IpoService ipoService;

    public IpoController(IpoService ipoService) {
        this.ipoService = ipoService;
    }
    @GetMapping()
    public List<Ipo> listIpo(){
        return ipoService.getAllIpos();
    }
    @GetMapping("/{id}")
    public Ipo getIpo(@PathVariable int id)
    {
        return ipoService.getIpo(id);
    }
    @PostMapping()
    public Ipo addIpo(@RequestBody Ipo ipo)
    {
        return ipoService.addIpo(ipo);
    }
    @PutMapping()
    public Ipo editIpo(@RequestBody Ipo ipo)
    {
        return ipoService.editIpo(ipo);
    }
    @DeleteMapping("/{id}")
    public String deleteIpo(@PathVariable int id)
    {
        return ipoService.deleteIpo(id);
    }
}