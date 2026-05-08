package defpackage;

import defpackage.ewc;
import defpackage.ke8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ne8 {
    public static final ArrayList a(yd8 yd8Var) {
        yd8Var.getClass();
        ewc.a aVar = ((ke8) yd8Var).c.getValue().o;
        qf8<Object> qf8Var = ke8.a.q[13];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Collection) objInvoke) {
            wd8 wd8Var = (wd8) obj;
            if (!(wd8Var.z().O() != null) && (wd8Var instanceof tf8)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> ve8<T> b(yd8<T> yd8Var) {
        T next;
        yd8Var.getClass();
        Iterator<T> it = ((ke8) yd8Var).k().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ve8 ve8Var = (ve8) next;
            ve8Var.getClass();
            if (((uq2) ((ye8) ve8Var).z()).c0()) {
                break;
            }
        }
        return (ve8) next;
    }
}
