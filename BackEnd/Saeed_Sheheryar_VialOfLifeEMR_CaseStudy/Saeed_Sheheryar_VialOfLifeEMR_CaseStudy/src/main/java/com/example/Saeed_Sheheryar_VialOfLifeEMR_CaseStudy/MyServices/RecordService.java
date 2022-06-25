package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;

public interface RecordService {
	
	Record createRecord(Record rec);
	
	Record readRecordByID(UserId id);
	
	Record updateRecord(Record rec);
	
	Void deleteRecordByID(UserId id);
}
