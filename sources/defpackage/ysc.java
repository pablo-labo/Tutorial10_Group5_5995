package defpackage;

import defpackage.xsc;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class ysc extends c1f implements Function2<xsc.d, lu2<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ysc yscVar = new ysc(2, lu2Var);
        yscVar.L$0 = obj;
        return yscVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xsc.d dVar, lu2<? super Boolean> lu2Var) {
        return ((ysc) create(dVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return Boolean.valueOf(((xsc.d) this.L$0) == xsc.d.a);
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
