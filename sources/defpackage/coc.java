package defpackage;

import android.view.View;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.scroll.c;
import com.facebook.react.views.scroll.d;
import com.facebook.react.views.scroll.g;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class coc implements Runnable {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ c c;

    public coc(c cVar) {
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeAnimatedModule nativeAnimatedModule;
        c cVar = this.c;
        if (cVar.f) {
            cVar.f = false;
            this.b = 0;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            cVar.postOnAnimationDelayed(this, 20L);
            return;
        }
        d.l(cVar);
        int i = this.b + 1;
        this.b = i;
        if (i < 3) {
            if (cVar.b0 && !this.a) {
                this.a = true;
                cVar.f(0);
            }
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            cVar.postOnAnimationDelayed(this, 20L);
            return;
        }
        cVar.c0 = null;
        if (cVar.f0) {
            d.c(cVar, g.f, 0.0f, 0.0f);
        }
        ReactContext reactContext = (ReactContext) cVar.getContext();
        if (reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null) {
            return;
        }
        nativeAnimatedModule.userDrivenScrollEnded(cVar.getId());
    }
}
