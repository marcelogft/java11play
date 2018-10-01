FROM openjdk:11-jre-slim
# copy JARS into image
COPY target/modules /modules

EXPOSE 8080

# run application with this command line 
CMD java --add-opens java.base/java.lang=spring.core,javassist --module-path /modules --module org.mocr.reactive.web.demo/org.mocr.reactive.web.demo.DemoApplication
