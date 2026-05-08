package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j31 extends p8b {
    public final long a;
    public final atf b;
    public final iy4 c;

    public j31(long j, atf atfVar, iy4 iy4Var) {
        this.a = j;
        if (atfVar == null) {
            ja.k("Null transportContext");
            throw null;
        }
        this.b = atfVar;
        if (iy4Var != null) {
            this.c = iy4Var;
        } else {
            ja.k("Null event");
            throw null;
        }
    }

    @Override // defpackage.p8b
    public final iy4 a() {
        return this.c;
    }

    @Override // defpackage.p8b
    public final long b() {
        return this.a;
    }

    @Override // defpackage.p8b
    public final atf c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p8b)) {
            return false;
        }
        p8b p8bVar = (p8b) obj;
        return this.a == p8bVar.b() && this.b.equals(p8bVar.c()) && this.c.equals(p8bVar.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
