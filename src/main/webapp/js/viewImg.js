$(function(){
	l=$(".smallimg li").length;
	$(".smallimg li:gt(6)").hide();
	var path=$(".smallimg li:eq(0)").find("img").attr("src");
	$(".bigimg").attr("src",path);
	
	$(".next").click(function(){
		var ei=$(".smallimg li:visible").last().index();
		var si=$(".smallimg li:visible").first().index();
		if(ei==(l-1)){alert("已到最后!");}
		else{
			var e=ei+1;
			var s=si+1;
			$(".smallimg li").show();
			$(".smallimg li:lt("+s+")").hide();
			$(".smallimg li:gt("+e+")").hide();
		}
	});
	
	$(".prev").click(function(){
		var ei=$(".smallimg li:visible").last().index();
		var si=$(".smallimg li:visible").first().index();
		if(si==0){alert("已在最前");}
		else{
			var e=ei-1;
			var s=si-1;
			$(".smallimg li").show();
			$(".smallimg li:lt("+s+")").hide();
			$(".smallimg li:gt("+e+")").hide();
		}
	});
	
	$(".smallimg li").click(function(){
		var path=$(this).find("img").attr("src");
	    $(".bigimg").attr("src",path);
	});
})
