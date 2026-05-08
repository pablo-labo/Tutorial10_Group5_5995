package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {532}, m = "invokeSuspend")
public final class msd extends c1f implements Function2<ooa, lu2<? super ooa>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ jsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msd(jsd jsdVar, lu2<? super msd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = jsdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        msd msdVar = new msd(this.this$0, lu2Var);
        msdVar.J$0 = ((ooa) obj).a;
        return msdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ooa ooaVar, lu2<? super ooa> lu2Var) {
        long j = ooaVar.a;
        msd msdVar = new msd(this.this$0, lu2Var);
        msdVar.J$0 = j;
        return msdVar.invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        long j = this.J$0;
        xsd xsdVar = this.this$0.t0;
        this.label = 1;
        Object objA = a.a(xsdVar, j, this);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
