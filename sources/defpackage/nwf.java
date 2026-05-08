package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nwf extends byf {
    public static final a b = new a();

    public static final class a {
        public final byf a(kwf kwfVar, List<? extends wxf> list) {
            kwfVar.getClass();
            list.getClass();
            List<rxf> parameters = kwfVar.getParameters();
            parameters.getClass();
            rxf rxfVar = (rxf) z92.Z0(parameters);
            if (rxfVar == null || !rxfVar.Q()) {
                return new ka7((rxf[]) parameters.toArray(new rxf[0]), (wxf[]) list.toArray(new wxf[0]), false);
            }
            List<rxf> parameters2 = kwfVar.getParameters();
            parameters2.getClass();
            List<rxf> list2 = parameters2;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((rxf) it.next()).j());
            }
            return new mwf(lc9.f0(z92.H1(arrayList, list)));
        }
    }

    @Override // defpackage.byf
    public final wxf d(ui8 ui8Var) {
        return g(ui8Var.M0());
    }

    public abstract wxf g(kwf kwfVar);
}
