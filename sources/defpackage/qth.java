package defpackage;

import com.google.android.gms.internal.fido.zzdh;
import com.google.android.gms.internal.fido.zzdl;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qth {
    public static final nth a(wth wthVar) throws zzdl {
        try {
            tth tthVarS = wthVar.s();
            if (tthVarS == null) {
                throw new zzdl("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = tthVarS.b;
                byte b2 = tthVarS.a;
                int i = 0;
                if (b2 == -128) {
                    long jA = wthVar.a();
                    if (jA > 1000) {
                        throw new zzdl("Parser being asked to read a large CBOR array");
                    }
                    b(b, jA);
                    nth[] nthVarArr = new nth[(int) jA];
                    while (i < jA) {
                        nthVarArr[i] = a(wthVar);
                        i++;
                    }
                    return new tsh(gkh.j(nthVarArr));
                }
                try {
                    if (b2 != -96) {
                        if (b2 == -64) {
                            throw new zzdl("Tags are currently unsupported");
                        }
                        if (b2 == -32) {
                            return new wsh(wthVar.v());
                        }
                        if (b2 == 0 || b2 == 32) {
                            long jH = wthVar.h();
                            b(b, jH > 0 ? jH : ~jH);
                            return new bth(jH);
                        }
                        if (b2 != 64) {
                            if (b2 != 96) {
                                throw new zzdl("Unidentifiable major type: " + ((b2 >> 5) & 7));
                            }
                            wthVar.P((byte) 96);
                            String str = new String(wthVar.W(), StandardCharsets.UTF_8);
                            b(b, str.length());
                            return new hth(str);
                        }
                        wthVar.P((byte) 64);
                        byte[] bArrW = wthVar.W();
                        int length = bArrW.length;
                        b(b, length);
                        prh.g(0, length, bArrW.length);
                        byte[] bArr = new byte[length];
                        System.arraycopy(bArrW, 0, bArr, 0, length);
                        return new ysh(new krh(bArr));
                    }
                    long jP = wthVar.p();
                    if (jP > 1000) {
                        throw new zzdl("Parser being asked to read a large CBOR map");
                    }
                    b(b, jP);
                    int i2 = (int) jP;
                    de6[] de6VarArr = new de6[i2];
                    nth nthVar = null;
                    int i3 = 0;
                    while (i3 < jP) {
                        nth nthVarA = a(wthVar);
                        if (nthVar != null && nthVarA.compareTo(nthVar) <= 0) {
                            throw new zzdh("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + nthVar.toString() + "\nCurrent key: " + nthVarA.toString());
                        }
                        de6VarArr[i3] = new de6(nthVarA, a(wthVar));
                        i3++;
                        nthVar = nthVarA;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        de6 de6Var = de6VarArr[i];
                        if (treeMap.containsKey((nth) de6Var.a)) {
                            throw new zzdh("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((nth) de6Var.a, (nth) de6Var.b);
                        i++;
                    }
                    return new eth(bmh.b(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new zzdl(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new zzdl(e3);
        }
    }

    public static final void b(byte b, long j) throws zzdh {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new zzdh(u40.c(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new zzdh(u40.c(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new zzdh(u40.c(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new zzdh(u40.c(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
