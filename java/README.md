# Java
Make sure you have Java installed on your machine. You can install the latest version of Java on macos using Homebrew by running `brew install java`. 

If you're able to run `java --version` and see something like this you're good to go:

```bash
% java--version                                                                                          
openjdk 22.0.1 2024-04-16
OpenJDK Runtime Environment Homebrew (build 22.0.1)
OpenJDK 64-Bit Server VM Homebrew (build 22.0.1, mixed mode, sharing)
```

Otherwise, you may need to symlink by running this command:

`sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk`

Now you'll be able to compile and run your Java code using `javac Sum.java`.

This will create a `Sum.class` binary which you can run with the command `java Sum`. This will call the `Sum.main()` method

```java
public static void main(String[] args) {
    System.out.println("Test sum(0, 0): " + (Sum.sum(0, 0) == 0));
    System.out.println("Test sum(1, 2): " + (Sum.sum(1, 2) == 3));
}
```

```bash
% java Sum      
Test sum(0, 0): true
Test sum(1, 2): true
```

If we don't have a `main` method in our class we'll get this output.

```bash
% java Sum.class
Error: Could not find or load main class Sum.class
Caused by: java.lang.ClassNotFoundException: Sum.class
```

However, we want to run a test suite on our Sum class. We'll use [Apache Maven](https://maven.apache.org/) to write rules on how to compile our Java and pull in dependencies needed for testing. We can install maven using Homebrew on macos `brew install maven`. Verify it installed:

```bash
% mvn --version
Apache Maven 3.9.8 (36645f6c9b5079805ea5009217e36f2cffd34256)
Maven home: /opt/homebrew/Cellar/maven/3.9.8/libexec
Java version: 22.0.1, vendor: Homebrew, runtime: /opt/homebrew/Cellar/openjdk/22.0.1/libexec/openjdk.jdk/Contents/Home
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "14.5", arch: "aarch64", family: "mac"
```

Now we can test our Java code and run it using maven.

```bash
mvn clean
mvn compile
mvn test
```

You should see output like this.

```
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ SumProject ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running SumTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in SumTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.748 s
[INFO] Finished at: 2024-07-08T16:37:14-05:00
[INFO] ------------------------------------------------------------------------
```

The build settings for Maven are set in `pom.xml` file.  This is where we add our [junit](https://junit.org/junit5/) dependency for testing.

<!-- TODO: debugging -->
