package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import defpackage.akb;
import defpackage.o6;
import defpackage.v40;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c0<E> extends c<E> implements RandomAccess {
    public static final c0<Object> d;
    public E[] b;
    public int c;

    static {
        c0<Object> c0Var = new c0<>(new Object[0], 0);
        d = c0Var;
        c0Var.a = false;
    }

    public c0(E[] eArr, int i) {
        this.b = eArr;
        this.c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.p.c
    public final p.c Q0(int i) {
        if (i >= this.c) {
            return new c0(Arrays.copyOf(this.b, i), this.c);
        }
        o6.h();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            v40.k(this.c, o6.g(i, "Index:", ", Size:"));
            return;
        }
        E[] eArr = this.b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[akb.a(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
            this.b = eArr2;
        }
        this.b[i] = e;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.c) {
            v40.k(this.c, o6.g(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        b(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        b(i);
        E[] eArr = this.b;
        E e = eArr[i];
        if (i < this.c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        b(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        a();
        int i = this.c;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
