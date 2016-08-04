<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../../common/jsp/common.jsp"%>
<html>
<head>
    <title>hello</title>



</head>

<style>

    body {
        padding: 0;
    }

    div {

    }

    .container {
        margin: 0 auto;
        width: 980px;
        height: 600px;

    }

    .header {
        width: 100%;
        height: 100px;
        margin-top: 10px;
        border: 1px solid #abcdef;
    }

    .content {
        margin-top: 10px;
    }
    .content .content-left {
        float: left;
        width: 200px;
        height: 400px;
        border: 1px solid #abcdef;
    }

    .content .content-right {
        float: left;
        width: 500px;
        height: 400px;
        border: 1px solid #abcdef;
        margin-left: 50px;

    }


</style>

<body>


<div class="container">


    <div class="header">

        <h5>this is a header</h5>

    </div>
    <div class="content">
        <div class="content-left">
            <h5>this is a left</h5>
        </div>
        <div class="content-right">
            <h5>this is a right</h5>

        </div>
    </div>


</div>
<script type="text/javascript"  src="${ctx}/common/js/jquery-1.9.1.min.js" ></script>
<script type="text/javascript" src="${ctx}/common/js/public/student.js"></script>
<script type="text/javascript" src="${ctx}/common/js/utils.js"></script>

</body>
</html>
