package com.erikriosetiawan.tokohreogponorogo;

import java.util.ArrayList;

public class ReogData {

    public static String[][] data = new String[][] {
            {"Jathil", "Jathil adalah prajurit berkuda dan merupakan salah satu tokoh dalam seni Reog", "https://upload.wikimedia.org/wikipedia/commons/a/a9/Reog_Ponorogo_dance.jpg"},
            {"Warok", "\"Warok\" yang berasal dari kata wewarah adalah orang yang mempunyai tekad suci, memberikan tuntunan dan perlindungan tanpa pamrih.", "https://upload.wikimedia.org/wikipedia/id/c/c8/Warok_Ponorogo.jpg"},
            {"Barongan (Dadak Merak)", "Barongan (Dadak merak) merupakan peralatan tari yang paling dominan dalam kesenian Reog Ponorogo.", "https://upload.wikimedia.org/wikipedia/commons/7/71/Reog_Ponorogo.jpg"},
            {"Klono Sewandono", "Klono Sewandono adalah seorang raja sakti mandraguna yang memiliki pusaka andalan berupa Cemeti.", "https://upload.wikimedia.org/wikipedia/id/1/10/Prabu_Klono_Sewandono.jpg"},
            {"Bujang Ganong", "Bujang Ganong (Ganongan) atau Patih Pujangga Anom adalah salah satu tokoh yang enerjik.", "https://upload.wikimedia.org/wikipedia/id/3/39/Bujang_Ganong.jpg"}
    };

    public static ArrayList<Reog> getListData() {
        Reog reog = null;
        ArrayList<Reog> list = new ArrayList<>();
        for (String[] dataKu : data) {
            reog = new Reog();
            reog.setName(dataKu[0]);
            reog.setRemarks(dataKu[1]);
            reog.setPhotos(dataKu[2]);

            list.add(reog);
        }

        return list;
    }
}
