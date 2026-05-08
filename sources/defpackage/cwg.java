package defpackage;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import defpackage.ywg;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class cwg {
    public static bx1 a(WebSettings webSettings) {
        try {
            return new bx1((WebSettingsBoundaryInterface) al1.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) ywg.a.a.b).convertSettings(webSettings)));
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e);
            return new dwg(null);
        }
    }
}
