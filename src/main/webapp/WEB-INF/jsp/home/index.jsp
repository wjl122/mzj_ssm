<%@include file="../homePage/head.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>木之家</title>
<link href="${basePath}/css/muStyle.css" type="text/css"
	rel="stylesheet" />
<link href="${basePath}/css/movepic.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript" src="${basePath}/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${basePath}/js/ellipsis.js"></script>
<script type="text/javascript" src="${basePath}/js/muScript.js"></script>
<script type="text/javascript" src="${basePath}/js/movepic.js"></script>
</head>
<body>

	<div class="main">
		<div class="content">
			<div class="slide" id="slide">
				<div class="img-div">
					<c:choose>
						<c:when test="${pictureList.size()>0}">
							<c:forEach items="#{pictureList}" var="um" begin="0" end="3">
								<img src="um.pictures" />
							</c:forEach>
						</c:when>
						<c:otherwise>
							<img src="" alt="没有找到图片" />
						</c:otherwise>
					</c:choose>

				</div>
				<div class="slide-btn">
					<a href="#" class="hover">●</a> <a href="#">●</a> <a href="#">●</a>
				</div>
			</div>
		</div>
		<img src="${basePath}/img/img1.png" class="img">

		<ul class="opType">
			<li>
				<div class="ellpsis">
					<a href=""> <c:forEach items="${showIndexContact }" var="um"
							begin="0" end="1">
					      ${um.title}
					   </c:forEach>
					</a>
				</div>
			</li>
			<li>

				<div>
					<c:forEach items="${newsList}" var="um" begin="0" end="3">
						<p>
							<a href="~/News/NewsDetails?id=@a.Id" class="ellpsis">${um.title}</a>
						</p>
					</c:forEach>

				</div>
			</li>
			<li>
				<div class="ellpsis">
					<a href="@Url.Action("Agents","Agent")"> <c:forEach
							items="${showIndexBuss }" var="um" begin="0" end="1">
					      ${um.title}
					   </c:forEach></a>
				</div>
			</li>
			<li>
				<div>
					<p>
						<c:forEach items="${showIndexPub }" var="um" begin="0" end="1">
					      ${um.title}
					   </c:forEach>
					</p>
				</div>
			</li>

		</ul>
		<script>
                $(".opType li>.ellpsis").ellipsis(90);
                $(".opType li div p .ellpsis").ellipsis(15);
            </script>
		<ul class="friendlyLink">
			<li>友情链接:</li>
			<c:forEach items="${friendList}" var="um">
				<li><a target="_blank" href="${um.urls}">${um.name}</a></li>
			</c:forEach>
		</ul>
	</div>
	<script type="text/javascript">
            var zBase = {
                config: {
                    index: 0,
                    auto: true,
                    direct: 'left'
                },
                init: function () {
                    this.slide = this.$id('slide');
                    this.img_div = this.$c('img-div')[0],
                        this.slide_btn = this.$tag('a', this.$c('slide-btn')[0]);
                    this.img_arr = this.$tag('img', this.img_div);
                    if (this.config.auto) this.play();
                    this.hover();
                },
                $id: function (id) { return document.getElementById(id); },
                $tag: function (tagName, obj) { return (obj ? obj : document).getElementsByTagName(tagName); },
                $c: function (claN, obj) {
                    var tag = this.$tag('*'), reg = new RegExp('(^|\\s)' + claN + '(\\s|$)'), arr = [];
                    for (var i = 0; i < tag.length; i++) {
                        if (reg.test(tag[i].className)) {
                            arr.push(tag[i]);
                        }
                    }
                    return arr;
                },
                $add: function (obj, claN) {
                    reg = new RegExp('(^|\\s)' + claN + '(\\s|$)');
                    if (!reg.test(obj.className)) {

                        obj.className += ' ' + claN;
                    }
                },
                $remve: function (obj, claN) { var cla = obj.className, reg = "/\\s*" + claN + "\\b/g"; obj.className = cla ? cla.replace(eval(reg), '') : '' },
                css: function (obj, attr, value) {
                    if (value) {
                        obj.style[attr] = value;
                    } else {
                        return typeof window.getComputedStyle != 'undefined' ? window.getComputedStyle(obj, null)[attr] : obj.currentStyle[attr];
                    }
                },
                animate: function (obj, attr, val) {
                    var d = 1000;//动画时间一秒完成。
                    if (obj[attr + 'timer']) clearInterval(obj[attr + 'timer']);
                    var start = parseInt(zBase.css(obj, attr));//动画开始位置
                    //space = 动画结束位置-动画开始位置，即动画要运动的距离。
                    var space = val - start, st = (new Date).getTime(), m = space > 0 ? 'ceil' : 'floor';
                    obj[attr + 'timer'] = setInterval(function () {
                        var t = (new Date).getTime() - st;//表示运行了多少时间，
                        if (t < d) {//如果运行时间小于动画时间
                            zBase.css(obj, attr, Math[m](zBase.easing['easeOut'](t, start, space, d)) + 'px');
                        } else {
                            clearInterval(obj[attr + 'timer']);
                            zBase.css(obj, attr, top + space + 'px');
                        }
                    }, 20);
                },
                play: function () {
                    this.slide.timer = setInterval(function () {
                        zBase.config.index++;
                        if (zBase.config.index >= zBase.img_arr.length) zBase.config.index = 0;//如果当前索引大于图片总数，把索引设置0

                        zBase.animate(zBase.img_div, zBase.config.direct, -zBase.config.index * 1100);
                        for (var j = 0; j < zBase.slide_btn.length; j++) {
                            zBase.$remve(zBase.slide_btn[j], 'hover');
                        }
                        zBase.$add(zBase.slide_btn[zBase.config.index], 'hover');

                    }, 4000)


                },
                hover: function () {
                    for (var i = 0; i < this.slide_btn.length; i++) {
                        this.slide_btn[i].index = i;//储存每个导航的索引值
                        this.slide_btn[i].onmouseover = function () {
                            if (zBase.slide.timer) clearInterval(zBase.slide.timer);
                            zBase.config.index = this.index;

                            for (var j = 0; j < zBase.slide_btn.length; j++) {
                                zBase.$remve(zBase.slide_btn[j], 'hover');
                            }
                            zBase.$add(zBase.slide_btn[zBase.config.index], 'hover');
                            zBase.animate(zBase.img_div, zBase.config.direct, -zBase.config.index * 1100);
                        }
                        this.slide_btn[i].onmouseout = function () {
                            zBase.play();
                        }
                    }
                },
                easing: {
                    linear: function (t, b, c, d) { return c * t / d + b; },
                    swing: function (t, b, c, d) { return -c / 2 * (Math.cos(Math.PI * t / d) - 1) + b; },
                    easeIn: function (t, b, c, d) { return c * (t /= d) * t * t * t + b; },
                    easeOut: function (t, b, c, d) { return -c * ((t = t / d - 1) * t * t * t - 1) + b; },
                    easeInOut: function (t, b, c, d) { return ((t /= d / 2) < 1) ? (c / 2 * t * t * t * t + b) : (-c / 2 * ((t -= 2) * t * t * t - 2) + b); }
                }
            }

            zBase.init();


        </script>
</body>
</html>

<%@include file="../homePage/foot.jsp"%>