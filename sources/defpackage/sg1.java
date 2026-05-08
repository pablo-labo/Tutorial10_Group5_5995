package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 implements j5d<ImageDecoder.Source, Bitmap> {
    public final ch1 a = new ch1();

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, ova ovaVar) {
        o6.d(source);
        return true;
    }

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ f5d<Bitmap> b(ImageDecoder.Source source, int i, int i2, ova ovaVar) {
        return c(o6.d(source), i, i2, ovaVar);
    }

    public final dh1 c(ImageDecoder.Source source, int i, int i2, ova ovaVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new lp3(i, i2, ovaVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new dh1(this.a, bitmapDecodeBitmap);
    }
}
