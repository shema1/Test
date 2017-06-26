<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 26.06.2017
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/css/addCompany.css">
<%--<form:form modelAttribute="curentChildCompany" action="/updateChildCompany/${curentChildCompany.id}"  method="post"  >--%>

    <%--<form:input path="name" value="${curentCompany.childName}"></form:input>--%>
    <%--<button>update</button>--%>
<%--</form:form>--%>

<form:form modelAttribute="childCompany" action="/updateChildCompany/${childCompany.id}">
        <form:input path="childName" value="${childCompany.childName}"></form:input>
    <button>update</button>
</form:form>