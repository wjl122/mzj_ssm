package com.mzj.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mzj.dao.FriendLinksDao;
import com.mzj.model.FriendLinksModel;
import com.mzj.model.NewdsModel;
import com.mzj.model.PicturesModel;
import com.mzj.model.ShowIndexesModel;
import com.mzj.service.FriendLinkService;
import com.mzj.service.NewdsService;
import com.mzj.service.PicturesService;
import com.mzj.service.ShowIndexesService;



@Controller
@RequestMapping("/home")
public class HomeController {
   private Logger logger=LoggerFactory.getLogger(this.getClass());
   
   @Autowired
   private FriendLinkService friendLinkService;   
   @Autowired
   private PicturesService picturesService;
   @Autowired
   private ShowIndexesService showIndexesService;
   @Autowired 
   private NewdsService newdsService;
   @RequestMapping(value="/index",method=RequestMethod.GET)
   private String index(Model model) {
	   System.out.println("hellpo");
	   
	   List<PicturesModel> pictureList=picturesService.getListByType("首页图片");
	   List<ShowIndexesModel> showIndexNews=showIndexesService.getListByType("新闻资讯");
	   List<ShowIndexesModel> showIndexBuss=showIndexesService.getListByType("招商联盟");
	   List<ShowIndexesModel> showIndexPub=showIndexesService.getListByType("公众微信");
	   List<ShowIndexesModel> showIndexContact=showIndexesService.getListByType("关于我们");	   	   
	   List<NewdsModel> newsList=newdsService.getList();	   
	   List<FriendLinksModel> friendList=friendLinkService.getList();  
	   
	   model.addAttribute("pictureList",pictureList);
	   
	   model.addAttribute("friendList",friendList);
	   
	   
	   model.addAttribute("showIndexNews",showIndexNews);
	   model.addAttribute("showIndexBuss",showIndexBuss);
	   model.addAttribute("showIndexPub",showIndexPub);
	   model.addAttribute("showIndexContact",showIndexContact);
	   model.addAttribute("newsList",newsList);
	   return "/home/index";
   }
}
