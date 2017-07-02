<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="/css/all.css">


<form:form modelAttribute="childCompany" action="/updateChildCompany/${childCompany.id}">
       <span>Name</span> <form:input path="childName" value="${childCompany.childName}"></form:input>
        <span>value</span><form:input path="childValue" value="${childCompany.childValue}"></form:input>
    <button>update</button>
</form:form>