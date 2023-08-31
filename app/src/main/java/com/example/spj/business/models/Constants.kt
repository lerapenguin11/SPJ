package com.example.spj.business.models

import com.example.spj.R

object Constants{

    fun getBasketball() : MutableList<NewsModel>{
        val basketballNewsList = mutableListOf<NewsModel>()

        val news1 = NewsModel(0, 1,"https://s-cdn.sportbox.ru/images/styles/1200-auto/fp_fotos/22/1f/219e7cb508702cb19ab80251fd4f608f64ef446d6410e721731529.jpg", R.string.title_news1_basketball, R.string.desc_new1_basketball,
        R.string.basketball, R.string.paragraph1_new1_basketball,
        R.string.paragraph2_new1_basketball, R.string.paragraph3_new1_basketball,
        "https://ic.pics.livejournal.com/basket_2/68532496/213329/213329_900.jpg")
        basketballNewsList.add(news1)

        val news2 = NewsModel(1, 2,"https://ss.sport-express.ru/userfiles/materials/192/1926572/volga.jpg", R.string.title_new2_basketball,  R.string.desc_new2_basketball,
            R.string.basketball, R.string.paragraph1_new2_basketball,
            R.string.paragraph2_new2_basketball, R.string.paragraph3_new2_basketball,
            "https://ss.sport-express.ru/userfiles/materials/192/1926797/volga.jpg")
        basketballNewsList.add(news2)

        val news3 = NewsModel(2, 3,"https://ss.sport-express.ru/userfiles/materials/192/1926581/volga.jpg", R.string.title_new3_basketball,  R.string.desc_new3_basketball,
            R.string.basketball, R.string.paragraph1_new2_basketball,
            R.string.paragraph2_new3_basketball, R.string.paragraph3_new3_basketball,
            "https://ss.sport-express.ru/userfiles/materials/192/1926572/volga.jpg")
        basketballNewsList.add(news3)

        return basketballNewsList
    }

    fun getFootball() : MutableList<NewsModel>{
        val footballNewsList = mutableListOf<NewsModel>()

        val news1 = NewsModel(0, 1,"https://s-cdn.sportbox.ru/images/styles/1920_1080/fp_fotos/b4/e5/3b705b6ac6a078afe851f5b1be1381b964d3f079c2144948434246.jpg", R.string.title_new1_football, R.string.desc_new1_football,
            R.string.football, R.string.paragraph1_new1_football,
            R.string.paragraph2_new1_football, R.string.paragraph3_new1_football,
            "https://s-cdn.sportbox.ru/images/styles/900x700-auto/fp_fotos/8f/43/d99bd45372b4701061c91fe2fe59531364e98a347ecc5754990735.jpg")
        footballNewsList.add(news1)

        val news2 = NewsModel(1, 2,"https://s-cdn.sportbox.ru/images/styles/1920_1080/fp_fotos/4a/83/1ee0e5f2e8380b1f1b1cd678d11552c864172caa9c7b3429741886.jpg", R.string.title_new2_football,
            R.string.desc_new2_football,
            R.string.football, R.string.paragraph1_new2_football,
            R.string.paragraph2_new2_football, R.string.paragraph3_new2_football,
            "https://s-cdn.sportbox.ru/images/styles/900x700-auto/fp_fotos/8f/43/d99bd45372b4701061c91fe2fe59531364e98a347ecc5754990735.jpg")
        footballNewsList.add(news2)

        val news3 = NewsModel(2, 3,"https://smi24.kz/userdata/article/2023/article_998088/thumb_b/image.jpg", R.string.title_new3_football, R.string.desc_new3_football,
            R.string.football, R.string.paragraph1_new3_football,
            R.string.paragraph2_new3_football, R.string.paragraph3_new3_football,
            "https://s-cdn.sportbox.ru/images/styles/1920_1080/fp_fotos/4a/83/1ee0e5f2e8380b1f1b1cd678d11552c864172caa9c7b3429741886.jpg")
        footballNewsList.add(news3)

        return footballNewsList
    }

