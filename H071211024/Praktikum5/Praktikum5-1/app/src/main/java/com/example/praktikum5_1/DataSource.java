package com.example.praktikum5_1;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Post> posts = generateDummyPosts();

    private static ArrayList<Post> generateDummyPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Ion", "Slone", "https://static.wikia.nocookie.net/titanfall/images/0/0a/Ion_1.jpg/revision/latest?cb=20170523212640", "Atlas", "https://static.wikia.nocookie.net/titanfall/images/1/1d/IonIcon.png/revision/latest?cb=20170627154952"));
        posts.add(new Post("Scorch", "Kane", "https://static.wikia.nocookie.net/titanfall/images/d/d5/Scorch_1.jpg/revision/latest?cb=20170523211614", "Ogre", "https://static.wikia.nocookie.net/titanfall/images/d/d5/ScorchIcon.png/revision/latest?cb=20170627154342"));
        posts.add(new Post("Northstar", "Viper", "https://static.wikia.nocookie.net/titanfall/images/6/63/Northstar_1.jpg/revision/latest?cb=20170523210536", "Stryder", "https://static.wikia.nocookie.net/titanfall/images/5/58/NorthstarIcon.png/revision/latest?cb=20170627154503"));
        posts.add(new Post("Ronin", "Ash", "https://static.wikia.nocookie.net/titanfall/images/7/7c/TF2_Ronin_1.jpg/revision/latest?cb=20170523211055", "Stryder", "https://static.wikia.nocookie.net/titanfall/images/7/7b/RoninIcon.png/revision/latest?cb=20170627154554"));
        posts.add(new Post("Tone", "Richter", "https://static.wikia.nocookie.net/titanfall/images/0/0c/Tone_1.jpg/revision/latest?cb=20170523212116", "Atlas", "https://static.wikia.nocookie.net/titanfall/images/6/62/ToneIcon.png/revision/latest?cb=20170627154425"));
        posts.add(new Post("Legion", "Kuben Blisk", "https://static.wikia.nocookie.net/titanfall/images/7/72/Legion_1.jpg/revision/latest?cb=20170523212759", "Ogre", "https://static.wikia.nocookie.net/titanfall/images/f/f0/LegionIcon.png/revision/latest?cb=20170627154711"));
        posts.add(new Post("Monarch", "Jack Cooper", "https://static.wikia.nocookie.net/titanfall/images/4/49/USER_Monarch_-_Render_HQ.png/revision/latest?cb=20180409232141", "Vanguard", "https://static.wikia.nocookie.net/titanfall/images/a/a3/MonarchIcon.png/revision/latest?cb=20170627154804"));
        return posts;
    }
}
