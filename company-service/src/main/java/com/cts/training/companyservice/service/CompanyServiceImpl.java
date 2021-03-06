package com.cts.training.companyservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.companyservice.entity.Company;
import com.cts.training.companyservice.repo.CompanyRepo;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public Company insert(Company company) {
		return companyRepo.save(company);
	}

	@Override
	public void remove(int id) {
		companyRepo.deleteById(id);
	}

	@Override
	public Company update(Company company) {
		return companyRepo.save(company);
	}

	@Override
	public List<Company> getAll() {
		return companyRepo.findAll();
	}
	
	@Override
	public Company getById(int id) {
		Optional<Company> company=companyRepo.findById(id);
		return company.orElse(null);
	}
	
	@Override
	public List<Company> getCompaniesByPattern(String pattern) {
		return companyRepo.findAllByNameContaining(pattern);
	}
	
	@Override
	public Company getCompanyByName(String name) {
		Optional<Company> company=companyRepo.findByName(name);
		return company.orElse(null);
	}
	
}
