package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class eme extends qse implements m3a, fme<Long> {
    public a b;

    public static final class a extends rse {
        public long c;

        public a(long j, long j2) {
            super(j);
            this.c = j2;
        }

        @Override // defpackage.rse
        public final void a(rse rseVar) {
            rseVar.getClass();
            this.c = ((a) rseVar).c;
        }

        @Override // defpackage.rse
        public final rse b() {
            return c(ame.j().g());
        }

        @Override // defpackage.rse
        public final rse c(long j) {
            return new a(j, this.c);
        }
    }

    @Override // defpackage.m3a
    public final long a() {
        return ((a) ame.s(this.b, this)).c;
    }

    @Override // defpackage.fme
    public final hme<Long> d() {
        return wab.a0;
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        this.b = (a) rseVar;
    }

    @Override // defpackage.pse
    public final rse n() {
        return this.b;
    }

    @Override // defpackage.pse
    public final rse o(rse rseVar, rse rseVar2, rse rseVar3) {
        if (((a) rseVar2).c == ((a) rseVar3).c) {
            return rseVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) ame.h(this.b)).c + ")@" + hashCode();
    }

    @Override // defpackage.m3a
    public final void v(long j) {
        wle wleVarJ;
        a aVar = (a) ame.h(this.b);
        if (aVar.c != j) {
            a aVar2 = this.b;
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                ((a) ame.n(aVar2, this, wleVarJ, aVar)).c = j;
                j6g j6gVar = j6g.a;
            }
            ame.m(wleVarJ, this);
        }
    }
}
