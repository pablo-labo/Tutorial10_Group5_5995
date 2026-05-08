package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.R;
import defpackage.wle;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class tgb extends n1 {
    public static final a t0 = a.a;
    public gu5<j6g> a0;
    public ahb b0;
    public String c0;
    public final View d0;
    public final ygb e0;
    public final WindowManager f0;
    public final WindowManager.LayoutParams g0;
    public zgb h0;
    public vl8 i0;
    public final g4a j0;
    public final g4a k0;
    public ph7 l0;
    public final az3 m0;
    public final Rect n0;
    public final qme o0;
    public eg0 p0;
    public final g4a q0;
    public boolean r0;
    public final int[] s0;

    public static final class a extends mj8 implements Function1<tgb, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(tgb tgbVar) {
            tgb tgbVar2 = tgbVar;
            if (tgbVar2.isAttachedToWindow()) {
                tgbVar2.o();
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            tgb.this.a(ka2.L(this.$$changed | 1), bVar);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ ph7 $parentBounds;
        final /* synthetic */ long $popupContentSize;
        final /* synthetic */ kuc $popupPosition;
        final /* synthetic */ long $windowSize;
        final /* synthetic */ tgb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kuc kucVar, tgb tgbVar, ph7 ph7Var, long j, long j2) {
            super(0);
            this.$popupPosition = kucVar;
            this.this$0 = tgbVar;
            this.$parentBounds = ph7Var;
            this.$windowSize = j;
            this.$popupContentSize = j2;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$popupPosition.element = this.this$0.getPositionProvider().e(this.$parentBounds, this.$windowSize, this.this$0.getParentLayoutDirection(), this.$popupContentSize);
            return j6g.a;
        }
    }

    public tgb() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgb(gu5 gu5Var, ahb ahbVar, String str, View view, iy3 iy3Var, zgb zgbVar, UUID uuid) {
        super(view.getContext(), null, 6, 0);
        ygb xgbVar = Build.VERSION.SDK_INT >= 29 ? new xgb() : new ygb();
        this.a0 = gu5Var;
        this.b0 = ahbVar;
        this.c0 = str;
        this.d0 = view;
        this.e0 = xgbVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ahb ahbVar2 = this.b0;
        boolean zB = x80.b(view);
        boolean z = ahbVar2.b;
        int i = ahbVar2.a;
        if (z && zB) {
            i |= 8192;
        } else if (z && !zB) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.g0 = layoutParams;
        this.h0 = zgbVar;
        this.i0 = vl8.a;
        this.j0 = r.f(null);
        this.k0 = r.f(null);
        this.m0 = r.c(new ugb(this));
        this.n0 = new Rect();
        this.o0 = new qme(new vgb(this));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, zte.a(view));
        setTag(R.id.view_tree_view_model_store_owner, n7g.b(view));
        setTag(R.id.view_tree_saved_state_registry_owner, esg.b(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(iy3Var.t1(8.0f));
        setOutlineProvider(new sgb());
        this.q0 = r.f(eh2.a);
        this.s0 = new int[2];
    }

    private final Function2<androidx.compose.runtime.b, Integer, j6g> getContent() {
        return (Function2) ((gme) this.q0).getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sl8 getParentLayoutCoordinates() {
        return (sl8) ((gme) this.k0).getValue();
    }

    private final ph7 getVisibleDisplayBounds() {
        this.e0.getClass();
        View view = this.d0;
        Rect rect = this.n0;
        view.getWindowVisibleDisplayFrame(rect);
        ne4 ne4Var = x80.a;
        return new ph7(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        ((gme) this.q0).setValue(function2);
    }

    private final void setParentLayoutCoordinates(sl8 sl8Var) {
        ((gme) this.k0).setValue(sl8Var);
    }

    @Override // defpackage.n1
    public final void a(int i, androidx.compose.runtime.b bVar) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-857613600);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b0.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                gu5<j6g> gu5Var = this.a0;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.n1
    public final void g(int i, int i2, int i3, boolean z, int i4) {
        super.g(i, i2, i3, z, i4);
        this.b0.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.g0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.e0.getClass();
        this.f0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.m0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.g0;
    }

    public final vl8 getParentLayoutDirection() {
        return this.i0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final th7 m37getPopupContentSizebOM6tXw() {
        return (th7) ((gme) this.j0).getValue();
    }

    public final zgb getPositionProvider() {
        return this.h0;
    }

    @Override // defpackage.n1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r0;
    }

    public n1 getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.c0;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.n1
    public final void h(int i, int i2) {
        this.b0.getClass();
        ph7 visibleDisplayBounds = getVisibleDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d - visibleDisplayBounds.b, Integer.MIN_VALUE));
    }

    public final void k(dm2 dm2Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        setParentCompositionContext(dm2Var);
        setContent(function2);
        this.r0 = true;
    }

    public final void l(gu5<j6g> gu5Var, ahb ahbVar, String str, vl8 vl8Var) {
        int i;
        this.a0 = gu5Var;
        this.c0 = str;
        if (!wl7.b(this.b0, ahbVar)) {
            ahbVar.getClass();
            this.b0 = ahbVar;
            boolean zB = x80.b(this.d0);
            boolean z = ahbVar.b;
            int i2 = ahbVar.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.g0;
            layoutParams.flags = i2;
            this.e0.getClass();
            this.f0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = vl8Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                l.g();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void m() {
        sl8 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.d()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jL = parentLayoutCoordinates.L(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            ph7 ph7Var = new ph7(i, i2, ((int) (jA >> 32)) + i, ((int) (jA & 4294967295L)) + i2);
            if (ph7Var.equals(this.l0)) {
                return;
            }
            this.l0 = ph7Var;
            o();
        }
    }

    public final void n(sl8 sl8Var) {
        setParentLayoutCoordinates(sl8Var);
        m();
    }

    public final void o() {
        th7 th7VarM37getPopupContentSizebOM6tXw;
        ph7 ph7Var = this.l0;
        if (ph7Var == null || (th7VarM37getPopupContentSizebOM6tXw = m37getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = th7VarM37getPopupContentSizebOM6tXw.a;
        ph7 visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = (((long) (visibleDisplayBounds.d - visibleDisplayBounds.b)) & 4294967295L) | (((long) (visibleDisplayBounds.c - visibleDisplayBounds.a)) << 32);
        kuc kucVar = new kuc();
        kucVar.element = 0L;
        this.o0.d(this, t0, new c(kucVar, this, ph7Var, j2, j));
        long j3 = kucVar.element;
        WindowManager.LayoutParams layoutParams = this.g0;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.b0.e;
        ygb ygbVar = this.e0;
        if (z) {
            ygbVar.a(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        ygbVar.getClass();
        this.f0.updateViewLayout(this, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eg0] */
    @Override // defpackage.n1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qme qmeVar = this.o0;
        qmeVar.getClass();
        wle.a aVar = wle.e;
        ey eyVar = qmeVar.d;
        aVar.getClass();
        qmeVar.h = wle.a.d(eyVar);
        if (!this.b0.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.p0 == null) {
            final gu5<j6g> gu5Var = this.a0;
            this.p0 = new OnBackInvokedCallback() { // from class: eg0
                public final void onBackInvoked() {
                    gu5 gu5Var2 = gu5Var;
                    if (gu5Var2 != null) {
                        gu5Var2.invoke();
                    }
                }
            };
        }
        fg0.a(this, this.p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qme qmeVar = this.o0;
        vle vleVar = qmeVar.h;
        if (vleVar != null) {
            vleVar.dispose();
        }
        qmeVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            fg0.b(this, this.p0);
        }
        this.p0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b0.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            gu5<j6g> gu5Var = this.a0;
            if (gu5Var != null) {
                gu5Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            gu5<j6g> gu5Var2 = this.a0;
            if (gu5Var2 != null) {
                gu5Var2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(vl8 vl8Var) {
        this.i0 = vl8Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m38setPopupContentSizefhxjrPA(th7 th7Var) {
        ((gme) this.j0).setValue(th7Var);
    }

    public final void setPositionProvider(zgb zgbVar) {
        this.h0 = zgbVar;
    }

    public final void setTestTag(String str) {
        this.c0 = str;
    }
}
