package com.stockmarket.company;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/company")
@RestController
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping()
    public List<Company> listCompany(){
        return companyService.getAllCompanies();
    }
    @GetMapping("/{id}")
    public Company getCompany(@PathVariable String id)
    {
        return companyService.getCompany(id);
    }
    @PostMapping()
    public Company addCompany(@RequestBody Company company)
    {
        return companyService.addCompany(company);
    }
    @PutMapping()
    public Company editCompany(@RequestBody Company company)
    {
        return companyService.editCompany(company);
    }
    @DeleteMapping("/{id}")
    public String deleteCompany(@PathVariable String id)
    {
        return companyService.deleteCompany(id);
    }
}

