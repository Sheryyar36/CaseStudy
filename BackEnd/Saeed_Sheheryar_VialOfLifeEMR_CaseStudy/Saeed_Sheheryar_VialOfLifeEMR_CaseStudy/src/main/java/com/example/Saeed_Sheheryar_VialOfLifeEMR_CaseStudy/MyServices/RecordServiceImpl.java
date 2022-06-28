package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import org.springframework.stereotype.Service;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.RecordRepo;

@Service
public class RecordServiceImpl implements RecordService{
	
	private RecordRepo recordrepo;
	
	public RecordServiceImpl(RecordRepo recordrepo) {
		super();
		this.recordrepo = recordrepo;
	}

	@Override
	public Record createRecord(Record rec) {
		return recordrepo.save(rec);
	}

	@Override
	public Record readRecordByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Record updateRecord(Record rec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void deleteRecordByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
