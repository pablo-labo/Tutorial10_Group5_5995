package defpackage;

import android.view.View;
import expo.modules.video.VideoView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wpg<T> {
    public final WeakReference<View> a;

    public wpg(VideoView videoView) {
        this.a = new WeakReference<>(videoView);
    }

    public final upg a(VideoView videoView, qf8 qf8Var) {
        qf8Var.getClass();
        View view = this.a.get();
        if (view != null) {
            return new upg(view, qf8Var.getName());
        }
        r6.g(l5.m("Can't send the '", qf8Var.getName(), "' event from the view that is deallocated"));
        return null;
    }
}
