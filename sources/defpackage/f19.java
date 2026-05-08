package defpackage;

import android.icu.util.ULocale;
import com.facebook.hermes.intl.JSRangeErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class f19 {
    public static g19 a(String str) throws JSRangeErrorException {
        g19 g19Var = new g19();
        g19Var.a = null;
        g19Var.b = null;
        g19Var.c = false;
        ULocale.Builder builder = new ULocale.Builder();
        g19Var.b = builder;
        try {
            builder.setLanguageTag(str);
            g19Var.c = true;
            return g19Var;
        } catch (RuntimeException e) {
            throw new JSRangeErrorException(e.getMessage());
        }
    }
}
