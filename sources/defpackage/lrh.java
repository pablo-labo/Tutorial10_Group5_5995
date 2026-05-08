package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class lrh extends hrh<Long> {
    @Override // defpackage.hrh
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strB = this.b((String) this.a.b);
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(25, strB));
        sb.append("Invalid long value for ");
        sb.append(strB);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
