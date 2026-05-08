package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(hc8 hc8Var, Object obj) {
        if (obj == null) {
            hc8Var.H1();
            return;
        }
        if (obj instanceof Map) {
            hc8Var.j();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                hc8Var.u0(String.valueOf(key));
                a(hc8Var, value);
            }
            hc8Var.t();
            j6g j6gVar = j6g.a;
            return;
        }
        if (obj instanceof List) {
            hc8Var.m();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                a(hc8Var, it.next());
            }
            hc8Var.l();
            j6g j6gVar2 = j6g.a;
            return;
        }
        if (obj instanceof Boolean) {
            hc8Var.V(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            hc8Var.F(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            hc8Var.E(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            hc8Var.K(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof za8) {
            hc8Var.M0((za8) obj);
            return;
        }
        if (obj instanceof String) {
            hc8Var.T0((String) obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot write ");
        sb.append(obj);
        yd8 yd8VarB = fwc.a.b(obj.getClass());
        sb.append(" of class '");
        sb.append(yd8VarB);
        sb.append("' to Json");
        throw new IllegalStateException(sb.toString().toString());
    }
}
