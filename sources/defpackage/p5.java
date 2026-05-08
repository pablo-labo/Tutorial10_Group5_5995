package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.linecorp.linesdk.internal.security.encryption.EncryptionException;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 {
    public final Context a;
    public final String b;
    public final cve c;

    public p5(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        xue xueVar = ft4.a;
        this.a = applicationContext;
        this.b = l5.l("com.linecorp.linesdk.accesstoken.", str);
        this.c = xueVar;
    }

    public final String a(long j) {
        return ((xue) this.c).b(this.a, String.valueOf(j));
    }

    public final String b(String str) {
        return ((xue) this.c).b(this.a, str);
    }

    public final qi7 c() {
        long jLongValue;
        long jLongValue2;
        Context context = this.a;
        String str = this.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        try {
            String string = sharedPreferences.getString("accessToken", null);
            cve cveVar = this.c;
            String strA = string == null ? null : ((xue) cveVar).a(context, string);
            String string2 = sharedPreferences.getString("expiresIn", null);
            if (string2 == null) {
                jLongValue = -1;
            } else {
                try {
                    jLongValue = Long.valueOf(((xue) cveVar).a(context, string2)).longValue();
                } catch (NumberFormatException unused) {
                    jLongValue = -1;
                }
            }
            String string3 = sharedPreferences.getString("issuedClientTime", null);
            if (string3 == null) {
                jLongValue2 = -1;
            } else {
                try {
                    jLongValue2 = Long.valueOf(((xue) cveVar).a(context, string3)).longValue();
                } catch (NumberFormatException unused2) {
                    jLongValue2 = -1;
                }
            }
            if (TextUtils.isEmpty(strA) || jLongValue == -1 || jLongValue2 == -1) {
                return null;
            }
            String string4 = sharedPreferences.getString("refreshToken", null);
            String strA2 = string4 != null ? ((xue) cveVar).a(context, string4) : null;
            if (strA2 == null) {
                strA2 = "";
            }
            return new qi7(jLongValue, jLongValue2, strA, strA2);
        } catch (EncryptionException e) {
            context.getSharedPreferences(str, 0).edit().clear().apply();
            throw e;
        }
    }
}
