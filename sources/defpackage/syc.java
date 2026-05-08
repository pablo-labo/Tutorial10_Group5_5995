package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class syc<E> extends i47<E> {
    public static final Object[] X;
    public static final syc<Object> Y;
    public final transient int V;
    public final transient int W;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;

    static {
        Object[] objArr = new Object[0];
        X = objArr;
        Y = new syc<>(objArr, 0, objArr, 0, 0);
    }

    public syc(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.V = i2;
        this.W = i3;
    }

    @Override // defpackage.x37
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.W;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.x37
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iG = hh2.G(obj);
                while (true) {
                    int i = iG & this.V;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iG = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.x37
    public final int d() {
        return this.W;
    }

    @Override // defpackage.x37
    public final int e() {
        return 0;
    }

    @Override // defpackage.x37
    public final boolean f() {
        return false;
    }

    @Override // defpackage.i47, defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public final r6g<E> iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.i47, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.i47
    public final e47<E> l() {
        return e47.i(this.W, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.W;
    }

    @Override // defpackage.i47, defpackage.x37
    public Object writeReplace() {
        return super.writeReplace();
    }
}
