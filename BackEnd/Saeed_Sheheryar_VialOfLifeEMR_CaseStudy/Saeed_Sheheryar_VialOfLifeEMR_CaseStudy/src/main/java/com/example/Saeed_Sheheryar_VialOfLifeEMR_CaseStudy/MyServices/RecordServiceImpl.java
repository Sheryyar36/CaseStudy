package com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyServices;

import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.Record;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.EntityModels.UserId;
import com.example.Saeed_Sheheryar_VialOfLifeEMR_CaseStudy.MyRepos.RecordRepo;

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
	public Record readRecordByID(UserId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Record updateRecord(Record rec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void deleteRecordByID(UserId id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
