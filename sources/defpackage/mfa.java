package defpackage;

import com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService;
import com.indeed.android.jobsearch.backend.util.a;

/* JADX INFO: loaded from: classes2.dex */
public final class mfa {
    public final s9e a;
    public final AutoCompleteApiService b;
    public final String c;
    public final String d;
    public final String e;

    public mfa(s9e s9eVar, AutoCompleteApiService autoCompleteApiService) {
        s9eVar.getClass();
        this.a = s9eVar;
        this.b = autoCompleteApiService;
        String strA = a.a();
        this.c = strA == null ? "" : strA;
        this.d = d93.a();
        this.e = d93.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.String r23, defpackage.pu2 r24) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfa.a(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(java.lang.String r10, defpackage.pu2 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.lfa
            if (r0 == 0) goto L14
            r0 = r11
            lfa r0 = (defpackage.lfa) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            lfa r0 = new lfa
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r8.result
            int r0 = r8.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L30
            java.lang.Object r9 = r8.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r8.L$0
            java.lang.String r9 = (java.lang.String) r9
            defpackage.r7d.b(r11)
            goto L56
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r1
        L36:
            defpackage.r7d.b(r11)
            s9e r11 = r9.a
            java.lang.String r3 = r11.e
            r8.L$0 = r1
            r8.L$1 = r1
            r8.label = r2
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r1 = r9.b
            java.lang.String r4 = r9.c
            java.lang.String r6 = r9.d
            java.lang.String r7 = r9.e
            r5 = r4
            r2 = r10
            java.lang.Object r11 = com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
            g13 r9 = defpackage.g13.a
            if (r11 != r9) goto L56
            return r9
        L56:
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r11.iterator()
        L63:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L7e
            java.lang.Object r11 = r10.next()
            r0 = r11
            wz0 r0 = (defpackage.wz0) r0
            java.util.List<nz0> r0 = r0.a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L63
            r9.add(r11)
            goto L63
        L7e:
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.t92.r0(r9, r11)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L8d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lba
            java.lang.Object r11 = r9.next()
            wz0 r11 = (defpackage.wz0) r11
            java.util.List<nz0> r0 = r11.a
            java.lang.Object r0 = defpackage.z92.O0(r0)
            nz0 r0 = (defpackage.nz0) r0
            zye r1 = new zye
            int r2 = r0.a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            int r0 = r0.b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.String r11 = r11.c
            r1.<init>(r3, r2, r11)
            r10.add(r1)
            goto L8d
        Lba:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfa.b(java.lang.String, pu2):java.io.Serializable");
    }
}
