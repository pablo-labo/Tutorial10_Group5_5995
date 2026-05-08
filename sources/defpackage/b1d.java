package defpackage;

import android.net.Uri;
import com.datadog.android.core.internal.CoreFeature;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class b1d {
    public final sn0 a;
    public final v03 b;
    public final String c = "firebase-settings.crashlytics.com";

    public b1d(sn0 sn0Var, v03 v03Var) {
        this.a = sn0Var;
        this.b = v03Var;
    }

    public static final URL a(b1d b1dVar) {
        b1dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority(b1dVar.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(CoreFeature.DEFAULT_SOURCE_NAME).appendPath("gmp");
        sn0 sn0Var = b1dVar.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(sn0Var.a).appendPath("settings");
        m40 m40Var = sn0Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", m40Var.c).appendQueryParameter("display_version", m40Var.b).build().toString());
    }
}
