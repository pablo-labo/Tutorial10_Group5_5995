package defpackage;

import defpackage.e47;
import defpackage.emf;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u9c extends emf {
    public static final u9c g;
    public static final Object h;
    public final e47<a> e;
    public final a f;

    public static final class a {
        public final ij9 a;
        public final long b;
        public final long c;

        public a(ij9 ij9Var, long j, long j2) {
            this.a = ij9Var;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a.equals(aVar.a) && this.c == aVar.c;
        }

        public final int hashCode() {
            long j = this.b;
            int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
            long j2 = this.c;
            return iHashCode + ((int) ((j2 >>> 32) ^ j2));
        }
    }

    static {
        e47.b bVar = e47.b;
        g = new u9c(qyc.e, null);
        h = new Object();
    }

    public u9c(e47<a> e47Var, a aVar) {
        this.e = e47Var;
        this.f = aVar;
    }

    @Override // defpackage.emf
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.emf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9c)) {
            return false;
        }
        u9c u9cVar = (u9c) obj;
        return Objects.equals(this.e, u9cVar.e) && Objects.equals(this.f, u9cVar.f);
    }

    @Override // defpackage.emf
    public final emf.b f(int i, emf.b bVar, boolean z) {
        a aVarS = s(i);
        Long lValueOf = Long.valueOf(aVarS.b);
        long jO = vjg.O(aVarS.c);
        bVar.getClass();
        bVar.i(lValueOf, null, i, jO, 0L, ba.f, false);
        return bVar;
    }

    @Override // defpackage.emf
    public final int h() {
        return o();
    }

    @Override // defpackage.emf
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.emf
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.emf
    public final emf.d m(int i, emf.d dVar, long j) {
        a aVarS = s(i);
        dVar.b(h, aVarS.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, vjg.O(aVarS.c), i, i, 0L);
        return dVar;
    }

    @Override // defpackage.emf
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final u9c q(int i, List<ij9> list) {
        e47.a aVar = new e47.a();
        e47<a> e47Var = this.e;
        aVar.d(e47Var.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            aVar.c(new a(list.get(i2), -1L, -9223372036854775807L));
        }
        aVar.d(e47Var.subList(i, e47Var.size()));
        return new u9c(aVar.f(), this.f);
    }

    public final long r(int i) {
        if (i < 0) {
            return -1L;
        }
        e47<a> e47Var = this.e;
        if (i < e47Var.size()) {
            return e47Var.get(i).b;
        }
        return -1L;
    }

    public final a s(int i) {
        a aVar;
        e47<a> e47Var = this.e;
        return (i != e47Var.size() || (aVar = this.f) == null) ? e47Var.get(i) : aVar;
    }
}
