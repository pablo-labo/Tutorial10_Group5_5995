package defpackage;

import android.content.Context;
import com.indeed.android.messaging.data.MessagingDatabase;
import defpackage.xed;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class y0g implements x0g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0g y0gVar) {
            super(0);
            this.$this_inject = y0gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    @Override // defpackage.x0g
    public final xed.a a() {
        return ued.a((Context) this.a.getValue(), MessagingDatabase.class, "messaging");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
