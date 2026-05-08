package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dih extends shh {
    public static final dih W = new dih(new Object[0], 0);
    public final transient int V;
    public final transient Object[] f;

    public dih(Object[] objArr, int i) {
        super(1);
        this.f = objArr;
        this.V = i;
    }

    @Override // defpackage.l7h
    public final Object[] e() {
        return this.f;
    }

    @Override // defpackage.l7h
    public final int f() {
        return 0;
    }

    @Override // defpackage.l7h
    public final int g() {
        return this.V;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qki.a(i, this.V);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.shh, defpackage.l7h
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.V;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.V;
    }
}
