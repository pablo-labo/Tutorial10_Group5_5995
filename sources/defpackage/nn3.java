package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", l = {307}, m = "invokeSuspend")
public final class nn3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ki5 $animatable;
    final /* synthetic */ ci7 $targetInteraction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn3(ki5 ki5Var, ci7 ci7Var, lu2<? super nn3> lu2Var) {
        super(2, lu2Var);
        this.$animatable = ki5Var;
        this.$targetInteraction = ci7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new nn3(this.$animatable, this.$targetInteraction, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((nn3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ki5 ki5Var = this.$animatable;
            ci7 ci7Var = this.$targetInteraction;
            this.label = 1;
            Object objA = ki5Var.a(ci7Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
