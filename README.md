# Skymill Programming exercise

# Example

If the program gets 4,4,2,2 as input, the table is initiated to size 4 x 4 with the object in
position [2, 2] with direction north. Then, commands 1,4,1,3,2,3,2,4,1,0 are read
from stdin and executed. The final output would then be the end position of the object,
in this case [0, 1].

[Solution diagram model] 
https://docs.google.com/document/d/1x9Bxu1czosEipIZ5yfj5m36QRbmBS3azKFA6MMFdRjA/edit?usp=sharing

### Prerequisites

```
Maven
Java 1.8
IDEA
```
External libraries : 
- Jupiter Junit
- AssertJ
- System - rules, for testing Stdin and Stout results
  https://stefanbirkner.github.io/system-rules/

Full specification can be found in pom file.


### Installing

mvn clean install

Main class App.java.

### Running
You can run the application from console or IDE of your choise with:

mvn compile or just run Main.java file

### Testing
Only tested whole protocol Main class

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Bobur Umurzokov**

## Asumptions
Json Controller should be implemented ot handle protocol from json format


