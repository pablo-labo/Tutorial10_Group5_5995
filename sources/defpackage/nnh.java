package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nnh extends rlh {
    public static final Object[] W;
    public static final nnh X;
    public final transient int V;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;

    static {
        Object[] objArr = new Object[0];
        W = objArr;
        X = new nnh(objArr, 0, objArr, 0, 0);
    }

    public nnh(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.c = objArr;
        this.d = i;
        this.e = objArr2;
        this.f = i2;
        this.V = i3;
    }

    @Override // defpackage.qjh
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.V;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.qjh
    public final int b() {
        return this.V;
    }

    @Override // defpackage.qjh
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.qjh
    public final s7h d() {
        return j().listIterator(0);
    }

    @Override // defpackage.qjh
    public final Object[] e() {
        return this.c;
    }

    @Override // defpackage.rlh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // defpackage.rlh
    public final gkh k() {
        return gkh.i(this.V, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.V;
    }
}
