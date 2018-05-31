# Reporting Demo
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
 - Go to targets and run the jar file with following command 
    - ```java -jar demo-0.0.1-SNAPSHOT.jar "../Files" ```
- After successful start, go to browser and hit http://localhost:8080/reports
- You will see all the report items
- You can try below urls as well to get other filtered reports based on path params.

#### To get all reports
- **http://localhost:8080/reports**
#### To get reports filtered on month and site
- **(http://localhost:8080/reports/month/1/site/mobile%20web)**
#### To get reports filtered on site and month
- **(http://localhost:8080/reports/site/mobile%20web/month/1)**
#### To get aggregated report on month
- **(http://localhost:8080/reports/month/1)**
#### To get aggregated reports on site
- **(http://localhost:8080/reports/site/mobile%20web)**