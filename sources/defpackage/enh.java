package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class enh extends gkh {
    public static final enh e = new enh(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public enh(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.gkh, defpackage.qjh
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.qjh
    public final int b() {
        return this.d;
    }

    @Override // defpackage.qjh
    public final int c() {
        return 0;
    }

    @Override // defpackage.qjh
    public final Object[] e() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zih.a(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
