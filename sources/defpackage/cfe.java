package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class cfe {
    public final LinkedHashMap a = new LinkedHashMap();

    public final class a {
        public final String a;

        /* JADX INFO: renamed from: cfe$a$a, reason: collision with other inner class name */
        public final class C0106a {
            public final String a;
            public final ArrayList b = new ArrayList();
            public Pair<String, ixf> c = new Pair<>("V", null);

            public C0106a(a aVar, String str, String str2) {
                this.a = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(String str, rw7... rw7VarArr) {
                ixf ixfVar;
                str.getClass();
                if (rw7VarArr.length == 0) {
                    ixfVar = null;
                } else {
                    na7 na7Var = new na7(new qr(rw7VarArr, 1));
                    int iV = kc9.V(t92.r0(na7Var, 10));
                    if (iV < 16) {
                        iV = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                    Iterator it = na7Var.iterator();
                    while (true) {
                        oa7 oa7Var = (oa7) it;
                        if (!oa7Var.a.hasNext()) {
                            break;
                        }
                        ma7 ma7Var = (ma7) oa7Var.next();
                        linkedHashMap.put(Integer.valueOf(ma7Var.a), (rw7) ma7Var.b);
                    }
                    ixfVar = new ixf(linkedHashMap);
                }
                this.b.add(new Pair(str, ixfVar));
            }

            public final void b(md8 md8Var) {
                md8Var.getClass();
                String strE = md8Var.e();
                strE.getClass();
                this.c = new Pair<>(strE, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void c(String str, rw7... rw7VarArr) {
                str.getClass();
                na7 na7Var = new na7(new qr(rw7VarArr, 1));
                int iV = kc9.V(t92.r0(na7Var, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                Iterator it = na7Var.iterator();
                while (true) {
                    oa7 oa7Var = (oa7) it;
                    if (!oa7Var.a.hasNext()) {
                        this.c = new Pair<>(str, new ixf(linkedHashMap));
                        return;
                    } else {
                        ma7 ma7Var = (ma7) oa7Var.next();
                        linkedHashMap.put(Integer.valueOf(ma7Var.a), (rw7) ma7Var.b);
                    }
                }
            }
        }

        public a(String str) {
            this.a = str;
        }

        public final void a(String str, String str2, Function1<? super C0106a, j6g> function1) {
            LinkedHashMap linkedHashMap = cfe.this.a;
            C0106a c0106a = new C0106a(this, str, str2);
            function1.invoke(c0106a);
            ArrayList arrayList = c0106a.b;
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).d());
            }
            String strD = c0106a.c.d();
            strD.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            sb.append(z92.W0(arrayList2, "", null, null, ru1.c, 30));
            sb.append(')');
            if (strD.length() > 1) {
                strD = ja.f(';', "L", strD);
            }
            sb.append(strD);
            String strE = g7.e(JwtParser.SEPARATOR_CHAR, this.a, sb.toString());
            ixf ixfVarE = c0106a.c.e();
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((ixf) ((Pair) it2.next()).e());
            }
            Pair pair = new Pair(strE, new ajb(ixfVarE, arrayList3, c0106a.a));
            linkedHashMap.put(pair.d(), pair.e());
        }
    }
}
