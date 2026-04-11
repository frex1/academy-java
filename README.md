# Academy Java

A comprehensive Java learning and practice repository featuring hands-on examples, exercises, and foundational concepts for new and intermediate Java developers.

---

## Features

- **Organized by Topic:** Individual modules for variables, scanner, flow control, arrays, strings, and more.
- **Source Code Examples:** Self-contained Java classes under each topic demonstrate best practices and common patterns.
- **Maven-based:** Easy to build, run, and test using standard Java/Maven tooling.
- **Testable:** Includes test directories for unit testing solutions and assignments.

---

## Project Structure

```
src/
 └── main/
     └── java/
         └── com/
             └── bptn/
                └── course/
                  ├── _01_variables/
                  ├── _02_scanner/
                  ├── _03_flow_control/
                  ├── _04_arrays/
                  ├── _05_strings/
                  └── hello/
 └── test/
site/            # (Site docs or reports if applicable)
```

---

## Quick Start

### Prerequisites
- Java 8+ (JDK)
- Maven

### Build and Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/frex1/academy-java.git
   cd academy-java
   ```

2. **Compile the project:**
   ```bash
   mvn compile
   ```

3. **Run a demo class:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.bptn.course.hello.HelloWorld"
   ```
   *(Replace with any class of interest in the topics above)*

4. **Run all tests:**
   ```bash
   mvn test
   ```

---

## How to Use
- Explore `src/main/java/com/bptn/course/` for topic-based lessons and examples.
- Each folder/module contains Java files focused on a specific concept with readable naming.
- Use, modify, or extend the code for your own learning or interviews.

---

## Contributing
Contributions for new topics, improved exercises, bug reports, and enhancements are welcome!  
Fork the repo, make your changes in a branch, and open a PR.

---

## License

MIT

---

## Author
- [@frex1](https://github.com/frex1)

---

## Support & Issues

Found a bug? Want an additional topic?  
Please open an issue at: https://github.com/frex1/academy-java/issues