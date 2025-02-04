
//登录
function checkLogin(){
    var username= document.login.username.value;
    var pass= document.login.pass.value;
    if(username==""||username.length<0){
        alert("请输入账号!");
        return false;
    }else if(pass==""||pass.length<0){
        alert("请输入密码!");
        return  false;
    }else{
        //表单提交
        document.login.submit();
    }
}
//注册
function checkRegdit(){
    var username= document.regdit.username.value;
    var pass= document.regdit.password.value;
    if(username==""||username.length<0){
        alert("请输入账号!");
        return false;
    }else  if(pass==""||pass.length<0){
        alert("请输入密码!");
        return  false;
    }else{
        //表单提交
        document.regdit.submit();
    }
    /* var patter =/^[a-zA-Z0-9_-]{4,16}$/;
     if(patter.test(username)){

     }*/

}