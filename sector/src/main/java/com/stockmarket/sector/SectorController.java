package com.stockmarket.sector;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sector")

public class SectorController {
    private SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }
    @GetMapping()
    public List<Sector> listSector(){
        return sectorService.getAllSectors();
    }
    @GetMapping("/{id}")
    public Sector getSector(@PathVariable String id)
    {
        return sectorService.getSector(id);
    }
    @PostMapping()
    public Sector addSector(@RequestBody Sector sector)
    {
        return sectorService.addSector(sector);
    }
    @PutMapping()
    public Sector editSector(@RequestBody Sector sector)
    {
        return sectorService.editSector(sector);
    }
    @DeleteMapping("/{id}")
    public String deleteSector(@PathVariable String id)
    {
        return sectorService.deleteSector(id);
    }
}

