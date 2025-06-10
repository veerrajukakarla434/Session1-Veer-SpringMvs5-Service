# Spring MVC 5 

#### Web Application :
* A web application is a computer program that utilizes web browsers and web technology to perform tasks over the Internet.

#### How can we develop web application using java frame works:
 
* Using Servlet's   ---> Servlet  class 
* Using Strut's    ----> ActionServlet class
* Using Spring    -----> DispatcherServlet class

#### Spring MVC Flow

* In Spring Web MVC, DispatcherServlet class works as the front controller. It is responsible to manage the flow of the spring mvc application.
* The @Controller annotation is used to mark the class as the controller in Spring 3.
* The @RequestMapping annotation is used to map the request url. It is applied on the method.

#### Diagram

![image](https://github.com/user-attachments/assets/fcf469cc-1ed6-4409-ba3c-a1cf2521b698)


#### Spring MVC Execution Flow

* **Step 1:** First request will be received by DispatcherServlet.

* **Step 2:**  DispatcherServlet will take the help of HandlerMapping and get to know the Controller class name associated with the given request.

* **Step 3:** So request transfer to the Controller, and then controller will process the request by executing appropriate methods and returns ModelAndView object (contains Model data and View name) back to the DispatcherServlet.

* **Step 4:** Now DispatcherServlet send the model object to the ViewResolver to get the actual view page.

* **Step 5:** Finally DispatcherServlet will pass the Model object to the View page to display the result.
#### Prerequisite For This Application (Spring MVC)

  * Spring MVC
  * Maven 3.x
  * Tomcat Server 8 or 9
  * Eclipse/STS tool
  * Postman / Chrome to test this application
  
  
