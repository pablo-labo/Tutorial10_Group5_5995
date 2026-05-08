package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q6g extends y03 {
    public static final q6g c = new q6g();

    @Override // defpackage.y03
    public final y03 E1(int i) {
        h4.g(i);
        return i >= uaf.d ? this : super.E1(i);
    }

    @Override // defpackage.y03
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        eq3.d.c.h(runnable, true, false);
    }

    @Override // defpackage.y03
    public final void w1(v03 v03Var, Runnable runnable) {
        eq3.d.c.h(runnable, true, true);
    }
}
