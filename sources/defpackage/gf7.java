package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gf7 implements j5d<InputStream, Bitmap> {
    public final sg1 a = new sg1();

    @Override // defpackage.j5d
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(InputStream inputStream, int i, int i2, ova ovaVar) {
        return this.a.c(ImageDecoder.createSource(pr1.b(inputStream)), i, i2, ovaVar);
    }
}
