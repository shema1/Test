<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 26.06.2017
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<link rel="stylesheet" href="/css/all.css">


<form:form modelAttribute="childCompany" action="/updateChildCompany/${childCompany.id}">
       <span>Name</span> <form:input path="childName" value="${childCompany.childName}"></form:input>
        <span>value</span><form:input path="childValue" value="${childCompany.childValue}"></form:input>
    <button>update</button>
</form:form>