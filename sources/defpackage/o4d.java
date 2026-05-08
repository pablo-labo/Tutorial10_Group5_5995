package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o4d {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue<m3d<?>> c;
    public final PriorityBlockingQueue<m3d<?>> d;
    public final w54 e;
    public final qc1 f;
    public final r15 g;
    public final tfa[] h;
    public at1 i;
    public final ArrayList j;
    public final ArrayList k;

    public interface a {
        void a();
    }

    @Deprecated
    public interface b<T> {
        void a();
    }

    public o4d(w54 w54Var, qc1 qc1Var) {
        r15 r15Var = new r15(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = w54Var;
        this.f = qc1Var;
        this.h = new tfa[4];
        this.g = r15Var;
    }

    public final void a(m3d m3dVar) {
        m3dVar.setRequestQueue(this);
        synchronized (this.b) {
            this.b.add(m3dVar);
        }
        m3dVar.setSequence(this.a.incrementAndGet());
        m3dVar.addMarker("add-to-queue");
        b(m3dVar, 0);
        if (m3dVar.shouldCache()) {
            this.c.add(m3dVar);
        } else {
            this.d.add(m3dVar);
        }
    }

    public final void b(m3d<?> m3dVar, int i) {
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
