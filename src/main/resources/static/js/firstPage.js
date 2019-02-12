$(function(){
    let urlHead = "http://localhost:8080";
    init();
    $("#commit").click(commit);
    function commit(){
        let url = urlHead +"/commitToken";
        let token =  $("#token_input").val();
        requestFormAjax(url,"GET",true,"token="+token);
        window.location.reload();
    }
    function getCurrToken(){
        let url = urlHead +"/getCurrToken";
        let result = requestFormAjax(url,"GET",false,"");
        if(result.token){
            $("#token_value").html(result.token);
        }
    }

    function init(){
        getCurrToken();
    }
    /**
     *  ajax请求 的封装
     * @param url 请求路径
     * @param type 请求的类型..get post
     * @param async 是否同步
     * @param data 请求的参数
     * @returns {*} 返回的结果
     */
    function requestFormAjax(url,type,async,data){
        let result;
        $.ajax({
            url:url,
            type:type,
            data:data,
            async:async,
            contentType: "application/json",
            success:function(data){
                if( data != null && data != ""){
                    result =  eval('(' + data + ')');
                }
            }
        })
        return result;
    }



})
