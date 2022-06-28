package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;

public interface RecordService {
	
	Record createRecord(Record rec);
	
	Record readRecordByID(Long id);
	
	Record updateRecord(Record rec);
	
	Void deleteRecordByID(Long id);
}
