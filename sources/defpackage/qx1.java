package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qx1 implements rxf {
    public final rxf a;
    public final w62 b;
    public final int c;

    public qx1(rxf rxfVar, w62 w62Var, int i) {
        this.a = rxfVar;
        this.b = w62Var;
        this.c = i;
    }

    @Override // defpackage.rxf
    public final aue M() {
        aue aueVarM = this.a.M();
        aueVarM.getClass();
        return aueVarM;
    }

    @Override // defpackage.rxf
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.v62, defpackage.aj3
    public final v62 a() {
        return this.a.a();
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        return this.b;
    }

    @Override // defpackage.cj3
    public final qne g() {
        qne qneVarG = this.a.g();
        qneVarG.getClass();
        return qneVarG;
    }

    @Override // defpackage.ie0
    public final lf0 getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.rxf
    public final int getIndex() {
        return this.a.getIndex() + this.c;
    }

    @Override // defpackage.aj3
    public final n8a getName() {
        n8a name = this.a.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.rxf
    public final List<ui8> getUpperBounds() {
        List<ui8> upperBounds = this.a.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // defpackage.rxf, defpackage.v62
    public final kwf j() {
        kwf kwfVarJ = this.a.j();
        kwfVarJ.getClass();
        return kwfVarJ;
    }

    @Override // defpackage.v62
    public final mge o() {
        mge mgeVarO = this.a.o();
        mgeVarO.getClass();
        return mgeVarO;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) this.a.o0(ej3Var, d);
    }

    public final String toString() {
        return this.a + "[inner-copy]";
    }

    @Override // defpackage.rxf
    public final boolean v() {
        return this.a.v();
    }

    @Override // defpackage.rxf
    public final ylg z() {
        ylg ylgVarZ = this.a.z();
        ylgVarZ.getClass();
        return ylgVarZ;
    }

    @Override // defpackage.aj3
    public final aj3 a() {
        return this.a.a();
    }

    @Override // defpackage.rxf, defpackage.v62, defpackage.aj3
    public final rxf a() {
        return this.a.a();
    }
}
