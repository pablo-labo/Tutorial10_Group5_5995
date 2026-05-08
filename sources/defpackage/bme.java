package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class bme extends qse implements v2a, fme<Double> {
    public a b;

    public static final class a extends rse {
        public double c;

        public a(long j, double d) {
            super(j);
            this.c = d;
        }

        @Override // defpackage.rse
        public final void a(rse rseVar) {
            rseVar.getClass();
            this.c = ((a) rseVar).c;
        }

        @Override // defpackage.rse
        public final rse b() {
            return c(this.a);
        }

        @Override // defpackage.rse
        public final rse c(long j) {
            return new a(j, this.c);
        }
    }

    @Override // defpackage.v2a
    public final double c() {
        return ((a) ame.s(this.b, this)).c;
    }

    @Override // defpackage.fme
    public final hme<Double> d() {
        return wab.a0;
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        this.b = (a) rseVar;
    }

    @Override // defpackage.v2a
    public final void m(double d) {
        wle wleVarJ;
        a aVar = (a) ame.h(this.b);
        if (aVar.c == d) {
            return;
        }
        a aVar2 = this.b;
        synchronized (ame.c) {
            wle.e.getClass();
            wleVarJ = ame.j();
            ((a) ame.n(aVar2, this, wleVarJ, aVar)).c = d;
            j6g j6gVar = j6g.a;
        }
        ame.m(wleVarJ, this);
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
        return "MutableDoubleState(value=" + ((a) ame.h(this.b)).c + ")@" + hashCode();
    }
}
