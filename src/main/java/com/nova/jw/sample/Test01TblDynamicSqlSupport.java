package com.nova.jw.sample;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Test01TblDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.272+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    public static final Test01Tbl test01Tbl = new Test01Tbl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.273+09:00", comments="Source field: DB2INST1.TEST01_TBL.ID")
    public static final SqlColumn<Integer> id = test01Tbl.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.273+09:00", comments="Source field: DB2INST1.TEST01_TBL.NAME")
    public static final SqlColumn<String> name = test01Tbl.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.273+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    public static final class Test01Tbl extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public Test01Tbl() {
            super("DB2INST1.TEST01_TBL");
        }
    }
}