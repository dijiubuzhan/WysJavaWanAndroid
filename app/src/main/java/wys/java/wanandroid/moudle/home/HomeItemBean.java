package wys.java.wanandroid.moudle.home;

import java.util.List;

public class HomeItemBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":10182,"link":"http://aospxref.com/","niceDate":"17小时前","niceShareDate":"17小时前","origin":"","prefix":"","projectLink":"","publishTime":1573312287000,"selfVisible":0,"shareDate":1573312287000,"shareUser":"","superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#272"}],"title":"在线Android源码(引用)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10178,"link":"https://blog.csdn.net/qq_35561554/article/details/102945299","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573265206000,"selfVisible":0,"shareDate":1573265206000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android TV开发KeyEvent事件处理流程&amp;焦点寻找","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10176,"link":"https://juejin.im/post/5dc4c7c16fb9a04a59016cab","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573259164000,"selfVisible":0,"shareDate":1573259164000,"shareUser":"_yuanhao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"17 个必须掌握的 BroadcastReceiver 知识点「建议收藏」","type":0,"userId":32103,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在早期，非常多博客在讲解和控件交互的时候，只会关注：<\/p>\r\n<p>ACTION_DOWN , ACTION_MOVE , ACTION_UP, ACTION_CANCEL<\/p>\r\n<p>这样的控件在一个手指交互的时候基本没有问题，但是一旦两个手指甚至多指操作，一个支持上下滑动的控件就会有跳跃感。<\/p>\r\n<p>那么今天的问题是：<\/p>\r\n<ol>\r\n<li>支持多个手指以上的操作，还应该关注哪些事件？<\/li>\r\n<li>Google 官方的控件，比如 ScrollView，ViewPager 这些都是支持多指操作的，那么多个手指时，如何判断哪一个是 active pointer（需要考虑一个接一个按下；一个接一个抬起）。<\/li>\r\n<li>一个未支持多指的控件，如何快速的支持？<\/li>\r\n<\/ol>\r\n<p>以上问题，知道任意一个都可以回答。<\/p>\r\n<blockquote>\r\n<p>另外，我们的问答数量已经突破了 50+，现在已经独立为 tab 啦，抬头即可看间。<br>本站始终追求非常高质量的提问，保证大多数问题能寻找答案的伙伴有所收获，么么哒，这个问题我觉得可以挂 5 天。<\/p>\r\n<\/blockquote>","envelopePic":"","fresh":false,"id":10049,"link":"https://www.wanandroid.com/wenda/show/10049","niceDate":"1天前","niceShareDate":"2019-11-03","origin":"","prefix":"","projectLink":"","publishTime":1573225580000,"selfVisible":0,"shareDate":1572796133000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 你那么多手指在触摸屏幕，你叫我怎么选？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10164,"link":"https://www.jianshu.com/p/c44d7a106302","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573225278000,"selfVisible":0,"shareDate":1573210924000,"shareUser":"等待一生","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"文章汇总|学习Android的一点一滴 ","type":0,"userId":32898,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10144,"link":"https://mp.weixin.qq.com/s/TEYHCH0gKkLm7f1PWEa_9Q","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573198622000,"selfVisible":0,"shareDate":1573128818000,"shareUser":"winlee28","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter混合开发(一)：Android项目集成Flutter模块详细指南","type":0,"userId":25211,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10163,"link":"https://mp.weixin.qq.com/s/D_0kKOG7rDaitoKEHrkj7w","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573142400000,"selfVisible":0,"shareDate":1573207864000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"一开启R8代码压缩就崩溃？这问题得解决啊！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10167,"link":"https://mp.weixin.qq.com/s/qVrii_-o54ZoE1_NMgs2lA","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573142400000,"selfVisible":0,"shareDate":1573215387000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"JetpackNote---基于Jetpack的学习笔记APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":74,"chapterName":"反编译","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10145,"link":"https://juejin.im/post/5dc407516fb9a04ab462a166","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135568000,"selfVisible":0,"shareDate":1573135029000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"因一纸设计稿，我把竞品APP扒得裤衩不剩(上)","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10146,"link":"https://juejin.im/post/5dc40aecf265da4d1f51c765","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135557000,"selfVisible":0,"shareDate":1573135243000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"应用流畅度(FPS)监控","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":126,"chapterName":"绘图相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10147,"link":"https://www.jianshu.com/p/a95c988fc3ca?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135546000,"selfVisible":0,"shareDate":1573135433000,"shareUser":"鸿洋","superChapterId":126,"superChapterName":"自定义控件","tags":[],"title":"Android简单画板实现","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"gs666","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个模仿企鹅 FM 界面的Android 应用&mdash;喜马拉雅Kotlin。完全使用 Kotlin 开发。有声资源和播放器由喜马拉雅 SDK 提供。 主要功能：\r\n\r\n1,在线播放专辑点播\r\n2,在线播放国家/省/市广播电台\r\n3,最近收听\r\n4,搜索节目/专辑/广播（包括热搜词）","envelopePic":"https://wanandroid.com/blogimgs/2baa4b4b-acfe-473c-b534-9d672423e564.png","fresh":false,"id":10135,"link":"https://www.wanandroid.com/blog/show/2703","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"https://github.com/gs666/XimalayaKotlin","publishTime":1573094591000,"selfVisible":0,"shareDate":1573094591000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个模仿企鹅 FM 界面的 Android 应用&mdash;喜马拉雅Kotlin。完全使用 Kotlin 开发。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"zj565061763","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"可以实现：\r\n1. &ldquo;A颜色&rdquo;  -&gt; &ldquo;B颜色&rdquo; 渐变\r\n2. &ldquo;A渐变&rdquo;  -&gt; &quot;B渐变&quot; 渐变\r\n\r\n重点：渐变的分界点位置可以进行调整","envelopePic":"https://wanandroid.com/blogimgs/55e1bc67-084d-49dd-8c2c-0b88492f478b.png","fresh":false,"id":10134,"link":"https://www.wanandroid.com/blog/show/2702","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"https://github.com/zj565061763/gradient-view","publishTime":1573094396000,"selfVisible":0,"shareDate":1573094396000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"动态渐变进度","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10123,"link":"https://juejin.im/post/59cef72b518825276f49fe40","niceDate":"2019-11-07","niceShareDate":"2019-11-06","origin":"","prefix":"","projectLink":"","publishTime":1573063641000,"selfVisible":0,"shareDate":1573027912000,"shareUser":"秉心说___","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"String 为什么不可变 ?","type":0,"userId":22057,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10107,"link":"https://mp.weixin.qq.com/s/rO17pwK-czZN-73GqpunJw","niceDate":"2019-11-07","niceShareDate":"2019-11-06","origin":"","prefix":"","projectLink":"","publishTime":1573063633000,"selfVisible":0,"shareDate":1573000187000,"shareUser":"hApple","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"哥纵横Android多年，竟然翻车在Json上","type":0,"userId":31976,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10127,"link":"https://www.jianshu.com/p/a2ee832300f6?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"","publishTime":1573063621000,"selfVisible":0,"shareDate":1573061672000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"Android 面试100题","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10159,"link":"https://mp.weixin.qq.com/s/SQb56b9QtoG22heoyFARXQ","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573207440000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"QQ底Tab实时高斯模糊效果怎么实现的？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10162,"link":"https://mp.weixin.qq.com/s/OVl6-ycfnk5Z4wbJtfybGQ","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573207847000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"给TextView文本加标签，小功能大秘密","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10171,"link":"https://mp.weixin.qq.com/s/ZlNcvwJ_swspifWTLHA92Q","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573215874000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Java 动态调试技术原理及实践","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10172,"link":"https://mp.weixin.qq.com/s/cY6rUrrjYRaIV--UzjiUgA","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573215894000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Android静态代码扫描效率优化与实践","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":374,"size":20,"total":7464}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"小编","chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":10182,"link":"http://aospxref.com/","niceDate":"17小时前","niceShareDate":"17小时前","origin":"","prefix":"","projectLink":"","publishTime":1573312287000,"selfVisible":0,"shareDate":1573312287000,"shareUser":"","superChapterId":272,"superChapterName":"导航主Tab","tags":[{"name":"导航","url":"/navi#272"}],"title":"在线Android源码(引用)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10178,"link":"https://blog.csdn.net/qq_35561554/article/details/102945299","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573265206000,"selfVisible":0,"shareDate":1573265206000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android TV开发KeyEvent事件处理流程&amp;焦点寻找","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10176,"link":"https://juejin.im/post/5dc4c7c16fb9a04a59016cab","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573259164000,"selfVisible":0,"shareDate":1573259164000,"shareUser":"_yuanhao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"17 个必须掌握的 BroadcastReceiver 知识点「建议收藏」","type":0,"userId":32103,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在早期，非常多博客在讲解和控件交互的时候，只会关注：<\/p>\r\n<p>ACTION_DOWN , ACTION_MOVE , ACTION_UP, ACTION_CANCEL<\/p>\r\n<p>这样的控件在一个手指交互的时候基本没有问题，但是一旦两个手指甚至多指操作，一个支持上下滑动的控件就会有跳跃感。<\/p>\r\n<p>那么今天的问题是：<\/p>\r\n<ol>\r\n<li>支持多个手指以上的操作，还应该关注哪些事件？<\/li>\r\n<li>Google 官方的控件，比如 ScrollView，ViewPager 这些都是支持多指操作的，那么多个手指时，如何判断哪一个是 active pointer（需要考虑一个接一个按下；一个接一个抬起）。<\/li>\r\n<li>一个未支持多指的控件，如何快速的支持？<\/li>\r\n<\/ol>\r\n<p>以上问题，知道任意一个都可以回答。<\/p>\r\n<blockquote>\r\n<p>另外，我们的问答数量已经突破了 50+，现在已经独立为 tab 啦，抬头即可看间。<br>本站始终追求非常高质量的提问，保证大多数问题能寻找答案的伙伴有所收获，么么哒，这个问题我觉得可以挂 5 天。<\/p>\r\n<\/blockquote>","envelopePic":"","fresh":false,"id":10049,"link":"https://www.wanandroid.com/wenda/show/10049","niceDate":"1天前","niceShareDate":"2019-11-03","origin":"","prefix":"","projectLink":"","publishTime":1573225580000,"selfVisible":0,"shareDate":1572796133000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问 你那么多手指在触摸屏幕，你叫我怎么选？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10164,"link":"https://www.jianshu.com/p/c44d7a106302","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573225278000,"selfVisible":0,"shareDate":1573210924000,"shareUser":"等待一生","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"文章汇总|学习Android的一点一滴 ","type":0,"userId":32898,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10144,"link":"https://mp.weixin.qq.com/s/TEYHCH0gKkLm7f1PWEa_9Q","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573198622000,"selfVisible":0,"shareDate":1573128818000,"shareUser":"winlee28","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter混合开发(一)：Android项目集成Flutter模块详细指南","type":0,"userId":25211,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10163,"link":"https://mp.weixin.qq.com/s/D_0kKOG7rDaitoKEHrkj7w","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573142400000,"selfVisible":0,"shareDate":1573207864000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"一开启R8代码压缩就崩溃？这问题得解决啊！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10167,"link":"https://mp.weixin.qq.com/s/qVrii_-o54ZoE1_NMgs2lA","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573142400000,"selfVisible":0,"shareDate":1573215387000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"JetpackNote---基于Jetpack的学习笔记APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":74,"chapterName":"反编译","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10145,"link":"https://juejin.im/post/5dc407516fb9a04ab462a166","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135568000,"selfVisible":0,"shareDate":1573135029000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"因一纸设计稿，我把竞品APP扒得裤衩不剩(上)","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10146,"link":"https://juejin.im/post/5dc40aecf265da4d1f51c765","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135557000,"selfVisible":0,"shareDate":1573135243000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"应用流畅度(FPS)监控","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":126,"chapterName":"绘图相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10147,"link":"https://www.jianshu.com/p/a95c988fc3ca?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1573135546000,"selfVisible":0,"shareDate":1573135433000,"shareUser":"鸿洋","superChapterId":126,"superChapterName":"自定义控件","tags":[],"title":"Android简单画板实现","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"gs666","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一个模仿企鹅 FM 界面的Android 应用&mdash;喜马拉雅Kotlin。完全使用 Kotlin 开发。有声资源和播放器由喜马拉雅 SDK 提供。 主要功能：\r\n\r\n1,在线播放专辑点播\r\n2,在线播放国家/省/市广播电台\r\n3,最近收听\r\n4,搜索节目/专辑/广播（包括热搜词）","envelopePic":"https://wanandroid.com/blogimgs/2baa4b4b-acfe-473c-b534-9d672423e564.png","fresh":false,"id":10135,"link":"https://www.wanandroid.com/blog/show/2703","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"https://github.com/gs666/XimalayaKotlin","publishTime":1573094591000,"selfVisible":0,"shareDate":1573094591000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一个模仿企鹅 FM 界面的 Android 应用&mdash;喜马拉雅Kotlin。完全使用 Kotlin 开发。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"zj565061763","chapterId":323,"chapterName":"动画","collect":false,"courseId":13,"desc":"可以实现：\r\n1. &ldquo;A颜色&rdquo;  -&gt; &ldquo;B颜色&rdquo; 渐变\r\n2. &ldquo;A渐变&rdquo;  -&gt; &quot;B渐变&quot; 渐变\r\n\r\n重点：渐变的分界点位置可以进行调整","envelopePic":"https://wanandroid.com/blogimgs/55e1bc67-084d-49dd-8c2c-0b88492f478b.png","fresh":false,"id":10134,"link":"https://www.wanandroid.com/blog/show/2702","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"https://github.com/zj565061763/gradient-view","publishTime":1573094396000,"selfVisible":0,"shareDate":1573094396000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=323"}],"title":"动态渐变进度","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10123,"link":"https://juejin.im/post/59cef72b518825276f49fe40","niceDate":"2019-11-07","niceShareDate":"2019-11-06","origin":"","prefix":"","projectLink":"","publishTime":1573063641000,"selfVisible":0,"shareDate":1573027912000,"shareUser":"秉心说___","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"String 为什么不可变 ?","type":0,"userId":22057,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":71,"chapterName":"数据解析","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10107,"link":"https://mp.weixin.qq.com/s/rO17pwK-czZN-73GqpunJw","niceDate":"2019-11-07","niceShareDate":"2019-11-06","origin":"","prefix":"","projectLink":"","publishTime":1573063633000,"selfVisible":0,"shareDate":1573000187000,"shareUser":"hApple","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"哥纵横Android多年，竟然翻车在Json上","type":0,"userId":31976,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10127,"link":"https://www.jianshu.com/p/a2ee832300f6?utm_source=desktop&amp;utm_medium=timeline","niceDate":"2019-11-07","niceShareDate":"2019-11-07","origin":"","prefix":"","projectLink":"","publishTime":1573063621000,"selfVisible":0,"shareDate":1573061672000,"shareUser":"鸿洋","superChapterId":76,"superChapterName":"热门专题","tags":[],"title":"Android 面试100题","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10159,"link":"https://mp.weixin.qq.com/s/SQb56b9QtoG22heoyFARXQ","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573207440000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"QQ底Tab实时高斯模糊效果怎么实现的？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10162,"link":"https://mp.weixin.qq.com/s/OVl6-ycfnk5Z4wbJtfybGQ","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573207847000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"给TextView文本加标签，小功能大秘密","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10171,"link":"https://mp.weixin.qq.com/s/ZlNcvwJ_swspifWTLHA92Q","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573215874000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Java 动态调试技术原理及实践","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队","chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":10172,"link":"https://mp.weixin.qq.com/s/cY6rUrrjYRaIV--UzjiUgA","niceDate":"2019-11-07","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1573056000000,"selfVisible":0,"shareDate":1573215894000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"Android静态代码扫描效率优化与实践","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 374
         * size : 20
         * total : 7464
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author : 小编
             * chapterId : 272
             * chapterName : 常用网站
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : true
             * id : 10182
             * link : http://aospxref.com/
             * niceDate : 17小时前
             * niceShareDate : 17小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1573312287000
             * selfVisible : 0
             * shareDate : 1573312287000
             * shareUser :
             * superChapterId : 272
             * superChapterName : 导航主Tab
             * tags : [{"name":"导航","url":"/navi#272"}]
             * title : 在线Android源码(引用)
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 导航
                 * url : /navi#272
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}

