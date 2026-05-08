package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class lp3 implements ImageDecoder$OnHeaderDecodedListener {
    public final gg6 a = gg6.a();
    public final int b;
    public final int c;
    public final oj3 d;
    public final g94 e;
    public final boolean f;
    public final llb g;

    public class a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public lp3(int i, int i2, ova ovaVar) {
        this.b = i;
        this.c = i2;
        this.d = (oj3) ovaVar.c(h94.f);
        this.e = (g94) ovaVar.c(g94.d);
        fva<Boolean> fvaVar = h94.i;
        this.f = ovaVar.c(fvaVar) != null && ((Boolean) ovaVar.c(fvaVar)).booleanValue();
        this.g = (llb) ovaVar.c(h94.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        gg6 gg6Var = this.a;
        int width = this.b;
        int height = this.c;
        if (gg6Var.c(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == oj3.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        llb llbVar = this.g;
        if (llbVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((llbVar == llb.a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
