package com.example.fpasnowflake.dialect;

import org.hibernate.dialect.Dialect;

public class SnowflakeDialect extends Dialect {

    @Override
    public String getSelectSequenceNextValString(String sequenceName) {
        return sequenceName + ".nextVal";
    }

    @Override
    public String getSequenceNextValString(String sequenceName) {
        return "select " + getSelectSequenceNextValString(sequenceName);
    }

    @Override
    public boolean supportsSequences() {
        return true;
    }

    @Override
    public boolean supportsPooledSequences() {
        return true;
    }
}
