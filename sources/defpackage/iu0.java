package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import defpackage.o85;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements o85 {
    public final Uri a;
    public final qva b;

    public static final class a implements o85.a<Uri> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            Uri uri = (Uri) obj;
            if (m.c(uri)) {
                return new iu0(uri, qvaVar);
            }
            return null;
        }
    }

    public iu0(Uri uri, qva qvaVar) {
        this.a = uri;
        this.b = qvaVar;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) throws IOException {
        String strW0 = z92.W0(z92.J0(this.a.getPathSegments(), 1), "/", null, null, null, 62);
        qva qvaVar = this.b;
        uqc uqcVar = new uqc(c0h.S(qvaVar.a.getAssets().open(strW0)));
        Context context = qvaVar.a;
        gu0 gu0Var = new gu0();
        Bitmap.Config[] configArr = m.a;
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return new zne(new vne(uqcVar, cacheDir, gu0Var), m.b(MimeTypeMap.getSingleton(), strW0), ze3.c);
    }
}
