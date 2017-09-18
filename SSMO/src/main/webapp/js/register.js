var name_is_ok=0;
var pwd_is_ok=0;
var email_is_ok=0;

$('#username').blur(function(){
	var username = $('#username').val();
	if(username.trim() == ""){
		$('#warning_name_no').show();
		$('#warning_name_yes').hide();
		name_is_ok=0;
	}else{
		$('#warning_name_no').hide();
		$('#warning_name_yes').show();
		name_is_ok=1;
	}
});

$('#again_password').blur(function(){
	var password = $('#password').val();
		var again_password = $('#again_password').val();
		if(again_password != password){
			/*console.log("不一样");*/
			$('#warning_pwd_no').show();
			$('#warning_pwd_yes').hide();
			
			pwd_is_ok=0;
		}else{
			/*console.log("一样");*/
			$('#warning_pwd_no').hide();
			
			$('#warning_pwd_yes').show();
			pwd_is_ok=1;
		}
	});
	
	$('#email').blur(function(){
		var true_email = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		var email = $('#email').val();
		if(!true_email.test(email)){
			$('#warning_email_no').show();
			$('#warning_email_yes').hide();
			email_is_ok=0;
		}else{
			$('#warning_email_no').hide();
			$('#warning_email_yes').show();
			email_is_ok=1;
			
		}
		if((name_is_ok+pwd_is_ok+email_is_ok) == 3){
			$('#register').attr("disabled",false);
		}else{
			$('#register').attr("disabled",true);
		}
	});
	
	
	
	$('#register').click(function(){
		alert("注册成功！")
	});