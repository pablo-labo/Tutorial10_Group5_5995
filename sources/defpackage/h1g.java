package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.uiplugin.file.FileTooLargeException;
import defpackage.f1g;
import defpackage.xh8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class h1g implements f1g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h1g h1gVar) {
            super(0);
            this.$this_inject = h1gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static void e(File file, InputStream inputStream) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        j6g j6gVar = j6g.a;
                        fileOutputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (IOException e) {
            ArrayList arrayList = lz2.a;
            lz2.c("UIPFileImpl", "Failed to read file: " + e.getMessage(), false, null, 12);
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012a A[Catch: Exception -> 0x0136, TryCatch #2 {Exception -> 0x0136, blocks: (B:34:0x011f, B:36:0x012a, B:38:0x0130, B:42:0x0139), top: B:53:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.f1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.app.Activity r10, java.lang.String r11, java.lang.String r12, kotlin.jvm.functions.Function1 r13, defpackage.pu2 r14) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1g.a(android.app.Activity, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    @Override // defpackage.f1g
    public final void b(FragmentManager fragmentManager, Context context, f1g.a aVar, gu5<? extends w0g> gu5Var) {
        fragmentManager.getClass();
        context.getClass();
        aVar.getClass();
        i1g i1gVar = (i1g) cr8.p(i1g.class);
        Uri uri = aVar.a;
        String str = aVar.b;
        Long l = aVar.c;
        uri.getClass();
        str.getClass();
        d9d d9dVar = new d9d();
        d9dVar.setArguments(aq1.a(new Pair("KEY_URI", uri.toString()), new Pair("KEY_FILE_NAME", str), new Pair("KEY_FILE_DATE_ADDED", l)));
        d9dVar.b = gu5Var;
        i1gVar.e(fragmentManager, d9dVar);
    }

    @Override // defpackage.f1g
    public final File c(Uri uri) throws IOException {
        String strL;
        Long lValueOf;
        Lazy lazy = this.a;
        ContentResolver contentResolver = ((Context) lazy.getValue()).getContentResolver();
        String type = contentResolver.getType(uri);
        if (type == null) {
            type = "";
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
            strL = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
            cursorQuery.close();
        } else {
            strL = null;
        }
        if (strL == null) {
            strL = l5.l("unknown.", extensionFromMimeType);
        }
        String str = strL;
        Cursor cursorQuery2 = contentResolver.query(uri, new String[]{"_size"}, null, null, null);
        if (cursorQuery2 != null) {
            cursorQuery2.moveToFirst();
            long j = cursorQuery2.getLong(cursorQuery2.getColumnIndex("_size"));
            cursorQuery2.close();
            lValueOf = Long.valueOf(j);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null && lValueOf.longValue() >= 10485760) {
            throw new FileTooLargeException();
        }
        File file = new File(((Context) lazy.getValue()).getExternalCacheDir(), str);
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return file;
            }
            e(file, inputStreamOpenInputStream);
            return file;
        } catch (FileNotFoundException e) {
            ArrayList arrayList = lz2.a;
            lz2.c("UIPFileImpl", l5.l("File not found: ", e.getMessage()), false, null, 12);
            return null;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
