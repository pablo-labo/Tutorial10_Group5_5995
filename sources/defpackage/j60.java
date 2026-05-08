package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class j60 implements ComponentCallbacks2 {
    public final /* synthetic */ t5d a;

    public j60(t5d t5dVar) {
        this.a = t5dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks
    @sy3
    public final void onLowMemory() {
        this.a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.a.a();
    }
}
