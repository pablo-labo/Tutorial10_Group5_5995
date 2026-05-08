package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {193}, m = "invokeSuspend")
public final class drc extends c1f implements Function2<e13, lu2<? super d37>, Object> {
    final /* synthetic */ bz4 $eventListener;
    final /* synthetic */ Bitmap $placeholderBitmap;
    final /* synthetic */ v27 $request;
    final /* synthetic */ hie $size;
    int label;
    final /* synthetic */ frc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drc(v27 v27Var, frc frcVar, hie hieVar, bz4 bz4Var, Bitmap bitmap, lu2<? super drc> lu2Var) {
        super(2, lu2Var);
        this.$request = v27Var;
        this.this$0 = frcVar;
        this.$size = hieVar;
        this.$eventListener = bz4Var;
        this.$placeholderBitmap = bitmap;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new drc(this.$request, this.this$0, this.$size, this.$eventListener, this.$placeholderBitmap, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d37> lu2Var) {
        return ((drc) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        v27 v27Var = this.$request;
        mrc mrcVar = new mrc(v27Var, this.this$0.f, 0, v27Var, this.$size, this.$eventListener, this.$placeholderBitmap != null);
        this.label = 1;
        Object objC = mrcVar.c(v27Var, this);
        g13 g13Var = g13.a;
        return objC == g13Var ? g13Var : objC;
    }
}
