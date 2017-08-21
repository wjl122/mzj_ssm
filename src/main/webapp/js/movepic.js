$(function(){
	var len2=$(".img-div").find("img").length;
	$(".img-div").css("width",len2*1100+'px');
//	var len=$(".picUl>li").length;
//	var width=len*1100;
//	n=0;
//	$(".picUl").css("width",width+'px');
//	for(var i=0;i<len;i++){
//		$(".picIndex").append("<li></li>");
//	}
//	window.onload=function(){
////		初始化
//		$(".picIndex li:eq(0)").addClass("sel");
////		$(".picIndex li:first").addClass("sel");
//		var w=$(".picIndex").width();
//		$(".picIndex").css("left",(1100-w)/2+'px');
//		//自动调用图片轮播
//		auto();
//	}
//	function auto(){
//		setInterval(movepic,4000);
//	}
//	function movepic(){
//		$(".picIndex li").removeClass("sel");
//		n=n+1;
//		if(n==len){
//			n=0;
//			$(".picIndex li:eq("+n+")").addClass("sel");
//		}
//		else{
//			$(".picIndex li:eq("+n+")").addClass("sel");
//		}
//		$(".picUl").animate({left:-1100+'px'},1000,
//			function(){
//				$(".picUl li").first().insertAfter($(".picUl li").last());
//				$(".picUl").css("left",0);
//			}
//		)
//	}
	//点击索引事件
//	$(".picIndex li").click(function(){
//		var current=$(this).index();
//		if(current>n){
//			$(".picUl").animate({left:-(current-n)*1100+'px'},1000);
//			n=current;
//			$(".picIndex li").removeClass("sel");
//			$(".picIndex li:eq("+n+")").addClass("sel");
//		}
//	});
});
