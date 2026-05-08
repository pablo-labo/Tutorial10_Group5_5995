package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m5d {
    public static final m5d a = new m5d();
    public static final HashMap b = new HashMap();

    public static final int a(Context context, String str) {
        context.getClass();
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strI = wve.I(lowerCase, "-", "_");
        try {
            return Integer.parseInt(strI);
        } catch (NumberFormatException unused) {
            m5d m5dVar = a;
            synchronized (m5dVar) {
                try {
                    HashMap map = b;
                    Integer num = (Integer) map.get(strI);
                    if (num != null) {
                        return num.intValue();
                    }
                    m5dVar.getClass();
                    int identifier = context.getResources().getIdentifier(strI, "drawable", context.getPackageName());
                    map.put(strI, Integer.valueOf(identifier));
                    return identifier;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Uri b(Context context, String str) {
        context.getClass();
        int iA = a(context, str);
        if (iA > 0) {
            Uri uriBuild = new Uri.Builder().scheme("res").path(String.valueOf(iA)).build();
            uriBuild.getClass();
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        uri.getClass();
        return uri;
    }
}
