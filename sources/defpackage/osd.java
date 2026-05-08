package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {1318}, m = "invokeSuspend")
public final class osd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ psd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osd(psd psdVar, int i, lu2<? super osd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = psdVar;
        this.$calculatedOffset = i;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new osd(this.this$0, this.$calculatedOffset, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((osd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zrd zrdVar = this.this$0.a;
            int i2 = this.$calculatedOffset;
            dvf dvfVar = u6f.a;
            this.label = 1;
            Object objG = wab.g(zrdVar, i2 - ((dme) zrdVar.a).e(), dvfVar, this);
            Object obj2 = g13.a;
            if (objG != obj2) {
                objG = j6g.a;
            }
            if (objG == obj2) {
                return obj2;
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
