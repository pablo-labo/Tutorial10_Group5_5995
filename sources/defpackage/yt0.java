package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public final class yt0 extends bbb {
    public final ah1 a;
    public final o82 b;

    public yt0(ah1 ah1Var, o82 o82Var) {
        o82Var.getClass();
        this.a = ah1Var;
        this.b = o82Var;
    }

    @Override // defpackage.bbb
    public final im3 a(int i, int i2, Bitmap.Config config) {
        config.getClass();
        int iC = eh1.c(i, i2, config);
        ah1 ah1Var = this.a;
        Bitmap bitmap = ah1Var.get(iC);
        if (bitmap.getAllocationByteCount() < eh1.b(config) * i * i2) {
            r6.g("Check failed.");
            return null;
        }
        bitmap.reconfigure(i, i2, config);
        im3 im3VarD0 = n82.d0(bitmap, ah1Var, this.b.a);
        im3VarD0.getClass();
        return im3VarD0;
    }
}
