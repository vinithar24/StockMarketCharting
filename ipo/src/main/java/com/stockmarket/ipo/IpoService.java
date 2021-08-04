package com.stockmarket.ipo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IpoService {
    private IpoRepository ipoRepository;

    public IpoService(IpoRepository ipoRepository) {
        this.ipoRepository = ipoRepository;
    }
    public List<Ipo> getAllIpos()
    {
        return (List<Ipo>) ipoRepository.findAll();
    }
    public Ipo getIpo(int id)
    {
        Optional<Ipo> ipo=ipoRepository.findById(id);
        return ipo.isPresent() ? ipo.get() : null;
    }
    public Ipo addIpo(Ipo ipo)
    {
        Ipo newIpo=ipoRepository.save(ipo);
        return newIpo;
    }
    public String deleteIpo(int id)
    {
        ipoRepository.deleteById(id);
        return "IPO Deleted";
    }
    public Ipo editIpo(Ipo ipo)
    {

        Ipo savedIpo=ipoRepository.save(ipo);
        return savedIpo;

    }
}
