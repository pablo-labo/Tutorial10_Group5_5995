package defpackage;

import com.google.android.gms.internal.fido.zzdh;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eth extends nth {
    public final int a;
    public final bmh b;

    public eth(bmh bmhVar) throws zzdh {
        bmhVar.getClass();
        this.b = bmhVar;
        s7h s7hVarD = bmhVar.entrySet().d();
        int i = 0;
        while (s7hVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) s7hVarD.next();
            int iA = ((nth) entry.getKey()).a();
            i = i < iA ? iA : i;
            int iA2 = ((nth) entry.getValue()).a();
            if (i < iA2) {
                i = iA2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 4) {
            throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.nth
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        nth nthVar = (nth) obj;
        int iZza = nthVar.zza();
        int iE = nth.e((byte) -96);
        if (iE != iZza) {
            return iE - nthVar.zza();
        }
        bmh bmhVar = ((eth) nthVar).b;
        bmh bmhVar2 = this.b;
        if (bmhVar2.d.size() != bmhVar.d.size()) {
            return bmhVar2.d.size() - bmhVar.d.size();
        }
        s7h s7hVarD = bmhVar2.entrySet().d();
        s7h s7hVarD2 = bmhVar.entrySet().d();
        do {
            if (!s7hVarD.hasNext() && !s7hVarD2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) s7hVarD.next();
            Map.Entry entry2 = (Map.Entry) s7hVarD2.next();
            int iCompareTo2 = ((nth) entry.getKey()).compareTo((nth) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((nth) entry.getValue()).compareTo((nth) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eth.class == obj.getClass()) {
            return this.b.equals(((eth) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(nth.e((byte) -96)), this.b});
    }

    public final String toString() {
        bmh bmhVar = this.b;
        if (bmhVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s7h s7hVarD = bmhVar.entrySet().d();
        while (s7hVarD.hasNext()) {
            Map.Entry entry = (Map.Entry) s7hVarD.next();
            linkedHashMap.put(((nth) entry.getKey()).toString().replace("\n", "\n  "), ((nth) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ewa ewaVar = new ewa(28);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            fhh.a(sb, linkedHashMap.entrySet().iterator(), ewaVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            g7.l(e);
            return null;
        }
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e((byte) -96);
    }
}
