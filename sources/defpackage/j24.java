package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes2.dex */
public final class j24 implements n34, SharedPreferences.OnSharedPreferenceChangeListener {
    public final a a;
    public final SharedPreferences b;
    public final yya c;

    public interface a {
        void a();
    }

    public j24(Context context, a aVar) {
        context.getClass();
        this.a = aVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.getClass();
        this.b = defaultSharedPreferences;
        this.c = new yya(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public final boolean a() {
        return this.b.getBoolean("fps_debug", false);
    }

    public final boolean b() {
        return this.b.getBoolean("hot_module_replacement", true);
    }

    public final boolean c() {
        return this.b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if ("fps_debug".equals(str) || "js_dev_mode_debug".equals(str) || "js_minify_debug".equals(str)) {
            this.a.a();
        }
    }
}
