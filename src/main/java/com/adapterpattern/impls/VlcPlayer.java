package com.adapterpattern.impls;

import com.adapterpattern.apis.AdvancedMediaPlayer;

/**
 * com.impls [workset_idea_01]
 * Created by Richard on 2018/4/9
 *
 * @author Richard on 2018/4/9
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file, filename:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
