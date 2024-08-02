Project description: Final Project (API and WEB UI Automation Testing)

Libraries: Java, Rest Assured, Selenium, Cucumber and Json

Task:
1. create API and WEB UI Automation project
    - create test cases with Gherkin format and Cucumber Library
    - create separate package for Step Definitions and Feature between API test and WEB UI test
    - create 2 Gradle task to run Cucumber test with tags @api and @web
    - create Cucumber report with HTML and JSON format
    - create README file
2. push to GitHub
   - create GitHub Actions workflow for manual trigger and Pull request

how to run project
running command at local terminal:
for API test: ./gradlew apiAutomationTesting
for WEB UI test: ./gradlew webAutomationTesting 