package defpackage;

import com.wlappdebug.r;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class a1g implements z0g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1g a1gVar) {
            super(0);
            this.$this_inject = a1gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    @Override // defpackage.z0g
    public final long a(long j) {
        return j;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
