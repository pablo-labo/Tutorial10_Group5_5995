package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class krd extends TagPayloadReader {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable a(int i, g4b g4bVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(g4bVar.r()));
        }
        if (i == 1) {
            return Boolean.valueOf(g4bVar.x() == 1);
        }
        if (i == 2) {
            return c(g4bVar);
        }
        if (i != 3) {
            if (i == 8) {
                return b(g4bVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(g4bVar.r()));
                g4bVar.K(2);
                return date;
            }
            int iB = g4bVar.B();
            ArrayList arrayList = new ArrayList(iB);
            for (int i2 = 0; i2 < iB; i2++) {
                Serializable serializableA = a(g4bVar.x(), g4bVar);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(g4bVar);
            int iX = g4bVar.x();
            if (iX == 9) {
                return map;
            }
            Serializable serializableA2 = a(iX, g4bVar);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap<String, Object> b(g4b g4bVar) {
        int iB = g4bVar.B();
        HashMap<String, Object> map = new HashMap<>(iB);
        for (int i = 0; i < iB; i++) {
            String strC = c(g4bVar);
            Serializable serializableA = a(g4bVar.x(), g4bVar);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(g4b g4bVar) {
        int iD = g4bVar.D();
        int i = g4bVar.b;
        g4bVar.K(iD);
        return new String(g4bVar.a, i, iD);
    }
}
