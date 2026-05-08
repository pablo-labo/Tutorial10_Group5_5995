package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rth extends oth {
    public static final rth e = new rth(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public rth(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.oth, defpackage.gth
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // defpackage.gth
    public final int b() {
        return this.d;
    }

    @Override // defpackage.gth
    public final int c() {
        return 0;
    }

    @Override // defpackage.gth
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gth
    public final Object[] f() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        beb.p(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
