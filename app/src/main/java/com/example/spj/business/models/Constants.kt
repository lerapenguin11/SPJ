package com.example.spj.business.models

object Constants{

    fun getBasketball() : MutableList<NewsModel>{
        val basketballNewsList = mutableListOf<NewsModel>()

        val news1 = NewsModel(0, 1,"", "Bayern officially land Carsen Edwards", "Carsen Edwards becomes the newest addition to new Pablo Laso's project at FC Bayern Munich with a one-year deal and completes the team's guard rotation, according to the official information.",
        "Basketball", "Larentzakis, 29, appeared in 41 EuroLeague games last season and averaged 6.4 points, 1.8 rebounds, 1.0 assists, and 4.8 PIR over 14 minutes per contest while shooting 49.2% from RANDOM NEWS DELETE ME beyond the arc.\n" +
                    "He helped the Reds to reach the EuroLeague Final Four and secure the second spot, also winning the Greek championship and cup competition.",
        "According to Konstantinos Melayess from Gazzetta.gr, his total earnings will reach €1.8 million in net.\n" +
                "The Greek sharpshooter previously had one year left on his deal.", "Larentzakis, 29, appeared in 41 EuroLeague games last season and averaged 6.4 points, 1.8 rebounds, 1.0 assists, and 4.8 PIR over 14 minutes per contest while shooting 49.2% from mid-range and 37.2% from beyond the arc.\n" +
                    "He helped the Reds to reach the EuroLeague Final Four and secure the second spot, also winning the Greek championship and cup competition.",
        "")
        basketballNewsList.add(news1)

        val news2 = NewsModel(1, 2,"", "TEST", "Carsen Edwards becomes the newest addition to new Pablo Laso's project at FC Bayern Munich with a one-year deal and completes the team's guard rotation, according to the official information.",
            "Basketball", "Larentzakis, 29, appeared in 41 EuroLeague games last season and averaged 6.4 points, 1.8 rebounds, 1.0 assists, and 4.8 PIR over 14 minutes per contest while shooting 49.2% from RANDOM NEWS DELETE ME beyond the arc.\n" +
                    "He helped the Reds to reach the EuroLeague Final Four and secure the second spot, also winning the Greek championship and cup competition.",
            "According to Konstantinos Melayess from Gazzetta.gr, his total earnings will reach €1.8 million in net.\n" +
                    "The Greek sharpshooter previously had one year left on his deal.", "Larentzakis, 29, appeared in 41 EuroLeague games last season and averaged 6.4 points, 1.8 rebounds, 1.0 assists, and 4.8 PIR over 14 minutes per contest while shooting 49.2% from mid-range and 37.2% from beyond the arc.\n" +
                    "He helped the Reds to reach the EuroLeague Final Four and secure the second spot, also winning the Greek championship and cup competition.",
            "")
        basketballNewsList.add(news2)

        return basketballNewsList
    }
}