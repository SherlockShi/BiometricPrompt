package com.hailong.biometricprompt.uitls;

import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;

/**
 * Author:      SherlockShi
 * Email:       sherlock_shi@163.com
 * Date:        2020-06-04 09:26
 * Description: https://blog.csdn.net/dianziagen/article/details/79555532
 */
public class AnimationUtil {

    /**
     * 晃动动画
     *
     * @return
     */
    public static Animation shake() {
        int count = 3;
        Animation translateAnimation = new TranslateAnimation(0, 10, 0, 0);
        //设置一个循环加速器，使用传入的次数就会出现摆动的效果。
        translateAnimation.setInterpolator(new CycleInterpolator(count));
        translateAnimation.setDuration(500);
        return translateAnimation;
    }
}
