package defpackage;

import com.google.android.gms.internal.fido.zzdh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tsh extends nth {
    public final gkh a;
    public final int b;

    public tsh(enh enhVar) throws zzdh {
        enhVar.getClass();
        this.a = enhVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            gkh gkhVar = this.a;
            if (i >= gkhVar.size()) {
                break;
            }
            int iA = ((nth) gkhVar.get(i)).a();
            if (i2 < iA) {
                i2 = iA;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 4) {
            throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.nth
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nth nthVar = (nth) obj;
        int iZza = nthVar.zza();
        int iE = nth.e((byte) -128);
        if (iE != iZza) {
            return iE - nthVar.zza();
        }
        gkh gkhVar = ((tsh) nthVar).a;
        gkh gkhVar2 = this.a;
        if (gkhVar2.size() != gkhVar.size()) {
            return gkhVar2.size() - gkhVar.size();
        }
        for (int i = 0; i < gkhVar2.size(); i++) {
            int iCompareTo = ((nth) gkhVar2.get(i)).compareTo((nth) gkhVar.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tsh.class == obj.getClass()) {
            return this.a.equals(((tsh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(nth.e((byte) -128)), this.a});
    }

    public final String toString() {
        gkh gkhVar = this.a;
        if (gkhVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = gkhVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((nth) gkhVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(ewa.R(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(ewa.R(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            g7.l(e);
            return null;
        }
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e((byte) -128);
    }
}
