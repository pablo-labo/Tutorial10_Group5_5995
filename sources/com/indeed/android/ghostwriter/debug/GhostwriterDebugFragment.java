package com.indeed.android.ghostwriter.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.ai8;
import defpackage.an0;
import defpackage.boa;
import defpackage.c1f;
import defpackage.e13;
import defpackage.fwc;
import defpackage.g13;
import defpackage.g4a;
import defpackage.gse;
import defpackage.gu5;
import defpackage.he4;
import defpackage.hh1;
import defpackage.hh2;
import defpackage.j6g;
import defpackage.ls3;
import defpackage.lu2;
import defpackage.mj8;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rqc;
import defpackage.u63;
import defpackage.uh3;
import defpackage.uv;
import defpackage.vh8;
import defpackage.vnd;
import defpackage.wg2;
import defpackage.wi5;
import defpackage.x76;
import defpackage.xd;
import defpackage.xh8;
import defpackage.xu5;
import defpackage.zr4;
import defpackage.zv8;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/indeed/android/ghostwriter/debug/GhostwriterDebugFragment;", "Lan0;", "Lxh8;", "<init>", "()V", "", "toastText", "", "isToastVisible", "ghostwriter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GhostwriterDebugFragment extends an0 implements xh8 {
    public final Lazy a = boa.E(qt8.a, new i(this));
    public final gse b;
    public final rqc c;
    public final gse d;
    public final gse e;

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$1", f = "GhostwriterDebugFragment.kt", l = {74}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$a$a, reason: collision with other inner class name */
        public static final class C0164a<T> implements wi5 {
            public final /* synthetic */ GhostwriterDebugFragment a;

            public C0164a(GhostwriterDebugFragment ghostwriterDebugFragment) {
                this.a = ghostwriterDebugFragment;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                this.a.b.setValue((List) obj);
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return GhostwriterDebugFragment.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            gse gseVar = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this).d;
            C0164a c0164a = new C0164a(GhostwriterDebugFragment.this);
            this.label = 1;
            gseVar.e(c0164a, this);
            return g13.a;
        }
    }

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$1$1", f = "GhostwriterDebugFragment.kt", l = {92}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $isToastVisible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g4a<Boolean> g4aVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$isToastVisible$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$isToastVisible$delegate, lu2Var);
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
                if (this.$isToastVisible$delegate.getValue().booleanValue()) {
                    this.label = 1;
                    Object objB = ls3.b(5000L, this);
                    g13 g13Var = g13.a;
                    if (objB == g13Var) {
                        return g13Var;
                    }
                }
                return j6g.a;
            }
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$isToastVisible$delegate.setValue(Boolean.FALSE);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$2$10$1", f = "GhostwriterDebugFragment.kt", l = {137}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<String, lu2<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = GhostwriterDebugFragment.this.new c(lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super Boolean> lu2Var) {
            return ((c) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            x76 x76VarE = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this);
            this.L$0 = null;
            this.label = 1;
            Object objA = x76VarE.a(str, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$2$2$1$1", f = "GhostwriterDebugFragment.kt", l = {117}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return GhostwriterDebugFragment.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                x76 x76VarE = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this);
                this.label = 1;
                Object objF = x76VarE.f(this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
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

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$2$3$1$1", f = "GhostwriterDebugFragment.kt", l = {126}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public e(lu2<? super e> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return GhostwriterDebugFragment.this.new e(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                x76 x76VarE = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this);
                this.label = 1;
                Object objF = x76VarE.f(this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
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

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$2$5$1", f = "GhostwriterDebugFragment.kt", l = {101}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<String, lu2<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public f(lu2<? super f> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            f fVar = GhostwriterDebugFragment.this.new f(lu2Var);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super Boolean> lu2Var) {
            return ((f) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            x76 x76VarE = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this);
            this.L$0 = null;
            this.label = 1;
            Object objI = x76VarE.b().I(str, new uv(str, 5), this);
            g13 g13Var = g13.a;
            return objI == g13Var ? g13Var : objI;
        }
    }

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onCreateView$2$1$2$6$1", f = "GhostwriterDebugFragment.kt", l = {104}, m = "invokeSuspend")
    public static final class g extends c1f implements xu5<String, String, String, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $isToastVisible$delegate;
        final /* synthetic */ g4a<String> $toastText$delegate;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(g4a<String> g4aVar, g4a<Boolean> g4aVar2, lu2<? super g> lu2Var) {
            super(4, lu2Var);
            this.$toastText$delegate = g4aVar;
            this.$isToastVisible$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            g gVar;
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            String str3 = (String) this.L$2;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                x76 x76VarE = GhostwriterDebugFragment.E(GhostwriterDebugFragment.this);
                this.L$0 = str;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                gVar = this;
                obj = x76VarE.b().S(str, str2, str3, new xd(str, 8), gVar);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                gVar = this;
            }
            vnd vndVar = (vnd) obj;
            g4a<String> g4aVar = gVar.$toastText$delegate;
            g4a<Boolean> g4aVar2 = gVar.$isToastVisible$delegate;
            if (vndVar != null) {
                g4aVar.setValue("Successfully started schedule apply to " + vndVar.c);
                g4aVar2.setValue(Boolean.TRUE);
            } else {
                g4aVar.setValue("Failed to start schedule apply for jobKey " + str);
                g4aVar2.setValue(Boolean.TRUE);
            }
            return j6g.a;
        }

        @Override // defpackage.xu5
        public final Object j(String str, String str2, String str3, lu2<? super j6g> lu2Var) {
            g gVar = GhostwriterDebugFragment.this.new g(this.$toastText$delegate, this.$isToastVisible$delegate, lu2Var);
            gVar.L$0 = str;
            gVar.L$1 = str2;
            gVar.L$2 = str3;
            return gVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment$onViewCreated$1", f = "GhostwriterDebugFragment.kt", l = {59, 62}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public h(lu2<? super h> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return GhostwriterDebugFragment.this.new h(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r7.c(r2, r6) == r3) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                defpackage.r7d.b(r7)
                goto L4c
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                r6 = 0
                return r6
            L17:
                defpackage.r7d.b(r7)
                goto L35
            L1b:
                defpackage.r7d.b(r7)
                com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment r7 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.this
                x76 r7 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.E(r7)
                com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment r0 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.this
                bt r4 = new bt
                r5 = 7
                r4.<init>(r0, r5)
                r6.label = r2
                java.lang.Object r7 = r7.e(r4, r6)
                if (r7 != r3) goto L35
                goto L4b
            L35:
                com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment r7 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.this
                x76 r7 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.E(r7)
                com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment r0 = com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.this
                cd r2 = new cd
                r4 = 6
                r2.<init>(r0, r4)
                r6.label = r1
                java.lang.Object r6 = r7.c(r2, r6)
                if (r6 != r3) goto L4c
            L4b:
                return r3
            L4c:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class i extends mj8 implements gu5<x76> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(GhostwriterDebugFragment ghostwriterDebugFragment) {
            super(0);
            this.$this_inject = ghostwriterDebugFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, x76] */
        @Override // defpackage.gu5
        public final x76 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(x76.class), a9cVar);
        }
    }

    public GhostwriterDebugFragment() {
        zr4 zr4Var = zr4.a;
        gse gseVarE = hh2.e(zr4Var);
        this.b = gseVarE;
        this.c = wg2.j(gseVarE);
        this.d = hh2.e(zr4Var);
        this.e = hh2.e(zr4Var);
    }

    public static final x76 E(GhostwriterDebugFragment ghostwriterDebugFragment) {
        return (x76) ghostwriterDebugFragment.a.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new a(null), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(-445885334, new he4(this, 1), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new h(null), 3);
    }
}
