package com.voxeldev.summerpractice2022.data.models

class TaxiRepository {

    fun getTaxisits(): List<Taxi> {


        return listOf(
            Taxi(
                0,
                "Тимур",
                "Звоните если опоздаете",
                "через 5 мин",
                "250 руб",
                "https://wl-adme.cf.tsp.li/resize/728x/jpg/c25/94e/6f17eb504eb7440d59fe3603bf.jpg"
            ),
            Taxi(
                1,
                "Азамат",
                "Чистая машина",
                "через 10 мин",
                "200 руб",
                "https://image2.thematicnews.com/uploads/images/00/00/41/2016/06/04/1498efe5b7.jpg"
            ),
            Taxi(
                2,
                "Айрат",
                "Пьяных не повезу",
                "через 20 мин",
                "350 руб",
                "https://taksi.bz/upfiles/images/taksist-inturist.jpg"
            ),
            Taxi(
                3,
                "Алексей",
                "С животными не повезу",
                "через 30 мин",
                "100 руб",
                "https://www.ridus.ru/images/2019/3/25/898525/hd_3325380323.jpg"
            ),
            Taxi(
                5,
                "Андрей",
                "Заранее предупреждать о ребёнке",
                "5 мин",
                "150 руб",
                "https://img.gazeta.ru/files3/626/13845626/TASS_47278969-pic_32ratio_900x600-900x600-71983.jpg"
            ),
            Taxi(
                8,
                "Асхат",
                "везу только трезвых",
                "10 мин",
                "300 руб",
                "https://static.insales-cdn.com/files/1/76/14712908/original/taksisty1_small.jpg"
            )
        )
    }
}