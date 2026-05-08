package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.media3.datasource.c;
import defpackage.af3;
import defpackage.cf3;
import defpackage.fze;
import defpackage.hz8;
import defpackage.ka2;
import defpackage.kze;
import defpackage.mz8;
import defpackage.tg1;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements tg1 {
    public static final fze<mz8> d = kze.a(new af3());
    public final mz8 a;
    public final c.a b;
    public final int c;

    public b(Context context) {
        mz8 mz8Var = d.get();
        ka2.r(mz8Var);
        c.a aVar = new c.a(context);
        this.a = mz8Var;
        this.b = aVar;
        this.c = -1;
    }

    @Override // defpackage.tg1
    public final hz8<Bitmap> a(Uri uri) {
        return this.a.submit((Callable) new cf3(this, uri, 0));
    }

    @Override // defpackage.tg1
    public final hz8<Bitmap> c(final byte[] bArr) {
        return this.a.submit(new Callable() { // from class: bf3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] bArr2 = bArr;
                return fh1.a(bArr2.length, bArr2, this.a.c);
            }
        });
    }
}
