package defpackage;

import defpackage.hga;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 {
    public static xga a(uqc uqcVar) throws EOFException {
        int i = Integer.parseInt(uqcVar.S(Long.MAX_VALUE));
        long j = Long.parseLong(uqcVar.S(Long.MAX_VALUE));
        long j2 = Long.parseLong(uqcVar.S(Long.MAX_VALUE));
        hga.a aVar = new hga.a();
        int i2 = Integer.parseInt(uqcVar.S(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strS = uqcVar.S(Long.MAX_VALUE);
            int iR = zve.R(strS, ':', 0, false, 6);
            if (iR == -1) {
                h5.k("Unexpected header: ".concat(strS));
                return null;
            }
            aVar.a(zve.s0(strS.substring(0, iR)).toString(), strS.substring(iR + 1));
        }
        return new xga(i, j, j2, new hga(lc9.g0(aVar.a)), 48);
    }

    public static void b(xga xgaVar, tqc tqcVar) {
        tqcVar.z0(xgaVar.a);
        tqcVar.writeByte(10);
        tqcVar.z0(xgaVar.b);
        tqcVar.writeByte(10);
        tqcVar.z0(xgaVar.c);
        tqcVar.writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = xgaVar.d.a.entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        tqcVar.z0(size);
        tqcVar.writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            for (String str : entry.getValue()) {
                tqcVar.Y(entry.getKey());
                tqcVar.Y(":");
                tqcVar.Y(str);
                tqcVar.writeByte(10);
            }
        }
    }
}
