package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class am2 implements ntc, roa {
    public int a;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [zr4] */
    public am2(String str, String str2) {
        str.getClass();
        this.a = str.length();
        Object arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                int iR = zve.R(str2, str.charAt(i), i2, false, 4);
                if (iR == -1) {
                    arrayList = zr4.a;
                    break;
                } else {
                    arrayList.add(Integer.valueOf(iR));
                    i2 = iR + 1;
                    i++;
                }
            } else {
                break;
            }
        }
        this.b = arrayList;
    }

    @Override // defpackage.roa
    public int a(int i) {
        Iterator it = ((List) this.b).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((Number) it.next()).intValue() >= i) {
                break;
            }
            i2++;
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.a;
    }

    @Override // defpackage.ntc
    public boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        int i;
        ntc[] ntcVarArr;
        do {
            i = this.a;
            ntcVarArr = (ntc[]) this.b;
            if (i >= 8) {
                return false;
            }
            this.a = i + 1;
        } while (!ntcVarArr[i].b(unsatisfiedLinkError, eneVarArr));
        return true;
    }

    @Override // defpackage.roa
    public int c(int i) {
        int i2 = this.a;
        List list = (List) this.b;
        return i >= i2 ? ((Number) z92.Y0(list)).intValue() + 1 : ((Number) list.get(i)).intValue();
    }

    public am2(ntc... ntcVarArr) {
        this.b = ntcVarArr;
        this.a = 0;
    }
}
