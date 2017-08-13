# wh-automation-and-performance-framework
bdd framework including gatling performance plugin 

AUTOMATION: 
Pre requisutes: 
- JAVA_HOME is preferabley JDK 1.7 or above
- Maven installation configured (M2_HOME or bundled version with IDE (intelliJ)
- project cloned and imported as a maven project 

Running the autmated tests on Desktop: 

Junit  - create a Junit run config pointing at RunCucumberTests.java 
  - the following cmd line argument can be set for running on mobile (ChromeDriver - Nexus 5 "-DdeviceType=mobile" if this is absent or anything else, the tests will be on Desktop (Chrome Driver).
  --NOTE-- Running the pack with Junit will not generate the pretty Cucumber report
  - An unstyled report will be generated in: target/cucumber
  
Maven - create a maven run config containing  "clean test" 
  - the following cmd line argument can be set for running on mobile (ChromeDriver - Nexus 5 "-DdeviceType=mobile" if this is absent or anything else, the tests will be on Desktop (Chrome Driver).
  - Running this way will generate the cucumber report
  
Cucumber report 
 - If running with mvn, after test completion find the report in: target/cucumber-reports-cucumber-html-reports
 
 Recording Performance scripts
 Add the following cmd command to either of the above methods -DperfRecording=Y
 This will set up the proxy required to record scripts within the instantiation of webDriver
 --NOTE-- You must have the Recorder running and listening to record the simulation
 
 PERFORMANCE
 Running Engine found in: test/scala/performance/ will run the BDDScripts simulation. Which is recorded directly from the BDD cucumber scenarios within the same project 
 Gatling report will be outputted to target/gatling
