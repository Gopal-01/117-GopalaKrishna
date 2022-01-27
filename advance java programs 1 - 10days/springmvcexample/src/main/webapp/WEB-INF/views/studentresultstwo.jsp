<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>..............Submitted Student two information .......</h2>
      <table>
         <tr>
            <td>Name of the student two:</td>
            <td>${name1}</td>
         </tr>
         <tr>
            <td>student two Age:</td>
            <td>${age1}</td>
         </tr>
         <tr>
            <td>student ID:</td>
            <td>${id}</td>
         </tr>
      </table>  
   </body>
   
</html>
