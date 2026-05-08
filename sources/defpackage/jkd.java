package defpackage;

import defpackage.ikd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jkd implements ikd {
    public final Function1<Object, Boolean> a;
    public final z3a<String, List<Object>> b;
    public z3a<String, List<gu5<Object>>> c;

    public static final class a implements ikd.a {
        public final /* synthetic */ z3a<String, List<gu5<Object>>> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ gu5<Object> c;

        public a(z3a<String, List<gu5<Object>>> z3aVar, String str, gu5<? extends Object> gu5Var) {
            this.a = z3aVar;
            this.b = str;
            this.c = gu5Var;
        }

        @Override // ikd.a
        public final void a() {
            z3a<String, List<gu5<Object>>> z3aVar = this.a;
            String str = this.b;
            List<gu5<Object>> listK = z3aVar.k(str);
            if (listK != null) {
                listK.remove(this.c);
            }
            List<gu5<Object>> list = listK;
            if (list == null || list.isEmpty()) {
                return;
            }
            z3aVar.m(str, listK);
        }
    }

    public jkd(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        z3a<String, List<Object>> z3aVar;
        this.a = function1;
        if (map == null || map.isEmpty()) {
            z3aVar = null;
        } else {
            z3aVar = new z3a<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                z3aVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = z3aVar;
    }

    @Override // defpackage.ikd
    public final boolean a(Object obj) {
        return this.a.invoke(obj).booleanValue();
    }

    @Override // defpackage.ikd
    public final ikd.a b(String str, gu5<? extends Object> gu5Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ypd.E(str.charAt(i))) {
                z3a<String, List<gu5<Object>>> z3aVarB = this.c;
                if (z3aVarB == null) {
                    z3aVarB = lnd.b();
                    this.c = z3aVarB;
                }
                List<gu5<Object>> listD = z3aVarB.d(str);
                if (listD == null) {
                    listD = new ArrayList<>();
                    z3aVarB.m(str, listD);
                }
                listD.add(gu5Var);
                return new a(z3aVarB, str, gu5Var);
            }
        }
        l5.q("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.ikd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> e() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkd.e():java.util.Map");
    }

    @Override // defpackage.ikd
    public final Object f(String str) {
        z3a<String, List<Object>> z3aVar = this.b;
        List<Object> listK = z3aVar != null ? z3aVar.k(str) : null;
        List<Object> list = listK;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (listK.size() > 1 && z3aVar != null) {
            List<Object> listSubList = listK.subList(1, listK.size());
            int i = z3aVar.i(str);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = z3aVar.c;
            Object obj = objArr[i];
            z3aVar.b[i] = str;
            objArr[i] = listSubList;
        }
        return listK.get(0);
    }
}
