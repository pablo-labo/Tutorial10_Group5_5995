package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yn4 {

    public static final class a implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            yn4.c(i2h.e);
        }
    }

    public static final class b implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            yn4.c(i2h.a);
        }
    }

    public static final class c implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            yn4.c(i2h.b);
        }
    }

    public static final class d implements l74 {
        @Override // defpackage.l74
        public final void dispose() {
            yn4.c(i2h.d);
        }
    }

    public static final class e implements l74 {
        public final /* synthetic */ iba a;
        public final /* synthetic */ qc b;

        public e(iba ibaVar, qc qcVar) {
            this.a = ibaVar;
            this.b = qcVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            iba ibaVar = this.a;
            ibaVar.getClass();
            ibaVar.q.remove(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r28, final defpackage.t41 r29, final defpackage.gu5 r30, final defpackage.hw9 r31, final defpackage.svb r32, final defpackage.b5g r33, androidx.compose.runtime.b r34, final java.lang.String r35, final java.util.List r36, final kotlin.jvm.functions.Function1 r37, final kotlin.jvm.functions.Function1 r38, final boolean r39) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn4.a(int, t41, gu5, hw9, svb, b5g, androidx.compose.runtime.b, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final i2h b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    return i2h.e;
                }
                return null;
            case 244823688:
                if (str.equals("COUNTRY_SELECTOR")) {
                    return i2h.d;
                }
                return null;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    return i2h.V;
                }
                return null;
            case 880722710:
                if (str.equals("JOB_TITLE")) {
                    return i2h.a;
                }
                return null;
            case 1244187507:
                if (str.equals("TIME_PERIOD")) {
                    return i2h.f;
                }
                return null;
            case 1668466781:
                if (str.equals("COMPANY")) {
                    return i2h.b;
                }
                return null;
            case 1675813750:
                if (str.equals("COUNTRY")) {
                    return i2h.c;
                }
                return null;
            default:
                return null;
        }
    }

    public static final void c(i2h i2hVar) {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-work-experience", i2hVar, null, 8));
    }
}
