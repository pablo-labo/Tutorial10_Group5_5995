package defpackage;

import defpackage.hga;
import java.util.Iterator;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class pkg {
    public static final xga a(Response response) {
        to1 e;
        int i = response.d;
        long j = response.Z;
        long j2 = response.a0;
        Headers headers = response.f;
        hga.a aVar = new hga.a();
        Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
        while (true) {
            ct0 ct0Var = (ct0) it;
            if (!ct0Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) ct0Var.next();
            aVar.a((String) pair.a(), (String) pair.b());
        }
        hga hgaVar = new hga(lc9.g0(aVar.a));
        ResponseBody responseBody = response.V;
        return new xga(i, j, j2, hgaVar, (responseBody == null || (e = responseBody.getE()) == null) ? null : new yne(e), response);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.uga r5, defpackage.pu2 r6) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkg.b(uga, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.vga r4, defpackage.pu2 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.jkg
            if (r0 == 0) goto L13
            r0 = r5
            jkg r0 = (defpackage.jkg) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jkg r0 = new jkg
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            zn1 r4 = (defpackage.zn1) r4
            defpackage.r7d.b(r5)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r5)
            zn1 r5 = new zn1
            r5.<init>()
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r4 = r4.b()
            g13 r0 = defpackage.g13.a
            if (r4 != r0) goto L45
            return r0
        L45:
            r4 = r5
        L46:
            long r0 = r4.b
            vr1 r4 = r4.J0(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkg.c(vga, pu2):java.lang.Object");
    }
}
