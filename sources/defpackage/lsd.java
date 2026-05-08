package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {528}, m = "invokeSuspend")
public final class lsd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ float $x;
    final /* synthetic */ float $y;
    int label;
    final /* synthetic */ jsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsd(jsd jsdVar, float f, float f2, lu2<? super lsd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = jsdVar;
        this.$x = f;
        this.$y = f2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lsd(this.this$0, this.$x, this.$y, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((lsd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xsd xsdVar = this.this$0.t0;
            float f = this.$x;
            float f2 = this.$y;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.label = 1;
            Object objA = a.a(xsdVar, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), this);
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
