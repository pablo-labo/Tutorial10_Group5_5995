package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.fx9;
import defpackage.ke3;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class sm9 implements fx9<Uri, File> {
    public final Context a;

    public static final class a implements gx9<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.gx9
        public final fx9<Uri, File> c(n1a n1aVar) {
            return new sm9(this.a);
        }
    }

    public static class b implements ke3<File> {
        public static final String[] c = {"_data"};
        public final Context a;
        public final Uri b;

        public b(Uri uri, Context context) {
            this.a = context;
            this.b = uri;
        }

        @Override // defpackage.ke3
        public final Class<File> a() {
            return File.class;
        }

        @Override // defpackage.ke3
        public final void b() {
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super File> aVar) {
            Cursor cursorQuery = this.a.getContentResolver().query(this.b, c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.b));
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public sm9(Context context) {
        this.a = context;
    }

    @Override // defpackage.fx9
    public final fx9.a<File> a(Uri uri, int i, int i2, ova ovaVar) {
        Uri uri2 = uri;
        return new fx9.a<>(new nna(uri2), new b(uri2, this.a));
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        return web.p(uri);
    }
}
