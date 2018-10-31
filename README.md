## 示例使用     


``` bash
mvn -gs settings.xml -f eos-spring-edas-patch/pom.xml clean install      
mvn -gs settings.xml -f itemcenter-api/pom.xml clean install     
mvn -gs settings.xml -f itemcenter-eos-provider/pom.xml clean package     
```



## eos项目修改      
1. 新建EOS Sample项目     

2. 右键项目, 选择Convert to Maven project     

3. 右键项目, 选择Generate war build scripts, 将生成的pom 文件内容片段复制到pom.xml     

4. 修改${PROJECT}/eos-web/WEB-INF/web.xml, 增加端口号, 端口号没有被其他进程占用即可     
```xml
	<context-param>
		<param-name>AdminPort</param-name>
		<param-value>6201</param-value>
	</context-param> 
    <context-param>
        <param-name>LocalIP</param-name>
        <param-value>127.0.0.1</param-value>
    </context-param>
```     

5. 修改${PROJECT}/exf/confg/spring.xml, 注释<!-- auto bean proxy -->     

```xml
	<!--  
	<bean class="com.primeton.spring.BeanNameAutoProxy">
	    <property name="proxyTargetClass">
   			<value>true</value>
  		</property>
		<property name="beanNames">
			<value>*</value>
		</property>
		<property name="interceptorNames">
			<list>
				<value>BeanInterceptor</value>
			</list>
		</property>
	</bean>
	-->
```     
	
6. pom.xml里增加依赖, 如mysql,edas-sdk,commons-el,jasper-compiler-jdt,jasper-compiler,jasper-runtime     
   现在<dependencies>里增加     

```xml
    <dependency>
        <groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>${mysql.jdbc.version}</version>
	</dependency> 
```     
   再在maven-eos-war-build-plugin的<jarStrs>里增加     
```xml     
mysql:mysql-connector-java:${mysql.jdbc.version}
```     

7. 修改构建包的spring.xml配置

    


