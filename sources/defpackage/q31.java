package defpackage;

import defpackage.lte;

/* JADX INFO: loaded from: classes2.dex */
public final class q31 extends lte {
    public final r31 a;
    public final t31 b;
    public final s31 c;

    public q31(r31 r31Var, t31 t31Var, s31 s31Var) {
        this.a = r31Var;
        this.b = t31Var;
        this.c = s31Var;
    }

    @Override // defpackage.lte
    public final lte.a a() {
        return this.a;
    }

    @Override // defpackage.lte
    public final lte.b b() {
        return this.c;
    }

    @Override // defpackage.lte
    public final lte.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lte)) {
            return false;
        }
        lte lteVar = (lte) obj;
        return this.a.equals(lteVar.a()) && this.b.equals(lteVar.c()) && this.c.equals(lteVar.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
