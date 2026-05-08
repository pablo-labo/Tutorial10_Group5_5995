package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m40 {
    public final String a;
    public final String b;
    public final String c;
    public final vnb d;
    public final ArrayList e;

    public m40(String str, String str2, String str3, vnb vnbVar, ArrayList arrayList) {
        q6.m(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vnbVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        if (!this.a.equals(m40Var.a) || !wl7.b(this.b, m40Var.b) || !wl7.b(this.c, m40Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return wl7.b(str, str) && this.d.equals(m40Var.d) && this.e.equals(m40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
