package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1052}, m = "invokeSuspend")
public final class fsd extends c1f implements Function2<afa, lu2<? super j6g>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ iuc $previousValue;
    final /* synthetic */ xsd $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsd(xsd xsdVar, long j, iuc iucVar, lu2<? super fsd> lu2Var) {
        super(2, lu2Var);
        this.$this_semanticsScrollBy = xsdVar;
        this.$offset = j;
        this.$previousValue = iucVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        fsd fsdVar = new fsd(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, lu2Var);
        fsdVar.L$0 = obj;
        return fsdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(afa afaVar, lu2<? super j6g> lu2Var) {
        return ((fsd) create(afaVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            afa afaVar = (afa) this.L$0;
            float fG = this.$this_semanticsScrollBy.g(this.$offset);
            ax4 ax4Var = new ax4(3, this.$previousValue, this.$this_semanticsScrollBy, afaVar);
            this.label = 1;
            Object objC = x0f.c(0.0f, fG, null, ax4Var, this, 12);
            g13 g13Var = g13.a;
            if (objC == g13Var) {
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
