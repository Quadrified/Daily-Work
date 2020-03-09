package com.cts.training.stockpriceservice;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface StockPriceService {
	
	public StockPrice insert(StockPrice stockPrice);
	
	public void remove(int id);
	
	public StockPrice update(StockPrice stockPrice);
	
	public StockPrice getById(int id);
	
	public List<StockPrice> getAll();

	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws IOException,Exception;

}