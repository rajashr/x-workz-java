package com.xworkz.movies;

import com.xworkz.excelread.Excel;
import com.xworkz.movies.dao.MoviesDAO;
import com.xworkz.movies.dao.MoviesDAOImpl;
import com.xworkz.movies.dto.MovieDTO;

public class Tester {
	public static void main(String[] args) {
		
	
	String excelPath="./excelData/movieHub.xlsx";
	String sheetName="Sheet1";
	Excel excel=new Excel(excelPath, sheetName);
	String name1=excel.getCellData(1, 0).toString();
	String duration1=excel.getCellData(1, 1).toString();
	String ratings1=excel.getCellData(1, 2).toString();
	String genre1=excel.getCellData(1, 0).toString();
	
	
	
	
	MoviesDAO dao=new MoviesDAOImpl();
	MovieDTO dto=new MovieDTO();
	dto.setName(name1);
	dto.setDuration(Double.parseDouble(duration1));
	dto.setRatings(Integer.parseInt(ratings1));
	dto.setGenre(genre1);
	
	dao.saveMovie(dto);
	
}

}
