package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class fpa {
    public static final OkHttpClient a(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.c(0L, timeUnit);
        builder.z = Util.b(0L, timeUnit);
        builder.A = Util.b(0L, timeUnit);
        builder.j = new bkc();
        builder.k = new Cache(new File(context.getCacheDir(), "http-cache"), 10485760L);
        return new OkHttpClient(builder);
    }
}
