package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import defpackage.q55;

/* JADX INFO: loaded from: classes.dex */
public final class bte implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ zse a;
    public final /* synthetic */ huc b;

    public bte(zse zseVar, huc hucVar) {
        this.a = zseVar;
        this.b = hucVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        zse zseVar = this.a;
        nva nvaVar = zseVar.c;
        long jA = wj3.a(width, height, nvaVar.b, nvaVar.c, (iie) r55.b(nvaVar, x27.a));
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            double dB = wj3.b(width, height, i, i2, zseVar.c.c);
            boolean z = dB < 1.0d;
            this.b.element = z;
            if (z || zseVar.c.d == dib.a) {
                imageDecoder.setTargetSize(gf9.a(((double) width) * dB), gf9.a(dB * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new yse());
        nva nvaVar2 = zseVar.c;
        imageDecoder.setAllocator(z27.a(nvaVar2) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) r55.b(nvaVar2, z27.i)).booleanValue() ? 1 : 0);
        q55.b<ColorSpace> bVar = z27.d;
        if (((ColorSpace) r55.b(nvaVar2, bVar)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) r55.b(nvaVar2, bVar));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) r55.b(nvaVar2, z27.e)).booleanValue());
    }
}
