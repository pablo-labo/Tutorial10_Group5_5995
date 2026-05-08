package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class gr1 implements j5d<ByteBuffer, Bitmap> {
    public final sg1 a = new sg1();

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, ova ovaVar) {
        return this.a.c(ImageDecoder.createSource(byteBuffer), i, i2, ovaVar);
    }
}
