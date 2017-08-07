# rwdb-demo
项目中使用的读写分离demo

spring+mybatis实现数据库读写分离

通过spring的AbstractRoutingDataSource和mybatis Plugin拦截器实现非常友好的读写分离，原有代码不需要任何改变。

读写数据源的切换根据你自定义拦截的方法名称。
