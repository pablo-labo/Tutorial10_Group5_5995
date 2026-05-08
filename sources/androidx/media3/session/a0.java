package androidx.media3.session;

import android.os.Handler;
import defpackage.ht0;
import defpackage.j2;
import defpackage.q9;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public int b;
    public q9 d;
    public Handler e;
    public boolean f;
    public final Object a = new Object();
    public final ht0<Integer, a<?>> c = new ht0<>();

    public static final class a<T> extends j2<T> {
        public final int W;
        public final T X;

        public a(int i, T t) {
            this.W = i;
            this.X = t;
        }

        public final void n() {
            super.l(this.X);
        }
    }

    public final <T> a<T> a(T t) {
        a<T> aVar;
        synchronized (this.a) {
            try {
                int iB = b();
                aVar = new a<>(iB, t);
                if (this.f) {
                    aVar.n();
                } else {
                    this.c.put(Integer.valueOf(iB), aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            i = this.b;
            this.b = i + 1;
        }
        return i;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this.a) {
            try {
                this.f = true;
                arrayList = new ArrayList(this.c.values());
                this.c.clear();
                if (this.d != null) {
                    Handler handler = this.e;
                    handler.getClass();
                    handler.post(this.d);
                    this.d = null;
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).n();
        }
    }

    public final <T> void d(int i, T t) {
        synchronized (this.a) {
            try {
                a<?> aVarRemove = this.c.remove(Integer.valueOf(i));
                if (aVarRemove != null) {
                    if (aVarRemove.X.getClass() == t.getClass()) {
                        aVarRemove.l(t);
                    } else {
                        zkd.T("SequencedFutureManager", "Type mismatch, expected " + aVarRemove.X.getClass() + ", but was " + t.getClass());
                    }
                }
                if (this.d != null && this.c.isEmpty()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
