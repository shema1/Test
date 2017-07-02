<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="q" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="/css/all.css">



<form:form cssStyle="margin-top: 2%" modelAttribute="addCompany" action="/addCompany"  method="post">
    <span>Company name</span><form:input   path="name" />
    <span>value</span><form:input   path="value" />
    <button>add</button>
</form:form>


<ol>
    <q:forEach var="com" items="${Company}">
        <li>${com.name}, ${com.value}  <a href="/deleteCompany/${com.id}"> delete </a>
            <a href="/updateCompany/${com.id}"> update </a>
        </li>

    </q:forEach>
</ol>
