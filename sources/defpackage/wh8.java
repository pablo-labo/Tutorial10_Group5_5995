package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class wh8 {
    public final vh8 a = new vh8();
    public final boolean b = true;

    public final void a() {
        vh8 vh8Var = this.a;
        o81 o81Var = vh8Var.c;
        tu8 tu8Var = tu8.a;
        if (o81Var.E(tu8Var)) {
            o81Var.D(tu8Var, "Eager instances ...");
        }
        long jNanoTime = System.nanoTime();
        kg7 kg7Var = vh8Var.b;
        HashMap<Integer, vge<?>> map = kg7Var.c;
        Collection<vge<?>> collectionValues = map.values();
        collectionValues.getClass();
        if (!collectionValues.isEmpty()) {
            vh8 vh8Var2 = kg7Var.a;
            fg7 fg7Var = new fg7(vh8Var2.c, (qpd) vh8Var2.a.b, null);
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                ((vge) it.next()).c(fg7Var);
            }
        }
        map.clear();
        double dDoubleValue = ((Number) new Pair(j6g.a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).e()).doubleValue();
        o81 o81Var2 = vh8Var.c;
        String str = "Eager instances created in " + dDoubleValue + " ms";
        if (o81Var2.E(tu8Var)) {
            o81Var2.D(tu8Var, str);
        }
    }
}
