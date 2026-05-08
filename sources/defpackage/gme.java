package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class gme<T> extends qse implements fme<T> {
    public final hme<T> b;
    public a<T> c;

    public static final class a<T> extends rse {
        public T c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, long j) {
            super(j);
            this.c = obj;
        }

        @Override // defpackage.rse
        public final void a(rse rseVar) {
            rseVar.getClass();
            this.c = ((a) rseVar).c;
        }

        @Override // defpackage.rse
        public final rse b() {
            return new a(this.c, ame.j().g());
        }

        @Override // defpackage.rse
        public final rse c(long j) {
            return new a(this.c, ame.j().g());
        }
    }

    public gme(T t, hme<T> hmeVar) {
        this.b = hmeVar;
        wle wleVarJ = ame.j();
        a<T> aVar = new a<>(t, wleVarJ.g());
        if (!(wleVarJ instanceof ca6)) {
            aVar.b = new a(t, 1L);
        }
        this.c = aVar;
    }

    @Override // defpackage.fme
    public final hme<T> d() {
        return this.b;
    }

    @Override // defpackage.ese
    public final T getValue() {
        return ((a) ame.s(this.c, this)).c;
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        this.c = (a) rseVar;
    }

    @Override // defpackage.pse
    public final rse n() {
        return this.c;
    }

    @Override // defpackage.pse
    public final rse o(rse rseVar, rse rseVar2, rse rseVar3) {
        if (this.b.k(((a) rseVar2).c, ((a) rseVar3).c)) {
            return rseVar2;
        }
        return null;
    }

    @Override // defpackage.g4a
    public final void setValue(T t) {
        wle wleVarJ;
        a aVar = (a) ame.h(this.c);
        if (this.b.k(aVar.c, t)) {
            return;
        }
        a<T> aVar2 = this.c;
        synchronized (ame.c) {
            wle.e.getClass();
            wleVarJ = ame.j();
            ((a) ame.n(aVar2, this, wleVarJ, aVar)).c = t;
            j6g j6gVar = j6g.a;
        }
        ame.m(wleVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) ame.h(this.c)).c + ")@" + hashCode();
    }
}
