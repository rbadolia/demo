# Reporting Demo
**Build instructions -** 

1. With IDE
    a. Open project in any suitable IDE by selecting the root demo folder.
    b. Let all maven dependencies loaded.
    c. Build the solution and generate the jar file.
2. Without IDE
    a. Go to the demo folder.
    b. Open terminal and run following commands.
        ```mvn clean```
        ```mvn package```

**Run instructions -**

1. After successful build, you will see the jar file created in the targets folder.
2. Go to targets and run the jar file with following command
``` java -jar demo-0.0.1-SNAPSHOT.jar "../Files" ```
3. After successful start, go to browser and hit http://localhost:8080/reports
4. You will see all the report items
5. You can try below urls as well to get other filtered reports based on path params.

**(http://localhost:8080/reports)** - To get all reports
**(http://localhost:8080/reports/month/1/site/mobile%20web)** - To get reports filtered on month and site
**(http://localhost:8080/reports/site/mobile%20web/month/1)** - To get reports filtered on site and month
**(http://localhost:8080/reports/month/1)** - To get aggregated report on month
**(http://localhost:8080/reports/site/mobile%20web)** - To get aggregated reports on site
