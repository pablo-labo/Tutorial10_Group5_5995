package defpackage;

import android.net.Uri;
import defpackage.o85;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 implements o85 {
    public final Uri a;
    public final qva b;

    public static final class a implements o85.a<Uri> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            Uri uri = (Uri) obj;
            if (wl7.b(uri.getScheme(), "content")) {
                return new kt2(uri, qvaVar);
            }
            return null;
        }
    }

    public kt2(Uri uri, qva qvaVar) {
        this.a = uri;
        this.b = qvaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    @Override // defpackage.o85
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.lu2<? super defpackage.m85> r8) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt2.a(lu2):java.lang.Object");
    }
}
