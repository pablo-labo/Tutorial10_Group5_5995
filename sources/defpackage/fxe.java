package defpackage;

import defpackage.kz3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class fxe extends jn9 {
    public final xx9 b;
    public final mq5 c;

    public fxe(xx9 xx9Var, mq5 mq5Var) {
        xx9Var.getClass();
        mq5Var.getClass();
        this.b = xx9Var;
        this.c = mq5Var;
    }

    @Override // defpackage.jn9, defpackage.z4d
    public final Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        if (lz3Var.a(lz3.h)) {
            mq5 mq5Var = this.c;
            if (!mq5Var.a.c() || !lz3Var.a.contains(kz3.b.a)) {
                xx9 xx9Var = this.b;
                Collection<mq5> collectionQ = xx9Var.q(mq5Var, function1);
                ArrayList arrayList = new ArrayList(collectionQ.size());
                Iterator<mq5> it = collectionQ.iterator();
                while (it.hasNext()) {
                    n8a n8aVarF = it.next().a.f();
                    if (function1.invoke(n8aVarF).booleanValue()) {
                        wya wyaVar = null;
                        if (!n8aVarF.b) {
                            wya wyaVarS = xx9Var.S(mq5Var.a(n8aVarF));
                            if (!wyaVarS.isEmpty()) {
                                wyaVar = wyaVarS;
                            }
                        }
                        if (wyaVar != null) {
                            arrayList.add(wyaVar);
                        }
                    }
                }
                return arrayList;
            }
        }
        return zr4.a;
    }

    @Override // defpackage.jn9, defpackage.in9
    public final Set<n8a> g() {
        return is4.a;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
