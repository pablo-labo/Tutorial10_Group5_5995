package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class eqa implements OnBackAnimationCallback {
    public final /* synthetic */ xpa a;
    public final /* synthetic */ ypa b;
    public final /* synthetic */ zpa c;
    public final /* synthetic */ aqa d;

    public eqa(xpa xpaVar, ypa ypaVar, zpa zpaVar, aqa aqaVar) {
        this.a = xpaVar;
        this.b = ypaVar;
        this.c = zpaVar;
        this.d = aqaVar;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new f71(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new f71(backEvent));
    }
}
