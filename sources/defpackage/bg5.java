package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bg5 {
    public final pf5 a;
    public final dae b;

    @uh3(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, 48}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ v03 $backgroundDispatcher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v03 v03Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$backgroundDispatcher = v03Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return bg5.this.new a(this.$backgroundDispatcher, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r6.b(r5) == r4) goto L25;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: bg5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public bg5(pf5 pf5Var, dae daeVar, v03 v03Var) {
        this.a = pf5Var;
        this.b = daeVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        pf5Var.a();
        Context applicationContext = pf5Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(cae.a);
            u63.Y(f13.a(v03Var), null, null, new a(v03Var, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + JwtParser.SEPARATOR_CHAR);
        }
    }
}
