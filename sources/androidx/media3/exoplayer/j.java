package androidx.media3.exoplayer;

import android.os.Looper;
import defpackage.emf;
import defpackage.ka2;
import defpackage.n2f;
import defpackage.zkd;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final b a;
    public final a b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public interface a {
    }

    public interface b {
        void m(int i, Object obj);
    }

    public j(a aVar, b bVar, emf emfVar, int i, n2f n2fVar, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        ka2.q(!this.f);
        this.f = true;
        e eVar = (e) this.b;
        if (!eVar.x0 && eVar.Y.getThread().isAlive()) {
            eVar.W.e(14, this).b();
        } else {
            zkd.T("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
