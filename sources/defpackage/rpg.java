package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class rpg implements Choreographer.FrameCallback {
    public final /* synthetic */ qpg a;

    public rpg(qpg qpgVar) {
        this.a = qpgVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.o0.run();
    }
}
