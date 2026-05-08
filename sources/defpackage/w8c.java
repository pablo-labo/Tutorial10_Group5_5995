package defpackage;

import com.wlappdebug.r;
import defpackage.xh8;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class w8c implements xh8 {
    public static final List<String> a;
    public static final Set<String> b;
    public static boolean c;
    public static final Lazy d;
    public static final Lazy e;
    public static final AtomicReference<String> f;

    public static final class a extends mj8 implements gu5<ed4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w8c w8cVar) {
            super(0);
            this.$this_inject = w8cVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ed4, java.lang.Object] */
        @Override // defpackage.gu5
        public final ed4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ed4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w8c w8cVar) {
            super(0);
            this.$this_inject = w8cVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    static {
        w8c w8cVar = new w8c();
        a = u63.a0("qaAutomationBuild", "qaAutomationCommands", "qaAutomationInitialUrl", "qaAutomationAppPrefs", "indeedDevEnvOverride", "indeedDevNetworkProxy", "indeedDevRnDevServer", "indeedDevRnOta", "indeedDevParams");
        b = ut0.I0(new String[]{"SHOE", "SOCK", "PPID"});
        a aVar = new a(w8cVar);
        qt8 qt8Var = qt8.a;
        d = boa.E(qt8Var, aVar);
        new d2f(new lz(18));
        e = boa.E(qt8Var, new b(w8cVar));
        new d2f(new mz(14));
        f = new AtomicReference<>();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
