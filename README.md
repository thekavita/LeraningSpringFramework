
# Spring Framework

The Spring Framework is an open-source application framework and inversion of control container for the Java platform. The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE (Enterprise Edition) platform.

## Tight Coupling vs Loose Coupling

### Tight Coupling:
 When two classes are tightly coupled, they are dependent on each other. If one class changes, the other class will also change.

### Loose Coupling:
 When two classes are loosely coupled, they are not dependent on each other. If one class changes, the other class will not change.

## Spring container

Spring Container is the core of the Spring Framework. The Spring Container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring Container uses DI to manage the components that make up an application.The Spring Container manages Spring beans and their life cycle.

## Different Types of IoC Containers
Spring provides two types of IoC containers:

### BeanFactory Container:
 Basic IoC container provided by Spring. It is the root interface for accessing a Spring BeanFactory. It is the simplest container provided by Spring.

### ApplicationContext Container:
 It is the advanced container provided by Spring. It is built on top of the BeanFactory container. It adds more enterprise-specific functionality like the ability to resolve textual messages from a properties file and the ability to publish application events to interested event listeners.



## Difference between Java Bean, POJO and Spring Bean
### POJO (Plain Old Java Object)
A POJO is a simple Java object, without any dependency. It does not extend any class and does not implement any interface. It is a simple Java object that is used to transfer data from one layer to another.
POJOs do not have any business logic. They are just simple data objects.
POJOs are not thread-safe. They are not synchronized.
POJOs do not have any dependency. They do not have any reference to any other object.

### Java Bean
A Java Bean is a POJO that follows some additional rules.
Java Beans are serializable.
Java Beans have a no-argument constructor.
Java Beans have getter and setter methods.
Java Beans are thread-safe. They are synchronized.
Java Beans have a dependency. They have a reference to other objects.

### Spring Bean
A Spring Bean is a POJO that is managed by Spring IoC Container (ApplicationContext or BeanFactory).
Spring Bean Configuration
Spring Bean Configuration is the process of defining beans. 
## The Spring Bean Configuration can be done in two ways:

XML Based Configuration

Annotation Based Configuration

 
## Dependency Injection (DI)
Dependency Injection (DI) is a software design pattern that implements Inversion of Control for software applications. The basic idea behind DI is to provide the required dependencies to a class through external sources rather than creating them inside the class. This external source is called a container. The container is responsible for creating the dependencies and injecting them into the class.


## Constructor-based 
Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on the other class.

## Setter method 
 The Setter method injection approach of dependency injection is the way of injecting the dependencies of an object by using the setter method. Writing setter method is mandatory. 
