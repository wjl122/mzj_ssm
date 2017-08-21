$(document).ready(function(){
	var H=window.screen.height;
	var W=window.screen.width;
	var point;
	$(".nav>li").hover(
		function(){
			$(this).find(".chiNav").slideDown("slow");
		},
		function(){
			$(this).find(".chiNav").slideDown("slow").stop();
			$(this).find(".chiNav").slideUp("slow");
		}
	);
	//关于品牌的图片区域
	var len=$(".imgUl li").length;
	for(var i=1;i<=len;i++){
		$(".imgIndex").append("<li>"+i+"</li>");
	}
	$(".imgIndex li:eq(0)").addClass("sel");
	$(".imgIndex li").live('click',function(){
		var index=$(this).index();
		$(".imgUl li").fadeOut();
		$(".imgUl li:eq("+index+")").fadeIn("slow");
		$(".imgIndex li").removeClass("sel");
		$(this).addClass("sel");
	});
	for(var i=0;i<$(".proList li").length;i++){
		if(i%3==0){$(".proList li:eq("+i+")").css("margin-left",0);}
	}
	
	$(".transparent").css("height",H);
	$(".viewImg").css("left",(W-800)/2+'px');
	
	$(".proList li").click(function(){
		point=$(this).index();
		$(".transparent").fadeIn("slow");
		$(".viewImg").fadeIn("slow");
		var path=$(this).find("img").attr("src");
		$(".viewImg").find("img").attr("src",path);
	});
	$(".transparent").click(function(){
		$(this).fadeOut("slow");
		$(".viewImg").fadeOut("slow");
	});
	
	$(".up").click(function(){
		if(point==0){alert("已到最前");}
		else{
			point-=1;
			var path=$(".proList li:eq("+point+")").find("img").attr("src");
		    $(".viewImg").find("img").attr("src",path);
		}
	});
	
	$(".down").click(function(){
		var len=$(".proList li").length;
		if(point==(len-1)){alert("已到最后");}
		else{
			point+=1;
			var path=$(".proList li:eq("+point+")").find("img").attr("src");
		    $(".viewImg").find("img").attr("src",path);
		}
	});
});
	

