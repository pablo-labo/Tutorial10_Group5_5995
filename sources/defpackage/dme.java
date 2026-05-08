package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dme extends qse implements c3a, fme<Integer> {
    public a b;

    public static final class a extends rse {
        public int c;

        public a(long j, int i) {
            super(j);
            this.c = i;
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

    @Override // defpackage.fme
    public final hme<Integer> d() {
        return wab.a0;
    }

    @Override // defpackage.c3a
    public final int e() {
        return ((a) ame.s(this.b, this)).c;
    }

    @Override // defpackage.c3a
    public final void h(int i) {
        wle wleVarJ;
        a aVar = (a) ame.h(this.b);
        if (aVar.c != i) {
            a aVar2 = this.b;
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                ((a) ame.n(aVar2, this, wleVarJ, aVar)).c = i;
                j6g j6gVar = j6g.a;
            }
            ame.m(wleVarJ, this);
        }
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
        return "MutableIntState(value=" + ((a) ame.h(this.b)).c + ")@" + hashCode();
    }
}
