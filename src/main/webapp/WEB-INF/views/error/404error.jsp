<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>존재하지 않는 물품</title>
</head>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

<style>
.fa {
	align-content: center;
}

.clearfix:before,
.clearfix:after {
    display: table;

    content: ' ';
}
.clearfix:after {
    clear: both;
}
body {
    background: #f0f0f0 !important;
}
.page-404 .outer {
    position: absolute;
    top: 0;

    display: table;

    width: 100%;
    height: 100%;
}
.page-404 .outer .middle {
    display: table-cell;

    vertical-align: middle;
}
.page-404 .outer .middle .inner {
    width: 350px;
    margin-right: auto;
    margin-left: auto;
}
.page-404 .outer .middle .inner .inner-circle {
    height: 350px;

    border-radius: 50%;
    background-color: #ffffff;
}
.page-404 .outer .middle .inner .inner-circle:hover i {
    color: #3F51A1!important;
    background-color: #f5f5f5;
    box-shadow: 0 0 0 15px #3F51A1;
    cursor: pointer;
}
.page-404 .outer .middle .inner .inner-circle:hover span {
    /* color: #3F51A1; */
    color: #DCF343;
}
.page-404 .outer .middle .inner .inner-circle i {
    font-size: 5em;
    line-height: 1em;

    float: right;

    width: 1.6em;
    height: 1.6em;
    margin-top: -.7em;
    margin-right: -.5em;
    padding: 20px;

    -webkit-transition: all .4s;
            transition: all .4s;
    text-align: center;

    color: #f5f5f5!important;
    border-radius: 50%;
    background-color: #3F51A1;
    box-shadow: 0 0 0 15px #f0f0f0;
}
.page-404 .outer .middle .inner .inner-circle span {
    font-size: 10em;
    font-weight: 700;
    line-height: 1.2em;

    display: block;

    -webkit-transition: all .4s;
            transition: all .4s;
    text-align: center;

    color: #e0e0e0;
}
.page-404 .outer .middle .inner .inner-status {
    font-size: 28px;
    font-weight: bold;

    display: block;

    margin-top: 20px;
    margin-bottom: 5px;

    text-align: center;

    /* color: #39bbdb; */
    color: #ABC3FF;
}
.page-404 .outer .middle .inner .inner-detail {
    line-height: 2.2em;

    display: block;

    margin-bottom: 10px;

    text-align: center;

    color: #999999;
}
</style>

<body>
<div class="page-404">
    <div class="outer">
        <div class="middle">
            <div class="inner">
                <!--BEGIN CONTENT-->
                <div class="inner-circle"><i class="fa fa-home" onclick="gohome()"></i><span>404</span></div>
                <span class="inner-status">지정하신 경로를 찾을 수 없습니다.</span>
                <span class="inner-detail">
                    집 아이콘을 클릭해 메인으로 돌아가세요!
                </span>
            </div>
        </div>
    </div>
</div>

<script>
function gohome() {
    window.location.href = '${path}/heehee/main';
}
</script>
</body>
</html>