Run instructions - 

1. Open project in any suitable ide by selecting the root demo folder.
2. Let the build manager initialise and load all dependencies.
3. Build the solution and generate the jar file.
4. Go to targets and run the jar file (java -jar demo-0.0.1-SNAPSHOT.jar)
5. You can run from the ide as well. In IntelliJ, create a application in run config by selecting the DemoApplication class.
6. Run this app and you will get the api up and running on localhost port 8080.

http://localhost:8080/reports - All reports
http://localhost:8080/reports/month/1/site/mobile%20web - reports after filtering on month and site
http://localhost:8080/reports/site/mobile%20web/month/1 - reports after filtering on month and site
http://localhost:8080/reports/month/1 - Aggregated reports on month
http://localhost:8080/reports/site/mobile%20web- Aggregated reports on site


