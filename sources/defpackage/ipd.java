package defpackage;

import java.util.Iterator;
import java.util.StringJoiner;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ipd {
    public static String a(Object obj) {
        return obj == null ? "null" : o6.f(String.valueOf(obj), " (a ", obj.getClass().getName(), ")");
    }

    public static String b(g gVar) {
        if (gVar == null) {
            return "unknown";
        }
        int iOrdinal = gVar.K().ordinal();
        if (iOrdinal == 2) {
            return l5.m("List<", b(gVar.x()), ">");
        }
        if (iOrdinal == 3) {
            return l5.m("Map<String, ", b(gVar.M()), ">");
        }
        if (iOrdinal != 4) {
            return gVar.H();
        }
        StringJoiner stringJoiner = new StringJoiner(", ");
        Iterator<g> it = gVar.L().iterator();
        while (it.hasNext()) {
            stringJoiner.add(b(it.next()));
        }
        return l5.m("[", String.valueOf(stringJoiner), "]");
    }
}
