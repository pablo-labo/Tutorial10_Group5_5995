package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e37 {
    public static final void a(Context context) {
        context.getClass();
        try {
            File file = new File(context.getCacheDir(), "images");
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        name.getClass();
                        if (wve.K(name, "indeed_job_share", false)) {
                            file2.delete();
                        }
                    }
                }
            }
        } catch (Exception unused) {
            ArrayList arrayList = lz2.a;
            lz2.c("ImageSaveAndShareUtils", "Failed to cleanup cached images with prefix: ".concat("indeed_job_share"), false, null, 12);
        }
    }

    public static final Uri b(Context context, Bitmap bitmap, String str) throws IOException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str.concat(".jpg"));
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            return null;
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
        try {
            if (outputStreamOpenOutputStream != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
                return uriInsert;
            }
            j6g j6gVar = j6g.a;
            c0h.q(outputStreamOpenOutputStream, null);
            return null;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.net.Uri c(android.content.Context r8, android.graphics.Bitmap r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e37.c(android.content.Context, android.graphics.Bitmap, java.lang.String):android.net.Uri");
    }

    public static final void d(Context context, String str) {
        context.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("ImageSaveAndShareUtils", "Starting share with text only", null);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "I was hired!");
        intent.putExtra("android.intent.extra.TEXT", str);
        context.startActivity(Intent.createChooser(intent, "Share via"));
    }
}
