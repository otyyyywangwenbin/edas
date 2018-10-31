1. 新建EOS Sample项目

1. 右键项目, 选择Convert to Maven project

1. 右键项目, 选择Generate war build scripts, 将生成的pom 文件内容片段复制到pom.xml

1. 修改${PROJECT}/eos-web/WEB-INF/web.xml, 增加端口号, 端口号没有被其他进程占用即可
	<context-param>
		<param-name>AdminPort</param-name>
		<param-value>6201</param-value>
	</context-param> 

1. 修改${PROJECT}/exf/confg/spring.xml, 注释<!-- auto bean proxy -->
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
	
1. pom.xml里增加依赖, 如mysql,edas-sdk,commons-el,jasper-compiler-jdt,jasper-compiler,jasper-runtime
   现在<dependencies>里增加
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>${mysql.jdbc.version}</version>
		</dependency> 
   再在maven-eos-war-build-plugin的<jarStrs>里增加
		mysql:mysql-connector-java:${mysql.jdbc.version}

