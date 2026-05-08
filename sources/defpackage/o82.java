package defpackage;

import android.util.Log;
import com.facebook.common.references.SharedReference;
import defpackage.n82;

/* JADX INFO: loaded from: classes2.dex */
public final class o82 {
    public final a a;

    public class a implements n82.c {
        public final /* synthetic */ q92 a;

        public a(q92 q92Var) {
            this.a = q92Var;
        }

        @Override // n82.c
        public final void a(SharedReference<Object> sharedReference, Throwable th) {
            this.a.getClass();
            sharedReference.getClass();
            Object objA = sharedReference.a();
            s55.p("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objA != null ? objA.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
        }

        @Override // n82.c
        public final boolean b() {
            this.a.getClass();
            return false;
        }
    }

    public o82(q92 q92Var) {
        this.a = new a(q92Var);
    }
}