    fun getTennis() : MutableList<NewsModel>{
        val tennisNewsList = mutableListOf<NewsModel>()

        val news1 = NewsModel(0, 1,"https://ss.sport-express.ru/userfiles/materials/192/1928214/volga.jpg", R.string.title_new1_tennis, R.string.desc_new1_tennis,
            R.string.tennis, R.string.paragraph1_new1_tennis,
            R.string.paragraph2_new1_tennis, R.string.paragraph3_new1_tennis,
            "https://ss.sport-express.ru/userfiles/materials/192/1928215/volga.jpg")
        tennisNewsList.add(news1)

        val news2 = NewsModel(1, 2,"https://ss.sport-express.ru/userfiles/materials/192/1928121/volga.jpg", R.string.title_new2_tennis,  R.string.desc_new1_tennis,
            R.string.tennis, R.string.paragraph1_new2_tennis,
            R.string.paragraph2_new2_tennis, R.string.paragraph3_new2_tennis,
            "https://ss.sport-express.ru/userfiles/materials/192/1928122/volga.jpg")
        tennisNewsList.add(news2)

        val news3 = NewsModel(2, 3,"https://ss.sport-express.ru/userfiles/materials/192/1928123/volga.jpg", R.string.title_new3_tennis,  R.string.desc_new1_tennis,
            R.string.tennis, R.string.paragraph1_new3_tennis,
            R.string.paragraph2_new3_tennis, R.string.paragraph3_new3_tennis,
            "https://static.gotennis.ru/uploads/catsubcat/b560c6d637576a5670949bd61ba697ec.jpg")
        tennisNewsList.add(news3)

        return tennisNewsList
    }

    fun getBaseball() : MutableList<NewsModel>{
        val baseballNewsList = mutableListOf<NewsModel>()

        val news1 = NewsModel(0, 1,"https://sun9-77.userapi.com/impg/JReb-Em4a9pb8f9jmrExRMS4GfEbExr3CQpj2A/IMkOte6eM5c.jpg?size=1080x1099&quality=96&sign=fc96caa38166cfa414746d4fab4d73cd&type=album",
            R.string.title_new3_baseball,
            R.string.desc_new1_baseball,
            R.string.baseball, R.string.paragraph1_new1_baseball,
            R.string.paragraph2_new1_baseball, R.string.paragraph3_new1_baseball,
            "https://sun9-63.userapi.com/impg/RNPqbNURjuaXEf0n7ul2z6oyr4AA9Ci28Ys-HQ/NvVQvWhYEYo.jpg?size=828x552&quality=96&sign=8a644dd30be0476f68aa1518fc423011&type=album")
        baseballNewsList.add(news1)

        val news2 = NewsModel(1, 2,"https://avatars.mds.yandex.net/i?id=2a0000018a449854118a521ad10b9adb7779-1364332-fast-images&n=13", R.string.title_new1_baseball,
            R.string.desc_new2_baseball,
            R.string.baseball, R.string.paragraph1_new2_baseball,
            R.string.paragraph2_new2_baseball, R.string.paragraph3_new2_baseball, "https://bdc2020.o0bc.com/wp-content/uploads/2023/08/Red_Sox_Astros_Baseball_07774-64e76849b7335-scaled.jpg")
        baseballNewsList.add(news2)

        val news3 = NewsModel(2, 3,"https://ss.sport-express.ru/userfiles/materials/182/1828628/volga.jpg", R.string.title_new2_baseball, R.string.desc_new3_baseball,
            R.string.baseball, R.string.paragraph1_new3_baseball,
            R.string.paragraph2_new3_baseball,
            R.string.paragraph3_new2_baseball,
            "https://ss.sport-express.ru/userfiles/materials/182/1828626/volga.jpg")
        baseballNewsList.add(news3)

        return baseballNewsList
    }

