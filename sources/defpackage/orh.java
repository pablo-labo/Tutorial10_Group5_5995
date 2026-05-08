package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class orh extends hrh<Double> {
    @Override // defpackage.hrh
    public final Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strB = this.b((String) this.a.b);
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + uz.c(27, strB));
        sb.append("Invalid double value for ");
        sb.append(strB);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
