package com.viki.epubreader.util;

public class Constant {
	public static final String HTML_HEAD = "<!DOCTYPE html>"
			+ "<html lang=\"vi\">"
			+ "<head>"
			+ "<meta charset=\"utf-8\" />"
			+ "<script type=\"text/javascript\" language=\"javascript\" src=\"file:///android_asset/scripts/jquery-2.1.0.min.js\"></script>"
			//+ "<script type=\"text/javascript\" language=\"javascript\" src=\"file:///android_asset/scripts/jquery.mobile-1.3.2.min.js\"></script>"
			+ "<script type=\"text/javascript\" language=\"javascript\" src=\"file:///android_asset/scripts/common.js\"></script>"

			+ "<style type=\"text/css\">"
			+ "*{margin:0;padding:0;  "
			+ " }"
			+ "body{margin:0;padding:0;border:none;break-inside: avoid-column;}"
			+ "body {column-fill: auto; column-width: [column-width]px; column-gap: [column-gap]px; -webkit-column-fill: auto; -webkit-column-width: [column-width]px; -webkit-column-gap: [column-gap]px; -moz-column-fill: auto; -moz-column-width: [column-width]px; -moz-column-gap: [column-gap]px; height: [column-height]px; padding: [column-padding]px; text-align: justify; width: auto; }"
			+ "body > p:last-of-type:after {content: ''; display: block; width: [column-padding]px; height: 1em; float: right; margin-right: -[column-padding]px; }"
			+ "a{text-decoration:none;color:black !important}"
//			+ "h1,h2,h3,h4,h5,h6{margin: 0 0 5px !important;padding:5px 0 0px !important;line-height:1.5em !important}"
//			+ "body img{border:0 none;padding: 0.5em !important;max-width:240px !important}"
//			+ "body,div,p,span{line-height:1.5em;font-size: ?px ;font-family: '?font'; text-align:justify}"
//			+ "h1 span, h2 span, h3 span, h4 span, h5 span, h6 span{font-size:inherit !important}"
//			+ "div,p{margin: 0.5em 0 0}"
//			+ "p{text-indent:15px}"
//			+ "table{background-color:white !important;border: 1px solid #000000 !important;border-collapse: collapse !important;width: 100%;margin: 0.5em 0 0 !important}"
//			+ "table td,table th{border: 1px solid #000000 !important;padding: 0.25em !important;vertical-align: top !important}"
//			+ "table,tr,td,th{font-size:100%}"
//			+ "hr{display:block;background:#000000;margin:0.5em 0 0}"
//			+ "blockquote{border:1px solid #000000;margin: 0.5em 0 0;padding:0.5em;display:table;background-color:#F2F2F2}"
//			+ ".vef_page_anchor{display:none !important}"
//			+ ".veftext_left{float:left}.veftext_right{float:right}.veftext_align-center{text-align:center}.veftext_align-left{text-align:left}.veftext_align-right{text-align:right}.veftext_align-justify{text-align:justify}"
//			+ ".veftext_fs13{font-size:13px}.veftext_fs14{font-size:14px}.veftext_fs15{font-size:15px}.veftext_fs16{font-size:16px}.veftext_fs17{font-size:17px}.veftext_fs18{font-size:18px}.veftext_fs19{font-size:19px}.veftext_fs20{font-size:20px}.veftext_fs21{font-size:21px}.veftext_fs22{font-size:22px}.veftext_fs23{font-size:23px}.veftext_fs24{font-size:24px}.veftext_fs25{font-size:25px}.veftext_fs26{font-size:26px}"
//			+ ".veftext_times-new-roman{font-family:'times new roman'}.veftext_arial{font-family:arial}.veftext_courier{font-family:courier}.veftext_verdana{font-family:verdana}.veftext_sans-serif{font-family:sans-serif}"
//			+ ".veftext_box{border: 1px solid #000000;padding:0.3em !important;background-color:white}"
			//+ ".MyAppHighlight{background: yellow !important; background: -webkit-gradient(linear, left top, left bottom, color-stop(0%%, #cdf8ff), color-stop(100%%, #81e1f8)); background: -webkit-linear-gradient(top,  #cdf8ff 0%%, #81e1f8 100%%); background: linear-gradient(to bottom,  #cdf8ff 0%%,#81e1f8 100%%); border-radius: 3px; padding: 1px 2px;  -webkit-box-shadow: 2px 3px 6px #959595; -webkit-text-shadow: 0px 1px 1px #F1D100;}"
			+ "img{-webkit-column-break-inside: avoid;break-inside: avoid-column;}"

			+ "</style>";

	public static final String HTML_CLOSE_HEAD = "</head><body>";
	public static final String HTML_HEAD_SEARCH = "<!DOCTYPE html>"
			+ "<html lang=\"vi\">"
			+ "<head>"
			+ "<meta charset=\"utf-8\" />"
			+ "<script type=\"text/javascript\" language=\"javascript\" src=\"file:///android_asset/scripts/jquery-2.1.0.min.js\"></script>"
			+ "<script type=\"text/javascript\" language=\"javascript\" src=\"file:///android_asset/scripts/searchInWebview.js\"></script>"
			+ "<script type=\"text/javascript\" language=\"javascript\">"
			+ "var chapterNumber = ??;" + "var isFinishSearch = %%;"

			+ "</script>" + "</head>" + "<body>";
	public static final String STYLE_FOR_NIGHT_MODE = "<style type=\"text/css\">"
			+ "body{background-color:#FBF0D9}"
			+ "body *{color: #5F4B32}"
			+ ".MyAppHighlight{background-color:white; color:black}"
			+ "</style>";
	public static final String HTML_END = "<span id=\"vef_end_body\"></span>"
//			+ "<script type=\"text/javascript\">"
//			+"$(\"body\").on(\"touchstart touchmove touchend taphold touchcancel scrollstop\",function(e){"
//			+"var posX=this.scrollX;"
//			+ "var mes=e.type+\"------click-------\";"
//			+ "		window.android.logWebview(mes);"
//			+"if(e.type==\"touchcancel\"){"
//			+"		var posX=$(\"body\").scrollLeft();"
//			+"		var currPage=Math.ceil(posX / widthColumn);"
//			+ "		var start=currPage*widthColumn;"
//			+"		var end=start+widthColumn;"
//			+"		var center=Math.ceil((start+end) / 2);"
//			+ "		window.android.logWebview(mes+currPage+\"--posX=\"+posX+\"widthColumn=\"+widthColumn);"
//			+"		if(posX < center){"
//			//+"		scrollTo(currPage*widthColumn)"
//			+"		}else if((currPage+1)<=pageCount){"
//			//+"		scrollTo((currPage+1)*widthColumn)"
//			+"		}"
//			+"}"
//			+ "});"
//			+"</script>"
			+ "</body></html>";

}
