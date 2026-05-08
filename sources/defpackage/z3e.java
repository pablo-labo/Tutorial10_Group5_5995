package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend")
public final class z3e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ zb0<ooa, de0> $animatable;
    final /* synthetic */ ese<ooa> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ zb0<ooa, de0> a;
        public final /* synthetic */ e13 b;

        public a(zb0<ooa, de0> zb0Var, e13 e13Var) {
            this.a = zb0Var;
            this.b = e13Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            long j = ((ooa) obj).a;
            zb0<ooa, de0> zb0Var = this.a;
            if ((zb0Var.d().a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (zb0Var.d().a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                Object objE = zb0Var.e(lu2Var, new ooa(j));
                return objE == g13.a ? objE : j6g.a;
            }
            u63.Y(this.b, null, null, new y3e(zb0Var, j, null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3e(ese<ooa> eseVar, zb0<ooa, de0> zb0Var, lu2<? super z3e> lu2Var) {
        super(2, lu2Var);
        this.$targetValue$delegate = eseVar;
        this.$animatable = zb0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        z3e z3eVar = new z3e(this.$targetValue$delegate, this.$animatable, lu2Var);
        z3eVar.L$0 = obj;
        return z3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z3e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            e13 e13Var = (e13) this.L$0;
            kjd kjdVarH = r.h(new c03(this.$targetValue$delegate, 1));
            a aVar = new a(this.$animatable, e13Var);
            this.label = 1;
            Object objE = kjdVarH.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
