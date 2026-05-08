package defpackage;

import android.graphics.Bitmap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagemanipulator.ManipulatorTask$launchLoader$1", f = "ImageManipulatorContext.kt", l = {50}, m = "invokeSuspend")
public final class za9 extends c1f implements Function2<e13, lu2<? super xa9>, Object> {
    int label;
    final /* synthetic */ bb9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za9(bb9 bb9Var, lu2<? super za9> lu2Var) {
        super(2, lu2Var);
        this.this$0 = bb9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new za9(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super xa9> lu2Var) {
        return ((za9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        CodedException unexpectedException;
        CodedException codedException;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                Function1<lu2<? super Bitmap>, Object> function1 = this.this$0.b;
                this.label = 1;
                obj = function1.invoke(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return new xa9((Bitmap) obj, null);
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            return new xa9(null, codedException);
        }
    }
}
