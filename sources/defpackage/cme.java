package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class cme extends qse implements x2a, fme<Float> {
    public a b;

    public static final class a extends rse {
        public float c;

        public a(long j, float f) {
            super(j);
            this.c = f;
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
    public final hme<Float> d() {
        return wab.a0;
    }

    @Override // defpackage.x2a
    public final float g() {
        return ((a) ame.s(this.b, this)).c;
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

    @Override // defpackage.x2a
    public final void q(float f) {
        wle wleVarJ;
        a aVar = (a) ame.h(this.b);
        if (aVar.c == f) {
            return;
        }
        a aVar2 = this.b;
        synchronized (ame.c) {
            wle.e.getClass();
            wleVarJ = ame.j();
            ((a) ame.n(aVar2, this, wleVarJ, aVar)).c = f;
            j6g j6gVar = j6g.a;
        }
        ame.m(wleVarJ, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((a) ame.h(this.b)).c + ")@" + hashCode();
    }
}
