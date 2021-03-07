package com.xworkz.resort.service;

import com.xworkz.resort.dto.ResortDTO;

public interface ServiceDAO {
	public void validateAndsave(ResortDTO dto);
	public void validateAndReadResortDetails(int resortId);
	public void validateAndUpdateResort(int resortId);
	public void validateAnddeleteResort(int resortId);

}
