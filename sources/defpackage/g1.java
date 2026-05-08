package defpackage;

import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", l = {1688}, m = "invokeSuspend")
public final class g1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ hmb.b $pressInteraction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(lu2 lu2Var, d3a d3aVar, hmb.b bVar) {
        super(2, lu2Var);
        this.$pressInteraction = bVar;
        this.$interactionSource = d3aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g1(lu2Var, this.$interactionSource, this.$pressInteraction);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hmb.c cVar = new hmb.c(this.$pressInteraction);
            d3a d3aVar = this.$interactionSource;
            this.label = 1;
            Object objA = d3aVar.a(cVar, this);
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
