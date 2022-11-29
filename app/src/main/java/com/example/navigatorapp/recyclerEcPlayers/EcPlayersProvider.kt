package com.example.navigatorapp.recyclerEcPlayers

import com.example.navigatorapp.recyclerEcPlayers.EcPlayer

class EcPlayersProvider {
    companion object {
        val ecPlayersList = listOf<EcPlayer>(
            EcPlayer("Cubo Rubik 2x2",6,6,"https://www.puzzlesycubosde.com/wp-content/uploads/2019/03/2x2_-1024x1024.jpg"),
            EcPlayer("Cubo Rubik 3x3",6,6,"https://http2.mlstatic.com/D_NQ_NP_901664-MEC50208974090_062022-O.jpg"),
            EcPlayer("Cubo Rubik 4x4",6,6,"https://www.puzzlesycubosde.com/wp-content/uploads/2019/03/cubos-4X42.jpg"),
            EcPlayer("Cubo Rubik 5x5",6,6,"https://http2.mlstatic.com/D_NQ_NP_887966-MEC50208833364_062022-O.jpg"),
            EcPlayer("Cubo Rubik 6x6",6,6,"https://http2.mlstatic.com/D_NQ_NP_875172-MEC44382662711_122020-O.jpg"),
            EcPlayer("Cubo Ribik Megaminx",12,12,"https://m.media-amazon.com/images/I/51JGGeqEvSL._SL500_.jpg"),
            EcPlayer("Priaminx",4,4,"https://m.media-amazon.com/images/I/61qz-NenWKL._AC_SL1500_.jpg"),
            EcPlayer("Skewb",6,6,"https://m.media-amazon.com/images/I/51gUVa7yB6L.jpg"),
            EcPlayer("Cubo Rubik 7x7",6,6,"https://http2.mlstatic.com/D_NQ_NP_716995-MEC45702191484_042021-O.jpg"),
            EcPlayer("Cubo Rubik 8x8",6,6,"https://www.losmundosderubik.es/2263-home_default/mofang-jiaoshi-mf8-8x8.jpg"),
            EcPlayer("Cubo Rubik Mirror",6,6,"https://upload.wikimedia.org/wikipedia/commons/2/22/Mirror_Cube_solved.png"),
            EcPlayer("Cubo MasterMorphix",4,4,"https://cdn.shopify.com/s/files/1/0603/2100/5725/products/DSC_6752_1024x1024@2x.gif?v=1642380141"),
        )
    }
}