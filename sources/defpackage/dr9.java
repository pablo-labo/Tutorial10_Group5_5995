package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.kv8;
import defpackage.sp7;
import defpackage.uid;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldr9;", "Lm6f;", "Lxh8;", "<init>", "()V", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dr9 extends m6f implements xh8 {
    public final Lazy V;
    public final Lazy W;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final frg a0;
    public final xj1 b = xj1.d;
    public final Lazy b0;
    public boolean c;
    public final Lazy c0;
    public final boolean d;
    public final Lazy e;
    public final Lazy f;

    @uh3(c = "com.indeed.android.messaging.ui.MessagingFragment$connectToSSE$1", f = "MessagingFragment.kt", l = {307}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5<uid> $sseFlow;
        int label;
        final /* synthetic */ dr9 this$0;

        /* JADX INFO: renamed from: dr9$a$a, reason: collision with other inner class name */
        public static final class C0211a<T> implements wi5 {
            public final /* synthetic */ dr9 a;

            public C0211a(dr9 dr9Var) {
                this.a = dr9Var;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                uid uidVar = (uid) obj;
                boolean z = uidVar instanceof uid.b;
                g13 g13Var = g13.a;
                dr9 dr9Var = this.a;
                if (z) {
                    ArrayList arrayList = lz2.a;
                    String str = ((uid.b) uidVar).a;
                    Log.d("SSEClient", "conversation id: " + str, null);
                    Object objJ = ((y1e) dr9Var.Z.getValue()).j(str, true, lu2Var);
                    return objJ == g13Var ? objJ : j6g.a;
                }
                if (uidVar instanceof uid.d) {
                    y1e y1eVar = (y1e) dr9Var.Z.getValue();
                    String str2 = ((uid.d) uidVar).a;
                    Set<String> set = y1e.e0;
                    Object objJ2 = y1eVar.j(str2, false, lu2Var);
                    return objJ2 == g13Var ? objJ2 : j6g.a;
                }
                if (uidVar instanceof uid.c) {
                    ArrayList arrayList2 = lz2.a;
                    uid.c cVar = (uid.c) uidVar;
                    String str3 = cVar.c;
                    String str4 = cVar.d;
                    String str5 = cVar.b;
                    String str6 = cVar.a;
                    Log.d("SSEClient", m6.h(u40.f("advertiserKey=", str6, ", accountKey=", str5, ", type="), str4, ", status=", str3), null);
                    kta ktaVar = (kta) dr9Var.V.getValue();
                    ktaVar.getClass();
                    str6.getClass();
                    str5.getClass();
                    str3.getClass();
                    str4.getClass();
                    u63.Y(ee3.p(ktaVar), null, null, new lta(ktaVar, str6, str5, str3, str4, null), 3);
                } else {
                    if (!(uidVar instanceof uid.a)) {
                        defpackage.l.g();
                        return null;
                    }
                    ArrayList arrayList3 = lz2.a;
                    lz2.c("SSEClient", l5.l("Error: ", ((uid.a) uidVar).a), false, null, 12);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(vi5<? extends uid> vi5Var, dr9 dr9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sseFlow = vi5Var;
            this.this$0 = dr9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sseFlow, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                vi5<uid> vi5Var = this.$sseFlow;
                C0211a c0211a = new C0211a(this.this$0);
                this.label = 1;
                Object objE = vi5Var.e(c0211a, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
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

    @uh3(c = "com.indeed.android.messaging.ui.MessagingFragment$onCreateView$2", f = "MessagingFragment.kt", l = {127}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @uh3(c = "com.indeed.android.messaging.ui.MessagingFragment$onCreateView$2$1", f = "MessagingFragment.kt", l = {}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ dr9 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dr9 dr9Var, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = dr9Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                dr9 dr9Var = this.this$0;
                if (dr9Var.d && ((tid) dr9Var.f.getValue()).a()) {
                    tid tidVar = (tid) this.this$0.f.getValue();
                    tidVar.d = 0L;
                    EventSource eventSource = tidVar.c;
                    if (eventSource != null) {
                        eventSource.cancel();
                    }
                    EventSource eventSource2 = tidVar.b;
                    if (eventSource2 != null) {
                        eventSource2.cancel();
                    }
                    this.this$0.O();
                }
                return j6g.a;
            }
        }

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return dr9.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zv8 viewLifecycleOwner = dr9.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                a aVar = new a(dr9.this, null);
                this.label = 1;
                Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, aVar, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
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

    public static final /* synthetic */ class c extends fa implements Function1<String, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            dr9.R((dr9) this.receiver, str, null, null, null, 30);
            return j6g.a;
        }
    }

    public static final /* synthetic */ class d extends qv5 implements Function2<Boolean, prd, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Boolean bool, prd prdVar) {
            boolean zBooleanValue = bool.booleanValue();
            prd prdVar2 = prdVar;
            prdVar2.getClass();
            dr9 dr9Var = (dr9) this.receiver;
            dr9Var.getClass();
            ((c6f) dr9Var.a.getValue()).l(dr9Var.getB()).a(zBooleanValue, prdVar2);
            return j6g.a;
        }
    }

    public static final class e implements goa, ev5 {
        public final /* synthetic */ ir a;

        public e(ir irVar) {
            this.a = irVar;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class f extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class g extends mj8 implements gu5<kta> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(dr9 dr9Var, f fVar) {
            super(0);
            this.$this_activityViewModel = dr9Var;
            this.$ownerProducer = fVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, kta] */
        @Override // defpackage.gu5
        public final kta invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(kta.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class h extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class i extends mj8 implements gu5<u67> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(dr9 dr9Var, h hVar) {
            super(0);
            this.$this_activityViewModel = dr9Var;
            this.$ownerProducer = hVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, u67] */
        @Override // defpackage.gu5
        public final u67 invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(u67.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class j extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class k extends mj8 implements gu5<fnf> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(dr9 dr9Var, j jVar) {
            super(0);
            this.$this_activityViewModel = dr9Var;
            this.$ownerProducer = jVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, fnf] */
        @Override // defpackage.gu5
        public final fnf invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(fnf.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class l extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModels = dr9Var;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class m extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModels = dr9Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class n extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(dr9 dr9Var) {
            super(0);
            this.$this_activityViewModels = dr9Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class o extends mj8 implements gu5<as9> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(dr9 dr9Var) {
            super(0);
            this.$this_inject = dr9Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [as9, java.lang.Object] */
        @Override // defpackage.gu5
        public final as9 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(as9.class), a9cVar);
        }
    }

    public static final class p extends mj8 implements gu5<tid> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(dr9 dr9Var) {
            super(0);
            this.$this_inject = dr9Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tid] */
        @Override // defpackage.gu5
        public final tid invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(tid.class), a9cVar);
        }
    }

    public static final class q extends mj8 implements gu5<lr9> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(dr9 dr9Var) {
            super(0);
            this.$this_inject = dr9Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lr9] */
        @Override // defpackage.gu5
        public final lr9 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(lr9.class), a9cVar);
        }
    }

    public static final class r extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(dr9 dr9Var) {
            super(0);
            this.$this_viewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModel;
        }
    }

    public static final class s extends mj8 implements gu5<y1e> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(dr9 dr9Var, r rVar) {
            super(0);
            this.$this_viewModel = dr9Var;
            this.$ownerProducer = rVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, y1e] */
        @Override // defpackage.gu5
        public final y1e invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(y1e.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class t extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(dr9 dr9Var) {
            super(0);
            this.$this_viewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModel;
        }
    }

    public static final class u extends mj8 implements gu5<d4g> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(dr9 dr9Var, t tVar) {
            super(0);
            this.$this_viewModel = dr9Var;
            this.$ownerProducer = tVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, d4g] */
        @Override // defpackage.gu5
        public final d4g invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(d4g.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class v extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(dr9 dr9Var) {
            super(0);
            this.$this_viewModel = dr9Var;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModel;
        }
    }

    public static final class w extends mj8 implements gu5<j7d> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(dr9 dr9Var, v vVar) {
            super(0);
            this.$this_viewModel = dr9Var;
            this.$ownerProducer = vVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, j7d] */
        @Override // defpackage.gu5
        public final j7d invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(j7d.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public dr9() {
        this.d = ((kr7) cr8.p(kr7.class)).e("droid_native_messaging_sse").a > 0;
        o oVar = new o(this);
        qt8 qt8Var = qt8.a;
        this.e = boa.E(qt8Var, oVar);
        this.f = boa.E(qt8Var, new p(this));
        g gVar = new g(this, new f(this));
        qt8 qt8Var2 = qt8.c;
        this.V = boa.E(qt8Var2, gVar);
        this.W = boa.E(qt8Var, new q(this));
        this.X = boa.E(qt8Var2, new i(this, new h(this)));
        this.Y = boa.E(qt8Var2, new k(this, new j(this)));
        this.Z = boa.E(qt8Var2, new s(this, new r(this)));
        this.a0 = os5.a(this, fwc.a.b(t8c.class), new l(this), new m(this), new n(this));
        this.b0 = boa.E(qt8Var2, new u(this, new t(this)));
        this.c0 = boa.E(qt8Var2, new w(this, new v(this)));
    }

    public static void R(dr9 dr9Var, String str, String str2, String str3, String str4, int i2) {
        dr9 dr9Var2;
        String str5;
        String str6 = (i2 & 1) != 0 ? null : str;
        String str7 = (i2 & 2) != 0 ? null : str2;
        boolean z = (i2 & 4) == 0;
        String str8 = (i2 & 8) != 0 ? null : str3;
        String str9 = (i2 & 16) != 0 ? null : str4;
        if (str6 != null) {
            dr9Var2 = dr9Var;
            lr9 lr9Var = (lr9) dr9Var2.W.getValue();
            w47 w47Var = ((t67) dr9Var2.P().Y.getValue()).e;
            lr9Var.getClass();
            w47Var.getClass();
            tp7 tp7Var = (tp7) cr8.p(tp7.class);
            int iOrdinal = w47Var.ordinal();
            if (iOrdinal == 0) {
                str5 = "messagingInbox";
            } else if (iOrdinal == 1) {
                str5 = "messagingArchive";
            } else if (iOrdinal == 2) {
                str5 = "messagingSpam";
            } else {
                if (iOrdinal != 3) {
                    defpackage.l.g();
                    return;
                }
                str5 = "messagingDrafts";
            }
            tp7Var.b(new sp7.g(str5, "conversationCard", null, null, 12));
            lr9Var.g(new mr9(lr9Var, str6, null));
        } else {
            dr9Var2 = dr9Var;
            dr9Var2.getClass();
        }
        i1g i1gVar = (i1g) cr8.p(i1g.class);
        lr5 lr5VarU = dr9Var2.requireActivity().u();
        lr5VarU.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        yzd yzdVar = new yzd();
        yzdVar.setArguments(aq1.a(new Pair("conversationId", str6), new Pair("initiateToken", str7), new Pair("fromDeepLink", boolValueOf), new Pair("presetDraftText", str8), new Pair("sessionSource", str9)));
        i1gVar.e(lr5VarU, yzdVar);
    }

    @Override // defpackage.m6f
    /* JADX INFO: renamed from: F, reason: from getter */
    public final xj1 getB() {
        return this.b;
    }

    @Override // defpackage.m6f
    public final void G() {
        P().Z.k(new jz2<>(j6g.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    @Override // defpackage.m6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr9.H(java.lang.String):void");
    }

    @Override // defpackage.m6f
    public final void I() {
    }

    @Override // defpackage.m6f
    public final void J() {
        this.c = true;
        if (this.d) {
            O();
        }
        Bundle arguments = getArguments();
        boolean zC = new d8c(arguments != null ? arguments.getBoolean("underQaAutomation") : false).c(xj1.d, false);
        frg frgVar = this.a0;
        if (zC) {
            ((t8c) frgVar.getValue()).h(s8c.NATIVE_INBOX);
        } else {
            ((t8c) frgVar.getValue()).g(false);
        }
    }

    @Override // defpackage.m6f
    public final void K() {
        this.c = false;
        uqe uqeVar = ((kta) this.V.getValue()).d;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        if (this.d) {
            tid tidVar = (tid) this.f.getValue();
            tidVar.d = 0L;
            EventSource eventSource = tidVar.c;
            if (eventSource != null) {
                eventSource.cancel();
            }
            EventSource eventSource2 = tidVar.b;
            if (eventSource2 != null) {
                eventSource2.cancel();
            }
        }
    }

    @Override // defpackage.m6f
    public final void L(prd prdVar) {
        prdVar.getClass();
    }

    @Override // defpackage.m6f
    public final void M(gq6 gq6Var) {
        Q(gq6Var);
    }

    @Override // defpackage.m6f
    public final void N() {
        Q(gq6.RESET_ON_NAV);
    }

    public final void O() {
        tid tidVar = (tid) this.f.getValue();
        tidVar.getClass();
        nj5 nj5Var = new nj5(wg2.W(new kv1(new lid(tidVar, "sse/notifications/job-seeker-updates", null), vr4.a, -2, eo1.a), new nid(tidVar, null)), new pid(tidVar, null));
        boolean z = nj5Var instanceof rw1;
        Object sw1Var = nj5Var;
        if (!z) {
            sw1Var = new sw1(nj5Var);
        }
        u63.Y(hh1.A(this), null, null, new a((rw1) sw1Var, this, null), 3);
    }

    public final u67 P() {
        return (u67) this.X.getValue();
    }

    public final void Q(gq6 gq6Var) {
        if (((bp7) cr8.p(bp7.class)).e()) {
            ((lr9) this.W.getValue()).f(gq6Var.a());
            u67.g(P());
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        zkd.c0 = arguments != null ? arguments.getString("proctorLoggingString") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i2 = 9;
        ((as9) this.e.getValue()).b.e(getViewLifecycleOwner(), new e(new ir(this, i2)));
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new er9(this, null), 3);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("initialUrl") : null;
        if (string != null) {
            H(string);
            ((c1g) cr8.p(c1g.class)).a();
        }
        zv8 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        u63.Y(hh1.A(viewLifecycleOwner2), null, null, new b(null), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(-1080146543, new pa(this, i2), true));
        return composeView;
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((kta) this.V.getValue()).h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        uqe uqeVar = ((kta) this.V.getValue()).d;
        if (uqeVar != null) {
            uqeVar.h(null);
        }
        super.onStop();
    }
}
