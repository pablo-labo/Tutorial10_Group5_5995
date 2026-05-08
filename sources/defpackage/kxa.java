package defpackage;

import defpackage.mke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kxa {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, Function1<? super H, ? extends fv1> function1) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = mke.c;
        mke mkeVarA = mke.b.a();
        while (!linkedList.isEmpty()) {
            Object objO0 = z92.O0(linkedList);
            int i2 = mke.c;
            mke mkeVarA2 = mke.b.a();
            ArrayList<a> arrayListG = ixa.g(objO0, linkedList, function1, new x1(mkeVarA2, 3));
            if (arrayListG.size() == 1 && mkeVarA2.isEmpty()) {
                Object objJ1 = z92.j1(arrayListG);
                objJ1.getClass();
                mkeVarA.add(objJ1);
            } else {
                a aVar = (Object) ixa.s(arrayListG, function1);
                fv1 fv1VarInvoke = function1.invoke(aVar);
                for (a aVar2 : arrayListG) {
                    aVar2.getClass();
                    if (!ixa.k(fv1VarInvoke, function1.invoke(aVar2))) {
                        mkeVarA2.add(aVar2);
                    }
                }
                if (!mkeVarA2.isEmpty()) {
                    mkeVarA.addAll(mkeVarA2);
                }
                mkeVarA.add(aVar);
            }
        }
        return mkeVarA;
    }
}
