<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 23.06.2017
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/css/all.css">
<form:form modelAttribute="curentCompany" action="/updateCompany/${curentCompany.id}"  method="post"  >
    <span>Company name</span><form:input   path="name" />
    <span>value</span><form:input   path="value" />
    <button>update</button>
</form:form>
