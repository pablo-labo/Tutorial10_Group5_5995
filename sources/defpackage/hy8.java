package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hy8<T> implements ga<List<T>> {
    public final ga<T> a;

    public hy8(ga<T> gaVar) {
        this.a = gaVar;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        mb8Var.m();
        ArrayList arrayList = new ArrayList();
        while (mb8Var.hasNext()) {
            try {
                arrayList.add(this.a.a(mb8Var, lb3Var));
            } catch (ApolloGraphQLException e) {
                while (mb8Var.hasNext()) {
                    mb8Var.I();
                }
                mb8Var.l();
                throw e;
            }
        }
        mb8Var.l();
        return arrayList;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        List list = (List) obj;
        hc8Var.getClass();
        lb3Var.getClass();
        list.getClass();
        hc8Var.m();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.a.b(hc8Var, lb3Var, it.next());
        }
        hc8Var.l();
    }
}
