package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {736}, m = "invokeSuspend")
public final class pd0 extends c1f implements Function2<mpb<Boolean>, lu2<? super j6g>, Object> {
    final /* synthetic */ csf<iu4> $childTransition;
    final /* synthetic */ ese<Function2<iu4, iu4, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a extends mj8 implements gu5<Boolean> {
        final /* synthetic */ csf<iu4> $childTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(csf<iu4> csfVar) {
            super(0);
            this.$childTransition = csfVar;
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            csf<iu4> csfVar = this.$childTransition;
            iu4 iu4VarA = csfVar.a.a();
            iu4 iu4Var = iu4.c;
            return Boolean.valueOf(iu4VarA == iu4Var && ((gme) csfVar.d).getValue() == iu4Var);
        }
    }

    public static final class b<T> implements wi5 {
        public final /* synthetic */ mpb<Boolean> a;
        public final /* synthetic */ csf<iu4> b;
        public final /* synthetic */ ese<Function2<iu4, iu4, Boolean>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(mpb<Boolean> mpbVar, csf<iu4> csfVar, ese<? extends Function2<? super iu4, ? super iu4, Boolean>> eseVar) {
            this.a = mpbVar;
            this.b = csfVar;
            this.c = eseVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                Function2 value = this.c.getValue();
                csf<iu4> csfVar = this.b;
                zBooleanValue = ((Boolean) value.invoke(csfVar.a.a(), ((gme) csfVar.d).getValue())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.a.setValue(Boolean.valueOf(zBooleanValue));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pd0(csf<iu4> csfVar, ese<? extends Function2<? super iu4, ? super iu4, Boolean>> eseVar, lu2<? super pd0> lu2Var) {
        super(2, lu2Var);
        this.$childTransition = csfVar;
        this.$shouldDisposeBlockUpdated$delegate = eseVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        pd0 pd0Var = new pd0(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, lu2Var);
        pd0Var.L$0 = obj;
        return pd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mpb<Boolean> mpbVar, lu2<? super j6g> lu2Var) {
        return ((pd0) create(mpbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            mpb mpbVar = (mpb) this.L$0;
            kjd kjdVarH = r.h(new a(this.$childTransition));
            b bVar = new b(mpbVar, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            Object objE = kjdVarH.e(bVar, this);
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
