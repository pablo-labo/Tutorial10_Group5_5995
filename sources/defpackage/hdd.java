package defpackage;

import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {207}, m = "invokeSuspend")
public final class hdd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ pdd $instance;
    final /* synthetic */ ei7 $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ pdd a;
        public final /* synthetic */ e13 b;

        public a(pdd pddVar, e13 e13Var) {
            this.a = pddVar;
            this.b = e13Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ci7 ci7Var = (ci7) obj;
            boolean z = ci7Var instanceof hmb.b;
            pdd pddVar = this.a;
            if (z) {
                pddVar.a((hmb.b) ci7Var);
            } else if ((ci7Var instanceof hmb.c) || (ci7Var instanceof hmb.a)) {
                pddVar.f();
            } else {
                pddVar.b.b(ci7Var, this.b);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdd(ei7 ei7Var, pdd pddVar, lu2<? super hdd> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = ei7Var;
        this.$instance = pddVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        hdd hddVar = new hdd(this.$interactionSource, this.$instance, lu2Var);
        hddVar.L$0 = obj;
        return hddVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hdd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        nde ndeVarB = this.$interactionSource.b();
        a aVar = new a(this.$instance, e13Var);
        this.label = 1;
        ndeVarB.e(aVar, this);
        return g13.a;
    }
}
