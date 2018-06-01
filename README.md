# Reporting Demo

- Its a Spring Boot application which read data from given csv files on startup and exposes REST endpoints to access the reports based on filter/aggregation criteria given by the user. 
- The build and package manager used is Maven.

## Build instructions

- With IDE
    - Open project in any suitable IDE by selecting the root demo folder.
    - Let all maven dependencies loaded.
    - Build the solution and generate the jar file.
- Without IDE
    - Go to the demo folder.
    - Open terminal and run following commands.
        - ```mvn clean```
        - ```mvn package```

## Run instructions

 - After successful build, you will see the jar file created in the targets folder.
 - Go to targets and run the jar file with following command (the csv file location is given in argument)
    - ```java -jar demo-0.0.1-SNAPSHOT.jar "../Files/" ```
- After successful start, go to browser and hit http://localhost:8080/reports
- You will see all the report items
- You can try below urls as well to get other filtered reports based on path params.

#### To get all reports
- **http://localhost:8080/reports**
#### To get reports filtered on month and site
- **(http://localhost:8080/reports/month/1/site/mobile_web)**
#### To get reports filtered on site and month
- **(http://localhost:8080/reports/site/mobile_web/month/1)**
#### To get report for a month
- **(http://localhost:8080/reports/month/1)**
#### To get reports for a site
- **(http://localhost:8080/reports/site/mobile_web)**
#### To get aggregated report on month
- **(http://localhost:8080/reports/aggregate/month/1)**
#### To get aggregated reports on site
- **(http://localhost:8080/reports/aggregate/site/mobile_web)**


## Test instructions

- Unit tests and acceptance tests can be run with following command
```
mvn test
```