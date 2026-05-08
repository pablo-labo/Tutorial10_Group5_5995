package defpackage;

import defpackage.ere;
import defpackage.ke8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class je8 implements gu5 {
    public final ke8.a a;
    public final ke8 b;

    public je8(ke8.a aVar, ke8 ke8Var) {
        this.a = aVar;
        this.b = ke8Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        ke8.a aVar = this.a;
        Collection<ui8> collectionB = aVar.b().j().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList(collectionB.size());
        for (ui8 ui8Var : collectionB) {
            ui8Var.getClass();
            arrayList.add(new cg8(ui8Var, new ee8(ui8Var, aVar, this.b)));
        }
        t52 t52VarB = aVar.b();
        n8a n8aVar = ei8.e;
        if (!ei8.b(t52VarB, ere.a.a) && !ei8.b(t52VarB, ere.a.b)) {
            if (arrayList.isEmpty()) {
                arrayList.add(new cg8(b04.e(aVar.b()).e(), fe8.b));
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c62 c62VarF = yz3.c(((cg8) it.next()).a).f();
                    c62VarF.getClass();
                    if (c62VarF != c62.INTERFACE && c62VarF != c62.ANNOTATION_CLASS) {
                        break;
                    }
                }
                arrayList.add(new cg8(b04.e(aVar.b()).e(), fe8.b));
            }
        }
        return r03.i(arrayList);
    }
}