    fun getChampionsBasketball() : MutableList<ChampionsModel>{
        val championsBasketballList = mutableListOf<ChampionsModel>()

        val champion1 = ChampionsModel("1", R.string.name_basketball1, "https://cdn-icons-png.flaticon.com/512/197/197374.png")
        championsBasketballList.add(champion1)

        val champion2 = ChampionsModel("2", R.string.name_basketball2, "https://cdn-icons-png.flaticon.com/512/197/197537.png")
        championsBasketballList.add(champion2)

        val champion3 = ChampionsModel("3", R.string.name_basketball3, "https://cdn-icons-png.flaticon.com/512/197/197538.png")
        championsBasketballList.add(champion3)

        val champion4 = ChampionsModel("4", R.string.name_basketball4, "https://cdn-icons-png.flaticon.com/512/197/197538.png")
        championsBasketballList.add(champion4)

        val champion5 = ChampionsModel("5", R.string.name_basketball5, "https://cdn-icons-png.flaticon.com/512/197/197542.png")
        championsBasketballList.add(champion5)

        val champion6 = ChampionsModel("6", R.string.name_basketball6, "https://cdn-icons-png.flaticon.com/512/197/197540.png")
        championsBasketballList.add(champion6)

        val champion7 = ChampionsModel("7", R.string.name_basketball7, "https://cdn-icons-png.flaticon.com/512/197/197556.png")
        championsBasketballList.add(champion7)

        return championsBasketballList
    }

    fun getChampionsFootball() : MutableList<ChampionsModel>{
        val championsFootballList = mutableListOf<ChampionsModel>()

        val champion1 = ChampionsModel("1", R.string.name_football1, "https://cdn-icons-png.flaticon.com/512/197/197556.png")

        championsFootballList.add(champion1)

        val champion2 = ChampionsModel("2", R.string.name_football2, "https://cdn-icons-png.flaticon.com/512/197/197542.png")

        championsFootballList.add(champion2)

        val champion3 = ChampionsModel("3", R.string.name_football3, "https://cdn-icons-png.flaticon.com/512/197/197538.png")

        championsFootballList.add(champion3)

        val champion4 = ChampionsModel("4", R.string.name_football4, "https://cdn-icons-png.flaticon.com/512/197/197558.png")

        championsFootballList.add(champion4)

        return championsFootballList
    }

    fun getChampionsTennis() : MutableList<ChampionsModel>{
        val championsTennisList = mutableListOf<ChampionsModel>()

        val champion1 = ChampionsModel("1", R.string.name_tennis1, "https://cdn-icons-png.flaticon.com/512/197/197537.png")

        championsTennisList.add(champion1)

        val champion2 = ChampionsModel("2", R.string.name_tennis2, "https://cdn-icons-png.flaticon.com/512/197/197540.png")

        championsTennisList.add(champion2)

        val champion3 = ChampionsModel("3", R.string.name_tennis3, "https://cdn-icons-png.flaticon.com/512/197/197555.png")

        championsTennisList.add(champion3)

        val champion4 = ChampionsModel("4", R.string.name_tennis4, "https://cdn-icons-png.flaticon.com/512/197/197551.png")

        championsTennisList.add(champion4)

        val champion5 = ChampionsModel("5", R.string.name_tennis5, "https://cdn-icons-png.flaticon.com/512/197/197554.png")

        championsTennisList.add(champion5)

        return championsTennisList
    }

    fun getChampionsBaseball() : MutableList<ChampionsModel>{
        val championsBaseball = mutableListOf<ChampionsModel>()

        val champion1 = ChampionsModel("1", R.string.name_baseball1, "https://cdn-icons-png.flaticon.com/512/197/197538.png")

        championsBaseball.add(champion1)

        val champion2 = ChampionsModel("2", R.string.name_baseball2, "https://cdn-icons-png.flaticon.com/512/197/197554.png")

        championsBaseball.add(champion2)

        val champion3 = ChampionsModel("3", R.string.name_baseball3, "https://cdn-icons-png.flaticon.com/512/197/197550.png")

        championsBaseball.add(champion3)


        val champion4 = ChampionsModel("4", R.string.name_baseball4, "https://cdn-icons-png.flaticon.com/512/197/197552.png")

        championsBaseball.add(champion4)

        val champion5 = ChampionsModel("5", R.string.name_baseball5, "https://cdn-icons-png.flaticon.com/512/197/197538.png")

        championsBaseball.add(champion5)

        val champion6 = ChampionsModel("6", R.string.name_baseball6, "https://cdn-icons-png.flaticon.com/512/197/197541.png")

        championsBaseball.add(champion6)

        return championsBaseball
    }
}