package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import defpackage.emf;
import defpackage.grf;
import defpackage.ka2;
import defpackage.sdb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {
    public final ArrayList<h.c> a = new ArrayList<>(1);
    public final HashSet<h.c> b = new HashSet<>(1);
    public final i.a c = new i.a(new CopyOnWriteArrayList(), 0, null);
    public final a.C0043a d = new a.C0043a();
    public Looper e;
    public emf f;
    public sdb g;

    @Override // androidx.media3.exoplayer.source.h
    public final void b(Handler handler, i iVar) {
        handler.getClass();
        i.a aVar = this.c;
        aVar.getClass();
        CopyOnWriteArrayList<i.a.C0050a> copyOnWriteArrayList = aVar.c;
        i.a.C0050a c0050a = new i.a.C0050a();
        c0050a.a = handler;
        c0050a.b = iVar;
        copyOnWriteArrayList.add(c0050a);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void c(i iVar) {
        CopyOnWriteArrayList<i.a.C0050a> copyOnWriteArrayList = this.c.c;
        for (i.a.C0050a c0050a : copyOnWriteArrayList) {
            if (c0050a.b == iVar) {
                copyOnWriteArrayList.remove(c0050a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void e(Handler handler, androidx.media3.exoplayer.drm.a aVar) {
        handler.getClass();
        a.C0043a c0043a = this.d;
        c0043a.getClass();
        CopyOnWriteArrayList<a.C0043a.C0044a> copyOnWriteArrayList = c0043a.c;
        a.C0043a.C0044a c0044a = new a.C0043a.C0044a();
        c0044a.a = handler;
        c0044a.b = aVar;
        copyOnWriteArrayList.add(c0044a);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void g(androidx.media3.exoplayer.drm.a aVar) {
        CopyOnWriteArrayList<a.C0043a.C0044a> copyOnWriteArrayList = this.d.c;
        for (a.C0043a.C0044a c0044a : copyOnWriteArrayList) {
            if (c0044a.b == aVar) {
                copyOnWriteArrayList.remove(c0044a);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void i(h.c cVar) {
        this.e.getClass();
        HashSet<h.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            s();
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void j(h.c cVar, grf grfVar, sdb sdbVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        ka2.l(looper == null || looper == looperMyLooper);
        this.g = sdbVar;
        emf emfVar = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(cVar);
            t(grfVar);
        } else if (emfVar != null) {
            i(cVar);
            cVar.a(this, emfVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void k(h.c cVar) {
        ArrayList<h.c> arrayList = this.a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            l(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        v();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void l(h.c cVar) {
        HashSet<h.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        r();
    }

    public final i.a q(h.b bVar) {
        return new i.a(this.c.c, 0, bVar);
    }

    public void r() {
    }

    public void s() {
    }

    public abstract void t(grf grfVar);

    public final void u(emf emfVar) {
        this.f = emfVar;
        Iterator<h.c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(this, emfVar);
        }
    }

    public abstract void v();
}
