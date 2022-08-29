package com.example.novella3

object Storage {

    val pages:List<NovellaContent> = listOf(
            //page 3
        NovellaContent(
            imageResId = R.drawable.third,
            text = "Отлично, чем займёмся?",
            firstAction = NovellaAction(page = 3, text = "пойдем на пробежку"),
            secondAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.third,
            text = "Отлично, чем займёмся?",
            secondAction = NovellaAction(page = 3, text = "пойдем в поход"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.third,
            text = "Отлично, чем займёмся?",
            thirdAction = NovellaAction(page = 3, text = "пойдем по полю"),
            firstAction = null,
            secondAction = null),

            //page 4
        NovellaContent(
            imageResId = R.drawable.four,
            text = "Может пойдем домй?",
            secondAction = NovellaAction(page = 4, text = "да и посмотрм фильм!"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.four,
            text = "Может пойдем домой?",
            thirdAction = NovellaAction(page = 4, text = "да и отпразднуем хэллуин!"),
            firstAction = null,
            secondAction = null),

            // page 5
        NovellaContent(
            imageResId = R.drawable.five,
            text = "Как уютно... Но уже темнеет.",
            secondAction = NovellaAction(page = 5, text = "пойдем домой и посмотрим фильм!"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.five,
            text = "Как уютно... Но уже темнеет.?",
            thirdAction = NovellaAction(page = 5, text = "пойдем домой и отпразднуем хэллуин!"),
            firstAction = null,
            secondAction = null),

            // page 6
        NovellaContent(
            imageResId = R.drawable.six,
            text = "Тебе грустно... Пойдем домой?",
            secondAction = NovellaAction(page = 6, text = "может посмотрим фильм?"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.six,
            text = "Тебе грустно... Пойдем домой?",
            thirdAction = NovellaAction(page = 6, text = "да и отпразднуем хэллуин!"),
            firstAction = null,
            secondAction = null),

            //page 7

        NovellaContent(
            imageResId = R.drawable.seven,
            text = "Как тебе фильм?",
            secondAction = NovellaAction(page = 7, text = "мне понравился!"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.seven,
            text = "Как тебе фильм?",
            thirdAction = NovellaAction(page = 7, text = "не очень..."),
            firstAction = null,
            secondAction = null),

        //page 8
        NovellaContent(
            imageResId = R.drawable.eght,
            text = "Получается очень красиво!",
            secondAction = NovellaAction(page = 8, text = "да! может посмотрим фильм?"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.eght,
            text = "Получается очень красиво!",
            thirdAction = NovellaAction(page = 8, text = "да! давай сделаем костюмы!"),
            firstAction = null,
            secondAction = null),

        // page 9
        NovellaContent(
            imageResId = R.drawable.nine,
            text = "Отлично, а теперь пора  спать... ",
            firstAction = NovellaAction(page = 9, text = "да, уже поздно..."),
            secondAction = null,
            thirdAction = null),

        // page 10
        NovellaContent(
            imageResId = R.drawable.nine,
            text = "Жаль... Тогда пойдем спать? ",
            firstAction = NovellaAction(page = 10, text = "да, уже поздно..."),
            secondAction = null,
            thirdAction = null),

        //page 11
        NovellaContent(
            imageResId = R.drawable.eleven,
            text = "Мне нравится твой костюм!",
            secondAction = NovellaAction(page = 11, text = "твой тоже очень красивый"),
            firstAction = null,
            thirdAction = null),
        NovellaContent(
            imageResId = R.drawable.eleven,
            text = "Мне нравится твой костюм!",
            thirdAction = NovellaAction(page = 11, text = "а мне если честно не нравится твой"),
            firstAction = null,
            secondAction = null),

        // page 12
        NovellaContent(
            imageResId = R.drawable.twelve,
            text = "Спасибо! Ну пойдем спать? ",
            firstAction = NovellaAction(page = 12, text = "да, уже поздно..."),
            secondAction = null,
            thirdAction = null),
        // page 13
        NovellaContent(
            imageResId = R.drawable.thirteen,
            text = "Ничего, я не в обиде. Пойдем спать? ",
            firstAction = NovellaAction(page = 13, text = "да, уже поздно..."),
            secondAction = null,
            thirdAction = null),

    )

}