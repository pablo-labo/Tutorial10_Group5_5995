package defpackage;

import android.os.SystemClock;
import defpackage.rn9;
import defpackage.t13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d89<K, V> implements t13<K, V>, rn9<K, V> {
    public final s13<K, t13.a<K, V>> b;
    public final s13<K, t13.a<K, V>> c;
    public final jlg<V> d;
    public final gze<tn9> e;
    public tn9 f;
    public long g;

    public d89(jlg jlgVar, rn9.a aVar, gze gzeVar) {
        new WeakHashMap();
        this.d = jlgVar;
        this.b = new s13<>(new b89(this, jlgVar));
        this.c = new s13<>(new b89(this, jlgVar));
        this.e = gzeVar;
        tn9 tn9Var = (tn9) gzeVar.get();
        web.h(tn9Var, "mMemoryCacheParamsSupplier returned null");
        this.f = tn9Var;
        this.g = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    @Override // defpackage.rn9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.n82<V> a(K r7, defpackage.n82<V> r8) {
        /*
            r6 = this;
            r7.getClass()
            r8.getClass()
            r6.f()
            monitor-enter(r6)
            s13<K, t13$a<K, V>> r0 = r6.b     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.e(r7)     // Catch: java.lang.Throwable -> L2d
            t13$a r0 = (t13.a) r0     // Catch: java.lang.Throwable -> L2d
            s13<K, t13$a<K, V>> r0 = r6.c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.e(r7)     // Catch: java.lang.Throwable -> L2d
            t13$a r0 = (t13.a) r0     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L32
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r0.d     // Catch: java.lang.Throwable -> L2f
            r3 = r3 ^ r1
            defpackage.web.i(r3)     // Catch: java.lang.Throwable -> L2f
            r0.d = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            n82 r0 = r6.h(r0)     // Catch: java.lang.Throwable -> L2d
            goto L33
        L2d:
            r7 = move-exception
            goto L96
        L2f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2d
        L32:
            r0 = r2
        L33:
            java.lang.Object r3 = r8.P()     // Catch: java.lang.Throwable -> L2d
            jlg<V> r4 = r6.d     // Catch: java.lang.Throwable -> L2d
            int r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L2d
            tn9 r4 = r6.f     // Catch: java.lang.Throwable -> L71
            int r4 = r4.d     // Catch: java.lang.Throwable -> L71
            if (r3 > r4) goto L79
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L71
            s13<K, t13$a<K, V>> r4 = r6.c     // Catch: java.lang.Throwable -> L76
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L76
            s13<K, t13$a<K, V>> r5 = r6.b     // Catch: java.lang.Throwable -> L76
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L76
            int r4 = r4 - r5
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            tn9 r5 = r6.f     // Catch: java.lang.Throwable -> L71
            int r5 = r5.b     // Catch: java.lang.Throwable -> L71
            int r5 = r5 - r1
            if (r4 > r5) goto L79
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L71
            s13<K, t13$a<K, V>> r4 = r6.c     // Catch: java.lang.Throwable -> L73
            int r4 = r4.c()     // Catch: java.lang.Throwable -> L73
            s13<K, t13$a<K, V>> r5 = r6.b     // Catch: java.lang.Throwable -> L73
            int r5 = r5.c()     // Catch: java.lang.Throwable -> L73
            int r4 = r4 - r5
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            tn9 r5 = r6.f     // Catch: java.lang.Throwable -> L71
            int r5 = r5.a     // Catch: java.lang.Throwable -> L71
            int r5 = r5 - r3
            if (r4 > r5) goto L79
            goto L7a
        L71:
            r7 = move-exception
            goto L94
        L73:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L73
            throw r7     // Catch: java.lang.Throwable -> L71
        L76:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L76
            throw r7     // Catch: java.lang.Throwable -> L71
        L79:
            r1 = 0
        L7a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L8c
            t13$a r1 = new t13$a     // Catch: java.lang.Throwable -> L2d
            r2 = -1
            r1.<init>(r7, r8, r2)     // Catch: java.lang.Throwable -> L2d
            s13<K, t13$a<K, V>> r8 = r6.c     // Catch: java.lang.Throwable -> L2d
            r8.d(r7, r1)     // Catch: java.lang.Throwable -> L2d
            im3 r2 = r6.g(r1)     // Catch: java.lang.Throwable -> L2d
        L8c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            defpackage.n82.G(r0)
            r6.e()
            return r2
        L94:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L2d
        L96:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d89.a(java.lang.Object, n82):n82");
    }

    @Override // defpackage.rn9
    public final synchronized boolean b(tf2 tf2Var) {
        return !this.c.b(tf2Var).isEmpty();
    }

    @Override // defpackage.rn9
    public final int c(cjb<K> cjbVar) {
        ArrayList<t13.a<K, V>> arrayListF;
        ArrayList<t13.a<K, V>> arrayListF2;
        synchronized (this) {
            arrayListF = this.b.f(cjbVar);
            arrayListF2 = this.c.f(cjbVar);
            d(arrayListF2);
        }
        Iterator<t13.a<K, V>> it = arrayListF2.iterator();
        while (it.hasNext()) {
            n82.G(h(it.next()));
        }
        for (t13.a<K, V> aVar : arrayListF) {
        }
        f();
        e();
        return arrayListF2.size();
    }

    public final synchronized void d(ArrayList<t13.a<K, V>> arrayList) {
        if (arrayList != null) {
            for (t13.a<K, V> aVar : arrayList) {
                synchronized (this) {
                    aVar.getClass();
                    web.i(!aVar.d);
                    aVar.d = true;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            monitor-enter(r5)
            tn9 r0 = r5.f     // Catch: java.lang.Throwable -> L6f
            r0.getClass()     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.b     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6f
            s13<K, t13$a<K, V>> r1 = r5.c     // Catch: java.lang.Throwable -> L74
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L74
            s13<K, t13$a<K, V>> r2 = r5.b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L74
            int r1 = r1 - r2
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 - r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> L6f
            tn9 r1 = r5.f     // Catch: java.lang.Throwable -> L6f
            int r2 = r1.c     // Catch: java.lang.Throwable -> L6f
            int r1 = r1.a     // Catch: java.lang.Throwable -> L6f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6f
            s13<K, t13$a<K, V>> r3 = r5.c     // Catch: java.lang.Throwable -> L71
            int r3 = r3.c()     // Catch: java.lang.Throwable -> L71
            s13<K, t13$a<K, V>> r4 = r5.b     // Catch: java.lang.Throwable -> L71
            int r4 = r4.c()     // Catch: java.lang.Throwable -> L71
            int r3 = r3 - r4
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 - r3
            int r1 = java.lang.Math.min(r2, r1)     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r0 = r5.i(r0, r1)     // Catch: java.lang.Throwable -> L6f
            r5.d(r0)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L5b
            java.util.Iterator r1 = r0.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            t13$a r2 = (t13.a) r2
            n82 r2 = r5.h(r2)
            defpackage.n82.G(r2)
            goto L47
        L5b:
            if (r0 == 0) goto L6e
            java.util.Iterator r5 = r0.iterator()
        L61:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            t13$a r0 = (t13.a) r0
            goto L61
        L6e:
            return
        L6f:
            r0 = move-exception
            goto L77
        L71:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L6f
        L74:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L6f
        L77:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d89.e():void");
    }

    public final synchronized void f() {
        long j = this.g;
        this.f.getClass();
        if (j + 300000 > SystemClock.uptimeMillis()) {
            return;
        }
        this.g = SystemClock.uptimeMillis();
        tn9 tn9Var = this.e.get();
        web.h(tn9Var, "mMemoryCacheParamsSupplier returned null");
        this.f = tn9Var;
    }

    public final synchronized im3 g(t13.a aVar) {
        synchronized (this) {
            web.i(!aVar.d);
            aVar.c++;
        }
        return n82.d0(aVar.b.P(), new c89(this, aVar), n82.f);
        return n82.d0(aVar.b.P(), new c89(this, aVar), n82.f);
    }

    @Override // defpackage.rn9
    public final n82<V> get(K k) {
        t13.a<K, V> aVar;
        im3 im3VarG;
        k.getClass();
        synchronized (this) {
            try {
                this.b.e(k);
                s13<K, t13.a<K, V>> s13Var = this.c;
                synchronized (s13Var) {
                    aVar = s13Var.b.get(k);
                }
                t13.a<K, V> aVar2 = aVar;
                im3VarG = aVar2 != null ? g(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        e();
        return im3VarG;
    }

    public final synchronized n82<V> h(t13.a<K, V> aVar) {
        aVar.getClass();
        return (aVar.d && aVar.c == 0) ? aVar.b : null;
    }

    public final synchronized ArrayList<t13.a<K, V>> i(int i, int i2) {
        K next;
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.b.a() <= iMax && this.b.c() <= iMax2) {
            return null;
        }
        ArrayList<t13.a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.b.a() <= iMax && this.b.c() <= iMax2) {
                return arrayList;
            }
            s13<K, t13.a<K, V>> s13Var = this.b;
            synchronized (s13Var) {
                next = s13Var.b.isEmpty() ? null : s13Var.b.keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.b.a()), Integer.valueOf(this.b.c())));
            }
            this.b.e(next);
            arrayList.add(this.c.e(next));
        }
    }
}
