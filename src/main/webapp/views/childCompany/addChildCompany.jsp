<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="/css/all.css">

<form:form cssStyle="margin-top: 2%" modelAttribute="addChildCompany" method="post" >
<span>Name</span><form:input path="childName"/>
<span>value</span><form:input path="childValue"/>

<form:select path="company" items="${company}" itemLabel="name" itemValue="id" />


<button>add</button>
</form:form>


<ol>
<c:forEach var="sl" items="${companyChild}">
    <li>${sl.childName}, ${sl.childValue} $, ( ${sl.company.name})
        <a href="/deleteChildCompany/${sl.id}">del</a>
        <a href="/updateChildCompany/${sl.id}"> update </a></li>
</c:forEach>
</ol>

























