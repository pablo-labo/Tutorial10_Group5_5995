package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {981}, m = "invokeSuspend")
public final class kn3 extends c1f implements Function2<e13, lu2<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ xrd $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ln3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn3(float f, ln3 ln3Var, xrd xrdVar, lu2<? super kn3> lu2Var) {
        super(2, lu2Var);
        this.$initialVelocity = f;
        this.this$0 = ln3Var;
        this.$this_performFling = xrdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new kn3(this.$initialVelocity, this.this$0, this.$this_performFling, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Float> lu2Var) {
        return ((kn3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        float f;
        ae0 ae0VarA;
        iuc iucVar;
        Object objD;
        g13 g13Var;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                iuc iucVar2 = new iuc();
                iucVar2.element = this.$initialVelocity;
                iuc iucVar3 = new iuc();
                ae0VarA = boa.a(0.0f, this.$initialVelocity, 28);
                try {
                    ln3 ln3Var = this.this$0;
                    yi3<Float> yi3Var = ln3Var.a;
                    li1 li1Var = new li1(iucVar3, this.$this_performFling, iucVar2, ln3Var, 2);
                    this.L$0 = iucVar2;
                    this.L$1 = ae0VarA;
                    this.label = 1;
                    objD = x0f.d(ae0VarA, yi3Var, false, li1Var, this);
                    g13Var = g13.a;
                } catch (CancellationException unused) {
                    iucVar = iucVar2;
                    iucVar.element = ((Number) ae0VarA.i()).floatValue();
                }
                if (objD == g13Var) {
                    return g13Var;
                }
                iucVar = iucVar2;
                f = iucVar.element;
            } else {
                f = this.$initialVelocity;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ae0VarA = (ae0) this.L$1;
            iucVar = (iuc) this.L$0;
            try {
                r7d.b(obj);
            } catch (CancellationException unused2) {
                iucVar.element = ((Number) ae0VarA.i()).floatValue();
            }
            f = iucVar.element;
        }
        return new Float(f);
    }
}
