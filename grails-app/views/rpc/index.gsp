<html>

<head>
    <title>RPC</title>
    <meta name="layout" content="main" />
</head>

<body>

<g:if test="${flash.message}">
    <div>${flash.message}</div>
</g:if>

<h1>RPC</h1>

<g:form action="send">
    <div>routing key: <g:textField name="key"/></div>
    <div>messsage: <g:textField name="message"/></div>
    <div><g:submitButton name="send" value="send"/></div>
</g:form>

</body>

</html>
