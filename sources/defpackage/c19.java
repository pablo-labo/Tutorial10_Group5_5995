package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c19 {
    public static final c19 b = new c19(new e19(new LocaleList(new Locale[0])));
    public final e19 a;

    public static class a {
        public static final /* synthetic */ int a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    public c19(e19 e19Var) {
        this.a = e19Var;
    }

    public static c19 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = a.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new c19(new e19(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c19) {
            return this.a.equals(((c19) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
