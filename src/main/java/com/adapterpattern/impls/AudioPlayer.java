package com.adapterpattern.impls;

import com.adapterpattern.apis.MediaPlayer;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if("mp3".equals(audioType)){
            System.out.println("palying mp3 file, filename:"+fileName);
        }else if("vlc".equals(audioType) || "mp4".equals(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("invalid media " + audioType + " format not support");
        }
    }
}
