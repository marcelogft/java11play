 open module org.mocr.reactive.web.demo {

     requires java.sql;

     requires java.activation;
     requires java.instrument;
     requires java.validation;
     requires java.xml.bind;

     requires spring.beans;
     requires spring.boot;
     requires spring.boot.autoconfigure;
     requires spring.context;
     requires spring.core;
     requires spring.web;
     requires spring.webflux;

     requires jdk.unsupported;

     requires reactor.core;
     requires reactor.netty;

}