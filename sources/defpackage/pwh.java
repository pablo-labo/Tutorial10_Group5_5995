package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class pwh {
    public String a;
    public String b;
    public long c;
    public Bundle d;

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(uz.c(21, str), str2));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return l6.i(sb, ",params=", strValueOf);
    }
}
