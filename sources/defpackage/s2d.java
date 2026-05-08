package defpackage;

import android.content.ComponentCallbacks;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.p63;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls2d;", "Lan0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class s2d extends an0 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final frg b;

    public static final class a extends mj8 implements gu5<nl0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s2d s2dVar) {
            super(0);
            this.$this_inject = s2dVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s2d s2dVar) {
            super(0);
            this.$this_viewModels = s2dVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class c extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.$ownerProducer = bVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            return hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : p63.a.b;
        }
    }

    public static final class f extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s2d s2dVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = s2dVar;
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            grg.c defaultViewModelProviderFactory;
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            if (hg6Var != null && (defaultViewModelProviderFactory = hg6Var.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            grg.c defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            defaultViewModelProviderFactory2.getClass();
            return defaultViewModelProviderFactory2;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.webview.ReportErrorEmailFragment$startReportErrorEmailFlow$1$1", f = "ReportErrorEmailFragment.kt", l = {28}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ androidx.fragment.app.g $activity;
        final /* synthetic */ gu5<j6g> $onDismissDialog;
        final /* synthetic */ gu5<j6g> $onReportErrorFailed;
        final /* synthetic */ String $reportSource;
        int label;
        final /* synthetic */ s2d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.g gVar, s2d s2dVar, String str, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$activity = gVar;
            this.this$0 = s2dVar;
            this.$reportSource = str;
            this.$onDismissDialog = gu5Var;
            this.$onReportErrorFailed = gu5Var2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new g(this.$activity, this.this$0, this.$reportSource, this.$onDismissDialog, this.$onReportErrorFailed, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                androidx.fragment.app.g gVar = this.$activity;
                String strA = ((nl0) this.this$0.a.getValue()).a();
                ba5 ba5Var = (ba5) pnb.B(this.this$0).a(null, fwc.a.b(ba5.class), null);
                String str = this.$reportSource;
                t2d t2dVar = new t2d(this.$onDismissDialog, this.this$0, this.$onReportErrorFailed);
                this.label = 1;
                Object objD = p2d.d(gVar, strA, ba5Var, r2d.ErrorReport, str, t2dVar, this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public s2d() {
        Lazy lazyE = boa.E(qt8.c, new c(new b(this)));
        this.b = os5.a(this, fwc.a.b(fx4.class), new d(lazyE), new e(lazyE), new f(this, lazyE));
    }

    public final fx4 E() {
        return (fx4) this.b.getValue();
    }

    public final void F(String str, gu5<j6g> gu5Var, gu5<j6g> gu5Var2) {
        androidx.fragment.app.g activity = getActivity();
        if (activity != null) {
            fx4 fx4VarE = E();
            ((gme) fx4VarE.b).setValue(dx4.a(fx4VarE.g(), true, null, false, 111));
            u63.Y(hh1.A(this), null, null, new g(activity, this, str, gu5Var, gu5Var2, null), 3);
        }
    }
}
