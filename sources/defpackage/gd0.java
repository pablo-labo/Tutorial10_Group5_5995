package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 {
    public final ArrayList a;
    public final kt0 b;

    public static final class a implements f5d<Drawable> {
        public final AnimatedImageDrawable a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // defpackage.f5d
        public final int a() {
            return xjg.d(Bitmap.Config.ARGB_8888) * this.a.getIntrinsicHeight() * this.a.getIntrinsicWidth() * 2;
        }

        @Override // defpackage.f5d
        public final Class<Drawable> b() {
            return Drawable.class;
        }

        @Override // defpackage.f5d
        public final Drawable get() {
            return this.a;
        }

        @Override // defpackage.f5d
        public final void recycle() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }
    }

    public static final class b implements j5d<ByteBuffer, Drawable> {
        public final gd0 a;

        public b(gd0 gd0Var) {
            this.a = gd0Var;
        }

        @Override // defpackage.j5d
        public final boolean a(ByteBuffer byteBuffer, ova ovaVar) {
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // defpackage.j5d
        public final f5d<Drawable> b(ByteBuffer byteBuffer, int i, int i2, ova ovaVar) {
            return gd0.a(ImageDecoder.createSource(byteBuffer), i, i2, ovaVar);
        }
    }

    public static final class c implements j5d<InputStream, Drawable> {
        public final gd0 a;

        public c(gd0 gd0Var) {
            this.a = gd0Var;
        }

        @Override // defpackage.j5d
        public final boolean a(InputStream inputStream, ova ovaVar) throws IOException {
            gd0 gd0Var = this.a;
            ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.a.b(gd0Var.a, inputStream, gd0Var.b);
            if (imageTypeB != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // defpackage.j5d
        public final f5d<Drawable> b(InputStream inputStream, int i, int i2, ova ovaVar) {
            return gd0.a(ImageDecoder.createSource(pr1.b(inputStream)), i, i2, ovaVar);
        }
    }

    public gd0(ArrayList arrayList, kt0 kt0Var) {
        this.a = arrayList;
        this.b = kt0Var;
    }

    public static a a(ImageDecoder.Source source, int i, int i2, ova ovaVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new lp3(i, i2, ovaVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        z3.p(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }
}
