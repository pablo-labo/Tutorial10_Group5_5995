package defpackage;

import defpackage.oi8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {
    public final /* synthetic */ s0<Object, Object> a;
    public final /* synthetic */ HashMap<ln9, List<Object>> b;
    public final /* synthetic */ oi8 c;

    public final class a extends b {
        public a(ln9 ln9Var) {
            super(ln9Var);
        }

        public final lf1 c(int i, a62 a62Var, uuc uucVar) {
            ln9 ln9Var = new ln9(this.a.a + '@' + i);
            r0 r0Var = r0.this;
            HashMap<ln9, List<Object>> map = r0Var.b;
            List<Object> arrayList = map.get(ln9Var);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(ln9Var, arrayList);
            }
            return r0Var.a.q(a62Var, uucVar, arrayList);
        }
    }

    public class b implements oi8.c {
        public final ln9 a;
        public final ArrayList<Object> b = new ArrayList<>();

        public b(ln9 ln9Var) {
            this.a = ln9Var;
        }

        @Override // oi8.c
        public final void a() {
            ArrayList<Object> arrayList = this.b;
            if (arrayList.isEmpty()) {
                return;
            }
            r0.this.b.put(this.a, arrayList);
        }

        @Override // oi8.c
        public final oi8.a b(a62 a62Var, uuc uucVar) {
            return r0.this.a.q(a62Var, uucVar, this.b);
        }
    }

    public r0(s0 s0Var, HashMap map, oi8 oi8Var, HashMap map2) {
        this.a = s0Var;
        this.b = map;
        this.c = oi8Var;
    }

    public final a a(n8a n8aVar, String str) {
        n8aVar.getClass();
        String strC = n8aVar.c();
        strC.getClass();
        return new a(new ln9(strC.concat(str)));
    }
}
