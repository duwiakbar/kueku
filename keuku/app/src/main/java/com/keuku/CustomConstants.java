package com.keuku;

public interface CustomConstants {

    // transaction type
    String KEY_CREDIT = "CREDIT";
    String KEY_DEBIT = "DEBIT";

    String BTN_DELETE = "Delete";

    //  database
    int DATABASE_VERSION = 1;
    String DATABASE_NAME = "KeuKuDB";
    String TABLE_NAME = "TransList";

    // table
    String KEY_ID = "id";
    String KEY_AMOUNT = "amount";
    String KEY_DESC = "description";
    String KEY_DATE = "date";
    String KEY_TYPE = "type";
}
