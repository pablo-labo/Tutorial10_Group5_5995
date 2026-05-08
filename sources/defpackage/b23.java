package defpackage;

import defpackage.xh8;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class b23 implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new b23()));
    public static final AtomicBoolean b = new AtomicBoolean();
    public static Locale c;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b23 b23Var) {
            super(0);
            this.$this_inject = b23Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
