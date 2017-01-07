<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
    <asset:javascript src="application.js"/>
    <script>
    $(document).ready(function () {
        var url = "/user/getuser";
        $.ajax({
            url: url,
            success: function (result) {
                $("#age").val(result.age); //JQuery selector
                $("#height").val(result.height); //JQuery selector
                $("#description").val(result.description); //JQuery selector
            },
            failure: function (result) {
                alert("Failure!")
            }
        });
    }); //Run function at end of page load
</script>
</head>
<body>
<g:form name="UpdateForm" url="[controller: 'user', action: 'update']">
    <g:hiddenField name="id" value="${params.id}"/>
    <label>Age</label>
    <g:textField name="age" id="age"/>
    <br>
    <label>Height</label>
    <g:textField name="height" id="height"/>
    <br>
    <label>Description</label>
    <g:textArea name="description" id="description"/>
    <br>
    <g:actionSubmit value="Submit" action="update"/>
</g:form>
</body>
</html>