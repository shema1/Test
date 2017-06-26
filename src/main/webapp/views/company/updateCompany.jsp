<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 23.06.2017
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/css/addCompany.css">
<form:form modelAttribute="curentCompany" action="/updateCompany/${curentCompany.id}"  method="post"  >

    <form:input path="name" value="${curentCompany.name}"></form:input>
    <button>update</button>
</form:form>
