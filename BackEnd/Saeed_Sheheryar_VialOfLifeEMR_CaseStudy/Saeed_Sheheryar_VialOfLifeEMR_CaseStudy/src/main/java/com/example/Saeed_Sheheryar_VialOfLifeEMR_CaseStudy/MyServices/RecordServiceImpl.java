package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.RecordRepo;

@Service
public class RecordServiceImpl implements RecordService{
	
	@Autowired
	private RecordRepo recordrepo;

	@Override
	public Record createRecord(Record rec) {
		return recordrepo.save(rec);
	}

	@Override
	public Record readRecordByID(Long id) {
		return recordrepo.getReferenceById(id);
	}

	@Override
	public Record updateRecord(Record rec) {
		// TODO Auto-generated method stub
		return recordrepo.save(rec);
	}

	@Override
	public void deleteRecordByID(Long id) {
		recordrepo.deleteById(id);
	}
	
}
