/**
 * 
 *//*

$(document).ready(function() {
	$("input:radio[name='pay_channel_type']").click(function() {
		var checkVal = $("input:radio[name='pay_channel_type']:checked").val();
		alert(checkVal);
		
		$.ajax({
			type : 'POST',
			url : '/servlet/pingpp/pay',
			data : {id:'1'},
			success : function(){
				alert("abc");
			},
			dataType : "json"
		});
	});
});
*/

function payclick(channel){
	$.ajax({
		type : 'POST',
		url : 'servlet/pingpp/pay',
		data : {channel:channel},
		success : function(response){
			if(channel==='wx_pub_qr'){
//				$('#qrcode').qrcode(response.charge);
			}else{
				pingppPc.createPayment(response.charge, function(result, err){
					// 处理错误信息
//					alert(err);
					console.log(err);
//					alert("pay failed");
				});
			}
			
//			alert(response.charge);
		},
		dataType : "json"
	});
}