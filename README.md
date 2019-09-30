# bdd_buy_project

# Setup

To be able to run this project you will need:

1 - Eclipse IDE
2 - Java version 1.8
3 - Cucumber dependencies (it's at pom file)
4 - Íf necessary, update the libraries needed to run the tests.

## Runing the tests

Open the project at Eclipse.
     >> Open the file Start_test.java, change the feature path to your directory and as a Junit test (C:\\...\\src\\test\\resources\\purchase.feature) <<-- path all here.
	 >> Be sure the file purchase.feature is inside (\\src\\test\\resources\\)
	 
	 
## The pom must be

Below properties:

<properties>
        <java.version>1.8</java.version>
        <junit.version>4.12</junit.version>
        <cucumber.version>4.3.1</cucumber.version>
        <maven.compiler.version>3.3</maven.compiler.version>
    </properties>
    
    <dependencies>
   

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-jvm</artifactId>
			<version>1.2.5</version>
			<type>pom</type>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-jvm-deps</artifactId>
			<version>1.0.5</version>
		</dependency>

		<dependency>
			<groupId>net.masterthought</groupId>
			<artifactId>cucumber-reporting</artifactId>
			<version>1.0.0</version>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>gherkin</artifactId>
			<version>2.12.2</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit-dep</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        /dependency>



		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.5.3</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer -->
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-picocontainer</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>



	</dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${maven.compiler.version}</version>
                <configuration>
                    <encoding>UTF-8</encoding>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>