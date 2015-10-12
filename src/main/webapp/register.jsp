<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员注册</title>
<link href="statics/css/base.css" rel="stylesheet">
<script type="text/javascript" src="statics/js/jquery-1.11.3.min.js"></script>
<!--[if lt IE 9]>
<script src="statics/js/html5shiv.js"></script>
<![endif]-->
<script type="text/javascript" src="static/js/jquery-html5Validate.js"></script>
</head>
<body id="login_body">
<div class="login_top_btn"><a class="btn" href="login.jsp">立即登录</a></div>
<section class="reg_box">
	<form class="register-form" action="user/add" method="post">
                   		<div class="logo_icon"></div>
						<div class="logo_text">【会员注册】</div>
       <div class="form_body">
          <div class="control-group">
            <label class="control-label" for="nickname">用户昵称</label>
            <div class="controls">
              <input type="text" id="nickname" class="span3" placeholder="请输入昵称" nullmsg="请填写昵称" value="" name="nickname" required>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="realName">真实姓名</label>
            <div class="controls">
              <input type="text" id="realName" class="span3" placeholder="请输入真实姓名" nullmsg="请填写真实姓名" value="" name="realName" required>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="inputPassword">密 码</label>
            <div class="controls">
              <input type="password" id="inputPassword"  class="span3" placeholder="请输入密码" nullmsg="请填写密码" name="password" required>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="repassword">确认密码</label>
            <div class="controls">
              <input type="password" id="repassword" class="span3" placeholder="请再次输入密码" nullmsg="请填确认密码" name="repassword" required>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="inputMoble">手机号码</label>
            <div class="controls">
              <input type="text" id="inputMobile" class="span3" placeholder="请输入手机号码" nullmsg="请填写手机号码" value="" name="mobile" required>
            </div>
          </div>     
          <div class="control-group">
            <label class="control-label" for="inputEmail">邮箱</label>
            <div class="controls">
              <input type="email" id="inputEmail" class="span3" placeholder="请输入电子邮件" nullmsg="请填写邮箱" value="" name="email" required>
            </div>
          </div>      
          <div class="control-group">
          	<label class="control-label">&nbsp;</label>
            <div class="controls">
              <button type="submit" class="btn btn-large">注 册</button>
            </div>
          </div>
      </div>
    </form>
</section>
</body>
<script type="text/javascript">
	$("register-form").html5Validate(function(){
		alert("注册成功！");
	});
</script>
</html>