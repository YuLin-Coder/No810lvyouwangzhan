<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

var menus = [

	{
        "backMenu":[
		
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"用户管理",
                        "menuJump":"列表",
                        "tableName":"yonghu"
                    }
                ],
                "menu":"用户管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"轮播图管理",
                        "menuJump":"列表",
                        "tableName":"config"
                    }
                ],
                "menu":"轮播图管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"飞机票管理",
                        "menuJump":"列表",
                        "tableName":"feijipiao"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"飞机票收藏管理",
                        "menuJump":"列表",
                        "tableName":"feijipiaoCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"飞机票订单管理",
                        "menuJump":"列表",
                        "tableName":"feijipiaoOrder"
                     }
                ],
                "menu":"飞机票管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"火车票管理",
                        "menuJump":"列表",
                        "tableName":"huochepiao"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"火车票收藏管理",
                        "menuJump":"列表",
                        "tableName":"huochepiaoCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"火车票订单管理",
                        "menuJump":"列表",
                        "tableName":"huochepiaoOrder"
                     }
                ],
                "menu":"火车票管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"景点管理",
                        "menuJump":"列表",
                        "tableName":"jingdian"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "修改",
                            "删除"
                        ],
                        "menu":"景点留言管理",
                        "menuJump":"列表",
                        "tableName":"jingdianLiuyan"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"景点收藏管理",
                        "menuJump":"列表",
                        "tableName":"jingdianCollection"
                    }
                ],
                "menu":"景点管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"酒店管理",
                        "menuJump":"列表",
                        "tableName":"jiudian"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "修改",
                            "删除"
                        ],
                        "menu":"酒店留言管理",
                        "menuJump":"列表",
                        "tableName":"jiudianLiuyan"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"酒店收藏管理",
                        "menuJump":"列表",
                        "tableName":"jiudianCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"酒店订单管理",
                        "menuJump":"列表",
                        "tableName":"jiudianOrder"
                     }
                ],
                "menu":"酒店管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"新闻管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"新闻管理"
            }
            ,{
                "child":[
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"飞机管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryFeiji"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"飞机型号管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryFeijipiaoXinghao"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"火车管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryHuochepiao"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"火车型号管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryHuochepiaoXinghao"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"景点类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryJingdian"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"景点等级管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryJingdianDengji"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"酒店星级管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryJiudian"
                    }
                    ,
                     {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"新闻类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryNews"
                    }

                ],
                "menu":"基础数据管理"
            }
        ],
        "frontMenu":[

        ],
        "roleName":"管理员",
        "tableName":"users"
    }
	,{
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"飞机票管理",
                        "menuJump":"列表",
                        "tableName":"feijipiao"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"飞机票收藏管理",
                        "menuJump":"列表",
                        "tableName":"feijipiaoCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"飞机票订单管理",
                        "menuJump":"列表",
                        "tableName":"feijipiaoOrder"
                     }
                ],
                "menu":"飞机票管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"火车票管理",
                        "menuJump":"列表",
                        "tableName":"huochepiao"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"火车票收藏管理",
                        "menuJump":"列表",
                        "tableName":"huochepiaoCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"火车票订单管理",
                        "menuJump":"列表",
                        "tableName":"huochepiaoOrder"
                     }
                ],
                "menu":"火车票管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"景点管理",
                        "menuJump":"列表",
                        "tableName":"jingdian"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "修改",
                            "删除"
                        ],
                        "menu":"景点留言管理",
                        "menuJump":"列表",
                        "tableName":"jingdianLiuyan"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"景点收藏管理",
                        "menuJump":"列表",
                        "tableName":"jingdianCollection"
                    }
                ],
                "menu":"景点管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"酒店管理",
                        "menuJump":"列表",
                        "tableName":"jiudian"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "修改",
                            "删除"
                        ],
                        "menu":"酒店留言管理",
                        "menuJump":"列表",
                        "tableName":"jiudianLiuyan"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"酒店收藏管理",
                        "menuJump":"列表",
                        "tableName":"jiudianCollection"
                    }
                     ,
                     {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"酒店订单管理",
                        "menuJump":"列表",
                        "tableName":"jiudianOrder"
                     }
                ],
                "menu":"酒店管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"新闻管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"新闻管理"
            }
        ],
        "frontMenu":[

        ],
        "roleName":"用户",
        "tableName":"yonghu"
    }
];

var hasMessage = '';