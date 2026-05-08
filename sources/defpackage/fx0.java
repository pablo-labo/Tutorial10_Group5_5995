package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fx0<K, T> extends n0<K, T> {
    public it0<T> a;

    public static String b(it0 it0Var, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(it0Var.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gwf.b.a;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(t92.r0(it0Var, 10));
        int i2 = 0;
        for (T t : it0Var) {
            int i3 = i2 + 1;
            T t2 = null;
            if (i2 < 0) {
                u63.o0();
                throw null;
            }
            Iterator<T> it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        t2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) t2) + '[' + i2 + "]: " + t);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    @Override // defpackage.n0
    public final it0<T> a() {
        return this.a;
    }
}
