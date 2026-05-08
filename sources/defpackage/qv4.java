package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@sy3
public abstract class qv4<T> extends ha1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv4(xed xedVar) {
        super(xedVar);
        xedVar.getClass();
    }

    public abstract void h(zze zzeVar, T t);

    public final void i(Iterable<? extends T> iterable) {
        iterable.getClass();
        zze zzeVarC = c();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                h(zzeVarC, it.next());
                zzeVarC.A0();
            }
        } finally {
            g(zzeVarC);
        }
    }

    public final void j(T t) {
        zze zzeVarC = c();
        try {
            h(zzeVarC, t);
            zzeVarC.A0();
        } finally {
            g(zzeVarC);
        }
    }
}
