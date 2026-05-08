package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fhh {
    public static final void a(StringBuilder sb, Iterator it, ewa ewaVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ewa.R(entry.getKey()));
            sb.append(" : ");
            sb.append(ewa.R(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ewa.R(entry2.getKey()));
                sb.append(" : ");
                sb.append(ewa.R(entry2.getValue()));
            }
        }
    }
}
