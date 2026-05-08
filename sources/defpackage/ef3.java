package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import defpackage.gpa;
import expo.modules.video.records.VideoSource;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class ef3 {
    public static final a.InterfaceC0038a a(Context context, VideoSource videoSource) {
        String scheme;
        String string;
        String str;
        String str2;
        Uri uri = videoSource.getUri();
        if (uri == null || (scheme = uri.getScheme()) == null || !wve.K(scheme, "http", false)) {
            return new c.a(context);
        }
        OkHttpClient okHttpClient = new OkHttpClient(new OkHttpClient.Builder());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        applicationInfo.getClass();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i);
            string.getClass();
        }
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (cCharAt >= 0 && cCharAt < 128) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        String str3 = vjg.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = CoreFeature.DEFAULT_APP_VERSION;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        sb2.append("/");
        sb2.append(str);
        sb2.append(" (Linux;Android ");
        String strI = l6.i(sb2, Build.VERSION.RELEASE, ") AndroidXMedia3/1.8.0");
        gpa.a aVar = new gpa.a(okHttpClient);
        Map<String, String> headers = videoSource.getHeaders();
        if (headers != null) {
            Map<String, String> map = !headers.isEmpty() ? headers : null;
            if (map != null) {
                kt1 kt1Var = aVar.a;
                synchronized (kt1Var) {
                    kt1Var.b = null;
                    ((HashMap) kt1Var.a).clear();
                    ((HashMap) kt1Var.a).putAll(map);
                }
            }
        }
        if (headers != null && (str2 = headers.get(DataOkHttpUploader.HEADER_USER_AGENT)) != null) {
            strI = str2;
        }
        aVar.c = strI;
        return aVar;
    }
}
