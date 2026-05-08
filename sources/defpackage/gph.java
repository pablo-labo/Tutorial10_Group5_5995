package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gph extends mnh {
    public static final gph e = new gph(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public gph(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.mnh, defpackage.wmh
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wmh
    public final int b() {
        return this.d;
    }

    @Override // defpackage.wmh
    public final int c() {
        return 0;
    }

    @Override // defpackage.wmh
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zlh.a(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
