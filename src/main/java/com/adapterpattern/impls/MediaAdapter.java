package com.adapterpattern.impls;

import com.adapterpattern.apis.AdvancedMediaPlayer;
import com.adapterpattern.apis.MediaPlayer;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equals(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equals(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
