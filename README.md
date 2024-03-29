
This is a test automation framework built using Cucumber, Selenium, and RestAssured. The framework enables you to write and execute automated tests for both web and API applications.

## Features

- **BDD Approach**: The framework uses Behavior-Driven Development (BDD) methodology, allowing you to write tests in a human-readable format using Gherkin syntax.
- **Web Testing**: Selenium WebDriver is integrated with Cucumber to perform web UI testing on various browsers.
- **API Testing**: RestAssured library is integrated with Cucumber to perform API testing and validation of RESTful services.
- **Modular Structure**: The framework follows a modular structure, making it easy to organize and maintain test scenarios, step definitions, and page objects.
- **Data-driven Testing**: The framework supports data-driven testing by allowing you to separate test data from test scripts using external data sources such as Excel or CSV files.
- **Reporting**: Cucumber's built-in reporting feature generates detailed HTML reports, providing insights into test execution results.

## Prerequisites

Make sure you have the following software installed before running the framework:

- Java Development Kit (JDK) version 8 or higher
- Maven build tool
- Web browsers (Chrome, Firefox, etc.)
- An IDE (Integrated Development Environment) such as IntelliJ IDEA or Eclipse

## Getting Started

1. Clone the repository:


    git clone https://github.com/muraliDomda/CucumberUIandApi.git


2. Open the project in your preferred IDE.

3. Update the dependencies by running the following Maven command:

    mvn clean install


4. Configure the web driver settings in the configuration file 

5. Write your feature files using Gherkin syntax in the src/test/resources/features directory.

6. Implement the step definitions for your scenarios in the src/test/java/stepdefinitions directory.

7. Execute scripts using 
      mvn clean verify -Dcucumber.filter.tags="@smoke"

8. View the generated Cucumber HTML reports located at target/cucumber-html-reports/overview-features.html.

## Extending the Framework

Feel free to extend the framework based on your requirements. Here are some possible areas of improvement:

- Implement additional utility classes for handling common operations or custom assertions.
- Integrate with a test management tool to sync test cases and track test execution.
- Enhance the reporting by integrating with other reporting tools such as Allure or ExtentReports.

## Contributing

If you'd like to contribute to this framework, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.

## License

This project is licensed under the MIT License.

## Acknowledgements

- Cucumber
- Selenium
- RestAssured

## Contact

For any questions or suggestions, please feel free to reach out to the project maintainers:

- Email: murali.domda@gmail.com
- LinkedIn: [Murali D](https://www.linkedin.com/in/murali-d-51166a150/)

