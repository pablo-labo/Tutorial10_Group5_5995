package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c74 {
    public static DisplayMetrics a;
    public static DisplayMetrics b;

    public static final WritableNativeMap a(double d) {
        if (a == null) {
            r6.g("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
            return null;
        }
        if (b == null) {
            r6.g("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetrics displayMetrics = a;
        displayMetrics.getClass();
        writableNativeMap.putMap("windowPhysicalPixels", b(displayMetrics, d));
        DisplayMetrics displayMetrics2 = b;
        displayMetrics2.getClass();
        writableNativeMap.putMap("screenPhysicalPixels", b(displayMetrics2, d));
        return writableNativeMap;
    }

    public static WritableNativeMap b(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = b;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        r6.g("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        return null;
    }

    public static final DisplayMetrics d() {
        DisplayMetrics displayMetrics = a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        r6.g("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        return null;
    }

    public static final void e(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        a = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        b = displayMetrics2;
    }

    public static final void f(Context context) {
        context.getClass();
        if (b != null) {
            return;
        }
        e(context);
    }
}
