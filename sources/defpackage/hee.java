package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hee {
    public final boolean a;
    public final boolean b;
    public final q30<jee> c;

    public static final class a extends mj8 implements Function1<Float, Float> {
        final /* synthetic */ iy3 $density;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(iy3 iy3Var) {
            super(1);
            this.$density = iy3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f) {
            f.floatValue();
            return Float.valueOf(this.$density.t1(56.0f));
        }
    }

    public static final class b extends mj8 implements gu5<Float> {
        final /* synthetic */ iy3 $density;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(iy3 iy3Var) {
            super(0);
            this.$density = iy3Var;
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(this.$density.t1(125.0f));
        }
    }

    public hee(boolean z, iy3 iy3Var, jee jeeVar, Function1<? super jee, Boolean> function1, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && jeeVar == jee.c) {
            l5.q("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        if (z2 && jeeVar == jee.a) {
            l5.q("The initial value must not be set to Hidden if skipHiddenState is set to true.");
            throw null;
        }
        this.c = new q30<>(jeeVar, new a(iy3Var), new b(iy3Var), cee.a, function1);
    }

    public static Object a(hee heeVar, jee jeeVar, lu2 lu2Var) {
        Object objB = androidx.compose.material3.internal.a.b(heeVar.c, jeeVar, ((cme) heeVar.c.l).g(), lu2Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public final Object b(lu2<? super j6g> lu2Var) {
        if (this.b) {
            r6.g("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
            return null;
        }
        Object objA = a(this, jee.a, lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public final boolean c() {
        return ((gme) this.c.g).getValue() != jee.a;
    }

    public final Object d(c1f c1fVar) {
        if (this.a) {
            r6.g("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        Object objA = a(this, jee.c, c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    public final Object e(c1f c1fVar) {
        oa4<jee> oa4VarE = this.c.e();
        jee jeeVar = jee.c;
        if (!oa4VarE.d(jeeVar)) {
            jeeVar = jee.b;
        }
        Object objA = a(this, jeeVar, c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    public /* synthetic */ hee(iy3 iy3Var, int i) {
        this(true, iy3Var, jee.a, zx5.e, false);
    }
}
