package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import defpackage.ke3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class llf implements ke3<InputStream> {
    public final Uri a;
    public final rlf b;
    public InputStream c;

    public static class a implements plf {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.plf
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class b implements plf {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // defpackage.plf
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public llf(Uri uri, rlf rlfVar) {
        this.a = uri;
        this.b = rlfVar;
    }

    public static llf c(Context context, Uri uri, plf plfVar) {
        return new llf(uri, new rlf(com.bumptech.glide.a.a(context).c.a().e(), plfVar, com.bumptech.glide.a.a(context).d, context.getContentResolver()));
    }

    @Override // defpackage.ke3
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.ke3
    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ke3
    public final void cancel() {
    }

    @Override // defpackage.ke3
    public final void d(knb knbVar, ke3.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.c = inputStreamF;
            aVar.f(inputStreamF);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.ke3
    public final xe3 e() {
        return xe3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0028: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:11:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[PHI: r6
  0x002f: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0052, B:14:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #4 {all -> 0x0027, blocks: (B:6:0x0018, B:8:0x001e, B:23:0x003d, B:25:0x0043), top: B:77:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llf.f():java.io.InputStream");
    }
}
