package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw8 implements xv8 {
    public final /* synthetic */ kv8 a;
    public final /* synthetic */ ew8 b;

    public dw8(ew8 ew8Var, aw8 aw8Var) {
        this.b = ew8Var;
        this.a = aw8Var;
    }

    @Override // defpackage.xv8
    public final void f() {
    }

    @Override // defpackage.xv8
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override // defpackage.xv8
    public final void onStop() {
    }
}
