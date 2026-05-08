package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.CookieManager;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class e94 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static long a(Context context, String str, String str2, boolean z) {
        context.getClass();
        str2.getClass();
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setTitle(str2);
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie != null) {
                request.addRequestHeader("Cookie", cookie);
            }
            if (z) {
                if (new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str2).exists()) {
                    ArrayList arrayList = lz2.a;
                    Log.d("DownloadUtils", str2.concat(" already exists, so creating a new file with a different name"), null);
                    str2 = b(str2);
                }
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
            } else {
                request.setDestinationInExternalFilesDir(context, null, str2);
            }
            Object systemService = context.getSystemService("download");
            systemService.getClass();
            return ((DownloadManager) systemService).enqueue(request);
        } catch (Exception e) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("DownloadUtils", l5.l("Error downloading resume file: ", e.getMessage()), false, e.getCause());
            return -1L;
        }
    }

    public static String b(String str) {
        return o6.f(zve.r0(str, JwtParser.SEPARATOR_CHAR), new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())), ".", zve.o0(JwtParser.SEPARATOR_CHAR, str, str));
    }
}
