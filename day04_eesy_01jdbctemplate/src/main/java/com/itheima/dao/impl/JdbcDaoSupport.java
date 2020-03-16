//package com.itheima.dao.impl;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.sql.DataSource;
//
///**
// * 此类用于抽取Dao中的重复代码
// * @author Rosalyn
// * @create 2020-03-16 11:06
// */
//public class JdbcDaoSupport {
//    private JdbcTemplate jdbcTemplate;
//
//    public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
//    }
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//
//    public void setDataSource(DataSource dataSource) {
//        if(jdbcTemplate == null){
//            jdbcTemplate = createJdbcTemplate(dataSource);
//        }
//
//    }
//
//    private JdbcTemplate createJdbcTemplate(DataSource dataSource){
//        return new JdbcTemplate(dataSource);
//    }
//
//
//}

