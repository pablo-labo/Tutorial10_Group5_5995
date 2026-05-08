package defpackage;

import defpackage.j05;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class ina {
    public final pwf a;
    public r c;
    public gu5<? extends Map<String, ? extends Object>> b = new k7(11);
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final ArrayList j = new ArrayList();

    public static final class a implements Function2<Object[], p3c, j6g> {
        public a(j05.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) {
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Iterator it = ina.this.j.iterator();
            while (it.hasNext()) {
                ((j05) it.next()).getClass();
            }
            return j6g.a;
        }
    }

    public static final class b implements gu5<zf8> {
        public static final b a = new b();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class c implements Function1<Object[], j6g> {
        public c(j05.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            String str = (String) objArr2[0];
            Iterator it = ina.this.j.iterator();
            while (it.hasNext()) {
                ((j05) it.next()).getClass();
                str.getClass();
            }
            return j6g.a;
        }
    }

    public ina(pwf pwfVar) {
        this.a = pwfVar;
    }

    public final xu0 a(String str) {
        xu0 xu0Var = new xu0(str, this.a);
        this.g.put(str, xu0Var);
        return xu0Var;
    }

    public final void b(String... strArr) {
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        this.c = new r((String[]) listAsList.toArray(new String[0]));
    }

    public final jna c() {
        LinkedHashMap linkedHashMap;
        qf0 ch7Var;
        wv4 wv4Var = j05.a.b;
        wv4Var.getClass();
        w2.b bVar = new w2.b();
        while (true) {
            boolean zHasNext = bVar.hasNext();
            linkedHashMap = this.f;
            if (!zHasNext) {
                break;
            }
            j05.a aVar = (j05.a) bVar.next();
            if (!linkedHashMap.containsKey(aVar.a())) {
                String strA = aVar.a();
                if (String.class.equals(p3c.class)) {
                    ch7Var = new ev0(strA, new rf0[0], new a(aVar));
                } else {
                    hb9 hb9Var = tf0.a;
                    iwc iwcVar = fwc.a;
                    rf0 rf0Var = (rf0) tf0.a.get(new Pair(iwcVar.b(String.class), Boolean.FALSE));
                    if (rf0Var == null) {
                        rf0Var = new rf0(new xp8(iwcVar.b(String.class), false, b.a), this.a);
                    }
                    rf0[] rf0VarArr = {rf0Var};
                    c cVar = new c(aVar);
                    ch7Var = j6g.class.equals(Integer.TYPE) ? new ch7(strA, rf0VarArr, cVar) : j6g.class.equals(Boolean.TYPE) ? new hi1(strA, rf0VarArr, cVar) : j6g.class.equals(Double.TYPE) ? new s84(strA, rf0VarArr, cVar) : j6g.class.equals(Float.TYPE) ? new ci5(strA, rf0VarArr, cVar) : j6g.class.equals(String.class) ? new zue(strA, rf0VarArr, cVar) : new o7g(strA, rf0VarArr, cVar);
                }
                linkedHashMap.put(strA, ch7Var);
            }
        }
        LinkedHashMap linkedHashMap2 = this.g;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(kc9.V(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            z0f z0fVar = ((xu0) entry.getValue()).c;
            if (z0fVar == null) {
                l5.q("Required value was null.");
                return null;
            }
            linkedHashMap3.put(key, z0fVar);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(lc9.c0(linkedHashMap, linkedHashMap3));
        gu5<? extends Map<String, ? extends Object>> gu5Var = this.b;
        LinkedHashMap linkedHashMap5 = this.e;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(kc9.V(linkedHashMap5.size()));
        Iterator it = linkedHashMap5.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            entry2.getKey();
            ((gv5) entry2.getValue()).getClass();
            l5.q("Required value was null.");
            return null;
        }
        LinkedHashMap linkedHashMapC0 = lc9.c0(this.d, linkedHashMap6);
        r rVar = this.c;
        LinkedHashMap linkedHashMap7 = this.h;
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(kc9.V(linkedHashMap7.size()));
        for (Map.Entry entry3 : linkedHashMap7.entrySet()) {
            Object key2 = entry3.getKey();
            b4c b4cVar = (b4c) entry3.getValue();
            linkedHashMap8.put(key2, new a4c(b4cVar.a, b4cVar.b, b4cVar.c));
        }
        LinkedHashMap linkedHashMap9 = this.i;
        LinkedHashMap linkedHashMap10 = new LinkedHashMap(kc9.V(linkedHashMap9.size()));
        for (Map.Entry entry4 : linkedHashMap9.entrySet()) {
            Object key3 = entry4.getKey();
            tp2 tp2Var = (tp2) entry4.getValue();
            String str = tp2Var.a;
            gu5<? extends Object> gu5Var2 = tp2Var.b;
            if (gu5Var2 == null) {
                h5.k(l5.m("The constant '", str, "' doesn't have getter."));
                return null;
            }
            linkedHashMap10.put(key3, new sp2(str, gu5Var2));
        }
        return new jna(gu5Var, linkedHashMapC0, linkedHashMap4, rVar, linkedHashMap8, linkedHashMap10);
    }

    public final LinkedHashMap d() {
        return this.f;
    }

    public final LinkedHashMap e() {
        return this.i;
    }

    public final pwf f() {
        return this.a;
    }

    public final LinkedHashMap g() {
        return this.h;
    }

    public final LinkedHashMap h() {
        return this.d;
    }
}
