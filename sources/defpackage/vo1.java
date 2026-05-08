package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class vo1 {

    public static final class a {
        public static void a(int i) {
            SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a.a(30);
        }
        if (i >= 30) {
            a.a(31);
        }
        if (i >= 30) {
            a.a(33);
        }
        if (i >= 30) {
            a.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        String upperCase2 = "VanillaIceCream".toUpperCase(locale);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
