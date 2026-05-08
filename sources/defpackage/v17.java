package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagemanipulator.ImageManipulatorModule$createManipulatorContext$task$1", f = "ImageManipulatorModule.kt", l = {}, m = "invokeSuspend")
public final class v17 extends c1f implements Function1<lu2<? super Bitmap>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v17(Bitmap bitmap, lu2<? super v17> lu2Var) {
        super(1, lu2Var);
        this.$bitmap = bitmap;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new v17(this.$bitmap, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super Bitmap> lu2Var) {
        return ((v17) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return this.$bitmap;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
