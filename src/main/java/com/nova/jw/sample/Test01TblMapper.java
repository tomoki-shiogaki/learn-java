package com.nova.jw.sample;

import static com.nova.jw.sample.Test01TblDynamicSqlSupport.*;

import com.nova.jw.sample.Test01Tbl;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface Test01TblMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.28+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    BasicColumn[] selectList = BasicColumn.columnList(id, name);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.274+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.274+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.275+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Test01Tbl> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.275+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Test01Tbl> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.275+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Test01TblResult")
    Optional<Test01Tbl> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.276+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Test01TblResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Test01Tbl> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.277+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.277+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.277+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.278+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default int insert(Test01Tbl record) {
        return MyBatis3Utils.insert(this::insert, record, test01Tbl, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.279+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default int insertMultiple(Collection<Test01Tbl> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, test01Tbl, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.279+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default int insertSelective(Test01Tbl record) {
        return MyBatis3Utils.insert(this::insert, record, test01Tbl, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.28+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default Optional<Test01Tbl> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.281+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default List<Test01Tbl> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.281+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default List<Test01Tbl> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.281+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, test01Tbl, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.282+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    static UpdateDSL<UpdateModel> updateAllColumns(Test01Tbl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-12T15:50:36.282+09:00", comments="Source Table: DB2INST1.TEST01_TBL")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Test01Tbl record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName);
    }
}