package com.allen.wanandroid


data class BaseBean<T>(val errorCode: Int, val errorMsg: String, val data: T)

data class AricleBean(
    val apkLink: String,
    val chapterId: Int,
    val collect: String,
    val courseId: Int,
    val desc: String,
    val envelopePic: String,
    val author: String,
    val chapterName: String,
    val id: Int,
    val link: String,
    val niceDate: String,
    val fresh: Boolean,
    val origin: String,
    val prefix: String,
    val publishTime: Long,
    val title: String,
    val projectLink: String,
    val superChapterId: Int,
    val superChapterName: String,
    val tags: ArrayList<TagBean>,
    val type: Int,
    val userId: Int,
    val visible: Int,
    val zan: Int
)

data class TagBean(val name: String, val url: String)

data class AricleBeans(
    val curPage: Int,
    val datas: ArrayList<AricleBean>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)

data class WeatherBean(val status: String, val error: String, val api_version: String)