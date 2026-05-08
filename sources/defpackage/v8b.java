package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class v8b<K, V, T> implements Iterator<T>, ze8 {
    public final ttf<K, V, T>[] a;
    public int b;
    public boolean c = true;

    public v8b(stf<K, V> stfVar, ttf<K, V, T>[] ttfVarArr) {
        this.a = ttfVarArr;
        ttfVarArr[0].a(stfVar.d, Integer.bitCount(stfVar.a) * 2, 0);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        ttf<K, V, T>[] ttfVarArr = this.a;
        ttf<K, V, T> ttfVar = ttfVarArr[i];
        if (ttfVar.c < ttfVar.b) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                ttf<K, V, T> ttfVar2 = ttfVarArr[i];
                int i2 = ttfVar2.c;
                Object[] objArr = ttfVar2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ttfVar2.c = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                ttf<K, V, T> ttfVar3 = ttfVarArr[i - 1];
                int i3 = ttfVar3.c;
                int length2 = ttfVar3.a.length;
                ttfVar3.c = i3 + 1;
            }
            ttfVarArr[i].a(stf.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        ttf<K, V, T>[] ttfVarArr = this.a;
        ttf<K, V, T> ttfVar = ttfVarArr[i];
        int i2 = ttfVar.c;
        if (i2 < ttfVar.b) {
            return i;
        }
        Object[] objArr = ttfVar.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        stf stfVar = (stf) obj;
        if (i == 6) {
            ttf<K, V, T> ttfVar2 = ttfVarArr[i + 1];
            Object[] objArr2 = stfVar.d;
            ttfVar2.a(objArr2, objArr2.length, 0);
        } else {
            ttfVarArr[i + 1].a(stfVar.d, Integer.bitCount(stfVar.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.c) {
            k20.p();
            return null;
        }
        T next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
