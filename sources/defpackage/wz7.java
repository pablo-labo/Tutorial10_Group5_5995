package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class wz7 extends pm3 {
    public final String c;
    public final /* synthetic */ qpd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz7(JobSearchApplication jobSearchApplication, qpd qpdVar, Context context) {
        super(context);
        this.d = qpdVar;
        String string = jobSearchApplication.getString(R.string.app_name_pointer);
        string.getClass();
        this.c = string;
    }

    @Override // defpackage.th3
    public final String b() {
        return this.c;
    }

    @Override // defpackage.th3
    public final SharedPreferences c() {
        return ((nm0) this.d.a(null, fwc.a.b(nm0.class), null)).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // defpackage.th3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r7 = this;
            java.lang.String r0 = "FLAVOR"
            java.lang.String r0 = r7.e(r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            r0 = r1
        Lb:
            java.lang.String r2 = "BUILD_TYPE"
            java.lang.String r2 = r7.e(r2)
            if (r2 != 0) goto L14
            r2 = r1
        L14:
            java.lang.String r3 = "VERSION_NAME"
            java.lang.String r3 = r7.e(r3)
            if (r3 != 0) goto L1d
            r3 = r1
        L1d:
            r4 = 0
            d2f r5 = r7.b     // Catch: java.lang.Exception -> L32
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L32
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Exception -> L32
            if (r5 == 0) goto L2f
            java.lang.String r6 = "VERSION_CODE"
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch: java.lang.Exception -> L32
            goto L30
        L2f:
            r5 = r4
        L30:
            if (r5 != 0) goto L34
        L32:
            r5 = r4
            goto L3e
        L34:
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Exception -> L32
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L32
            if (r6 == 0) goto L32
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L32
        L3e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "BUILD_COMMIT_HASH"
            java.lang.String r6 = r7.e(r6)
            if (r6 != 0) goto L4b
            goto L4c
        L4b:
            r1 = r6
        L4c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r0 = 32
            r6.append(r0)
            r6.append(r2)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = " ("
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ") "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            java.lang.CharSequence r0 = defpackage.zve.s0(r0)
            java.lang.String r0 = r0.toString()
            qpd r7 = r7.d     // Catch: java.lang.Exception -> L9c
            java.lang.Class<ep7> r1 = defpackage.ep7.class
            iwc r2 = defpackage.fwc.a     // Catch: java.lang.Exception -> L9c
            yd8 r1 = r2.b(r1)     // Catch: java.lang.Exception -> L9c
            java.lang.Object r7 = r7.a(r4, r1, r4)     // Catch: java.lang.Exception -> L9c
            ep7 r7 = (defpackage.ep7) r7     // Catch: java.lang.Exception -> L9c
            rp7 r7 = r7.a()     // Catch: java.lang.Exception -> L9c
            rp7 r1 = defpackage.rp7.b     // Catch: java.lang.Exception -> L9c
            if (r7 != r1) goto L9c
            java.lang.String r7 = "(e2eqa) "
            java.lang.String r0 = defpackage.l5.l(r7, r0)
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz7.d():java.lang.String");
    }
}
