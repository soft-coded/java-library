package com.example.repository;

import com.example.entity.*;
import java.util.*;
import java.util.stream.*;

// the interface for loanRecord repository
interface ILoanRecordRepository {
  LoanRecord addLoanRecord(LoanRecord loanRecord);

  void deleteLoanRecord(int id);

  LoanRecord updateLoanRecord(LoanRecord loanRecord);

  List<LoanRecord> getAllLoanRecords();
}

// class implementation for the interface
public class LoanRecordRepositoryImpl implements ILoanRecordRepository {
  private List<LoanRecord> loanRecords = new ArrayList<>();

  public LoanRecord addLoanRecord(LoanRecord loanRecord) {
    // don't add if already present
    if (loanRecords.contains(loanRecord))
      return loanRecord;

    loanRecords.add(loanRecord);
    return loanRecord;
  }

  public void deleteLoanRecord(int loanRecordId) {
    loanRecords.removeIf((loanRecordObj) -> loanRecordObj.getId() == loanRecordId);
  }

  public LoanRecord updateLoanRecord(LoanRecord newLoanRecord) {
    this.loanRecords
        .stream()
        .filter((loanRecordObj) -> loanRecordObj.getId() == newLoanRecord.getId())
        .forEach((loanRecordObj) -> {
          loanRecordObj.setUserId(newLoanRecord.getUserId());
          loanRecordObj.setBookId(newLoanRecord.getBookId());
          loanRecordObj.setBorrowDate(newLoanRecord.getBorrowDate());
          loanRecordObj.setDueDate(newLoanRecord.getDueDate());
          loanRecordObj.setReturnDate(newLoanRecord.getReturnDate());
          // id cannot be changed
        });

    return this.loanRecords
        .stream()
        .filter((loanRecordObj) -> loanRecordObj.getId() == newLoanRecord.getId())
        .collect(Collectors.toList())
        .get(0);
  }

  public List<LoanRecord> getAllLoanRecords() {
    return loanRecords;
  }
}
