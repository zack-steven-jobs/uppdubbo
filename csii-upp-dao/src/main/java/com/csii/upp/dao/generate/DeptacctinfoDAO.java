package com.csii.upp.dao.generate;

import java.sql.SQLException;
import java.util.List;

import com.csii.upp.dao.BasePayDAO;
import com.csii.upp.dto.generate.Deptacctinfo;
import com.csii.upp.dto.generate.DeptacctinfoExample;

public class DeptacctinfoDAO extends BasePayDAO {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int countByExample(DeptacctinfoExample example) throws SQLException {
        Integer count = (Integer)  getSqlMap().queryForObject("DEPTACCTINFO.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int deleteByExample(DeptacctinfoExample example) throws SQLException {
        int rows = getSqlMap().delete("DEPTACCTINFO.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int deleteByPrimaryKey(String deptnbr, String inneracctcfmmode) throws SQLException {
        Deptacctinfo _key = new Deptacctinfo();
        _key.setDeptnbr(deptnbr);
        _key.setInneracctcfmmode(inneracctcfmmode);
        int rows = getSqlMap().delete("DEPTACCTINFO.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  void insert(Deptacctinfo record) throws SQLException {
        getSqlMap().insert("DEPTACCTINFO.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  void insertSelective(Deptacctinfo record) throws SQLException {
        getSqlMap().insert("DEPTACCTINFO.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public static  List<Deptacctinfo> selectByExample(DeptacctinfoExample example) throws SQLException {
        List<Deptacctinfo> list = getSqlMap().queryForList("DEPTACCTINFO.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  Deptacctinfo selectByPrimaryKey(String deptnbr, String inneracctcfmmode) throws SQLException {
        Deptacctinfo _key = new Deptacctinfo();
        _key.setDeptnbr(deptnbr);
        _key.setInneracctcfmmode(inneracctcfmmode);
        Deptacctinfo record = (Deptacctinfo) getSqlMap().queryForObject("DEPTACCTINFO.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int updateByExampleSelective(Deptacctinfo record, DeptacctinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("DEPTACCTINFO.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int updateByExample(Deptacctinfo record, DeptacctinfoExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMap().update("DEPTACCTINFO.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int updateByPrimaryKeySelective(Deptacctinfo record) throws SQLException {
        int rows = getSqlMap().update("DEPTACCTINFO.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    public static  int updateByPrimaryKey(Deptacctinfo record) throws SQLException {
        int rows = getSqlMap().update("DEPTACCTINFO.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table DEPTACCTINFO
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends DeptacctinfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DeptacctinfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}