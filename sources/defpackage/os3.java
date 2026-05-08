package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.speechrecognition.DelayedFileStreamer$startStreaming$1", f = "DelayedFileStreamer.kt", l = {42}, m = "invokeSuspend")
public final class os3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ qs3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os3(qs3 qs3Var, lu2<? super os3> lu2Var) {
        super(2, lu2Var);
        this.this$0 = qs3Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new os3(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((os3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            qs3 qs3Var = this.this$0;
            File file = qs3Var.a;
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = qs3Var.c;
            this.label = 1;
            Object objA = qs3.a(qs3Var, file, autoCloseOutputStream, this);
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
