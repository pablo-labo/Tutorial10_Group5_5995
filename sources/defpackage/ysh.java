package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ysh extends nth {
    public final krh a;

    public ysh(krh krhVar) {
        this.a = krhVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nth nthVar = (nth) obj;
        int iZza = nthVar.zza();
        int iE = nth.e((byte) 64);
        if (iE != iZza) {
            return iE - nthVar.zza();
        }
        krh krhVar = ((ysh) nthVar).a;
        krh krhVar2 = this.a;
        byte[] bArr = krhVar2.zza;
        int length = bArr.length;
        byte[] bArr2 = krhVar.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return wqh.a.compare(krhVar2.j(), krhVar.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ysh.class == obj.getClass()) {
            return this.a.equals(((ysh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(nth.e((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        aqh aqhVar = iqh.a;
        iqh iqhVarC = aqhVar.d;
        if (iqhVarC == null) {
            yph yphVar = aqhVar.b;
            char[] cArr = yphVar.b;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char c = cArr[i];
                if (c < 'a' || c > 'z') {
                    i++;
                } else {
                    int length2 = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            char c2 = cArr[i2];
                            if (c2 >= 'A' && c2 <= 'Z') {
                                r6.g("Cannot call upperCase() on a mixed-case alphabet");
                                return null;
                            }
                            i2++;
                        } else {
                            char[] cArr2 = new char[cArr.length];
                            for (int i3 = 0; i3 < cArr.length; i3++) {
                                char c3 = cArr[i3];
                                if (c3 >= 97 && c3 <= 122) {
                                    c3 ^= 32;
                                }
                                cArr2[i3] = (char) c3;
                            }
                            yph yphVar2 = new yph(yphVar.a.concat(".upperCase()"), cArr2);
                            byte[] bArr = yphVar2.g;
                            if (!yphVar.h || yphVar2.h) {
                                yphVar = yphVar2;
                            } else {
                                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (int i4 = 65; i4 <= 90; i4++) {
                                    int i5 = i4 | 32;
                                    byte b = bArr[i4];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        char c4 = (char) i4;
                                        char c5 = (char) i5;
                                        if (b2 != -1) {
                                            r6.g(ejh.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                yphVar = new yph(yphVar2.a.concat(".ignoreCase()"), yphVar2.b, bArrCopyOf, true);
                            }
                        }
                    }
                }
            }
            iqhVarC = yphVar == aqhVar.b ? aqhVar : aqhVar.c(yphVar, aqhVar.c);
            aqhVar.d = iqhVarC;
        }
        byte[] bArrJ = this.a.j();
        return l5.m("h'", iqhVarC.b(bArrJ.length, bArrJ), "'");
    }

    @Override // defpackage.nth
    public final int zza() {
        return nth.e((byte) 64);
    }
}
