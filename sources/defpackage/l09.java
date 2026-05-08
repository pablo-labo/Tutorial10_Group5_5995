package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class l09 extends q09 implements olf<vs4> {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public l09(Executor executor, yn9 yn9Var, ContentResolver contentResolver) {
        super(executor, yn9Var);
        this.c = contentResolver;
    }

    @Override // defpackage.olf
    public final boolean b(x4d x4dVar) {
        Rect rect = f;
        return oie.l(rect.width(), rect.height(), x4dVar);
    }

    @Override // defpackage.q09
    public final vs4 d(a aVar) {
        x4d x4dVar;
        Cursor cursorQuery;
        vs4 vs4VarF;
        int iE;
        Uri uri = aVar.b;
        Uri uri2 = rhg.a;
        String string = uri.toString();
        if ((!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) || (x4dVar = aVar.h) == null || (cursorQuery = this.c.query(uri, d, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (vs4VarF = f(x4dVar, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string2 = cursorQuery.getString(columnIndex);
                if (string2 != null) {
                    try {
                        iE = yid.e(new ExifInterface(string2).getAttributeInt("Orientation", 1));
                    } catch (IOException e2) {
                        s55.a.getClass();
                        if (wab.p(6)) {
                            wab.u(6, l09.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string2), e2);
                        }
                        iE = 0;
                    }
                    vs4VarF.c = iE;
                } else {
                    iE = 0;
                    vs4VarF.c = iE;
                }
            }
            cursorQuery.close();
            return vs4VarF;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // defpackage.q09
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final vs4 f(x4d x4dVar, long j) {
        int i;
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (oie.l(rect.width(), rect.height(), x4dVar)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = oie.l(rect2.width(), rect2.height(), x4dVar) ? 1 : 0;
        }
        if (i == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = cursorQueryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }
}
