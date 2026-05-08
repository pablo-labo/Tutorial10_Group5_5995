package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import androidx.media3.datasource.cache.c;
import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import expo.modules.video.VideoCacheException;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mng {
    public final WeakReference<Context> a;
    public final vqe b;
    public final SharedPreferences c;
    public wt8 d;
    public c e;

    public mng(ReactApplicationContext reactApplicationContext) {
        this.a = new WeakReference<>(reactApplicationContext);
        vqe vqeVar = new vqe(reactApplicationContext.getApplicationContext(), "exoplayer_internal.db", null, 1);
        this.b = vqeVar;
        SharedPreferences sharedPreferences = reactApplicationContext.getSharedPreferences("ExpoVideoCache", 0);
        this.c = sharedPreferences;
        this.d = new wt8(sharedPreferences.getLong("cacheSize", 1073741824L));
        this.e = new c(b(), this.d, vqeVar);
    }

    public static void a() throws VideoCacheException {
        yng.a.getClass();
        if (!yng.e.isEmpty()) {
            throw new VideoCacheException("Cannot clear cache while there are active players", null);
        }
        if (wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
            Log.w("ExpoVideo", "Clearing cache on the main thread, this might cause performance issues");
        }
    }

    public final File b() throws Exceptions$ReactContextLost {
        SharedPreferences sharedPreferences = this.c;
        String string = sharedPreferences.getString("cacheDir", null);
        if (string == null) {
            string = t40.h();
            sharedPreferences.edit().putString("cacheDir", string).commit();
        }
        Context context = this.a.get();
        if (context == null) {
            throw new Exceptions$ReactContextLost();
        }
        File file = new File(new File(context.getCacheDir(), "ExpoVideoCache"), string);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void c(long j) throws VideoCacheException {
        a();
        this.e.n();
        this.c.edit().putLong("cacheSize", j).apply();
        this.d = new wt8(j);
        this.e = new c(b(), this.d, this.b);
    }
}
