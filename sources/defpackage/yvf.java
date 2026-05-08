package defpackage;

import defpackage.hv1;
import defpackage.mv5;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class yvf extends mv5 implements xvf {
    public final aue t0;
    public final zvf u0;
    public m52 v0;
    public static final /* synthetic */ qf8<Object>[] x0 = {fwc.a.g(new l4c(yvf.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final a w0 = new a();

    public static final class a {
    }

    public yvf(aue aueVar, zvf zvfVar, m52 m52Var, xvf xvfVar, lf0 lf0Var, hv1.a aVar, qne qneVar) {
        super(lf0Var, aVar, zvfVar, xvfVar, toe.e, qneVar);
        this.t0 = aueVar;
        this.u0 = zvfVar;
        this.h0 = zvfVar.X();
        aueVar.e(new kha(1, this, m52Var));
        this.v0 = m52Var;
    }

    @Override // defpackage.dj3
    /* JADX INFO: renamed from: K0 */
    public final cj3 a() {
        kv5 kv5VarA = super.a();
        kv5VarA.getClass();
        return (xvf) kv5VarA;
    }

    @Override // defpackage.mv5
    public final mv5 M0(lf0 lf0Var, hv1.a aVar, aj3 aj3Var, kv5 kv5Var, n8a n8aVar, qne qneVar) {
        aj3Var.getClass();
        aVar.getClass();
        lf0Var.getClass();
        hv1.a aVar2 = hv1.a.a;
        if (aVar != aVar2) {
            hv1.a aVar3 = hv1.a.d;
        }
        return new yvf(this.t0, this.u0, this.v0, this, lf0Var, aVar2, qneVar);
    }

    @Override // defpackage.xvf
    public final m52 R() {
        return this.v0;
    }

    @Override // defpackage.mv5, defpackage.kv5, defpackage.qxe
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final yvf b(TypeSubstitutor typeSubstitutor) {
        typeSubstitutor.getClass();
        kv5 kv5VarB = super.b(typeSubstitutor);
        kv5VarB.getClass();
        yvf yvfVar = (yvf) kv5VarB;
        ui8 ui8Var = yvfVar.V;
        ui8Var.getClass();
        m52 m52VarB = this.v0.a().b(TypeSubstitutor.d(ui8Var));
        if (m52VarB == null) {
            return null;
        }
        yvfVar.v0 = m52VarB;
        return yvfVar;
    }

    @Override // defpackage.hv1
    public final hv1 Z(t52 t52Var, ax9 ax9Var, ws3 ws3Var) {
        t52Var.getClass();
        ws3Var.getClass();
        mv5.a aVarQ0 = Q0(TypeSubstitutor.b);
        aVarQ0.b = t52Var;
        aVarQ0.c = ax9Var;
        aVarQ0.d = ws3Var;
        aVarQ0.f = hv1.a.b;
        aVarQ0.m = false;
        fv1 fv1VarN0 = aVarQ0.x.N0(aVarQ0);
        fv1VarN0.getClass();
        return (xvf) fv1VarN0;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final fv1 a() {
        kv5 kv5VarA = super.a();
        kv5VarA.getClass();
        return (xvf) kv5VarA;
    }

    @Override // defpackage.mv5, defpackage.qxe
    public final /* bridge */ /* synthetic */ uq2 b(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // defpackage.uq2
    public final boolean c0() {
        return this.v0.c0();
    }

    @Override // defpackage.dj3, defpackage.aj3
    public final w62 d() {
        return this.u0;
    }

    @Override // defpackage.uq2
    public final t52 d0() {
        t52 t52VarD0 = this.v0.d0();
        t52VarD0.getClass();
        return t52VarD0;
    }

    @Override // defpackage.mv5, defpackage.fv1
    public final ui8 getReturnType() {
        ui8 ui8Var = this.V;
        ui8Var.getClass();
        return ui8Var;
    }

    @Override // defpackage.dj3, defpackage.aj3
    public final aj3 d() {
        return this.u0;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final hv1 a() {
        kv5 kv5VarA = super.a();
        kv5VarA.getClass();
        return (xvf) kv5VarA;
    }

    @Override // defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final aj3 a() {
        kv5 kv5VarA = super.a();
        kv5VarA.getClass();
        return (xvf) kv5VarA;
    }

    @Override // defpackage.mv5, defpackage.dj3, defpackage.bj3, defpackage.aj3
    public final kv5 a() {
        kv5 kv5VarA = super.a();
        kv5VarA.getClass();
        return (xvf) kv5VarA;
    }
}
