package com.nova.jw.sample;

import javax.annotation.Generated;

public class Test01Tbl {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.264+09:00", comments="Source field: DB2INST1.TEST01_TBL.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.268+09:00", comments="Source field: DB2INST1.TEST01_TBL.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.268+09:00", comments="Source field: DB2INST1.TEST01_TBL.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.268+09:00", comments="Source field: DB2INST1.TEST01_TBL.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.268+09:00", comments="Source field: DB2INST1.TEST01_TBL.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.269+09:00", comments="Source field: DB2INST1.TEST01_TBL.NAME")
    public void setName(String name) {
        this.name = name;
    }
}