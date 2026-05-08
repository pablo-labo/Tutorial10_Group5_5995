package defpackage;

import android.os.ConditionVariable;
import androidx.media3.datasource.cache.c;

/* JADX INFO: loaded from: classes.dex */
public final class kfe extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfe(c cVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = cVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            c.h(this.b);
            this.b.b.getClass();
        }
    }
}
