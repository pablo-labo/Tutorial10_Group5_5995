package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class a89<K, V> {
    public final int a;
    public final e89<K, V> b;
    public final hh2 c;
    public int d;
    public int e;
    public int f;

    public a89(int i) {
        this.a = i;
        if (i <= 0) {
            l5.q("maxSize <= 0");
            throw null;
        }
        this.b = new e89<>();
        this.c = new hh2(22);
    }

    public void a(boolean z, K k, V v, V v2) {
        k.getClass();
        v.getClass();
    }

    public final V b(K k) {
        k.getClass();
        synchronized (this.c) {
            e89<K, V> e89Var = this.b;
            e89Var.getClass();
            V v = e89Var.a.get(k);
            if (v != null) {
                this.e++;
                return v;
            }
            this.f++;
            return null;
        }
    }

    public final V c(K k, V v) {
        V vPut;
        k.getClass();
        v.getClass();
        synchronized (this.c) {
            try {
                this.d += e(k, v);
                e89<K, V> e89Var = this.b;
                e89Var.getClass();
                vPut = e89Var.a.put(k, v);
                if (vPut != null) {
                    this.d -= e(k, vPut);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            a(false, k, vPut, v);
        }
        g(this.a);
        return vPut;
    }

    public final V d(K k) {
        V vRemove;
        synchronized (this.c) {
            try {
                e89<K, V> e89Var = this.b;
                e89Var.getClass();
                vRemove = e89Var.a.remove(k);
                if (vRemove != null) {
                    this.d -= e(k, vRemove);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            a(false, k, vRemove, null);
        }
        return vRemove;
    }

    public final int e(K k, V v) {
        int iF = f(k, v);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException("Negative size: " + k + '=' + v);
    }

    public int f(K k, V v) {
        k.getClass();
        v.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r6) {
        /*
            r5 = this;
        L0:
            hh2 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L65
            e89<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap<K, V> r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L65
            goto L18
        L16:
            r5 = move-exception
            goto L6d
        L18:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L63
            e89<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap<K, V> r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L63
        L27:
            e89<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap<K, V> r1 = r1.a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = defpackage.z92.P0(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            e89<K, V> r3 = r5.b     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap<K, V> r3 = r3.a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.d     // Catch: java.lang.Throwable -> L16
            int r4 = r5.e(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r3 = 1
            r5.a(r3, r2, r1, r0)
            goto L0
        L63:
            monitor-exit(r0)
            return
        L65:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L16
            throw r6     // Catch: java.lang.Throwable -> L16
        L6d:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a89.g(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
