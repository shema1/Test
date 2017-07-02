<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="/css/all.css">
<form:form modelAttribute="curentCompany" action="/updateCompany/${curentCompany.id}"  method="post"  >
    <span>Company name</span><form:input   path="name" />
    <span>value</span><form:input   path="value" />
    <button>update</button>
</form:form>
