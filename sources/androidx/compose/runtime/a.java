package androidx.compose.runtime;

import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.n7d;
import defpackage.p6;
import defpackage.pxf;
import defpackage.r6;
import defpackage.r7d;
import defpackage.t40;
import defpackage.t6e;
import defpackage.uh3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {554}, m = "invokeSuspend")
public final class a extends n7d implements Function2<t6e<? super String>, lu2<? super j6g>, Object> {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComposePausableCompositionException this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComposePausableCompositionException composePausableCompositionException, lu2<? super a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = composePausableCompositionException;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        a aVar = new a(this.this$0, lu2Var);
        aVar.L$0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t6e<? super String> t6eVar, lu2<? super j6g> lu2Var) {
        return ((a) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        t6e t6eVar;
        int i;
        int i2;
        int i3;
        String strI;
        int i4;
        int i5;
        int i6 = this.label;
        if (i6 == 0) {
            r7d.b(obj);
            t6eVar = (t6e) this.L$0;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            t6eVar = (t6e) this.L$0;
            r7d.b(obj);
        }
        if (i3 >= Math.min(this.this$0.lastOperation, this.this$0.operations.b)) {
            return j6g.a;
        }
        int i7 = i3 + 1;
        int iA = this.this$0.operations.a(i3);
        switch (iA) {
            case 0:
                strI = GesturesListener.SCROLL_DIRECTION_UP;
                break;
            case 1:
                strI = t40.i(this.this$0.instances.b(i2), "down ");
                i2++;
                break;
            case 2:
                strI = "remove " + this.this$0.operations.a(i7) + ' ' + this.this$0.operations.a(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strI = "move " + this.this$0.operations.a(i7) + ' ' + this.this$0.operations.a(i3 + 2) + ' ' + this.this$0.operations.a(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strI = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                i5 = i2 + 1;
                strI = "insertBottomUp " + this.this$0.operations.a(i7) + ' ' + this.this$0.instances.b(i2);
                i7 = i4;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                i5 = i2 + 1;
                strI = "insertTopDown " + this.this$0.operations.a(i7) + ' ' + this.this$0.instances.b(i2);
                i7 = i4;
                i2 = i5;
                break;
            case 7:
                int i8 = i2 + 1;
                Object objB = this.this$0.instances.b(i2);
                objB.getClass();
                pxf.d(2, objB);
                i2 += 2;
                strI = "apply " + ((Function2) objB) + ' ' + this.this$0.instances.b(i8);
                break;
            case 8:
                strI = "reuse " + this.this$0.reused.b(i);
                i++;
                break;
            default:
                strI = p6.c(iA, "unknown op: ");
                break;
        }
        this.L$0 = t6eVar;
        this.I$0 = i7;
        this.I$1 = i2;
        this.I$2 = i;
        this.label = 1;
        t6eVar.a(this, i3 + ": " + strI);
        return g13.a;
    }
}
