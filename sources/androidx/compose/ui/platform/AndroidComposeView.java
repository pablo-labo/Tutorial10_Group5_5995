package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.indeed.android.jobsearch.R;
import defpackage.a3a;
import defpackage.a60;
import defpackage.abb;
import defpackage.ae7;
import defpackage.af7;
import defpackage.afb;
import defpackage.ame;
import defpackage.az3;
import defpackage.b3a;
import defpackage.b60;
import defpackage.bcf;
import defpackage.bd6;
import defpackage.bf7;
import defpackage.bfb;
import defpackage.bg;
import defpackage.by3;
import defpackage.c50;
import defpackage.c60;
import defpackage.cf7;
import defpackage.cg0;
import defpackage.cl1;
import defpackage.cr8;
import defpackage.cx1;
import defpackage.d50;
import defpackage.db0;
import defpackage.df7;
import defpackage.dfb;
import defpackage.dl1;
import defpackage.dld;
import defpackage.dn1;
import defpackage.dn5;
import defpackage.e50;
import defpackage.e70;
import defpackage.eb0;
import defpackage.ela;
import defpackage.eo4;
import defpackage.epg;
import defpackage.esg;
import defpackage.ey;
import defpackage.f50;
import defpackage.f81;
import defpackage.fpg;
import defpackage.g1f;
import defpackage.g40;
import defpackage.g4a;
import defpackage.g50;
import defpackage.gb4;
import defpackage.gme;
import defpackage.gpg;
import defpackage.gs4;
import defpackage.gu5;
import defpackage.gvf;
import defpackage.h4;
import defpackage.h50;
import defpackage.h51;
import defpackage.hh1;
import defpackage.hm5;
import defpackage.hm7;
import defpackage.hne;
import defpackage.hwa;
import defpackage.i50;
import defpackage.i62;
import defpackage.if9;
import defpackage.ifb;
import defpackage.im5;
import defpackage.iq2;
import defpackage.iy3;
import defpackage.j4a;
import defpackage.j50;
import defpackage.j5e;
import defpackage.j6g;
import defpackage.jh2;
import defpackage.jhf;
import defpackage.jm5;
import defpackage.jn5;
import defpackage.jtc;
import defpackage.jy3;
import defpackage.k5e;
import defpackage.kf9;
import defpackage.kg0;
import defpackage.kh7;
import defpackage.kie;
import defpackage.kjf;
import defpackage.ktc;
import defpackage.kv8;
import defpackage.ky3;
import defpackage.kzg;
import defpackage.l5;
import defpackage.l51;
import defpackage.l6;
import defpackage.lg8;
import defpackage.luc;
import defpackage.lzg;
import defpackage.m50;
import defpackage.m60;
import defpackage.mb0;
import defpackage.mj8;
import defpackage.mx9;
import defpackage.n40;
import defpackage.n51;
import defpackage.n60;
import defpackage.ng8;
import defpackage.nrd;
import defpackage.nz9;
import defpackage.obb;
import defpackage.ofd;
import defpackage.ol5;
import defpackage.opg;
import defpackage.os2;
import defpackage.p3a;
import defpackage.p40;
import defpackage.p51;
import defpackage.pg8;
import defpackage.pk2;
import defpackage.pm8;
import defpackage.pn5;
import defpackage.pqg;
import defpackage.pt3;
import defpackage.pz9;
import defpackage.q40;
import defpackage.q92;
import defpackage.qma;
import defpackage.qme;
import defpackage.qo3;
import defpackage.qtc;
import defpackage.qug;
import defpackage.qv5;
import defpackage.qx9;
import defpackage.qxa;
import defpackage.r5;
import defpackage.r6;
import defpackage.r70;
import defpackage.rbb;
import defpackage.rhf;
import defpackage.rma;
import defpackage.rxa;
import defpackage.shf;
import defpackage.sm8;
import defpackage.sn5;
import defpackage.st8;
import defpackage.stc;
import defpackage.sy3;
import defpackage.t37;
import defpackage.t9e;
import defpackage.tb0;
import defpackage.th7;
import defpackage.tia;
import defpackage.tl5;
import defpackage.u70;
import defpackage.u80;
import defpackage.u94;
import defpackage.ueb;
import defpackage.ufd;
import defpackage.ujf;
import defpackage.um8;
import defpackage.us3;
import defpackage.v03;
import defpackage.v4e;
import defpackage.v50;
import defpackage.v80;
import defpackage.veb;
import defpackage.vl8;
import defpackage.vle;
import defpackage.vxa;
import defpackage.w4e;
import defpackage.w50;
import defpackage.w80;
import defpackage.wab;
import defpackage.wc6;
import defpackage.wf9;
import defpackage.wg2;
import defpackage.wl7;
import defpackage.wle;
import defpackage.wu1;
import defpackage.wu5;
import defpackage.x4e;
import defpackage.x50;
import defpackage.x7;
import defpackage.xc6;
import defpackage.xu1;
import defpackage.y40;
import defpackage.yf6;
import defpackage.yy3;
import defpackage.z50;
import defpackage.ze7;
import defpackage.zf9;
import defpackage.zs3;
import defpackage.zte;
import defpackage.zv8;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements rxa, obb, ofd, kf9, qo3, hwa {
    public static Method A1;
    public static final p3a<AndroidComposeView> B1 = new p3a<>((Object) null);
    public static j50 C1;
    public static Method D1;
    public static Class<?> y1;
    public static Method z1;
    public boolean A0;
    public final d50 B0;
    public final c50 C0;
    public final vxa D0;
    public boolean E0;
    public tb0 F0;
    public iq2 G0;
    public boolean H0;
    public final wf9 I0;
    public long J0;
    public final int[] K0;
    public final float[] L0;
    public final float[] M0;
    public final float[] N0;
    public long O0;
    public boolean P0;
    public long Q0;
    public final g4a R0;
    public final az3 S0;
    public Function1<? super b, j6g> T0;
    public final e50 U0;
    public final jm5 V;
    public final f50 V0;
    public v03 W;
    public final g50 W0;
    public final shf X0;
    public final rhf Y0;
    public final AtomicReference Z0;
    public long a;
    public final e70 a0;
    public final pt3 a1;
    public final boolean b;
    public final st8 b0;
    public final r70 b1;
    public final sm8 c;
    public final androidx.compose.ui.e c0;
    public final g4a c1;
    public final g4a d;
    public final androidx.compose.ui.e d0;
    public int d1;
    public final View e;
    public final cx1 e0;
    public final g4a e1;
    public final boolean f;
    public final mb0 f0;
    public final rbb f1;
    public final androidx.compose.ui.layout.f g0;
    public final df7 g1;
    public final pm8 h0;
    public final mx9 h1;
    public final a3a<pm8> i0;
    public final eb0 i1;
    public final stc j0;
    public MotionEvent j1;
    public final AndroidComposeView k0;
    public long k1;
    public final j5e l0;
    public final by3 l1;
    public final androidx.compose.ui.platform.d m0;
    public final p3a<gu5<j6g>> m1;
    public m60 n0;
    public float n1;
    public final g40 o0;
    public float o1;
    public final u70 p0;
    public final p p1;
    public final p51 q0;
    public final h50 q1;
    public final ArrayList r0;
    public boolean r1;
    public ArrayList s0;
    public final o s1;
    public boolean t0;
    public final wu1 t1;
    public boolean u0;
    public boolean u1;
    public final nz9 v0;
    public final nrd v1;
    public final bfb w0;
    public View w1;
    public Function1<? super Configuration, j6g> x0;
    public final m x1;
    public final n40 y0;
    public final q40 z0;

    public static final class a {
        public static boolean a() {
            try {
                if (AndroidComposeView.y1 == null) {
                    AndroidComposeView.y1 = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.z1 == null) {
                    Class<?> cls = AndroidComposeView.y1;
                    AndroidComposeView.z1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.z1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return wl7.b(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class b {
        public final zv8 a;
        public final dld b;

        public b(zv8 zv8Var, dld dldVar) {
            this.a = zv8Var;
            this.b = dldVar;
        }
    }

    public static final class c extends mj8 implements Function1<bf7, Boolean> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(bf7 bf7Var) {
            int i = bf7Var.a;
            boolean zRequestFocusFromTouch = true;
            if (i == 1) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (i != 2) {
                zRequestFocusFromTouch = false;
            } else if (AndroidComposeView.this.isInTouchMode()) {
                zRequestFocusFromTouch = AndroidComposeView.this.requestFocusFromTouch();
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    public static final class d extends mj8 implements Function1<Configuration, j6g> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(Configuration configuration) {
            return j6g.a;
        }
    }

    public /* synthetic */ class e extends qv5 implements gu5<os2> {
        @Override // defpackage.gu5
        public final os2 invoke() {
            ContentCaptureSession contentCaptureSessionA;
            View view = (View) this.receiver;
            c60.a aVar = c60.a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                gpg.a(view);
            }
            if (i < 29 || (contentCaptureSessionA = fpg.a(view)) == null) {
                return null;
            }
            return new os2(contentCaptureSessionA, view);
        }
    }

    public static final class f extends mj8 implements gu5<Boolean> {
        final /* synthetic */ MotionEvent $motionEvent;
        final /* synthetic */ AndroidComposeView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
            super(0);
            this.this$0 = androidComposeView;
            this.$motionEvent = motionEvent;
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.E(this.$motionEvent, this.this$0));
        }
    }

    public static final class g extends mj8 implements gu5<Boolean> {
        final /* synthetic */ KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(KeyEvent keyEvent) {
            super(0);
            this.$event = keyEvent;
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.$event));
        }
    }

    public /* synthetic */ class h extends qv5 implements wu5<u94, kie, Function1<? super gb4, ? extends j6g>, Boolean> {
        @Override // defpackage.wu5
        public final Boolean q(u94 u94Var, kie kieVar, Function1<? super gb4, ? extends j6g> function1) {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            Class<?> cls = AndroidComposeView.y1;
            Resources resources = androidComposeView.getContext().getResources();
            pk2 pk2Var = new pk2(new jy3(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), kieVar.a, function1);
            return Boolean.valueOf(x50.a.a(androidComposeView, u94Var, pk2Var));
        }
    }

    public static final class i extends mj8 implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ luc<FocusTargetNode> $focusTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(luc<FocusTargetNode> lucVar) {
            super(1);
            this.$focusTarget = lucVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusTargetNode] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.$focusTarget.element = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    public static final class j extends mj8 implements Function1<FocusTargetNode, Boolean> {
        public static final j a = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    public static final class k extends mj8 implements Function1<ng8, Boolean> {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ng8 ng8Var) {
            ol5 ol5Var;
            KeyEvent keyEvent = ng8Var.a;
            long jY = pg8.y(keyEvent);
            if (lg8.a(jY, lg8.b)) {
                ol5Var = new ol5(2);
            } else if (lg8.a(jY, lg8.c)) {
                ol5Var = new ol5(1);
            } else if (lg8.a(jY, lg8.i)) {
                ol5Var = new ol5(keyEvent.isShiftPressed() ? 2 : 1);
            } else {
                ol5Var = lg8.a(jY, lg8.g) ? new ol5(4) : lg8.a(jY, lg8.f) ? new ol5(3) : (lg8.a(jY, lg8.d) || lg8.a(jY, lg8.m)) ? new ol5(5) : (lg8.a(jY, lg8.e) || lg8.a(jY, lg8.n)) ? new ol5(6) : (lg8.a(jY, lg8.h) || lg8.a(jY, lg8.k) || lg8.a(jY, lg8.o)) ? new ol5(7) : (lg8.a(jY, lg8.a) || lg8.a(jY, lg8.l)) ? new ol5(8) : null;
            }
            if (ol5Var != null) {
                int i = ol5Var.a;
                if (pg8.A(keyEvent) == 2) {
                    Integer numF = cr8.F(i);
                    qtc embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
                    Boolean boolA = AndroidComposeView.this.getFocusOwner().a(i, embeddedViewFocusRect, new androidx.compose.ui.platform.b(ol5Var));
                    if (boolA != null ? boolA.booleanValue() : true) {
                        return Boolean.TRUE;
                    }
                    if (!(i == 1 || i == 2)) {
                        return Boolean.FALSE;
                    }
                    if (numF != null) {
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        int iIntValue = numF.intValue();
                        androidComposeView.getClass();
                        tl5 tl5Var = tl5.f.get();
                        tl5Var.getClass();
                        tl5 tl5Var2 = tl5Var;
                        View viewB = androidComposeView;
                        loop0: while (true) {
                            if (viewB == null) {
                                viewB = null;
                                break;
                            }
                            View rootView = androidComposeView.getRootView();
                            rootView.getClass();
                            viewB = tl5Var2.b((ViewGroup) rootView, viewB, iIntValue);
                            if (viewB != null) {
                                c60.a aVar = c60.a;
                                if (!viewB.equals(androidComposeView)) {
                                    for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == androidComposeView) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                        }
                        if (wl7.b(viewB, AndroidComposeView.this)) {
                            viewB = null;
                        }
                        if (viewB != null) {
                            Rect rectY = embeddedViewFocusRect != null ? wab.y(embeddedViewFocusRect) : null;
                            if (rectY == null) {
                                r6.g("Invalid rect");
                                return null;
                            }
                            View rootView2 = AndroidComposeView.this.getRootView();
                            rootView2.getClass();
                            ViewGroup viewGroup = (ViewGroup) rootView2;
                            viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this, rectY);
                            viewGroup.offsetRectIntoDescendantCoords(viewB, rectY);
                            if (cr8.B(viewB, numF, rectY)) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                    if (!AndroidComposeView.this.getFocusOwner().p(i, false, false)) {
                        return Boolean.TRUE;
                    }
                    Boolean boolA2 = AndroidComposeView.this.getFocusOwner().a(i, null, new androidx.compose.ui.platform.a(ol5Var));
                    return Boolean.valueOf(boolA2 != null ? boolA2.booleanValue() : true);
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class l extends mj8 implements gu5<th7> {
        public l() {
            super(0);
        }

        @Override // defpackage.gu5
        public final th7 invoke() {
            Activity activity;
            int iRound;
            long j;
            Context context = AndroidComposeView.this.getContext();
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof Activity)) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    activity = (Activity) baseContext;
                    break;
                }
            }
            if (activity != null) {
                int i = Build.VERSION.SDK_INT;
                Rect rectA = (i >= 30 ? dl1.a : i >= 29 ? wg2.c : i >= 28 ? cl1.a : hh1.b).a(activity);
                int iWidth = rectA.width();
                iRound = rectA.height();
                j = iWidth;
            } else {
                Configuration configuration = context.getResources().getConfiguration();
                float f = context.getResources().getDisplayMetrics().density;
                int iRound2 = Math.round(configuration.screenWidthDp * f);
                iRound = Math.round(configuration.screenHeightDp * f);
                j = iRound2;
            }
            return new th7((((long) iRound) & 4294967295L) | (j << 32));
        }
    }

    public static final class m implements veb {
        public ueb a;

        public m() {
            ueb.a.getClass();
        }

        @Override // defpackage.veb
        public final void a(ueb uebVar) {
            if (uebVar == null) {
                ueb.a.getClass();
                uebVar = q92.W;
            }
            a60.a.a(AndroidComposeView.this, uebVar);
        }

        @Override // defpackage.veb
        public final void b(ueb uebVar) {
            this.a = uebVar;
        }

        @Override // defpackage.veb
        public final ueb c() {
            return this.a;
        }
    }

    public static final class n extends mj8 implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i) {
            super(1);
            this.$focusDirection = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.A(this.$focusDirection));
        }
    }

    public static final class o extends mj8 implements gu5<j6g> {
        public o() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            int actionMasked;
            MotionEvent motionEvent = AndroidComposeView.this.j1;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                AndroidComposeView.this.k1 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.post(androidComposeView.p1);
            }
            return j6g.a;
        }
    }

    public static final class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.j1;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                androidComposeView.W(motionEvent, i, androidComposeView.k1, false);
            }
        }
    }

    public static final class q extends mj8 implements Function1<ufd, Boolean> {
        public static final q a = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(ufd ufdVar) {
            return Boolean.FALSE;
        }
    }

    public static final class r extends mj8 implements Function1<gu5<? extends j6g>, j6g> {
        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gu5<? extends j6g> gu5Var) {
            gu5<? extends j6g> gu5Var2 = gu5Var;
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                gu5Var2.invoke();
            } else {
                Handler handler2 = AndroidComposeView.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new m50(gu5Var2, 0));
                }
            }
            return j6g.a;
        }
    }

    public static final class s extends mj8 implements gu5<b> {
        public s() {
            super(0);
        }

        @Override // defpackage.gu5
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [e50] */
    /* JADX WARN: Type inference failed for: r3v17, types: [f50] */
    /* JADX WARN: Type inference failed for: r3v18, types: [g50] */
    public AndroidComposeView(Context context, v03 v03Var) {
        super(context);
        this.a = 9205357640488583168L;
        this.b = true;
        this.c = new sm8();
        ky3 ky3VarB = h4.b(context);
        wg2 wg2Var = wg2.Z;
        this.d = androidx.compose.runtime.r.e(ky3VarB, wg2Var);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        this.f = z;
        gs4 gs4Var = new gs4();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(gs4Var);
        qx9<dn1> qx9Var = new qx9<dn1>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.qx9
            public final e.c a() {
                dn1 dn1Var = new dn1();
                dn1Var.d0 = this.b;
                return dn1Var;
            }

            @Override // defpackage.qx9
            public final void b(e.c cVar) {
                ((dn1) cVar).d0 = this.b;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }
        };
        this.V = new jm5(this, this);
        this.W = v03Var;
        this.a0 = new e70(new h(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.b0 = new st8();
        androidx.compose.ui.e eVarA = androidx.compose.ui.input.key.a.a(e.a.b, new k());
        this.c0 = eVarA;
        androidx.compose.ui.e eVarA2 = androidx.compose.ui.input.rotary.a.a(q.a);
        this.d0 = eVarA2;
        this.e0 = new cx1();
        this.f0 = new mb0(ViewConfiguration.get(context));
        androidx.compose.ui.layout.f fVar = new androidx.compose.ui.layout.f();
        this.g0 = fVar;
        pm8 pm8Var = new pm8(3);
        pm8Var.m(y.b);
        pm8Var.i(getDensity());
        pm8Var.s(getViewConfiguration());
        pm8Var.n(l0.b(fVar).o(emptySemanticsElement).o(eVarA2).o(eVarA).o(getFocusOwner().i()).o(getDragAndDropManager().c).o(qx9Var));
        this.h0 = pm8Var;
        a3a a3aVar = kh7.a;
        this.i0 = new a3a<>();
        m1getLayoutNodes();
        this.j0 = new stc();
        this.k0 = this;
        this.l0 = new j5e(getRoot(), gs4Var, m1getLayoutNodes());
        androidx.compose.ui.platform.d dVar = new androidx.compose.ui.platform.d(this);
        this.m0 = dVar;
        this.n0 = new m60(this, new e(0, this, c60.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.o0 = new g40(context);
        this.p0 = new u70(this);
        this.q0 = new p51();
        this.r0 = new ArrayList();
        this.v0 = new nz9();
        this.w0 = new bfb(getRoot());
        this.x0 = d.a;
        this.y0 = new n40(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw l6.k("Autofill service could not be located.");
        }
        this.z0 = new q40(new abb(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.B0 = new d50(context);
        this.C0 = new c50(getClipboardManager());
        this.D0 = new vxa(new r());
        this.I0 = new wf9(getRoot());
        this.J0 = 9223372034707292159L;
        this.K0 = new int[]{0, 0};
        float[] fArrA = if9.a();
        this.L0 = fArrA;
        this.M0 = if9.a();
        this.N0 = if9.a();
        this.O0 = -1L;
        this.Q0 = 9187343241974906880L;
        this.R0 = androidx.compose.runtime.r.f(null);
        this.S0 = androidx.compose.runtime.r.c(new s());
        this.U0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: e50
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.X();
            }
        };
        this.V0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: f50
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.X();
            }
        };
        this.W0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: g50
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                ((gme) this.a.g1.a).setValue(new bf7(z2 ? 1 : 2));
            }
        };
        shf shfVar = new shf(getView(), this);
        this.X0 = shfVar;
        c60.a.getClass();
        this.Y0 = new rhf(shfVar);
        this.Z0 = new AtomicReference(null);
        this.a1 = new pt3(getTextInputService());
        this.b1 = new r70();
        this.c1 = androidx.compose.runtime.r.e(sn5.a(context), wg2Var);
        this.d1 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        vl8 vl8Var = vl8.a;
        vl8 vl8Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : vl8.b : vl8Var;
        this.e1 = androidx.compose.runtime.r.f(vl8Var2 != null ? vl8Var2 : vl8Var);
        this.f1 = new rbb(this);
        this.g1 = new df7(isInTouchMode() ? 1 : 2, new c());
        this.h1 = new mx9(this);
        eb0 eb0Var = new eb0();
        new bcf(new db0(eb0Var));
        this.i1 = eb0Var;
        this.l1 = new by3(3);
        this.m1 = new p3a<>(nrdVar);
        this.p1 = new p();
        this.q1 = new h50(this, i3);
        this.s1 = new o();
        this.t1 = i2 < 29 ? new x7(fArrA) : new xu1();
        addOnAttachStateChangeListener(this.n0);
        setWillNotDraw(false);
        setFocusable(true);
        b60.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        epg.o(this, dVar);
        setOnDragListener(getDragAndDropManager());
        getRoot().u(this);
        if (i2 >= 29) {
            w50.a.a(this);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.e = view;
            addView(view, -1);
        }
        this.v1 = i2 >= 31 ? new nrd() : null;
        this.x1 = new m();
    }

    public static final void D(AndroidComposeView androidComposeView, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        androidx.compose.ui.platform.d dVar = androidComposeView.m0;
        if (wl7.b(str, dVar.G)) {
            int iD2 = dVar.E.d(i2);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!wl7.b(str, dVar.H) || (iD = dVar.F.d(i2)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static final /* synthetic */ boolean E(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public static void I(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).z();
            } else if (childAt instanceof ViewGroup) {
                I((ViewGroup) childAt);
            }
        }
    }

    public static long J(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j2 = size;
            return j2 | (j2 << 32);
        }
        bg.h();
        return 0L;
    }

    public static View K(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (wl7.b(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewK = K(viewGroup.getChildAt(i3), i2);
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void M(pm8 pm8Var) {
        pm8Var.R();
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i2 = j4aVarN.c;
        for (int i3 = 0; i3 < i2; i3++) {
            M(pm8VarArr[i3]);
        }
    }

    public static boolean O(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !pz9.a.a(motionEvent, i2));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    @sy3
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @sy3
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) ((gme) this.R0).getValue();
    }

    private void setDensity(iy3 iy3Var) {
        ((gme) this.d).setValue(iy3Var);
    }

    private void setFontFamilyResolver(pn5.a aVar) {
        ((gme) this.c1).setValue(aVar);
    }

    private void setLayoutDirection(vl8 vl8Var) {
        ((gme) this.e1).setValue(vl8Var);
    }

    private final void set_viewTreeOwners(b bVar) {
        ((gme) this.R0).setValue(bVar);
    }

    @Override // defpackage.rxa
    public final void A() {
        androidx.compose.ui.platform.d dVar = this.m0;
        dVar.A = true;
        if (dVar.v() && !dVar.L) {
            dVar.L = true;
            dVar.l.post(dVar.N);
        }
        m60 m60Var = this.n0;
        m60Var.V = true;
        if (!m60Var.e() || m60Var.c0) {
            return;
        }
        m60Var.c0 = true;
        m60Var.X.post(m60Var.d0);
    }

    @Override // defpackage.rxa
    public final void B(pm8 pm8Var, boolean z, boolean z2, boolean z3) {
        pm8 pm8VarK;
        pm8 pm8VarK2;
        wf9 wf9Var = this.I0;
        if (!z) {
            if (wf9Var.p(pm8Var, z2) && z3) {
                U(pm8Var);
                return;
            }
            return;
        }
        yy3 yy3Var = wf9Var.b;
        pm8 pm8Var2 = pm8Var.V;
        um8 um8Var = pm8Var.u0;
        if (pm8Var2 == null) {
            ae7.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = um8Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    defpackage.l.g();
                    return;
                }
                if (!um8Var.e || z2) {
                    um8Var.e = true;
                    um8Var.p.k0 = true;
                    if (pm8Var.E0) {
                        return;
                    }
                    if ((wl7.b(pm8Var.W(), Boolean.TRUE) || wf9.h(pm8Var)) && ((pm8VarK = pm8Var.K()) == null || !pm8VarK.u0.e)) {
                        yy3Var.a(pm8Var, hm7.a);
                    } else if ((pm8Var.k() || wf9.i(pm8Var)) && ((pm8VarK2 = pm8Var.K()) == null || !pm8VarK2.G())) {
                        yy3Var.a(pm8Var, hm7.c);
                    }
                    if (wf9Var.d || !z3) {
                        return;
                    }
                    U(pm8Var);
                    return;
                }
                return;
            }
        }
        wf9Var.h.b(new wf9.a(pm8Var, true, z2));
    }

    @Override // defpackage.rxa
    public final void C() {
        this.u0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.L(android.view.MotionEvent):int");
    }

    public final void N(pm8 pm8Var) {
        this.I0.p(pm8Var, false);
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i2 = j4aVarN.c;
        for (int i3 = 0; i3 < i2; i3++) {
            N(pm8VarArr[i3]);
        }
    }

    public final boolean P(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean Q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.j1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void R() {
        if (this.P0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.O0) {
            this.O0 = jCurrentAnimationTimeMillis;
            wu1 wu1Var = this.t1;
            float[] fArr = this.M0;
            wu1Var.e(this, fArr);
            jh2.w(fArr, this.N0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.K0;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            this.Q0 = (((long) Float.floatToRawIntBits(f2 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f3 - iArr[1])) & 4294967295L);
        }
    }

    public final void S(MotionEvent motionEvent) {
        this.O0 = AnimationUtils.currentAnimationTimeMillis();
        wu1 wu1Var = this.t1;
        float[] fArr = this.M0;
        wu1Var.e(this, fArr);
        jh2.w(fArr, this.N0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = if9.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.Q0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean T() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void U(pm8 pm8Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (pm8Var != null) {
            while (pm8Var != null && pm8Var.H() == pm8.f.a) {
                if (!this.H0) {
                    pm8 pm8VarK = pm8Var.K();
                    if (pm8VarK == null) {
                        break;
                    }
                    long j2 = pm8VarK.t0.c.d;
                    if (iq2.f(j2) && iq2.e(j2)) {
                        break;
                    }
                }
                pm8Var = pm8Var.K();
            }
            if (pm8Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final int V(MotionEvent motionEvent) {
        Object obj;
        if (this.u1) {
            this.u1 = false;
            int metaState = motionEvent.getMetaState();
            this.b0.getClass();
            ((gme) lzg.a).setValue(new ifb(metaState));
        }
        nz9 nz9Var = this.v0;
        x7 x7VarA = nz9Var.a(motionEvent, this);
        bfb bfbVar = this.w0;
        if (x7VarA == null) {
            if (!bfbVar.e) {
                bfbVar.c.a.c();
                bfbVar.b.c();
            }
            return 0;
        }
        List list = (List) x7VarA.a;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                obj = list.get(size);
                if (((afb) obj).e) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
            obj = null;
        } else {
            obj = null;
        }
        afb afbVar = (afb) obj;
        if (afbVar != null) {
            this.a = afbVar.d;
        }
        int iA = bfbVar.a(x7VarA, this, P(motionEvent));
        x7VarA.b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        nz9Var.c.delete(pointerId);
        nz9Var.b.delete(pointerId);
        return iA;
    }

    public final void W(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f2 = pointerCoords.x;
            long jV = v((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jV >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jV & 4294967295L));
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        x7 x7VarA = this.v0.a(motionEventObtain, this);
        x7VarA.getClass();
        this.w0.a(x7VarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.K0
            r0.getLocationOnScreen(r1)
            long r2 = r0.J0
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.O0
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.J0 = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L44
            if (r2 == r1) goto L44
            pm8 r1 = r0.getRoot()
            um8 r1 = r1.u0
            zf9 r1 = r1.p
            r1.v0()
            r1 = r9
            goto L45
        L44:
            r1 = r3
        L45:
            r0.R()
            android.view.View r2 = r0.w1
            if (r2 != 0) goto L52
            android.view.View r2 = r0.getRootView()
            r0.w1 = r2
        L52:
            stc r5 = r0.getRectManager()
            long r10 = r0.J0
            long r12 = r0.Q0
            long r12 = defpackage.ak2.E(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.M0
            int r15 = defpackage.pi3.c(r14)
            glf r3 = r5.b
            r15 = r15 & 2
            if (r15 != 0) goto L78
        L75:
            r16 = r6
            goto L7a
        L78:
            r14 = 0
            goto L75
        L7a:
            long r6 = r3.c
            boolean r6 = defpackage.lh7.b(r12, r6)
            if (r6 != 0) goto L86
            r3.c = r12
            r6 = r9
            goto L87
        L86:
            r6 = 0
        L87:
            long r12 = r3.d
            boolean r7 = defpackage.lh7.b(r10, r12)
            if (r7 != 0) goto L92
            r3.d = r10
            r6 = r9
        L92:
            if (r14 == 0) goto L95
            r6 = r9
        L95:
            long r7 = (long) r8
            long r7 = r7 << r4
            long r10 = (long) r2
            long r10 = r10 & r16
            long r7 = r7 | r10
            long r10 = r3.e
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto La4
            r3.e = r7
            r6 = r9
        La4:
            if (r6 != 0) goto Lad
            boolean r2 = r5.e
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r3 = 0
            goto Lae
        Lad:
            r3 = r9
        Lae:
            r5.e = r3
            wf9 r2 = r0.I0
            r2.a(r1)
            stc r0 = r0.getRectManager()
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.X():void");
    }

    @Override // defpackage.rxa
    public final void a(boolean z) {
        o oVar;
        wf9 wf9Var = this.I0;
        if (wf9Var.b.c() || ((j4a) wf9Var.e.a).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    oVar = this.s1;
                } finally {
                    Trace.endSection();
                }
            } else {
                oVar = null;
            }
            if (wf9Var.j(oVar)) {
                requestLayout();
            }
            wf9Var.a(false);
            if (this.u0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.u0 = false;
            }
            j6g j6gVar = j6g.a;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        w4e w4eVarG;
        r5 r5Var;
        Function1 function1;
        q40 q40Var = this.z0;
        if (q40Var != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                if (autofillValue.isText()) {
                    pm8 pm8VarB = q40Var.b.c.b(iKeyAt);
                    if (pm8VarB != null && (w4eVarG = pm8VarB.g()) != null && (r5Var = (r5) x4e.a(w4eVarG, v4e.g)) != null && (function1 = (Function1) r5Var.b) != null) {
                    }
                } else if (autofillValue.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValue.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValue.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        n40 n40Var = this.y0;
        if (n40Var != null) {
            p51 p51Var = n40Var.b;
            if (p51Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int iKeyAt2 = sparseArray.keyAt(i3);
                AutofillValue autofillValue2 = sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                } else {
                    if (autofillValue2.isDate()) {
                        throw new ela("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new ela("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new ela("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // defpackage.rxa
    public final long b(long j2) {
        R();
        return if9.b(j2, this.M0);
    }

    @Override // defpackage.rxa
    public final void c(pm8 pm8Var) {
        q40 q40Var = this.z0;
        if (q40Var != null) {
            q40Var.d.a.b(pm8Var.b, new p40(q40Var, pm8Var));
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.m0.m(i2, this.a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.m0.m(i2, this.a, true);
    }

    @Override // defpackage.hwa
    public final void d(androidx.compose.ui.layout.n nVar) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new i50(nVar, 0));
        } else {
            l5.q("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            M(getRoot());
        }
        a(true);
        wle.e.getClass();
        ame.j().m();
        this.t0 = true;
        cx1 cx1Var = this.e0;
        y40 y40Var = cx1Var.a;
        Canvas canvas2 = y40Var.a;
        y40Var.a = canvas;
        getRoot().z(y40Var, null);
        cx1Var.a.a = canvas2;
        ArrayList arrayList = this.r0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((qxa) arrayList.get(i2)).k();
            }
        }
        if (pqg.f) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.t0 = false;
        ArrayList arrayList2 = this.s0;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f) {
            kg0.a(this, this.n1);
            View view = this.e;
            if (view == null) {
                wl7.g("frameRateCategoryView");
                throw null;
            }
            kg0.a(view, this.o1);
            if (!Float.isNaN(this.o1)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.n1 = Float.NaN;
            this.o1 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (getFocusOwner().n(new defpackage.web(10), new androidx.compose.ui.platform.AndroidComposeView.f(r9, r8)) != false) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.r1
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L18
            h50 r0 = r8.q1
            r8.removeCallbacks(r0)
            int r3 = r9.getActionMasked()
            if (r3 != r2) goto L15
            r8.r1 = r1
            goto L18
        L15:
            r0.run()
        L18:
            boolean r0 = O(r9)
            if (r0 != 0) goto Lb0
            boolean r0 = r8.isAttachedToWindow()
            if (r0 != 0) goto L26
            goto Lb0
        L26:
            int r0 = r9.getActionMasked()
            r3 = 1
            if (r0 != r2) goto L79
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r9.isFromSource(r0)
            if (r0 == 0) goto L70
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            r1 = 26
            float r1 = r9.getAxisValue(r1)
            float r1 = -r1
            ufd r2 = new ufd
            r8.getContext()
            float r3 = r0.getScaledVerticalScrollFactor()
            float r3 = r3 * r1
            r8.getContext()
            float r0 = r0.getScaledHorizontalScrollFactor()
            float r4 = r0 * r1
            long r6 = r9.getEventTime()
            int r5 = r9.getDeviceId()
            r2.<init>(r3, r4, r5, r6)
            im5 r0 = r8.getFocusOwner()
            l50 r1 = new l50
            r1.<init>(r9, r8)
            boolean r8 = r0.d(r2, r1)
            return r8
        L70:
            int r8 = r8.L(r9)
            r8 = r8 & r3
            if (r8 == 0) goto L78
            goto Laa
        L78:
            return r1
        L79:
            r0 = 2
            boolean r0 = r9.isFromSource(r0)
            if (r0 != 0) goto Lab
            web r0 = new web
            float r1 = r9.getX()
            float r2 = r9.getY()
            java.lang.Float.floatToRawIntBits(r1)
            java.lang.Float.floatToRawIntBits(r2)
            r9.getEventTime()
            r9.getActionMasked()
            r1 = 10
            r0.<init>(r1)
            im5 r1 = r8.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$f r2 = new androidx.compose.ui.platform.AndroidComposeView$f
            r2.<init>(r9, r8)
            boolean r0 = r1.n(r0, r2)
            if (r0 == 0) goto Lab
        Laa:
            return r3
        Lab:
            boolean r8 = super.dispatchGenericMotionEvent(r9)
            return r8
        Lb0:
            boolean r8 = super.dispatchGenericMotionEvent(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().k(keyEvent, new g(keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.b0.getClass();
        ((gme) lzg.a).setValue(new ifb(metaState));
        return getFocusOwner().k(keyEvent, hm5.a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            v50.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r1) {
            h50 h50Var = this.q1;
            removeCallbacks(h50Var);
            MotionEvent motionEvent2 = this.j1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.r1 = false;
            } else {
                h50Var.run();
            }
        }
        if (!O(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || Q(motionEvent))) {
            int iL = L(motionEvent);
            if ((iL & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iL & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rxa
    public final void e(f81.b bVar) {
        this.I0.f.b(bVar);
        U(null);
    }

    @Override // defpackage.rxa
    public final void f(pm8 pm8Var) {
        m1getLayoutNodes().h(pm8Var.b, pm8Var);
    }

    public final View findViewByAccessibilityIdTraversal(int i2) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return K(this, i2);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        qtc qtcVarH;
        if (view == null || this.I0.c) {
            return super.focusSearch(view, i2);
        }
        tl5 tl5Var = tl5.f.get();
        tl5Var.getClass();
        View viewB = tl5Var.b(this, view, i2);
        if (view != this || (qtcVarH = getFocusOwner().o()) == null) {
            qtcVarH = cr8.h(view, this);
        }
        ol5 ol5VarH = cr8.H(i2);
        int i3 = ol5VarH != null ? ol5VarH.a : 6;
        luc lucVar = new luc();
        if (getFocusOwner().a(i3, qtcVarH, new i(lucVar)) != null) {
            T t = lucVar.element;
            if (t != 0) {
                if (viewB != null) {
                    if (i3 == 1 || i3 == 2) {
                        return super.focusSearch(view, i2);
                    }
                    if (gvf.g(dn5.b((FocusTargetNode) t), cr8.h(viewB, this), qtcVarH, i3)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    @Override // defpackage.rxa
    public final void g(int i2, pm8 pm8Var) {
        q40 q40Var = this.z0;
        if (q40Var != null) {
            AndroidComposeView androidComposeView = q40Var.c;
            abb abbVar = q40Var.a;
            b3a b3aVar = q40Var.h;
            if (b3aVar.e(i2)) {
                abbVar.a(androidComposeView, i2, false);
            }
            w4e w4eVarG = pm8Var.g();
            if (w4eVarG != null && w4eVarG.a.a(k5e.q)) {
                b3aVar.a(pm8Var.b);
                abbVar.a(androidComposeView, pm8Var.b, true);
            }
        }
        getRectManager().f(pm8Var, true);
    }

    public final tb0 getAndroidViewsHandler$ui_release() {
        if (this.F0 == null) {
            tb0 tb0Var = new tb0(getContext());
            this.F0 = tb0Var;
            addView(tb0Var, -1);
            requestLayout();
        }
        tb0 tb0Var2 = this.F0;
        tb0Var2.getClass();
        return tb0Var2;
    }

    @Override // defpackage.rxa
    public h51 getAutofill() {
        return this.y0;
    }

    @Override // defpackage.rxa
    public n51 getAutofillManager() {
        return this.z0;
    }

    @Override // defpackage.rxa
    public p51 getAutofillTree() {
        return this.q0;
    }

    public final Function1<Configuration, j6g> getConfigurationChangeObserver() {
        return this.x0;
    }

    public final m60 getContentCaptureManager$ui_release() {
        return this.n0;
    }

    @Override // defpackage.rxa
    public v03 getCoroutineContext() {
        return this.W;
    }

    @Override // defpackage.rxa
    public iy3 getDensity() {
        return (iy3) ((gme) this.d).getValue();
    }

    @Override // defpackage.obb
    public qtc getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return cr8.h(viewFindFocus, this);
        }
        return null;
    }

    @Override // defpackage.rxa
    public im5 getFocusOwner() {
        return this.V;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        qtc embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (wl7.b(getFocusOwner().a(6, null, j.a), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.rxa
    public pn5.a getFontFamilyResolver() {
        return (pn5.a) ((gme) this.c1).getValue();
    }

    @Override // defpackage.rxa
    public jn5.a getFontLoader() {
        return this.b1;
    }

    @Override // defpackage.rxa
    public wc6 getGraphicsContext() {
        return this.p0;
    }

    @Override // defpackage.rxa
    public yf6 getHapticFeedBack() {
        return this.f1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.I0.b.c();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.rxa
    public cf7 getInputModeManager() {
        return this.g1;
    }

    public final androidx.compose.ui.layout.f getInsetsListener() {
        return this.g0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.O0;
    }

    @Override // android.view.View, android.view.ViewParent, defpackage.rxa
    public vl8 getLayoutDirection() {
        return (vl8) ((gme) this.e1).getValue();
    }

    public long getMeasureIteration() {
        wf9 wf9Var = this.I0;
        if (!wf9Var.c) {
            ae7.a("measureIteration should be only used during the measure/layout pass");
        }
        return wf9Var.g;
    }

    @Override // defpackage.rxa
    public mx9 getModifierLocalManager() {
        return this.h1;
    }

    @Override // defpackage.rxa
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // defpackage.rxa
    public w.a getPlacementScope() {
        x.a aVar = x.a;
        return new v(this);
    }

    @Override // defpackage.rxa
    public veb getPointerIconService() {
        return this.x1;
    }

    @Override // defpackage.rxa
    public stc getRectManager() {
        return this.j0;
    }

    @Override // defpackage.rxa
    public pm8 getRoot() {
        return this.h0;
    }

    public ofd getRootForTest() {
        return this.k0;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        nrd nrdVar;
        if (Build.VERSION.SDK_INT < 31 || (nrdVar = this.v1) == null) {
            return false;
        }
        return ((Boolean) ((gme) nrdVar.a).getValue()).booleanValue();
    }

    @Override // defpackage.rxa
    public j5e getSemanticsOwner() {
        return this.l0;
    }

    @Override // defpackage.rxa
    public sm8 getSharedDrawScope() {
        return this.c;
    }

    @Override // defpackage.rxa
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? cg0.a.a(this) : this.E0;
    }

    @Override // defpackage.rxa
    public vxa getSnapshotObserver() {
        return this.D0;
    }

    @Override // defpackage.rxa
    public hne getSoftwareKeyboardController() {
        return this.a1;
    }

    @Override // defpackage.rxa
    public rhf getTextInputService() {
        return this.Y0;
    }

    @Override // defpackage.rxa
    public ujf getTextToolbar() {
        return this.i1;
    }

    public final ofd.a getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.rxa
    public opg getViewConfiguration() {
        return this.f0;
    }

    public final b getViewTreeOwners() {
        return (b) this.S0.getValue();
    }

    @Override // defpackage.rxa
    public kzg getWindowInfo() {
        return this.b0;
    }

    public final q40 get_autofillManager$ui_release() {
        return this.z0;
    }

    @Override // defpackage.rxa
    public final void h(pm8 pm8Var) {
        getRectManager().i(pm8Var);
        q40 q40Var = this.z0;
        if (q40Var == null || !q40Var.h.e(pm8Var.b)) {
            return;
        }
        q40Var.a.a(q40Var.c, pm8Var.b, false);
    }

    @Override // defpackage.kf9
    public final void i(float[] fArr) {
        R();
        if9.e(fArr, this.M0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.Q0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.Q0 & 4294967295L));
        c60.a aVar = c60.a;
        float[] fArr2 = this.L0;
        if9.d(fArr2);
        if9.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        c60.b(fArr, fArr2);
    }

    @Override // defpackage.rxa
    public final void j(pm8 pm8Var) {
        by3 by3Var = this.I0.e;
        by3Var.getClass();
        if (pm8Var.D0 > 0) {
            ((j4a) by3Var.a).b(pm8Var);
            pm8Var.C0 = true;
        }
        U(null);
    }

    @Override // defpackage.rxa
    public final void k(pm8 pm8Var, boolean z) {
        this.I0.f(pm8Var, z);
    }

    @Override // defpackage.rxa
    public final void l(pm8 pm8Var) {
        w4e w4eVarG;
        q40 q40Var = this.z0;
        if (q40Var == null || (w4eVarG = pm8Var.g()) == null || !w4eVarG.a.a(k5e.q)) {
            return;
        }
        q40Var.h.a(pm8Var.b);
        q40Var.a.a(q40Var.c, pm8Var.b, true);
    }

    @Override // defpackage.rxa
    public final qxa m(Function2 function2, tia.f fVar, xc6 xc6Var) {
        j4a j4aVar;
        Reference referencePoll;
        Object obj;
        if (xc6Var != null) {
            return new bd6(xc6Var, null, this, function2, fVar);
        }
        do {
            by3 by3Var = this.l1;
            ReferenceQueue referenceQueue = (ReferenceQueue) by3Var.b;
            j4aVar = (j4a) by3Var.a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                j4aVar.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i2 = j4aVar.c;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) j4aVar.k(i2 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        qxa qxaVar = (qxa) obj;
        if (qxaVar == null) {
            return new bd6(getGraphicsContext().b(), getGraphicsContext(), this, function2, fVar);
        }
        qxaVar.i(function2, fVar);
        return qxaVar;
    }

    @Override // defpackage.rxa
    public final void n(pm8 pm8Var) {
        androidx.compose.ui.platform.d dVar = this.m0;
        dVar.A = true;
        if (dVar.v()) {
            dVar.w(pm8Var);
        }
        m60 m60Var = this.n0;
        m60Var.V = true;
        if (m60Var.e()) {
            m60Var.W.f(j6g.a);
        }
    }

    @Override // defpackage.rxa
    public final void o(pm8 pm8Var) {
        m1getLayoutNodes().g(pm8Var.b);
        wf9 wf9Var = this.I0;
        yy3 yy3Var = wf9Var.b;
        yy3Var.a.f(pm8Var);
        yy3Var.b.f(pm8Var);
        yy3Var.c.f(pm8Var);
        ((j4a) wf9Var.e.a).j(pm8Var);
        this.A0 = true;
        getRectManager().i(pm8Var);
        q40 q40Var = this.z0;
        if (q40Var == null || !q40Var.h.e(pm8Var.b)) {
            return;
        }
        q40Var.a.a(q40Var.c, pm8Var.b, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        kv8 lifecycle;
        zv8 zv8Var;
        super.onAttachedToWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(a.a());
        }
        this.g0.onViewAttachedToWindow(this);
        if (i2 > 28) {
            if (C1 == null) {
                j50 j50Var = new j50();
                C1 = j50Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    try {
                        if (y1 == null) {
                            y1 = Class.forName("android.os.SystemProperties");
                        }
                        if (A1 == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class<?> cls = y1;
                            A1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = A1;
                        if (method != null) {
                            method.invoke(null, j50Var);
                        }
                    } finally {
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                } catch (Throwable unused) {
                    j6g j6gVar = j6g.a;
                }
            }
            p3a<AndroidComposeView> p3aVar = B1;
            synchronized (p3aVar) {
                p3aVar.g(this);
                j6g j6gVar2 = j6g.a;
            }
        }
        ((gme) this.b0.a).setValue(Boolean.valueOf(hasWindowFocus()));
        st8 st8Var = this.b0;
        new l();
        st8Var.getClass();
        this.b0.getClass();
        N(getRoot());
        M(getRoot());
        qme qmeVar = getSnapshotObserver().a;
        qmeVar.getClass();
        wle.a aVar = wle.e;
        ey eyVar = qmeVar.d;
        aVar.getClass();
        qmeVar.h = wle.a.d(eyVar);
        n40 n40Var = this.y0;
        if (n40Var != null) {
            l51 l51Var = l51.a;
            l51Var.getClass();
            n40Var.c.registerCallback(l51Var);
        }
        zv8 zv8VarA = zte.a(this);
        dld dldVarB = esg.b(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (zv8VarA != null && dldVarB != null && (zv8VarA != (zv8Var = viewTreeOwners.a) || dldVarB != zv8Var))) {
            if (zv8VarA == null) {
                r6.g("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (dldVarB == null) {
                r6.g("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            zv8VarA.getLifecycle().a(this);
            b bVar = new b(zv8VarA, dldVarB);
            set_viewTreeOwners(bVar);
            Function1<? super b, j6g> function1 = this.T0;
            if (function1 != null) {
                function1.invoke(bVar);
            }
            this.T0 = null;
        }
        ((gme) this.g1.a).setValue(new bf7(isInTouchMode() ? 1 : 2));
        b viewTreeOwners2 = getViewTreeOwners();
        kv8 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw l6.k("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.n0);
        getViewTreeObserver().addOnGlobalLayoutListener(this.U0);
        getViewTreeObserver().addOnScrollChangedListener(this.V0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.W0);
        if (Build.VERSION.SDK_INT >= 31) {
            z50.a.b(this);
        }
        q40 q40Var = this.z0;
        if (q40Var != null) {
            getFocusOwner().s().g(q40Var);
            getSemanticsOwner().d.g(q40Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        t9e t9eVar = (t9e) this.Z0.get();
        u80 u80Var = (u80) (t9eVar != null ? t9eVar.b : null);
        if (u80Var == null) {
            return this.X0.d;
        }
        t9e t9eVar2 = (t9e) u80Var.d.get();
        af7 af7Var = (af7) (t9eVar2 != null ? t9eVar2.b : null);
        return af7Var != null && (af7Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(h4.b(getContext()));
        this.b0.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 31 ? configuration.fontWeightAdjustment : 0) != this.d1) {
            this.d1 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(sn5.a(getContext()));
        }
        this.x0.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        t9e t9eVar = (t9e) this.Z0.get();
        u80 u80Var = (u80) (t9eVar != null ? t9eVar.b : null);
        if (u80Var == null) {
            shf shfVar = this.X0;
            if (shfVar.d) {
                t37 t37Var = shfVar.h;
                jhf jhfVar = shfVar.g;
                int i3 = t37Var.e;
                boolean z = t37Var.a;
                if (i3 == 1) {
                    i2 = z ? 6 : 0;
                } else if (i3 == 0) {
                    i2 = 1;
                } else if (i3 == 2) {
                    i2 = 2;
                } else if (i3 == 6) {
                    i2 = 5;
                } else if (i3 == 5) {
                    i2 = 7;
                } else if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 4) {
                    i2 = 4;
                } else {
                    if (i3 != 7) {
                        r6.g("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i2;
                int i4 = t37Var.d;
                if (i4 == 1) {
                    editorInfo.inputType = 1;
                } else if (i4 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i2;
                } else if (i4 == 3) {
                    editorInfo.inputType = 2;
                } else if (i4 == 4) {
                    editorInfo.inputType = 3;
                } else if (i4 == 5) {
                    editorInfo.inputType = 17;
                } else if (i4 == 6) {
                    editorInfo.inputType = 33;
                } else if (i4 == 7) {
                    editorInfo.inputType = 129;
                } else if (i4 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i4 != 9) {
                        r6.g("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z) {
                    int i5 = editorInfo.inputType;
                    if ((i5 & 1) == 1) {
                        editorInfo.inputType = i5 | 131072;
                        if (i3 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i6 = editorInfo.inputType;
                if ((i6 & 1) == 1) {
                    int i7 = t37Var.b;
                    if (i7 == 1) {
                        editorInfo.inputType = i6 | 4096;
                    } else if (i7 == 2) {
                        editorInfo.inputType = i6 | 8192;
                    } else if (i7 == 3) {
                        editorInfo.inputType = i6 | 16384;
                    }
                    if (t37Var.c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j2 = jhfVar.b;
                int i8 = kjf.c;
                editorInfo.initialSelStart = (int) (j2 >> 32);
                editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                eo4.a(editorInfo, jhfVar.a.b);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.d.d()) {
                    androidx.emoji2.text.d.a().i(editorInfo);
                }
                jtc jtcVar = new jtc(shfVar.g, new i62(shfVar), shfVar.h.c);
                shfVar.i.add(new WeakReference(jtcVar));
                return jtcVar;
            }
        } else {
            t9e t9eVar2 = (t9e) u80Var.d.get();
            af7 af7Var = (af7) (t9eVar2 != null ? t9eVar2.b : null);
            if (af7Var != null) {
                synchronized (af7Var.c) {
                    if (af7Var.e) {
                        return null;
                    }
                    ktc ktcVarA = af7Var.a.a(editorInfo);
                    ze7 ze7Var = new ze7(af7Var);
                    InputConnection rmaVar = Build.VERSION.SDK_INT >= 34 ? new rma(ktcVarA, ze7Var) : new qma(ktcVarA, ze7Var);
                    af7Var.d.b(new qug(rmaVar));
                    return rmaVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        m60 m60Var = this.n0;
        m60Var.getClass();
        m60.b.b(m60Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g0.onViewDetachedFromWindow(this);
        if (this.f) {
            View view = this.e;
            if (view == null) {
                wl7.g("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28) {
            p3a<AndroidComposeView> p3aVar = B1;
            synchronized (p3aVar) {
                p3aVar.j(this);
                j6g j6gVar = j6g.a;
            }
        }
        qme qmeVar = getSnapshotObserver().a;
        vle vleVar = qmeVar.h;
        if (vleVar != null) {
            vleVar.dispose();
        }
        qmeVar.a();
        this.b0.getClass();
        b viewTreeOwners = getViewTreeOwners();
        kv8 lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw l6.k("No lifecycle owner exists");
        }
        lifecycle.c(this.n0);
        lifecycle.c(this);
        n40 n40Var = this.y0;
        if (n40Var != null) {
            l51 l51Var = l51.a;
            l51Var.getClass();
            n40Var.c.unregisterCallback(l51Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.U0);
        getViewTreeObserver().removeOnScrollChangedListener(this.V0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.W0);
        if (i2 >= 31) {
            z50.a.a(this);
        }
        q40 q40Var = this.z0;
        if (q40Var != null) {
            getSemanticsOwner().d.j(q40Var);
            getFocusOwner().s().j(q40Var);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.O0 = 0L;
        this.I0.j(this.s1);
        this.G0 = null;
        X();
        if (this.F0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        wf9 wf9Var = this.I0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                N(getRoot());
            }
            long J = J(i2);
            long J2 = J(i3);
            long jA = iq2.a.a((int) (J >>> 32), (int) (J & 4294967295L), (int) (J2 >>> 32), (int) (4294967295L & J2));
            iq2 iq2Var = this.G0;
            if (iq2Var == null) {
                this.G0 = new iq2(jA);
                this.H0 = false;
            } else if (!iq2.b(iq2Var.a, jA)) {
                this.H0 = true;
            }
            wf9Var.q(jA);
            wf9Var.l();
            setMeasuredDimension(getRoot().u0.p.a, getRoot().u0.p.b);
            if (this.F0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().u0.p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().u0.p.b, 1073741824));
            }
            j6g j6gVar = j6g.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        ueb uebVarC;
        int toolType = motionEvent.getToolType(i2);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (uebVarC = getPointerIconService().c()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        Context context = getContext();
        if (uebVarC instanceof v80) {
            return null;
        }
        return uebVarC instanceof w80 ? PointerIcon.getSystemIcon(context, ((w80) uebVarC).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // defpackage.qo3
    public final void onResume(zv8 zv8Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a.a());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (this.b) {
            vl8 vl8Var = vl8.a;
            vl8 vl8Var2 = i2 != 0 ? i2 != 1 ? null : vl8.b : vl8Var;
            if (vl8Var2 != null) {
                vl8Var = vl8Var2;
            }
            setLayoutDirection(vl8Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        nrd nrdVar;
        if (Build.VERSION.SDK_INT < 31 || (nrdVar = this.v1) == null) {
            return;
        }
        nrdVar.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        m60 m60Var = this.n0;
        m60Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (wl7.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m60.b.a(m60Var, longSparseArray);
        } else {
            m60Var.a.post(new n60(0, m60Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        ((gme) this.b0.a).setValue(Boolean.valueOf(z));
        this.u1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zA = a.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        M(getRoot());
    }

    @Override // defpackage.chb
    public final long p(long j2) {
        R();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.Q0 >> 32));
        return if9.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.Q0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.N0);
    }

    @Override // defpackage.rxa
    public final void q() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            if (D1 == null) {
                Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                D1 = declaredMethod;
            }
            Method method = D1;
            if (method != null) {
                method.invoke(viewTreeObserver, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.rxa
    public final void r(pm8 pm8Var, boolean z, boolean z2) {
        um8 um8Var = pm8Var.u0;
        hm7 hm7Var = hm7.d;
        wf9 wf9Var = this.I0;
        if (!z) {
            wf9Var.getClass();
            int iOrdinal = um8Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                defpackage.l.g();
                return;
            }
            pm8 pm8VarK = pm8Var.K();
            boolean z3 = pm8VarK == null || pm8VarK.k();
            if (!z2) {
                if (pm8Var.G()) {
                    return;
                }
                if (pm8Var.F() && pm8Var.k() == z3 && pm8Var.k() == um8Var.p.j0) {
                    return;
                }
            }
            zf9 zf9Var = um8Var.p;
            zf9Var.l0 = true;
            zf9Var.m0 = true;
            if (!pm8Var.E0 && zf9Var.j0 && z3) {
                if ((pm8VarK == null || !pm8VarK.F()) && (pm8VarK == null || !pm8VarK.G())) {
                    wf9Var.b.a(pm8Var, hm7Var);
                }
                if (wf9Var.d) {
                    return;
                }
                U(null);
                return;
            }
            return;
        }
        yy3 yy3Var = wf9Var.b;
        int iOrdinal2 = um8Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    defpackage.l.g();
                    return;
                }
            }
        }
        if ((um8Var.e || um8Var.f) && !z2) {
            return;
        }
        um8Var.f = true;
        um8Var.g = true;
        zf9 zf9Var2 = um8Var.p;
        zf9Var2.l0 = true;
        zf9Var2.m0 = true;
        if (pm8Var.E0) {
            return;
        }
        pm8 pm8VarK2 = pm8Var.K();
        if (wl7.b(pm8Var.W(), Boolean.TRUE) && ((pm8VarK2 == null || !pm8VarK2.u0.e) && (pm8VarK2 == null || !pm8VarK2.u0.f))) {
            yy3Var.a(pm8Var, hm7.b);
        } else if (pm8Var.k() && ((pm8VarK2 == null || !pm8VarK2.F()) && (pm8VarK2 == null || !pm8VarK2.G()))) {
            yy3Var.a(pm8Var, hm7Var);
        }
        if (wf9Var.d) {
            return;
        }
        U(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().l().c()) {
            return super.requestFocus(i2, rect);
        }
        ol5 ol5VarH = cr8.H(i2);
        int i3 = ol5VarH != null ? ol5VarH.a : 7;
        return wl7.b(getFocusOwner().a(i3, rect != null ? wab.B(rect) : null, new n(i3)), Boolean.TRUE);
    }

    @Override // defpackage.rxa
    public final void s(pm8 pm8Var, long j2) {
        wf9 wf9Var = this.I0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            wf9Var.k(pm8Var, j2);
            if (!wf9Var.b.c()) {
                wf9Var.a(false);
                if (this.u0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.u0 = false;
                }
            }
            getRectManager().a();
            j6g j6gVar = j6g.a;
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.m0.h = j2;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, j6g> function1) {
        this.x0 = function1;
    }

    public final void setContentCaptureManager$ui_release(m60 m60Var) {
        this.n0 = m60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.ui.e$c] */
    public void setCoroutineContext(v03 v03Var) {
        this.W = v03Var;
        ?? r9 = getRoot().t0.f;
        if (r9 instanceof g1f) {
            ((g1f) r9).K0();
        }
        if (!r9.a.c0) {
            ae7.b("visitSubtreeIf called on an unattached node");
        }
        j4a j4aVar = new j4a(new e.c[16]);
        e.c cVar = r9.a;
        e.c cVar2 = cVar.f;
        if (cVar2 == null) {
            us3.a(j4aVar, cVar);
        } else {
            j4aVar.b(cVar2);
        }
        while (true) {
            int i2 = j4aVar.c;
            if (i2 == 0) {
                return;
            }
            e.c cVar3 = (e.c) j4aVar.k(i2 - 1);
            if ((cVar3.d & 16) != 0) {
                for (e.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.f) {
                    if ((cVar4.c & 16) != 0) {
                        ?? B = cVar4;
                        ?? j4aVar2 = 0;
                        while (B != 0) {
                            if (B instanceof dfb) {
                                dfb dfbVar = (dfb) B;
                                if (dfbVar instanceof g1f) {
                                    ((g1f) dfbVar).K0();
                                }
                            } else if ((B.c & 16) != 0 && (B instanceof zs3)) {
                                e.c cVar5 = ((zs3) B).e0;
                                int i3 = 0;
                                B = B;
                                j4aVar2 = j4aVar2;
                                while (cVar5 != null) {
                                    if ((cVar5.c & 16) != 0) {
                                        i3++;
                                        j4aVar2 = j4aVar2;
                                        if (i3 == 1) {
                                            B = cVar5;
                                        } else {
                                            if (j4aVar2 == 0) {
                                                j4aVar2 = new j4a(new e.c[16]);
                                            }
                                            if (B != 0) {
                                                j4aVar2.b(B);
                                                B = 0;
                                            }
                                            j4aVar2.b(cVar5);
                                        }
                                    }
                                    cVar5 = cVar5.f;
                                    B = B;
                                    j4aVar2 = j4aVar2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            B = us3.b(j4aVar2);
                        }
                    }
                }
            }
            us3.a(j4aVar, cVar3);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.O0 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super b, j6g> function1) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.T0 = function1;
    }

    @Override // defpackage.rxa
    public void setShowLayoutBounds(boolean z) {
        this.E0 = z;
    }

    public void setUncaughtExceptionHandler(ofd.a aVar) {
        this.I0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui_release(ofd.a aVar) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.rxa
    public final long t(long j2) {
        R();
        return if9.b(j2, this.N0);
    }

    @Override // defpackage.rxa
    public final void u(float f2) {
        if (this.f) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.n1) || f2 > this.n1) {
                    this.n1 = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.o1) || f2 < this.o1) {
                    this.o1 = f2;
                }
            }
        }
    }

    @Override // defpackage.chb
    public final long v(long j2) {
        R();
        long jB = if9.b(j2, this.M0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.Q0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.Q0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // defpackage.rxa
    public final void w(gu5<j6g> gu5Var) {
        p3a<gu5<j6g>> p3aVar = this.m1;
        if (p3aVar.c(gu5Var) >= 0) {
            return;
        }
        p3aVar.g(gu5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(kotlin.jvm.functions.Function2 r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.c r0 = (androidx.compose.ui.platform.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.c r0 = new androidx.compose.ui.platform.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return
        L27:
            defpackage.r7d.b(r6)
            goto L46
        L2b:
            defpackage.r7d.b(r6)
            n50 r6 = new n50
            r6.<init>(r4)
            r0.label = r2
            u9e r1 = new u9e
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r4.Z0
            r1.<init>(r6, r4, r5, r2)
            java.lang.Object r4 = defpackage.f13.d(r1, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L46
            return
        L46:
            defpackage.r40.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.x(kotlin.jvm.functions.Function2, pu2):void");
    }

    @Override // defpackage.rxa
    public final void y(int i2, pm8 pm8Var) {
        m1getLayoutNodes().g(i2);
        m1getLayoutNodes().h(pm8Var.b, pm8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        r4.l(0, r0);
     */
    @Override // defpackage.rxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            r11 = this;
            boolean r0 = r11.A0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4c
            vxa r0 = r11.getSnapshotObserver()
            qme r0 = r0.a
            vy5 r3 = defpackage.vy5.c
            java.lang.Object r4 = r0.g
            monitor-enter(r4)
            j4a<qme$a> r0 = r0.f     // Catch: java.lang.Throwable -> L38
            int r5 = r0.c     // Catch: java.lang.Throwable -> L38
            r6 = r2
            r7 = r6
        L17:
            T[] r8 = r0.a
            if (r6 >= r5) goto L3d
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L38
            qme$a r8 = (qme.a) r8     // Catch: java.lang.Throwable -> L38
            r8.e(r3)     // Catch: java.lang.Throwable -> L38
            z3a<java.lang.Object, o3a<java.lang.Object>> r8 = r8.f     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.f()     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto L2d
            int r7 = r7 + 1
            goto L3a
        L2d:
            if (r7 <= 0) goto L3a
            T[] r8 = r0.a     // Catch: java.lang.Throwable -> L38
            int r9 = r6 - r7
            r10 = r8[r6]     // Catch: java.lang.Throwable -> L38
            r8[r9] = r10     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r11 = move-exception
            goto L4a
        L3a:
            int r6 = r6 + 1
            goto L17
        L3d:
            int r3 = r5 - r7
            java.util.Arrays.fill(r8, r3, r5, r1)     // Catch: java.lang.Throwable -> L38
            r0.c = r3     // Catch: java.lang.Throwable -> L38
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            r11.A0 = r2
            goto L4c
        L4a:
            monitor-exit(r4)
            throw r11
        L4c:
            tb0 r0 = r11.F0
            if (r0 == 0) goto L53
            I(r0)
        L53:
            q40 r0 = r11.z0
            if (r0 == 0) goto L71
            b3a r3 = r0.h
            int r4 = r3.d
            if (r4 != 0) goto L6a
            boolean r4 = r0.i
            if (r4 == 0) goto L6a
            abb r4 = r0.a
            android.view.autofill.AutofillManager r4 = r4.a
            r4.commit()
            r0.i = r2
        L6a:
            int r3 = r3.d
            if (r3 == 0) goto L71
            r3 = 1
            r0.i = r3
        L71:
            p3a<gu5<j6g>> r0 = r11.m1
            boolean r0 = r0.e()
            if (r0 == 0) goto Lae
            p3a<gu5<j6g>> r0 = r11.m1
            java.lang.Object r0 = r0.b(r2)
            if (r0 == 0) goto Lae
            p3a<gu5<j6g>> r0 = r11.m1
            int r0 = r0.b
            r3 = r2
        L86:
            p3a<gu5<j6g>> r4 = r11.m1
            if (r3 >= r0) goto Laa
            java.lang.Object r4 = r4.b(r3)
            gu5 r4 = (defpackage.gu5) r4
            p3a<gu5<j6g>> r5 = r11.m1
            if (r3 < 0) goto La6
            int r6 = r5.b
            if (r3 >= r6) goto La6
            java.lang.Object[] r5 = r5.a
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La3
            r4.invoke()
        La3:
            int r3 = r3 + 1
            goto L86
        La6:
            r5.f(r3)
            throw r1
        Laa:
            r4.l(r2, r0)
            goto L71
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.z():void");
    }

    @Override // defpackage.rxa
    public g40 getAccessibilityManager() {
        return this.o0;
    }

    @Override // defpackage.rxa
    public c50 getClipboard() {
        return this.C0;
    }

    @Override // defpackage.rxa
    public d50 getClipboardManager() {
        return this.B0;
    }

    @Override // defpackage.rxa
    public e70 getDragAndDropManager() {
        return this.a0;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public a3a<pm8> m1getLayoutNodes() {
        return this.i0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i2;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        j6g j6gVar = j6g.a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
