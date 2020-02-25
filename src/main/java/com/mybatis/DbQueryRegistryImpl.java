package com.mybatis;

import java.util.EnumMap;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.config.IDbQuery;
import com.baomidou.mybatisplus.generator.config.querys.DB2Query;
import com.baomidou.mybatisplus.generator.config.querys.DMQuery;
import com.baomidou.mybatisplus.generator.config.querys.DbQueryRegistry;
import com.baomidou.mybatisplus.generator.config.querys.H2Query;
import com.baomidou.mybatisplus.generator.config.querys.KingbaseESQuery;
import com.baomidou.mybatisplus.generator.config.querys.MariadbQuery;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.querys.OracleQuery;
import com.baomidou.mybatisplus.generator.config.querys.PostgreSqlQuery;
import com.baomidou.mybatisplus.generator.config.querys.SqliteQuery;

/**
 * DbQueryRegistryImpl
 */
public class DbQueryRegistryImpl extends DbQueryRegistry {
    private final Map<DbType, IDbQuery> db_query_enum_map = new EnumMap<>(DbType.class);

    public DbQueryRegistryImpl(){
        db_query_enum_map.put(DbType.ORACLE, new OracleQuery());
        db_query_enum_map.put(DbType.SQL_SERVER, new SqlServerQueryImpl());
        db_query_enum_map.put(DbType.POSTGRE_SQL, new PostgreSqlQuery());
        db_query_enum_map.put(DbType.DB2, new DB2Query());
        db_query_enum_map.put(DbType.MARIADB, new MariadbQuery());
        db_query_enum_map.put(DbType.H2, new H2Query());
        db_query_enum_map.put(DbType.SQLITE, new SqliteQuery());
        db_query_enum_map.put(DbType.DM, new DMQuery());
        db_query_enum_map.put(DbType.KINGBASE_ES, new KingbaseESQuery());
        db_query_enum_map.put(DbType.MYSQL, new MySqlQuery());
    }

    @Override
    public IDbQuery getDbQuery(DbType dbType) {
        return db_query_enum_map.get(dbType);
    }
}