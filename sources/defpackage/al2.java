package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
public final class al2 extends c1f implements Function2<Float, lu2<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ xk2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al2(xk2 xk2Var, lu2<? super al2> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xk2Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        al2 al2Var = new al2(this.this$0, lu2Var);
        al2Var.F$0 = ((Number) obj).floatValue();
        return al2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, lu2<? super Float> lu2Var) {
        return ((al2) create(Float.valueOf(f.floatValue()), lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            float f = this.F$0;
            Function2 function2 = (Function2) x4e.a(this.this$0.a.d, v4e.e);
            if (function2 == null) {
                throw l6.k("Required value was null.");
            }
            boolean z2 = ((lrd) this.this$0.a.d.d(k5e.u)).c;
            if (z2) {
                f = -f;
            }
            ooa ooaVar = new ooa((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.Z$0 = z2;
            this.label = 1;
            obj = function2.invoke(ooaVar, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
            z = z2;
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            r7d.b(obj);
        }
        long j = ((ooa) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
