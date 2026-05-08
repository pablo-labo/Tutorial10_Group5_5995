package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1760}, m = "invokeSuspend")
public final class c1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hk6 $interaction;
    final /* synthetic */ d3a $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d3a d3aVar, hk6 hk6Var, lu2<? super c1> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = d3aVar;
        this.$interaction = hk6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new c1(this.$interactionSource, this.$interaction, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            d3a d3aVar = this.$interactionSource;
            hk6 hk6Var = this.$interaction;
            this.label = 1;
            Object objA = d3aVar.a(hk6Var, this);
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
