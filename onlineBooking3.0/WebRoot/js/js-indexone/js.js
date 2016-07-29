$(function(){
	$(".index_imgico").hover(
		function(){
			if ($(this).children("img").attr("class") == "lastimg")
			{
				alert("y");
			}
			$(this).addClass("index_imgico_press");
			$(this).children(".index_imgico_list").show();
		},
		function(){
			$(this).removeClass("index_imgico_press");
			$(this).children(".index_imgico_list").hide();
		}
	);
	
	$(".menu_top > li").mouseover(function(){
		$(".menu_top > li").removeClass("press").eq($(this).index()).addClass("press");
		$(".sub_list").hide();
		$(this).children(".sub_list").show();
	});
	$(".index_sort_right").click(function(){
		if ($(".index_imgshow").css("display") == "block")
		{
			$(".index_imgshow").hide();
		}
		else
		{
			$(".index_imgshow").show();
		}
		
	});
	$(".index_imgico_list > li a").hover(
		function(){
			$(this).children(".index_imgico_1").hide();
			$(this).children(".index_imgico_2").show();
		},
		function(){
			$(this).children(".index_imgico_1").show();
			$(this).children(".index_imgico_2").hide();
		}
	);
	
	$(".public_button1").hover(
		function(){
			$(this).addClass("public_button1_hover");
		},
		function(){
			$(this).removeClass("public_button1_hover");
		}
	);
	$(".public_button").hover(
		function(){
			$(this).addClass("public_button_hover");
		},
		function(){
			$(this).removeClass("public_button_hover");
		}
	);
	$(".public_button2").hover(
		function(){
			$(this).addClass("public_button2_hover");
		},
		function(){
			$(this).removeClass("public_button2_hover");
		}
	);
	$(".public_button3").hover(
		function(){
			$(this).addClass("public_button3_hover");
		},
		function(){
			$(this).removeClass("public_button3_hover");
		}
	);
	
	var nside_con_special_len = $(".nside_con_special").length-2;
	
	$(".nside_con_special").hover(
		function(){
			if ($(".nside_con_special").index($(this)) >= nside_con_special_len)
			{
				
				$(this).children(".index_imgico_list").addClass("index_imgico_list_last");
				$(this).addClass("nside_con_special_last_press");
			}
			else
			{
				$(this).addClass("nside_con_special_press");
				
			}
			$(this).children(".index_imgico_list").show();
			$(this).css("z-index","60");
		},
		function(){
			$(this).removeClass("nside_con_special_last_press");
			$(this).removeClass("nside_con_special_press");
			$(this).children(".index_imgico_list").hide();
			$(this).css("z-index","0");
		}
	);
	
	$(".left_title h3").click(function(){
		$(".left_title h3").removeClass("press");
		$(".left_list").hide();
		$(this).addClass("press");
		$(this).parent().children(".left_list").show();
		
	});
	
	$(".right_mat_img").click(function(){
		$(".right_mat_bot").show();
		$(".right_mat_img").hide();
		$(".right_mat_img1").show();
	});
	$(".right_mat_img1").click(function(){
		$(".right_mat_bot").hide();
		$(".right_mat_img").show();
		$(".right_mat_img1").hide();
	});
	$(".main_focus_img").click(function(){
		$(".main_focus_bot").show();
		$(".main_focus_img").hide();
		$(".main_focus_img1").show();
	});
	$(".main_focus_img1").click(function(){
		$(".main_focus_bot").hide();
		$(".main_focus_img").show();
		$(".main_focus_img1").hide();
	});
	
	
	$(".left_list1 > li").click(function(){
		$(".left_list1 > li").removeClass("press");
		$(".left_list2").hide();
		if ($(this).children(".left_list2").length > 0)
		{
			$(this).addClass("press");
			$(this).children(".left_list2").show();
			return false;
		}
	});
	
	
	$(".sub_down").mouseover(function() {
        $(this).children(".sub_down_empty").stop(true, true).show();
    });
    $(".sub_down").bind("mouseleave", function() {
        $(this).children(".sub_down_empty").hide();
    });
	
	
	var login_height = parseInt(($("body").height()-($(".login").innerHeight(true)+$(".foot_mat").innerHeight(true))));
	var login_height1 = parseInt($("body").height()-$(".foot_mat").innerHeight(true));
	setTimeout(function(){
	$(".login_wrap").css("height",login_height1);
	},3);
	$(".login_wrap td").css("height",login_height);
	$(window).resize(function(){
		login_height = parseInt(($("body").height()-($(".login").innerHeight(true)+$(".foot_mat").innerHeight(true))));
		login_height1 = parseInt($("body").height()-$(".foot_mat").innerHeight(true));
		setTimeout(function(){
	$(".login_wrap").css("height",login_height1);
	},3);
		$(".login_wrap td").css("height",login_height);
	});
});