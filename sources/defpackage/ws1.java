package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.datasource.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ws1 implements tg1 {
    public final b a;
    public a b;

    public ws1(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.tg1
    public final hz8<Bitmap> a(Uri uri) {
        Uri uri2;
        a aVar = this.b;
        if (aVar == null || (uri2 = aVar.b) == null || !uri2.equals(uri)) {
            hz8<Bitmap> hz8VarA = this.a.a(uri);
            this.b = new a(uri, hz8VarA);
            return hz8VarA;
        }
        hz8<Bitmap> hz8Var = this.b.c;
        ka2.r(hz8Var);
        return hz8Var;
    }

    @Override // defpackage.tg1
    public final hz8<Bitmap> c(byte[] bArr) {
        byte[] bArr2;
        a aVar = this.b;
        if (aVar == null || (bArr2 = aVar.a) == null || !Arrays.equals(bArr2, bArr)) {
            hz8<Bitmap> hz8VarC = this.a.c(bArr);
            this.b = new a(bArr, hz8VarC);
            return hz8VarC;
        }
        hz8<Bitmap> hz8Var = this.b.c;
        ka2.r(hz8Var);
        return hz8Var;
    }

    public static class a {
        public final byte[] a;
        public final Uri b;
        public final hz8<Bitmap> c;

        public a(byte[] bArr, hz8<Bitmap> hz8Var) {
            this.a = bArr;
            this.b = null;
            this.c = hz8Var;
        }

        public a(Uri uri, hz8<Bitmap> hz8Var) {
            this.a = null;
            this.b = uri;
            this.c = hz8Var;
        }
    }
}
