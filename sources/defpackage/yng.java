package defpackage;

import expo.modules.video.VideoView;
import expo.modules.video.VideoViewNotFoundException;
import expo.modules.video.player.VideoPlayer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yng {
    public static final yng a = new yng();
    public static WeakReference<gk0> b = new WeakReference<>(null);
    public static final LinkedHashMap c = new LinkedHashMap();
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final LinkedHashMap e = new LinkedHashMap();
    public static final pug<VideoPlayer> f = new pug<>();
    public static zx0 g;
    public static mng h;

    public static void a() {
        Iterator it = c.values().iterator();
        while (it.hasNext()) {
            ((VideoView) it.next()).setKeepScreenOn(!f.a.isEmpty());
        }
    }

    public static mng b() {
        mng mngVar = h;
        if (mngVar != null) {
            return mngVar;
        }
        wl7.g("cache");
        throw null;
    }

    public static VideoView c(String str) throws VideoViewNotFoundException {
        str.getClass();
        VideoView videoView = (VideoView) c.get(str);
        if (videoView != null) {
            return videoView;
        }
        throw new VideoViewNotFoundException(l5.m("VideoView with id: ", str, " not found"), null);
    }
}
