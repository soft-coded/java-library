package com.example.service;

import com.example.entity.*;
import com.example.repository.*;
import java.util.*;

// required interface
interface ILoanRecordService {
  LoanRecord addLoanRecord(LoanRecord loanRecord);

  void deleteLoanRecord(int id);

  LoanRecord updateLoanRecord(LoanRecord updateData);

  List<LoanRecord> getAllLoanRecords();
}

// class implementing the interface
public class LoanRecordServiceImpl implements ILoanRecordService {
  private LoanRecordRepositoryImpl loanRecordRepo = new LoanRecordRepositoryImpl();

  public LoanRecord addLoanRecord(LoanRecord loanRecord) {
    return loanRecordRepo.addLoanRecord(loanRecord);
  }

  public void deleteLoanRecord(int loanRecordId) {
    loanRecordRepo.deleteLoanRecord(loanRecordId);
  }

  public LoanRecord updateLoanRecord(LoanRecord newLoanRecord) {
    return loanRecordRepo.updateLoanRecord(newLoanRecord);
  }

  public List<LoanRecord> getAllLoanRecords() {
    return loanRecordRepo.getAllLoanRecords();
  }
}