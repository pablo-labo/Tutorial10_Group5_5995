package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dae {
    public static final b c = new b();
    public static final ojb d = ojh.x(z8e.b, new okc(a.a));
    public final oq2 a;
    public final z0d b;

    public static final class a extends mj8 implements Function1<CorruptionException, rjb> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final rjb invoke(CorruptionException corruptionException) {
            CorruptionException corruptionException2 = corruptionException;
            corruptionException2.getClass();
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + wnb.b() + JwtParser.SEPARATOR_CHAR, corruptionException2);
            return new s3a(1, true ? 1 : 0);
        }
    }

    public static final class b {
        public static final /* synthetic */ qf8<Object>[] a = {fwc.a.h(new n4c(b.class))};
    }

    public dae(pf5 pf5Var, v03 v03Var, v03 v03Var2, vf5 vf5Var) throws PackageManager.NameNotFoundException {
        pf5Var.a();
        Context context = pf5Var.a;
        context.getClass();
        f9e.a.getClass();
        sn0 sn0VarA = f9e.a(pf5Var);
        oq2 oq2Var = new oq2(context);
        b1d b1dVar = new b1d(sn0VarA, v03Var);
        c.getClass();
        z0d z0dVar = new z0d(v03Var2, vf5Var, sn0VarA, b1dVar, (if3) d.a(b.a[0], context));
        this.a = oq2Var;
        this.b = z0dVar;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.a.b;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        x8e x8eVar = this.b.d.b;
        if (x8eVar == null) {
            wl7.g("sessionConfigs");
            throw null;
        }
        Double d2 = x8eVar.b;
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6.b(r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.eae
            if (r0 == 0) goto L13
            r0 = r7
            eae r0 = (defpackage.eae) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            eae r0 = new eae
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r7)
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L31:
            java.lang.Object r6 = r0.L$0
            dae r6 = (defpackage.dae) r6
            defpackage.r7d.b(r7)
            goto L4a
        L39:
            defpackage.r7d.b(r7)
            r0.L$0 = r6
            r0.label = r4
            oq2 r7 = r6.a
            r7.getClass()
            j6g r7 = defpackage.j6g.a
            if (r7 != r5) goto L4a
            goto L56
        L4a:
            z0d r6 = r6.b
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r5) goto L57
        L56:
            return r5
        L57:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.b(pu2):java.lang.Object");
    }
}
