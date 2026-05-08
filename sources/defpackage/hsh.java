package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class hsh extends hrh<Boolean> {
    @Override // defpackage.hrh
    public final Boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (gqh.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (gqh.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strB = b((String) this.a.b);
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(28, strB));
        sb.append("Invalid boolean value for ");
        sb.append(strB);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
