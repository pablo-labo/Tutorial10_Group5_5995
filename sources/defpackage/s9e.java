package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s9e {
    public final nm0 a;
    public final w74 b;
    public long c;
    public long d;
    public String e;
    public long f;

    public s9e(nm0 nm0Var, w74 w74Var) {
        this.a = nm0Var;
        this.b = w74Var;
        this.c = nm0Var.j("lastActivityTime");
        this.d = nm0Var.j("currentSessionStartTime");
        this.e = nm0Var.e("currentSessionId", "");
        this.f = nm0Var.j("lastSessionEndTime");
    }

    public final String a() {
        return this.e;
    }
}
