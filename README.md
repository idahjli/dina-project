# dina-web
[![Build Status](https://travis-ci.org/idali0226/dina-web.svg?branch=master)](https://travis-ci.org/idali0226/dina-web)
[![codecov.io](https://codecov.io/github/idali0226/dina-web/coverage.svg?branch=master)](https://codecov.io/github/idali0226/dina-web?branch=master)

 
This repository consists of three basic modules in dinaproject:
  
   - dina-datamodel
   - dina-data-jpa
   - dina-data-service
  
dina-datamodel is the model of entities from dina database 

dina-data-jpa is the CRUD operations to dina database
  
dina-data-service is a restful service which provides a set of methods to read, create, updat and delete data instance(s) to/from dina database.

All the moduls are java project and build with maven
 

# Build instructions 
   
To build the project in maven:

    mvn clean install
   
