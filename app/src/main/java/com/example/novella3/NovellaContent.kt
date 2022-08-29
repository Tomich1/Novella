package com.example.novella3

data class NovellaContent(
    var imageResId: Int,
    var text:String,
    val firstAction: NovellaAction?,
    val secondAction: NovellaAction?,
    val thirdAction: NovellaAction?

)

