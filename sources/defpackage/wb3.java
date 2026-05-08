package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wb3<T> implements y9f<T> {
    public final int a;
    public final int b;
    public n3d c;

    public wb3() {
        if (!xjg.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            l5.q("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.y9f
    public final n3d a() {
        return this.c;
    }

    @Override // defpackage.y9f
    public void b() {
    }

    @Override // defpackage.y9f
    public final void c(n3d n3dVar) {
        this.c = n3dVar;
    }

    @Override // defpackage.y9f
    public final void e(qhe qheVar) throws Throwable {
        qheVar.m(this.a, this.b);
    }

    @Override // defpackage.xv8
    public final void f() {
    }

    @Override // defpackage.xv8
    public final void onDestroy() {
    }

    @Override // defpackage.xv8
    public final void onStop() {
    }
}
