# spring-boot-unit-test-demo
- This is the project we have created to show the basic of unit test cases in a spring boot project.

## Steps to do
- First we have to add the Junit dependency , if spring-boot-starter-test dependency is already added then we don't need to add anything.
- Spring has already added all the dependency requird to write unit test inside spring-boot-starter-test with scope test.
- Note: if we are adding scope attribute as test to any dependency that means this dependency is only for test purpose, not required for normal execution for the application.
- In this project we have created one DemoUtility.java class and we have created two methods one is to add two integers and second is to check the null value.
- For these two methods we have created DemoUtilityTest.java inside test package where we have written two test cases to check the methods.
- We can directly run the unit test cases without running the whole spring boot application.
- Note : when we build this project with maven build command (below) then all test cases will to automatically execute.
> mvn clean install
> mvn clean install -DskipTests  (build the project without executing test cases)

## Lifecyle of Test Case
- When we are wriitng any test case so we are follwing the below steps
  1. we are creating the object  of that class or setting up the test data 
  2. After each test we are releasing resource or clean up test data.
- So if we are doing same thing in each test , we can also control it via anootations.

### Lifecycle Method Annotation
#### Part One
> @BeforeEach
- this above annotation we can use if we want to do anything before each test case
> @AfterEach
- this above annotation we can if we want to do anything after after each test case ()if we want to release some resource
- Note : remember that these above annotations will be executed before and after of each test cases in a class.
- For example if we have two test cases in a class then @BeforeEach and @AfterEach methods will be called twice that means before each test case.
- To demonstrate these annotations I have created LifeCycleAnnotations.java and LifeCycleAnnotationsTest.java 

#### Part Two
> @BeforeAll
- this above annotation we can use if want a method to be executed only once, before all test methods/cases
- For Example: This is useful for getting database connections, connecting to servers

> @AfterAll
- this above annotation we can use if want a method to be executed only once, after all test methods/cases
- For Example: This is useful for releasing database connections, disconnecting to servers

- Note: @BeforeAll and @AfterAll both the methods should be static because these will call once so it should belongs to class

- Sequence will be :
  1. @BeforeAll
  2. @BeforeEach
  3. @Test Method One
  4. @AfterEach
  5. @BeforeEach
  6. @TestMethodTwo
  7. @AfterEach
  8. @AfterAll

  - to show this example I have created LifeCycleAnnotationsAll.java and LifeCycleAnnotationsAllTest.java

### Display Name Generator
- Every test is having a name same as method name.
- If you run a test case then it will show the same name as method name.
- When you have multiple test cases in different classes then display names becomes more important to idetify the test cases.
- Two Java Test class can have same method name so to identify these things we have Display Name Generator in Junit.
- To use display name generator we have Jnuit provide the annotation wherein we can use any Generator class, see the example below
  > @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
- So we have multiple Display Name Generators available in Jnuit , some of them we can see below

#### Replace Underscores Generator
- As mentioned in above example if we use the below annotation with class and use the ReplaceUnderscores class of  DisplayNameGenerator class then uerscore (_) symbol in all test methods names will replace by space.
  > @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
- Check the DisplayNameGenerator_ReplaceUnderscores.java class for the example.

#### Indictive Sentences Generator
- We can use this generator as below
  > @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
- If we use this generator then all the test case methods name will display along the class name.
- This Generator is usefull to identify the test cases of same name in different classes.
- Check the DisplayNameGenerator_IndictiveSentences.java class for the example.

#### Simple Generator
- We can use this generator as below
  > @DisplayNameGeneration(DisplayNameGenerator.Simple.class).
- It is used to Remove trailing parentheses () from test method name.
- Check the DisplayNameGenerator_Simple.java class for the example.