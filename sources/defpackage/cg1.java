package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class cg1 implements b6d<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // defpackage.b6d
    public final f5d<byte[]> c(f5d<Bitmap> f5dVar, ova ovaVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        f5dVar.get().compress(this.a, this.b, byteArrayOutputStream);
        f5dVar.recycle();
        return new yr1(byteArrayOutputStream.toByteArray());
    }
}
