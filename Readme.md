# Demo APP

Java 11
Spring 5.1
WebFlux
Reactor

```
mvn clean package
```

```
java --add-opens java.base/java.lang=spring.core,javassist --module-path target/modules --module org.mocr.reactive.web.demo/org.mocr.reactive.web.demo.DemoApplication
```

http://localhost:8080/greeting

http://localhost:8080/actuator