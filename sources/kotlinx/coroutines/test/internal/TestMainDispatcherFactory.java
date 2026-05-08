package kotlinx.coroutines.test.internal;

import defpackage.gx;
import defpackage.ju9;
import defpackage.k89;
import defpackage.l89;
import defpackage.zbf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Ll89;", "<init>", "()V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TestMainDispatcherFactory implements l89 {
    @Override // defpackage.l89
    public final k89 a(List<? extends l89> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((l89) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iB = ((l89) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((l89) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        l89 l89Var = (l89) obj;
        if (l89Var == null) {
            l89Var = ju9.a;
        }
        return new zbf(new gx(l89Var, arrayList, this));
    }

    @Override // defpackage.l89
    public final int b() {
        return Integer.MAX_VALUE;
    }
}
