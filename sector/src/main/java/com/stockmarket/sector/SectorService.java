package com.stockmarket.sector;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectorService {
    private SectorRepository sectorRepository;
    public SectorService(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }
    public List<Sector> getAllSectors()
    {
        return (List<Sector>) sectorRepository.findAll();
    }
    public Sector getSector(String id)
    {
        Optional<Sector> sector=sectorRepository.findById(id);
        return sector.isPresent() ? sector.get() : null;
    }
    public Sector addSector(Sector sector)
    {
        Sector newSector=sectorRepository.save(sector);
        return newSector;
    }
    public String deleteSector(String id)
    {
        sectorRepository.deleteById(id);
        return "Sector Deleted";
    }
    public Sector editSector(Sector sector)
    {

        Sector savedSector=sectorRepository.save(sector);
        return savedSector;

    }
}
