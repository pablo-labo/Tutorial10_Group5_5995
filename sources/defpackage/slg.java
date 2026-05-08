package defpackage;

import defpackage.d04;
import defpackage.hv1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public class slg extends wlg implements rlg {
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final ui8 Y;
    public final rlg Z;
    public final int f;

    public static final class a extends slg {
        public final d2f a0;

        public a(fv1 fv1Var, rlg rlgVar, int i, lf0 lf0Var, n8a n8aVar, ui8 ui8Var, boolean z, boolean z2, boolean z3, ui8 ui8Var2, qne qneVar, gu5<? extends List<? extends vlg>> gu5Var) {
            super(fv1Var, rlgVar, i, lf0Var, n8aVar, ui8Var, z, z2, z3, ui8Var2, qneVar);
            this.a0 = new d2f(gu5Var);
        }

        @Override // defpackage.slg, defpackage.rlg
        public final rlg G(ov5 ov5Var, n8a n8aVar, int i) {
            lf0 annotations = getAnnotations();
            annotations.getClass();
            ui8 type = getType();
            type.getClass();
            return new a(ov5Var, null, i, annotations, n8aVar, type, z0(), this.W, this.X, this.Y, qne.p, new s04(this, 4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slg(fv1 fv1Var, rlg rlgVar, int i, lf0 lf0Var, n8a n8aVar, ui8 ui8Var, boolean z, boolean z2, boolean z3, ui8 ui8Var2, qne qneVar) {
        super(fv1Var, lf0Var, n8aVar, ui8Var, qneVar);
        fv1Var.getClass();
        lf0Var.getClass();
        n8aVar.getClass();
        ui8Var.getClass();
        qneVar.getClass();
        this.f = i;
        this.V = z;
        this.W = z2;
        this.X = z3;
        this.Y = ui8Var2;
        this.Z = rlgVar == null ? this : rlgVar;
    }

    @Override // defpackage.rlg
    public rlg G(ov5 ov5Var, n8a n8aVar, int i) {
        lf0 annotations = getAnnotations();
        annotations.getClass();
        ui8 type = getType();
        type.getClass();
        return new slg(ov5Var, null, i, annotations, n8aVar, type, z0(), this.W, this.X, this.Y, qne.p);
    }

    @Override // defpackage.vlg
    public final boolean N() {
        return false;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final rlg a() {
        rlg rlgVar = this.Z;
        return rlgVar == this ? this : rlgVar.a();
    }

    @Override // defpackage.qxe
    public final cj3 b(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        if (typeSubstitutor.a.e()) {
            return this;
        }
        b0.l();
        return null;
    }

    @Override // defpackage.dj3, defpackage.aj3
    public final fv1 d() {
        aj3 aj3VarD = super.d();
        aj3VarD.getClass();
        return (fv1) aj3VarD;
    }

    @Override // defpackage.rlg
    public final int getIndex() {
        return this.f;
    }

    @Override // defpackage.fj3
    public final e04 getVisibility() {
        d04.i iVar = d04.f;
        iVar.getClass();
        return iVar;
    }

    @Override // defpackage.fv1, defpackage.hv1
    public final Collection<rlg> m() {
        Collection<? extends fv1> collectionM = d().m();
        collectionM.getClass();
        Collection<? extends fv1> collection = collectionM;
        ArrayList arrayList = new ArrayList(t92.r0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((fv1) it.next()).i().get(this.f));
        }
        return arrayList;
    }

    @Override // defpackage.vlg
    public final /* bridge */ /* synthetic */ up2 n0() {
        return null;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.e(this, d);
    }

    @Override // defpackage.rlg
    public final boolean p0() {
        return this.X;
    }

    @Override // defpackage.rlg
    public final boolean q0() {
        return this.W;
    }

    @Override // defpackage.rlg
    public final ui8 u0() {
        return this.Y;
    }

    @Override // defpackage.rlg
    public final boolean z0() {
        if (!this.V) {
            return false;
        }
        hv1.a aVarF = ((hv1) d()).f();
        aVarF.getClass();
        return aVarF != hv1.a.b;
    }
}
