# ContactPerson
类似手机联系人最右侧的字母导航栏.

拼音提取首字母可以参考使用https://github.com/promeG/TinyPinyin

悬浮头部效果和头部分层，参考使用StickyHeaderDecoration 
image

Download

https://fir.im/j54h

集成方式

注入依赖 Step 1. Add the JitPack repository to your build file Step 2. Add the dependency
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies {
 	   compile 'com.github.qdxxxx:IndexBarLayout:1.0.2'
	}
Activity里面集成代码

设置index首字母信息
        indexLayout.getIndexBar().setIndexsList(List<String> indexs);
index字母改变的事件通知
       indexLayout.getIndexBar().setIndexChangeListener(new IndexBar.IndexChangeListener() {
           @Override
           public void indexChanged(String indexName) {
           }
       });
Layout

<qdx.indexbarlayout.IndexLayout
        android:id="@+id/index_layout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
方法及属性介绍

indexLayout

name	format	中文解释
setDrawByTouch        	boolean	触摸显示的字母圆的y轴中心点与手指触摸相同
setCircleRadius        	float  	触摸显示的字母圆的半径
setCircleDuration    	integer  	触摸显示的字母圆显示时间
setCircleColor        	integer	圆的颜色
setIndexBarWidth      	integer	字母导航栏的宽度
setIndexBarHeightRatio	float      	字母导航栏高度相对父高度占比
getIndexBar	     	           	获取字母导航栏
