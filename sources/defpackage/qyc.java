package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qyc<E> extends e47<E> {
    public static final qyc e = new qyc(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public qyc(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.e47, defpackage.x37
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.x37
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.x37
    public final int d() {
        return this.d;
    }

    @Override // defpackage.x37
    public final int e() {
        return 0;
    }

    @Override // defpackage.x37
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        pnb.s(i, this.d);
        E e2 = (E) this.c[i];
        Objects.requireNonNull(e2);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.e47, defpackage.x37
    public Object writeReplace() {
        return super.writeReplace();
    }
}
