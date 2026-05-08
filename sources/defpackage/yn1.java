package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public final class yn1 extends BasePool<Bitmap> implements ah1 {
    public yn1(lia liaVar, wfb wfbVar, mia miaVar) {
        super(liaVar, wfbVar, miaVar);
        liaVar.getClass();
        miaVar.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final Bitmap b(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void d(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int f(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int g(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int h(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final Bitmap i(wn1<Bitmap> wn1Var) {
        Bitmap bitmap = (Bitmap) super.i(wn1Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean k(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return !bitmap2.isRecycled() && bitmap2.isMutable();
    }
}
