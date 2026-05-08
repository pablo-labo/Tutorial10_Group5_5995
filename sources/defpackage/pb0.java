package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidComposeView;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.nzg;
import defpackage.rzg;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class pb0 extends ViewGroup implements efa, wk2, sxa, tpa {
    public static final b r0 = b.a;
    public gu5<j6g> V;
    public androidx.compose.ui.e W;
    public final tea a;
    public Function1<? super androidx.compose.ui.e, j6g> a0;
    public final View b;
    public iy3 b0;
    public final rxa c;
    public Function1<? super iy3, j6g> c0;
    public gu5<j6g> d;
    public zv8 d0;
    public boolean e;
    public dld e0;
    public gu5<j6g> f;
    public final int[] f0;
    public long g0;
    public rzg h0;
    public final p i0;
    public final o j0;
    public Function1<? super Boolean, j6g> k0;
    public final int[] l0;
    public int m0;
    public int n0;
    public final ffa o0;
    public boolean p0;
    public final pm8 q0;

    public static final class a extends nzg.b {
        public final /* synthetic */ ypg c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ypg ypgVar) {
            super(1);
            this.c = ypgVar;
        }

        @Override // nzg.b
        public final rzg d(rzg rzgVar, List<nzg> list) {
            return this.c.h(rzgVar);
        }

        @Override // nzg.b
        public final nzg.a e(nzg nzgVar, nzg.a aVar) {
            pe7 pe7Var = this.c.q0.t0.c;
            if (pe7Var.J0.c0) {
                long jE = ak2.E(pe7Var.a0(0L));
                int i = (int) (jE >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jE & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jA = ojh.m(pe7Var).a();
                int i3 = (int) (jA >> 32);
                int i4 = (int) (jA & 4294967295L);
                long j = pe7Var.c;
                long jE2 = ak2.E(pe7Var.a0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jE2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (jE2 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return new nzg.a(pb0.g(aVar.a, i, i2, i5, i7), pb0.g(aVar.b, i, i2, i5, i7));
                }
            }
            return aVar;
        }
    }

    public static final class b extends mj8 implements Function1<pb0, j6g> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(pb0 pb0Var) {
            pb0 pb0Var2 = pb0Var;
            pb0Var2.getHandler().post(new qb0(pb0Var2.i0, 0));
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<androidx.compose.ui.e, j6g> {
        final /* synthetic */ androidx.compose.ui.e $coreModifier;
        final /* synthetic */ pm8 $layoutNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pm8 pm8Var, androidx.compose.ui.e eVar) {
            super(1);
            this.$layoutNode = pm8Var;
            this.$coreModifier = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(androidx.compose.ui.e eVar) {
            this.$layoutNode.n(eVar.o(this.$coreModifier));
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<iy3, j6g> {
        final /* synthetic */ pm8 $layoutNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pm8 pm8Var) {
            super(1);
            this.$layoutNode = pm8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(iy3 iy3Var) {
            this.$layoutNode.i(iy3Var);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<rxa, j6g> {
        final /* synthetic */ pm8 $layoutNode;
        final /* synthetic */ pb0 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ypg ypgVar, pm8 pm8Var) {
            super(1);
            this.$this_run = ypgVar;
            this.$layoutNode = pm8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(rxa rxaVar) {
            rxa rxaVar2 = rxaVar;
            AndroidComposeView androidComposeView = rxaVar2 instanceof AndroidComposeView ? (AndroidComposeView) rxaVar2 : null;
            if (androidComposeView != null) {
                pb0 pb0Var = this.$this_run;
                pm8 pm8Var = this.$layoutNode;
                androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(pb0Var, pm8Var);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(pb0Var);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(pm8Var, pb0Var);
                pb0Var.setImportantForAccessibility(1);
                epg.o(pb0Var, new k50(androidComposeView, pm8Var, androidComposeView));
            }
            ViewParent parent = this.$this_run.getView().getParent();
            pb0 pb0Var2 = this.$this_run;
            if (parent != pb0Var2) {
                pb0Var2.addView(pb0Var2.getView());
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function1<rxa, j6g> {
        final /* synthetic */ pb0 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ypg ypgVar) {
            super(1);
            this.$this_run = ypgVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(rxa rxaVar) {
            rxa rxaVar2 = rxaVar;
            AndroidComposeView androidComposeView = rxaVar2 instanceof AndroidComposeView ? (AndroidComposeView) rxaVar2 : null;
            if (androidComposeView != null) {
                pb0 pb0Var = this.$this_run;
                androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(pb0Var);
                pxf.b(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(pb0Var));
                pb0Var.setImportantForAccessibility(0);
            }
            this.$this_run.removeAllViewsInLayout();
            return j6g.a;
        }
    }

    public static final class g implements ag9 {
        public final /* synthetic */ ypg a;
        public final /* synthetic */ pm8 b;

        public static final class a extends mj8 implements Function1<w.a, j6g> {
            public static final a a = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ j6g invoke(w.a aVar) {
                return j6g.a;
            }
        }

        public static final class b extends mj8 implements Function1<w.a, j6g> {
            final /* synthetic */ pm8 $layoutNode;
            final /* synthetic */ pb0 $this_run;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ypg ypgVar, pm8 pm8Var) {
                super(1);
                this.$this_run = ypgVar;
                this.$layoutNode = pm8Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(w.a aVar) {
                rb0.a(this.$this_run, this.$layoutNode);
                return j6g.a;
            }
        }

        public g(ypg ypgVar, pm8 pm8Var) {
            this.a = ypgVar;
            this.b = pm8Var;
        }

        @Override // defpackage.ag9
        public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ypg ypgVar = this.a;
            ViewGroup.LayoutParams layoutParams = ypgVar.getLayoutParams();
            layoutParams.getClass();
            ypgVar.measure(iMakeMeasureSpec, pb0.e(ypgVar, 0, i, layoutParams.height));
            return ypgVar.getMeasuredWidth();
        }

        @Override // defpackage.ag9
        public final bg9 c(androidx.compose.ui.layout.q qVar, List<? extends vf9> list, long j) {
            ypg ypgVar = this.a;
            int childCount = ypgVar.getChildCount();
            bs4 bs4Var = bs4.a;
            if (childCount == 0) {
                return qVar.Y0(iq2.j(j), iq2.i(j), bs4Var, a.a);
            }
            if (iq2.j(j) != 0) {
                ypgVar.getChildAt(0).setMinimumWidth(iq2.j(j));
            }
            if (iq2.i(j) != 0) {
                ypgVar.getChildAt(0).setMinimumHeight(iq2.i(j));
            }
            int iJ = iq2.j(j);
            int iH = iq2.h(j);
            ViewGroup.LayoutParams layoutParams = ypgVar.getLayoutParams();
            layoutParams.getClass();
            int iE = pb0.e(ypgVar, iJ, iH, layoutParams.width);
            int i = iq2.i(j);
            int iG = iq2.g(j);
            ViewGroup.LayoutParams layoutParams2 = ypgVar.getLayoutParams();
            layoutParams2.getClass();
            ypgVar.measure(iE, pb0.e(ypgVar, i, iG, layoutParams2.height));
            return qVar.Y0(ypgVar.getMeasuredWidth(), ypgVar.getMeasuredHeight(), bs4Var, new b(ypgVar, this.b));
        }

        @Override // defpackage.ag9
        public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ypg ypgVar = this.a;
            ViewGroup.LayoutParams layoutParams = ypgVar.getLayoutParams();
            layoutParams.getClass();
            ypgVar.measure(iMakeMeasureSpec, pb0.e(ypgVar, 0, i, layoutParams.height));
            return ypgVar.getMeasuredWidth();
        }

        @Override // defpackage.ag9
        public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
            ypg ypgVar = this.a;
            ViewGroup.LayoutParams layoutParams = ypgVar.getLayoutParams();
            layoutParams.getClass();
            ypgVar.measure(pb0.e(ypgVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return ypgVar.getMeasuredHeight();
        }

        @Override // defpackage.ag9
        public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
            ypg ypgVar = this.a;
            ViewGroup.LayoutParams layoutParams = ypgVar.getLayoutParams();
            layoutParams.getClass();
            ypgVar.measure(pb0.e(ypgVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return ypgVar.getMeasuredHeight();
        }
    }

    public static final class h extends mj8 implements Function1<s5e, j6g> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(s5e s5eVar) {
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ pm8 $layoutNode;
        final /* synthetic */ pb0 $this_run;
        final /* synthetic */ pb0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ypg ypgVar, pm8 pm8Var, ypg ypgVar2) {
            super(1);
            this.$this_run = ypgVar;
            this.$layoutNode = pm8Var;
            this.this$0 = ypgVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            pb0 pb0Var = this.$this_run;
            pm8 pm8Var = this.$layoutNode;
            pb0 pb0Var2 = this.this$0;
            ww1 ww1VarA = gb4Var.w1().a();
            if (pb0Var.getView().getVisibility() != 8) {
                pb0Var.p0 = true;
                rxa rxaVar = pm8Var.b0;
                AndroidComposeView androidComposeView = rxaVar instanceof AndroidComposeView ? (AndroidComposeView) rxaVar : null;
                if (androidComposeView != null) {
                    Canvas canvasA = z40.a(ww1VarA);
                    androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                    pb0Var2.draw(canvasA);
                }
                pb0Var.p0 = false;
            }
            return j6g.a;
        }
    }

    public static final class j extends mj8 implements Function1<sl8, j6g> {
        final /* synthetic */ pm8 $layoutNode;
        final /* synthetic */ pb0 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ypg ypgVar, pm8 pm8Var) {
            super(1);
            this.$this_run = ypgVar;
            this.$layoutNode = pm8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(sl8 sl8Var) {
            WindowInsets windowInsetsG;
            rb0.a(this.$this_run, this.$layoutNode);
            this.$this_run.c.C();
            pb0 pb0Var = this.$this_run;
            int[] iArr = pb0Var.f0;
            int i = iArr[0];
            int i2 = iArr[1];
            pb0Var.getView().getLocationOnScreen(this.$this_run.f0);
            pb0 pb0Var2 = this.$this_run;
            long j = pb0Var2.g0;
            pb0Var2.g0 = sl8Var.a();
            pb0 pb0Var3 = this.$this_run;
            rzg rzgVar = pb0Var3.h0;
            if (rzgVar != null) {
                int[] iArr2 = pb0Var3.f0;
                if ((i != iArr2[0] || i2 != iArr2[1] || !th7.b(j, pb0Var3.g0)) && (windowInsetsG = this.$this_run.h(rzgVar).g()) != null) {
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsG);
                }
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {617, 619}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ pb0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z, pb0 pb0Var, long j, lu2<? super k> lu2Var) {
            super(2, lu2Var);
            this.$consumed = z;
            this.this$0 = pb0Var;
            this.$viewVelocity = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new k(this.$consumed, this.this$0, this.$viewVelocity, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (r11 == r3) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (r11 == r3) goto L18;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L19
                if (r0 == r2) goto L15
                if (r0 != r1) goto Le
                defpackage.r7d.b(r11)
                goto L4a
            Le:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                r10 = 0
                return r10
            L15:
                defpackage.r7d.b(r11)
                goto L34
            L19:
                defpackage.r7d.b(r11)
                boolean r11 = r10.$consumed
                pb0 r0 = r10.this$0
                g13 r3 = defpackage.g13.a
                if (r11 != 0) goto L3a
                tea r4 = r0.a
                long r7 = r10.$viewVelocity
                r10.label = r2
                r5 = 0
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                if (r11 != r3) goto L34
                goto L49
            L34:
                vmg r11 = (defpackage.vmg) r11
                r11.getClass()
                goto L4f
            L3a:
                r9 = r10
                tea r4 = r0.a
                long r5 = r9.$viewVelocity
                r9.label = r1
                r7 = 0
                java.lang.Object r11 = r4.a(r5, r7, r9)
                if (r11 != r3) goto L4a
            L49:
                return r3
            L4a:
                vmg r11 = (defpackage.vmg) r11
                r11.getClass()
            L4f:
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: pb0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {628}, m = "invokeSuspend")
    public static final class l extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j, lu2<? super l> lu2Var) {
            super(2, lu2Var);
            this.$toBeConsumed = j;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return pb0.this.new l(this.$toBeConsumed, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((l) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                tea teaVar = pb0.this.a;
                long j = this.$toBeConsumed;
                this.label = 1;
                Object objB = teaVar.b(j, this);
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

    public static final class m extends mj8 implements gu5<j6g> {
        public static final m a = new m(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ j6g invoke() {
            return j6g.a;
        }
    }

    public static final class n extends mj8 implements gu5<j6g> {
        public static final n a = new n(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ j6g invoke() {
            return j6g.a;
        }
    }

    public static final class o extends mj8 implements gu5<j6g> {
        final /* synthetic */ pb0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ypg ypgVar) {
            super(0);
            this.this$0 = ypgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.this$0.getLayoutNode().Q();
            return j6g.a;
        }
    }

    public static final class p extends mj8 implements gu5<j6g> {
        final /* synthetic */ pb0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ypg ypgVar) {
            super(0);
            this.this$0 = ypgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            pb0 pb0Var = this.this$0;
            if (pb0Var.e && pb0Var.isAttachedToWindow()) {
                ViewParent parent = this.this$0.getView().getParent();
                pb0 pb0Var2 = this.this$0;
                if (parent == pb0Var2) {
                    vxa snapshotObserver = pb0Var2.getSnapshotObserver();
                    pb0 pb0Var3 = this.this$0;
                    snapshotObserver.a(pb0Var3, pb0.r0, pb0Var3.getUpdate());
                }
            }
            return j6g.a;
        }
    }

    public static final class q extends mj8 implements gu5<j6g> {
        public static final q a = new q(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ j6g invoke() {
            return j6g.a;
        }
    }

    public pb0(Context context, dm2 dm2Var, int i2, tea teaVar, View view, rxa rxaVar) {
        super(context);
        this.a = teaVar;
        this.b = view;
        this.c = rxaVar;
        if (dm2Var != null) {
            LinkedHashMap linkedHashMap = o0h.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, dm2Var);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ypg ypgVar = (ypg) this;
        epg.q(this, new a(ypgVar));
        epg.d.m(this, this);
        this.d = q.a;
        this.f = n.a;
        this.V = m.a;
        e.a aVar = e.a.b;
        this.W = aVar;
        this.b0 = q92.b();
        this.f0 = new int[2];
        this.g0 = 0L;
        this.i0 = new p(ypgVar);
        this.j0 = new o(ypgVar);
        this.l0 = new int[2];
        this.m0 = Integer.MIN_VALUE;
        this.n0 = Integer.MIN_VALUE;
        this.o0 = new ffa();
        pm8 pm8Var = new pm8(3);
        pm8Var.c0 = ypgVar;
        androidx.compose.ui.e eVarB = b5e.b(androidx.compose.ui.input.nestedscroll.a.a(aVar, rb0.a, teaVar), true, h.a);
        ffb ffbVar = new ffb();
        ffbVar.b = new hfb(ypgVar);
        ql2 ql2Var = new ql2();
        ql2 ql2Var2 = ffbVar.c;
        if (ql2Var2 != null) {
            ql2Var2.b = null;
        }
        ffbVar.c = ql2Var;
        ql2Var.b = ffbVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(ql2Var);
        androidx.compose.ui.e eVarA = s.a(androidx.compose.ui.draw.a.a(eVarB.o(ffbVar), new i(ypgVar, pm8Var, ypgVar)), new j(ypgVar, pm8Var));
        pm8Var.n(this.W.o(eVarA));
        this.a0 = new c(pm8Var, eVarA);
        pm8Var.i(this.b0);
        this.c0 = new d(pm8Var);
        pm8Var.A0 = new e(ypgVar, pm8Var);
        pm8Var.B0 = new f(ypgVar);
        pm8Var.m(new g(ypgVar, pm8Var));
        this.q0 = pm8Var;
    }

    public static final int e(ypg ypgVar, int i2, int i3, int i4) {
        return (i4 >= 0 || i2 == i3) ? View.MeasureSpec.makeMeasureSpec(nic.C(i4, i2, i3), 1073741824) : (i4 != -2 || i3 == Integer.MAX_VALUE) ? (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static kf7 g(kf7 kf7Var, int i2, int i3, int i4, int i5) {
        int i6 = kf7Var.a - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = kf7Var.b - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = kf7Var.c - i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = kf7Var.d - i5;
        return kf7.b(i6, i7, i8, i9 >= 0 ? i9 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vxa getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            ae7.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return isAttachedToWindow();
    }

    @Override // defpackage.wk2
    public final void a() {
        this.V.invoke();
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        this.h0 = new rzg(rzgVar);
        return h(rzgVar);
    }

    @Override // defpackage.wk2
    public final void c() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.wk2
    public final void f() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.l0;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final iy3 getDensity() {
        return this.b0;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final pm8 getLayoutNode() {
        return this.q0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final zv8 getLifecycleOwner() {
        return this.d0;
    }

    public final androidx.compose.ui.e getModifier() {
        return this.W;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ffa ffaVar = this.o0;
        return ffaVar.b | ffaVar.a;
    }

    public final Function1<iy3, j6g> getOnDensityChanged$ui_release() {
        return this.c0;
    }

    public final Function1<androidx.compose.ui.e, j6g> getOnModifierChanged$ui_release() {
        return this.a0;
    }

    public final Function1<Boolean, j6g> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.k0;
    }

    public final gu5<j6g> getRelease() {
        return this.V;
    }

    public final gu5<j6g> getReset() {
        return this.f;
    }

    public final dld getSavedStateRegistryOwner() {
        return this.e0;
    }

    public final gu5<j6g> getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    public final rzg h(rzg rzgVar) {
        rzg.j jVar = rzgVar.a;
        kf7 kf7VarG = jVar.g(-1);
        kf7 kf7Var = kf7.e;
        if (!kf7VarG.equals(kf7Var) || !jVar.h(-9).equals(kf7Var) || jVar.f() != null) {
            pe7 pe7Var = this.q0.t0.c;
            if (pe7Var.J0.c0) {
                long jE = ak2.E(pe7Var.a0(0L));
                int i2 = (int) (jE >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jE & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jA = ojh.m(pe7Var).a();
                int i4 = (int) (jA >> 32);
                int i5 = (int) (jA & 4294967295L);
                long j2 = pe7Var.c;
                long jE2 = ak2.E(pe7Var.a0((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jE2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (4294967295L & jE2));
                int i8 = i7 >= 0 ? i7 : 0;
                if (i2 != 0 || i3 != 0 || i6 != 0 || i8 != 0) {
                    return rzgVar.a.n(i2, i3, i6, i8);
                }
            }
        }
        return rzgVar;
    }

    @Override // defpackage.dfa
    public final void i(View view, View view2, int i2, int i3) {
        ffa ffaVar = this.o0;
        if (i3 == 1) {
            ffaVar.b = i2;
        } else {
            ffaVar.a = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.p0) {
            this.q0.Q();
            return null;
        }
        this.b.postOnAnimation(new ob0(this.j0, 0));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    @Override // defpackage.dfa
    public final void j(View view, int i2) {
        ffa ffaVar = this.o0;
        if (i2 == 1) {
            ffaVar.b = 0;
        } else {
            ffaVar.a = 0;
        }
    }

    @Override // defpackage.dfa
    public final void k(View view, int i2, int i3, int[] iArr, int i4) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            int i5 = i4 == 0 ? 1 : 2;
            xea xeaVar = this.a.a;
            xea xeaVar2 = null;
            if (xeaVar != null && xeaVar.c0) {
                xeaVar2 = (xea) pg8.t(xeaVar);
            }
            long jE0 = xeaVar2 != null ? xeaVar2.e0(i5, jFloatToRawIntBits) : 0L;
            iArr[0] = wea.b(Float.intBitsToFloat((int) (jE0 >> 32)));
            iArr[1] = wea.b(Float.intBitsToFloat((int) (jE0 & 4294967295L)));
        }
    }

    @Override // defpackage.efa
    public final void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            xea xeaVar = this.a.a;
            xea xeaVar2 = null;
            if (xeaVar != null && xeaVar.c0) {
                xeaVar2 = (xea) pg8.t(xeaVar);
            }
            xea xeaVar3 = xeaVar2;
            long jZ0 = xeaVar3 != null ? xeaVar3.Z0(jFloatToRawIntBits, i7, jFloatToRawIntBits2) : 0L;
            iArr[0] = wea.b(Float.intBitsToFloat((int) (jZ0 >> 32)));
            iArr[1] = wea.b(Float.intBitsToFloat((int) (jZ0 & 4294967295L)));
        }
    }

    @Override // defpackage.dfa
    public final void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (this.b.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i3 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i4 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i5 * (-1.0f))) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            xea xeaVar = this.a.a;
            xea xeaVar2 = null;
            if (xeaVar != null && xeaVar.c0) {
                xeaVar2 = (xea) pg8.t(xeaVar);
            }
            xea xeaVar3 = xeaVar2;
            if (xeaVar3 != null) {
                xeaVar3.Z0(jFloatToRawIntBits, i7, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.dfa
    public final boolean o(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i0.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.p0) {
            this.q0.Q();
        } else {
            this.b.postOnAnimation(new ob0(this.j0, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.b.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.m0 = i2;
        this.n0 = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        u63.Y(this.a.c(), null, null, new k(z, this, ewa.f(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        u63.Y(this.a.c(), null, null, new l(ewa.f(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, j6g> function1 = this.k0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(iy3 iy3Var) {
        if (iy3Var != this.b0) {
            this.b0 = iy3Var;
            Function1<? super iy3, j6g> function1 = this.c0;
            if (function1 != null) {
                function1.invoke(iy3Var);
            }
        }
    }

    public final void setLifecycleOwner(zv8 zv8Var) {
        if (zv8Var != this.d0) {
            this.d0 = zv8Var;
            setTag(R.id.view_tree_lifecycle_owner, zv8Var);
        }
    }

    public final void setModifier(androidx.compose.ui.e eVar) {
        if (eVar != this.W) {
            this.W = eVar;
            Function1<? super androidx.compose.ui.e, j6g> function1 = this.a0;
            if (function1 != null) {
                function1.invoke(eVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super iy3, j6g> function1) {
        this.c0 = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super androidx.compose.ui.e, j6g> function1) {
        this.a0 = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, j6g> function1) {
        this.k0 = function1;
    }

    public final void setRelease(gu5<j6g> gu5Var) {
        this.V = gu5Var;
    }

    public final void setReset(gu5<j6g> gu5Var) {
        this.f = gu5Var;
    }

    public final void setSavedStateRegistryOwner(dld dldVar) {
        if (dldVar != this.e0) {
            this.e0 = dldVar;
            setTag(R.id.view_tree_saved_state_registry_owner, dldVar);
        }
    }

    public final void setUpdate(gu5<j6g> gu5Var) {
        this.d = gu5Var;
        this.e = true;
        this.i0.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
