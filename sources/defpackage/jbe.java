package defpackage;

import defpackage.rjb;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class jbe {

    @Deprecated
    public static final rjb.a<Boolean> c = new rjb.a<>("firebase_sessions_enabled");

    @Deprecated
    public static final rjb.a<Double> d = new rjb.a<>("firebase_sessions_sampling_rate");

    @Deprecated
    public static final rjb.a<Integer> e = new rjb.a<>("firebase_sessions_restart_timeout");

    @Deprecated
    public static final rjb.a<Integer> f = new rjb.a<>("firebase_sessions_cache_duration");

    @Deprecated
    public static final rjb.a<Long> g = new rjb.a<>("firebase_sessions_cache_updated_time");
    public final if3<rjb> a;
    public x8e b;

    @uh3(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return jbe.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            jbe jbeVar;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                jbe jbeVar2 = jbe.this;
                vi5<rjb> data = jbeVar2.a.getData();
                this.L$0 = jbeVar2;
                this.label = 1;
                Object objB = wg2.B(data, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
                obj = objB;
                jbeVar = jbeVar2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jbeVar = (jbe) this.L$0;
                r7d.b(obj);
            }
            jbe.a(jbeVar, new s3a(new LinkedHashMap(((rjb) obj).a()), true));
            return j6g.a;
        }
    }

    public jbe(if3<rjb> if3Var) throws Throwable {
        this.a = if3Var;
        u63.i0(vr4.a, new a(null));
    }

    public static final void a(jbe jbeVar, rjb rjbVar) {
        jbeVar.getClass();
        jbeVar.b = new x8e((Boolean) rjbVar.b(c), (Double) rjbVar.b(d), (Integer) rjbVar.b(e), (Integer) rjbVar.b(f), (Long) rjbVar.b(g));
    }

    public final boolean b() {
        x8e x8eVar = this.b;
        if (x8eVar == null) {
            wl7.g("sessionConfigs");
            throw null;
        }
        Long l = x8eVar.e;
        if (x8eVar != null) {
            Integer num = x8eVar.d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / 1000 >= ((long) num.intValue());
        }
        wl7.g("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(rjb.a r5, java.lang.Object r6, defpackage.pu2 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.kbe
            if (r0 == 0) goto L13
            r0 = r7
            kbe r0 = (defpackage.kbe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kbe r0 = new kbe
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r7)     // Catch: java.io.IOException -> L46
            goto L5a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r7)
            if3<rjb> r7 = r4.a     // Catch: java.io.IOException -> L46
            lbe r1 = new lbe     // Catch: java.io.IOException -> L46
            r1.<init>(r6, r5, r4, r2)     // Catch: java.io.IOException -> L46
            r0.label = r3     // Catch: java.io.IOException -> L46
            vjb r4 = new vjb     // Catch: java.io.IOException -> L46
            r4.<init>(r1, r2)     // Catch: java.io.IOException -> L46
            java.lang.Object r4 = r7.a(r4, r0)     // Catch: java.io.IOException -> L46
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L5a
            return r5
        L46:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to update cache config value: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "SettingsCache"
            android.util.Log.w(r5, r4)
        L5a:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbe.c(rjb$a, java.lang.Object, pu2):java.lang.Object");
    }
}
