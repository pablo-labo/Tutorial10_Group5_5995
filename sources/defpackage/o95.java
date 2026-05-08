package defpackage;

import android.webkit.MimeTypeMap;
import defpackage.o85;
import defpackage.w5b;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class o95 implements o85 {
    public final File a;

    public static final class a implements o85.a<File> {
        @Override // o85.a
        public final o85 a(Object obj, qva qvaVar) {
            return new o95((File) obj);
        }
    }

    public o95(File file) {
        this.a = file;
    }

    @Override // defpackage.o85
    public final Object a(lu2<? super m85> lu2Var) {
        String str = w5b.b;
        File file = this.a;
        return new zne(new r95(w5b.a.b(file), pa5.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(hb5.Q(file)), ze3.c);
    }
}
