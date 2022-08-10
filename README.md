# Financial-Portfolio-Management-Neueda
Designing a single REST API spring boot application for financial Portfolio management

### Table of Contents

   + [Installation](#installation)
   + [Project Motivation](#project-motivation)
   + [Assumptions](#assumption)
   + [File Descriptions](#file-descriptions)
   + [Acknowledgement, Author and Licensing](#acknowledgement--author-and-licensing)

### Installation
The code should run with no issues using Java versions 8 and above. Using Java version 11 and Intellij Enterprise edition with reqd spring boot plugins is recommended.
MySQL workbench or other MySQL platforms can be used for persistent storage. Postman or any other API request handler can be used for managing and making requests. Maven has been used for the project build and the project has been containerized using Docker.
Additionally include the Swagger UI dependency for documentation ease.


### Project Motivation
This is a project for the Neueda Training program -  sprint 3 deliverable.
The overall objective of the project is to get acquainted with Java, SpringBoot functionalities and annotations, basic system design, docker and CI/CD pipelines. 
The immediate aim is to design a simple Portfolio Manager for handling basic requests that can be scaled later. And leveraging SQL servers for persistent storage in springboot apps effectively.


### Assumptions
As this is a basic project, there are several assumptions taken for maintaining simplicity :-
* There is a single user who wishes to see his portfolio
* The portfolio consists only of equity stocks and no Crypto or bonds or other financial assets are considered.
* Dataset used for the purpose is Nifty 50 price dataset at an instance.
* There is no authentication implemented yet as no requirement to manager users/unauthorized access.
* No Futures and options trading, simple holdings of buy and sell
* No UI yet, but can be added in the future


### File Descriptions/ Approach
The structure of the project is like any other SpringBoot application with Two Entities - Investor(really means the transaction record) and the Stock entity. 
The investor entity has a nested stock entity, as each record will contain the stock traded on the market. Requests have been made accordingly.

### Sample Output
![Investors Get Request json o/p](https://github.com/asxd-10/FinancialPortfolioNeueda/blob/main/investors-op.jpg?raw=true)

### Acknowledgement, Author and Licensing
For the project, I would like to express my gratitude towards :- 
* [Neueda](https://neueda.com/) for providing us the training
* [Maaike van Putten](https://www.linkedin.com/in/maaikevanputten/), our Java and SpringBoot trainer for the valuable teachings and necessary guidance + helpful debugging for this project
The code can be freely used by any individual or organization for their needs. MIT LICENSED.

Authors - 
* Ashay Katre
* Pooja Srinivasan
* Sandeep Allam
* Shruthi Muralidaran
