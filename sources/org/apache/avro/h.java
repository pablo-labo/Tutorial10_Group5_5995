package org.apache.avro;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l5;
import java.io.IOException;
import java.util.HashMap;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    public static class a {
        public static final long[] a = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];

        static {
            for (int i = 0; i < 256; i++) {
                long j = i;
                for (int i2 = 0; i2 < 8; i2++) {
                    j = (j >>> 1) ^ ((-(1 & j)) & (-4513414715797952619L));
                }
                a[i] = j;
            }
        }
    }

    public static Appendable a(HashMap map, g gVar, Appendable appendable) throws IOException {
        g.u uVarK = gVar.K();
        int iOrdinal = uVarK.ordinal();
        boolean z = true;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                appendable.append("{\"type\":\"").append(uVarK.c()).append("\"");
                if (uVarK == g.u.ARRAY) {
                    a(map, gVar.x(), appendable.append(",\"items\":"));
                } else {
                    a(map, gVar.M(), appendable.append(",\"values\":"));
                }
                return appendable.append("}");
            }
            if (iOrdinal == 4) {
                appendable.append('[');
                for (g gVar2 : gVar.L()) {
                    if (z) {
                        z = false;
                    } else {
                        appendable.append(',');
                    }
                    a(map, gVar2, appendable);
                }
                return appendable.append(']');
            }
            if (iOrdinal != 5) {
                return appendable.append('\"').append(uVarK.c()).append('\"');
            }
        }
        String strE = gVar.E();
        if (map.get(strE) != null) {
            return appendable.append((CharSequence) map.get(strE));
        }
        String str = "\"" + strE + "\"";
        map.put(strE, str);
        appendable.append("{\"name\":").append(str);
        appendable.append(",\"type\":\"").append(uVarK.c()).append("\"");
        if (uVarK == g.u.ENUM) {
            appendable.append(",\"symbols\":[");
            for (String str2 : gVar.A()) {
                if (z) {
                    z = false;
                } else {
                    appendable.append(',');
                }
                appendable.append('\"').append(str2).append('\"');
            }
            appendable.append("]");
        } else if (uVarK == g.u.FIXED) {
            appendable.append(",\"size\":").append(Integer.toString(gVar.D()));
        } else {
            appendable.append(",\"fields\":[");
            for (g.f fVar : gVar.C()) {
                if (z) {
                    z = false;
                } else {
                    appendable.append(',');
                }
                appendable.append("{\"name\":\"").append(fVar.b).append("\"");
                a(map, fVar.d, appendable.append(",\"type\":")).append("}");
            }
            appendable.append("]");
        }
        return appendable.append("}");
    }

    public static long b(byte[] bArr) {
        long j = -4513414715797952619L;
        for (byte b : bArr) {
            j = a.a[((int) (j ^ ((long) b))) & 255] ^ (j >>> 8);
        }
        return j;
    }

    public static String c(g gVar) {
        try {
            return a(new HashMap(), gVar, new StringBuilder()).toString();
        } catch (IOException e) {
            l5.r(e);
            return null;
        }
    }
}
