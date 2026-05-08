package defpackage;

import defpackage.z4d;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class g72 extends ka6 {
    public static final void J1(t52 t52Var, LinkedHashSet<t52> linkedHashSet, in9 in9Var, boolean z) {
        for (aj3 aj3Var : z4d.a.a(in9Var, lz3.o, 2)) {
            if (aj3Var instanceof t52) {
                t52 t52VarR0 = (t52) aj3Var;
                if (t52VarR0.i0()) {
                    n8a name = t52VarR0.getName();
                    name.getClass();
                    v62 v62VarD = in9Var.d(name, dia.d);
                    t52VarR0 = v62VarD instanceof t52 ? (t52) v62VarD : v62VarD instanceof zvf ? ((zvf) v62VarD).r0() : null;
                }
                if (t52VarR0 != null) {
                    int i = yz3.a;
                    Iterator<ui8> it = t52VarR0.j().b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (yz3.p(it.next(), t52Var.a())) {
                                linkedHashSet.add(t52VarR0);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        in9 in9VarT = t52VarR0.T();
                        in9VarT.getClass();
                        J1(t52Var, linkedHashSet, in9VarT, z);
                    }
                }
            }
        }
    }
}
