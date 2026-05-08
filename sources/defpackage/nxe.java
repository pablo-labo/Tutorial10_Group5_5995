package defpackage;

import defpackage.l5h;
import defpackage.pua;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nxe extends l5h {
    public final long c;
    public final Function1<lu2<? super Map<String, ? extends Object>>, Object> d;
    public final k5h e;

    public static final class a implements l5h.a {
        public final long a;
        public final Function1<lu2<? super Map<String, ? extends Object>>, Object> b;
        public final k5h c;

        public a(int i) {
            mxe mxeVar = new mxe(1, null);
            this.a = 10000L;
            this.b = mxeVar;
            this.c = k5h.a;
        }

        @Override // l5h.a
        public final nxe a(ewg ewgVar, l5h.b bVar, e13 e13Var) {
            ewgVar.getClass();
            bVar.getClass();
            e13Var.getClass();
            return new nxe(ewgVar, bVar, this.a, this.b, this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nxe(ewg ewgVar, l5h.b bVar, long j, Function1<? super lu2<? super Map<String, ? extends Object>>, ? extends Object> function1, k5h k5hVar) {
        super(ewgVar, bVar);
        ewgVar.getClass();
        bVar.getClass();
        function1.getClass();
        k5hVar.getClass();
        this.c = j;
        this.d = function1;
        this.e = k5hVar;
    }

    @Override // defpackage.l5h
    public final void a(Map<String, ? extends Object> map) {
        map.getClass();
        Object obj = map.get("type");
        boolean zB = wl7.b(obj, "data");
        l5h.b bVar = this.b;
        if (zB) {
            Object obj2 = map.get("id");
            obj2.getClass();
            Object obj3 = map.get("payload");
            obj3.getClass();
            bVar.d((String) obj2, (Map) obj3);
            return;
        }
        if (wl7.b(obj, "error")) {
            Object obj4 = map.get("id");
            if (obj4 instanceof String) {
                bVar.c((String) obj4, (Map) map.get("payload"));
                return;
            } else {
                bVar.e((Map) map.get("payload"));
                return;
            }
        }
        if (wl7.b(obj, "complete")) {
            Object obj5 = map.get("id");
            obj5.getClass();
            bVar.a((String) obj5);
        }
    }

    @Override // defpackage.l5h
    public final <D extends pua.a> void e(rh0<D> rh0Var) {
        rh0Var.getClass();
        Pair pair = new Pair("type", "start");
        Pair pair2 = new Pair("id", rh0Var.b.toString());
        pua<D> puaVar = rh0Var.a;
        Boolean bool = rh0Var.f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z = rh0Var.k;
        Boolean bool2 = rh0Var.g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        lb3 lb3Var = (lb3) rh0Var.c.c(lb3.f);
        if (lb3Var == null) {
            lb3Var = lb3.g;
        }
        String strB = zBooleanValue2 ? puaVar.b() : null;
        ub9 ub9Var = new ub9();
        Function1 eo3Var = (zBooleanValue || z) ? new eo3(puaVar.id(), zBooleanValue, z) : new tr(4);
        ub9Var.j();
        ub9Var.u0("operationName");
        ub9Var.p(puaVar.name());
        ub9Var.u0("variables");
        za5 za5Var = new za5(ub9Var);
        za5Var.j();
        puaVar.d(za5Var, lb3Var, false);
        za5Var.t();
        if (strB != null) {
            ub9Var.u0("query");
            ub9Var.p(strB);
        }
        eo3Var.invoke(ub9Var);
        ub9Var.t();
        Object objH = ub9Var.h();
        objH.getClass();
        d(lc9.a0(pair, pair2, new Pair("payload", (Map) objH)), this.e);
    }

    @Override // defpackage.l5h
    public final <D extends pua.a> void f(rh0<D> rh0Var) {
        rh0Var.getClass();
        d(lc9.a0(new Pair("type", "stop"), new Pair("id", rh0Var.b.toString())), this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (defpackage.ewa.O(r7.c, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.pu2 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.oxe
            if (r0 == 0) goto L13
            r0 = r8
            oxe r0 = (defpackage.oxe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            oxe r0 = new oxe
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r8)
            goto L7a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L31:
            java.lang.Object r1 = r0.L$0
            java.util.Map r1 = (java.util.Map) r1
            defpackage.r7d.b(r8)
            goto L5a
        L39:
            defpackage.r7d.b(r8)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r1 = "type"
            java.lang.String r6 = "connection_init"
            r8.<init>(r1, r6)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r8}
            java.util.LinkedHashMap r1 = defpackage.lc9.b0(r8)
            r0.L$0 = r1
            r0.label = r4
            kotlin.jvm.functions.Function1<lu2<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> r8 = r7.d
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r5) goto L5a
            goto L79
        L5a:
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L63
            java.lang.String r4 = "payload"
            r1.put(r4, r8)
        L63:
            k5h r8 = r7.e
            r7.d(r1, r8)
            pxe r8 = new pxe
            r8.<init>(r7, r2)
            r0.L$0 = r2
            r0.label = r3
            long r1 = r7.c
            java.lang.Object r7 = defpackage.ewa.O(r1, r8, r0)
            if (r7 != r5) goto L7a
        L79:
            return r5
        L7a:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.g(pu2):java.lang.Object");
    }
}
