package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class x8b<K, V, T> extends v8b<K, V, T> {
    public int V;
    public final w8b<K, V> d;
    public K e;
    public boolean f;

    public x8b(w8b<K, V> w8bVar, ttf<K, V, T>[] ttfVarArr) {
        super(w8bVar.c, ttfVarArr);
        this.d = w8bVar;
        this.V = w8bVar.e;
    }

    public final void d(int i, stf<?, ?> stfVar, K k, int i2) {
        int i3 = i2 * 5;
        ttf<K, V, T>[] ttfVarArr = this.a;
        if (i3 <= 30) {
            int iD = 1 << wtf.d(i, i3);
            if (stfVar.h(iD)) {
                ttfVarArr[i2].a(stfVar.d, Integer.bitCount(stfVar.a) * 2, stfVar.f(iD));
                this.b = i2;
                return;
            } else {
                int iT = stfVar.t(iD);
                stf<?, ?> stfVarS = stfVar.s(iT);
                ttfVarArr[i2].a(stfVar.d, Integer.bitCount(stfVar.a) * 2, iT);
                d(i, stfVarS, k, i2 + 1);
                return;
            }
        }
        ttf<K, V, T> ttfVar = ttfVarArr[i2];
        Object[] objArr = stfVar.d;
        ttfVar.a(objArr, objArr.length, 0);
        while (true) {
            ttf<K, V, T> ttfVar2 = ttfVarArr[i2];
            if (wl7.b(ttfVar2.a[ttfVar2.c], k)) {
                this.b = i2;
                return;
            } else {
                ttfVarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.v8b, java.util.Iterator
    public final T next() {
        if (this.d.e != this.V) {
            q6.h();
            return null;
        }
        if (!this.c) {
            k20.p();
            return null;
        }
        ttf<K, V, T> ttfVar = this.a[this.b];
        this.e = (K) ttfVar.a[ttfVar.c];
        this.f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v8b, java.util.Iterator
    public final void remove() {
        if (!this.f) {
            bg.h();
            return;
        }
        boolean z = this.c;
        w8b<K, V> w8bVar = this.d;
        if (!z) {
            pxf.b(w8bVar).remove(this.e);
        } else {
            if (!z) {
                k20.p();
                return;
            }
            ttf<K, V, T> ttfVar = this.a[this.b];
            Object obj = ttfVar.a[ttfVar.c];
            pxf.b(w8bVar).remove(this.e);
            d(obj != null ? obj.hashCode() : 0, w8bVar.c, obj, 0);
        }
        this.e = null;
        this.f = false;
        this.V = w8bVar.e;
    }
}
