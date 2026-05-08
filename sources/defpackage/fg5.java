package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class fg5 {
    public final String a;
    public final Intent b;

    public static final class a {
        public final fg5 a;

        public a(fg5 fg5Var) {
            this.a = fg5Var;
        }
    }

    public static class b implements kna<fg5> {
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[PHI: r4
  0x0163: PHI (r4v6 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:58:0x0161, B:64:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.ys4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r5, defpackage.lna r6) {
            /*
                Method dump skipped, instruction units count: 383
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fg5.b.a(java.lang.Object, java.lang.Object):void");
        }
    }

    public static final class c implements kna<a> {
        @Override // defpackage.ys4
        public final void a(Object obj, lna lnaVar) {
            lnaVar.a(((a) obj).a, "messaging_client_event");
        }
    }

    public fg5(Intent intent) {
        fib.g("MESSAGE_DELIVERED", "evenType must be non-null");
        this.a = "MESSAGE_DELIVERED";
        fib.j(intent, "intent must be non-null");
        this.b = intent;
    }
}
