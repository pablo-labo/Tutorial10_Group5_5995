package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class sn0 {
    public final String a;
    public final m40 b;

    public sn0(String str, m40 m40Var) {
        q6.m(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = m40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn0)) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        if (!wl7.b(this.a, sn0Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!wl7.b(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return wl7.b(str2, str2) && this.b.equals(sn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((z29.LOG_ENVIRONMENT_PROD.hashCode() + akb.d((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 46672442) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + z29.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
