package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s96 implements ceb, zdb {
    public final String a;
    public final q96 b;

    public s96(String str, q96 q96Var) {
        str.getClass();
        q96Var.getClass();
        this.a = str;
        this.b = q96Var;
    }

    @Override // defpackage.ceb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.zdb
    public final c00 b() {
        return new c00(new r96(this.b, 0));
    }
}
