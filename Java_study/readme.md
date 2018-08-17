maven仓库地址
http://mvnrepository.com/artifact/org.jsoup/jsoup/1.11.3

1.命令行创建普通java项目
```$xslt
mvn archetype:generate -DgroupId=com.fxust -DartifactId=demo -DarchetypeArtifactId=maven-archetype-quickstart
```
2.命令行创建javaWeb项目
```$xslt
mvn archetype:generate -DgroupId=com.fxust.codelab -DartifactId=myweb -DarchetypeArtifactId=maven-archetype-webapp
```

3、更新依赖
```$xslt
mvn dependency:copy-dependencies
```