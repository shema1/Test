<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykola
  Date: 22.06.2017
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/css/addChildCompany.css">

<form:form cssStyle="margin-top: 2%" modelAttribute="addChildCompany" method="post" >
<form:input path="childName"/>
<form:input path="childValue"/>
<form:select path="company" items="${company}" itemLabel="name" itemValue="id" />


<button>add</button>
</form:form>



<%--<form:form modelAttribute="addChildCompany" method="post">--%>
    <%--<form:input path="childName"/>--%>
    <%--<form:input path="childValue"/>--%>
    <%--<select name="ch">--%>
        <%--<c:forEach var="ch" items="${company}">--%>

            <%--<option value="${ch.id}">${ch.name}</option>--%>
        <%--</c:forEach>--%>
    <%--</select>--%>

    <%--<button>add</button>--%>


<%--</form:form>--%>
<ol>
<c:forEach var="sl" items="${companyChild}">
    <li>${sl.childName} <a href="/deleteChildCompany/${sl.id}">del</a></li>
</c:forEach>
</ol>


<%--<ol>--%>
<%--<c:forEach var="a" items="${company}">--%>
    <%--<li>${a.name} ${a.companies} </li>--%>
    <%--<c:forEach var="sl" items="${companyChild}">--%>
        <%--<li>${sl.childName} <a href="/deleteChildCompany/${sl.id}">del</a></li>--%>
    <%--</c:forEach>--%>
<%--</c:forEach>--%>
<%--</ol>--%>

<%--<ol>--%>
    <%--<c:forEach var="b" items="${companyChild}">--%>
        <%--<li>${b.company}</li>--%>
        <%--&lt;%&ndash;<c:forEach var="i" items="${b.company.}"></c:forEach>&ndash;%&gt;--%>

    <%--</c:forEach>--%>
<%--</ol>--%>






















