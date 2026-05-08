package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.o85;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class hr1 implements o85 {
    public final ByteBuffer a;
    public final qva b;

    public static final class a implements o85.a<ByteBuffer> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            return new hr1((ByteBuffer) obj, qvaVar);
        }
    }

    public hr1(ByteBuffer byteBuffer, qva qvaVar) {
        this.a = byteBuffer;
        this.b = qvaVar;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) {
        ByteBuffer byteBuffer = this.a;
        try {
            zn1 zn1Var = new zn1();
            zn1Var.write(byteBuffer);
            byteBuffer.position(0);
            Context context = this.b.a;
            Bitmap.Config[] configArr = m.a;
            File cacheDir = context.getCacheDir();
            cacheDir.mkdirs();
            return new zne(new vne(zn1Var, cacheDir, null), null, ze3.b);
        } catch (Throwable th) {
            byteBuffer.position(0);
            throw th;
        }
    }
}
