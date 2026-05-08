package defpackage;

import android.graphics.Bitmap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagemanipulator.ManipulatorTask$addTransformer$1", f = "ImageManipulatorContext.kt", l = {59}, m = "invokeSuspend")
public final class ya9 extends c1f implements Function2<e13, lu2<? super xa9>, Object> {
    final /* synthetic */ xr3<xa9> $oldTask;
    final /* synthetic */ n37 $transformer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya9(xr3<xa9> xr3Var, n37 n37Var, lu2<? super ya9> lu2Var) {
        super(2, lu2Var);
        this.$oldTask = xr3Var;
        this.$transformer = n37Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ya9(this.$oldTask, this.$transformer, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super xa9> lu2Var) {
        return ((ya9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        CodedException unexpectedException;
        CodedException codedException;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xr3<xa9> xr3Var = this.$oldTask;
            this.label = 1;
            obj = xr3Var.n1(this);
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
        xa9 xa9Var = (xa9) obj;
        n37 n37Var = this.$transformer;
        xa9Var.getClass();
        n37Var.getClass();
        CodedException codedException2 = xa9Var.b;
        if (codedException2 != null) {
            return new xa9(null, codedException2);
        }
        try {
            Bitmap bitmap = xa9Var.a;
            if (bitmap != null) {
                return new xa9(n37Var.a(bitmap), null);
            }
            throw new IllegalArgumentException("The result doesn't have a value or error");
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException3 = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException3.a(), codedException3.getMessage(), codedException3.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            return new xa9(null, codedException);
        }
    }
}
