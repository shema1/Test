<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 23.06.2017
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form modelAttribute="update"   >
    <form:input path="name" value="${update.name}" />

    <button>add</button>
</form:form>
