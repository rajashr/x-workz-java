package com.xworkz.resort.dao;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {
	public void save(ResortDTO dto);
	public void readResortDetails(int resortId);
	public void updateResort(int resortId);
	public void deleteResort(int resortId);

}
