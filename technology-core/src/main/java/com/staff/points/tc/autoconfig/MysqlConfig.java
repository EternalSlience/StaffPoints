package com.staff.points.tc.autoconfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Configuration
@MapperScan("com.staff.points.mapper")
@Component
public class MysqlConfig {
    @Value("${datasource.username}")
    private String userName;
    @Value("${datasource.password}")
    private String password;
    @Value("${datasource.url}")
    private String url;
    @Value("${datasource.driver-class-name}")
    private String driverClassName;

    @PostConstruct
    private void printConfig () {
        String configStr = toString();
        System.out.println("mysqlconfig配置项为:" + configStr);
    }
    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(userName);//用户名
        dataSource.setPassword(password);//密码
        dataSource.setDriverClassName(driverClassName);
        dataSource.setInitialSize(5);//初始化时建立物理连接的个数
        dataSource.setMaxActive(50);//最大连接池数量
        dataSource.setMinIdle(1);//最小连接池数量
        dataSource.setMaxWait(60000);//获取连接时最大等待时间，单位毫秒。
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false); //
        dataSource.setTestOnReturn(false);
        dataSource.setPoolPreparedStatements(true); //缓存游标
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20); //游标缓存大小
        dataSource.setTimeBetweenEvictionRunsMillis(60000); // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(30000); //配置一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setValidationQuery("SELECT 1");//用来检测连接是否有效的sql
        dataSource.setTestOnBorrow(false);//申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestWhileIdle(true);//建议配置为true，不影响性能，并且保证安全性。
        dataSource.setPoolPreparedStatements(false);//是否缓存preparedStatement，也就是PSCache
        return dataSource;
    }
//    @Bean
//    public ServletRegistrationBean statViewServlet() {
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
//        // 添加IP白名单
//        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
//        // 添加IP黑名单，当白名单和黑名单重复时，黑名单优先级更高
//        servletRegistrationBean.addInitParameter("deny", "127.0.0.1");
//        // 添加控制台管理用户
//        servletRegistrationBean.addInitParameter("loginUsername", "SimpleWu");
//        servletRegistrationBean.addInitParameter("loginPassword", "123456");
//        // 是否能够重置数据
//        servletRegistrationBean.addInitParameter("resetEnable", "false");
//        return servletRegistrationBean;
//    }
//
//    @Bean
//    public FilterRegistrationBean statFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//        // 添加过滤规则
//        filterRegistrationBean.addUrlPatterns("/*");
//        // 忽略过滤格式
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
//        return filterRegistrationBean;
//    }


    @Override
    public String toString() {
        return "MysqlConfig{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                '}';
    }
}
