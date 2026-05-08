package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.dfa;
import defpackage.efa;
import defpackage.epg;
import defpackage.ffa;
import defpackage.fk3;
import defpackage.gk3;
import defpackage.kf7;
import defpackage.prg;
import defpackage.qrg;
import defpackage.r6;
import defpackage.rzg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements fk3, dfa, efa {
    public static final int[] u0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final rzg v0;
    public static final Rect w0;
    public boolean V;
    public boolean W;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public ContentFrameLayout c;
    public int c0;
    public ActionBarContainer d;
    public int d0;
    public gk3 e;
    public final Rect e0;
    public Drawable f;
    public final Rect f0;
    public final Rect g0;
    public final Rect h0;
    public rzg i0;
    public rzg j0;
    public rzg k0;
    public rzg l0;
    public d m0;
    public OverScroller n0;
    public ViewPropertyAnimator o0;
    public final a p0;
    public final b q0;
    public final c r0;
    public final ffa s0;
    public final f t0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = null;
            actionBarOverlayLayout.b0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.o0 = null;
            actionBarOverlayLayout.b0 = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.o0 = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.p0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.o0 = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.p0);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        rzg.d cVar = i >= 30 ? new rzg.c() : i >= 29 ? new rzg.b() : new rzg.a();
        cVar.g(kf7.b(0, 1, 0, 1));
        v0 = cVar.b();
        w0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new Rect();
        this.h0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        rzg rzgVar = rzg.b;
        this.i0 = rzgVar;
        this.j0 = rzgVar;
        this.k0 = rzgVar;
        this.l0 = rzgVar;
        this.p0 = new a();
        this.q0 = new b();
        this.r0 = new c();
        r(context);
        this.s0 = new ffa();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.t0 = fVar;
        addView(fVar);
    }

    public static boolean p(View view, Rect rect, boolean z) {
        boolean z2;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.fk3
    public final boolean a() {
        s();
        return this.e.a();
    }

    @Override // defpackage.fk3
    public final boolean b() {
        s();
        return this.e.b();
    }

    @Override // defpackage.fk3
    public final boolean c() {
        s();
        return this.e.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // defpackage.fk3
    public final void d(Menu menu, j.a aVar) {
        s();
        this.e.d(menu, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.fk3
    public final boolean e() {
        s();
        return this.e.e();
    }

    @Override // defpackage.fk3
    public final void f() {
        s();
        this.e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.fk3
    public final boolean g() {
        s();
        return this.e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ffa ffaVar = this.s0;
        return ffaVar.b | ffaVar.a;
    }

    public CharSequence getTitle() {
        s();
        return this.e.getTitle();
    }

    @Override // defpackage.fk3
    public final void h(int i) {
        s();
        if (i == 2) {
            this.e.k();
        } else if (i == 5) {
            this.e.r();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // defpackage.dfa
    public final void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.dfa
    public final void j(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.dfa
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // defpackage.fk3
    public final void l() {
        s();
        this.e.m();
    }

    @Override // defpackage.efa
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.dfa
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.dfa
    public final boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        rzg rzgVarH = rzg.h(this, windowInsets);
        boolean zP = p(this.d, new Rect(rzgVarH.b(), rzgVarH.d(), rzgVarH.c(), rzgVarH.a()), false);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        Rect rect = this.e0;
        epg.d.b(this, rzgVarH, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        rzg.j jVar = rzgVarH.a;
        rzg rzgVarN = jVar.n(i, i2, i3, i4);
        this.i0 = rzgVarN;
        boolean z = true;
        if (!this.j0.equals(rzgVarN)) {
            this.j0 = this.i0;
            zP = true;
        }
        Rect rect2 = this.f0;
        if (rect2.equals(rect)) {
            z = zP;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return jVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.a0 || !z) {
            return false;
        }
        this.n0.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.n0.getFinalY() > this.d.getHeight()) {
            q();
            this.r0.run();
        } else {
            q();
            this.q0.run();
        }
        this.b0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.c0 + i2;
        this.c0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        androidx.appcompat.app.f fVar;
        qrg qrgVar;
        this.s0.a = i;
        this.c0 = getActionBarHideOffset();
        q();
        d dVar = this.m0;
        if (dVar == null || (qrgVar = (fVar = (androidx.appcompat.app.f) dVar).s) == null) {
            return;
        }
        qrgVar.a();
        fVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.a0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.a0 || this.b0) {
            return;
        }
        if (this.c0 <= this.d.getHeight()) {
            q();
            postDelayed(this.q0, 600L);
        } else {
            q();
            postDelayed(this.r0, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.d0 ^ i;
        this.d0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        d dVar = this.m0;
        if (dVar != null) {
            androidx.appcompat.app.f fVar = (androidx.appcompat.app.f) dVar;
            fVar.o = !z2;
            if (z || !z2) {
                if (fVar.p) {
                    fVar.p = false;
                    fVar.z(true);
                }
            } else if (!fVar.p) {
                fVar.p = true;
                fVar.z(true);
            }
        }
        if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 || this.m0 == null) {
            return;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        d dVar = this.m0;
        if (dVar != null) {
            ((androidx.appcompat.app.f) dVar).n = i;
        }
    }

    public final void q() {
        removeCallbacks(this.q0);
        removeCallbacks(this.r0);
        ViewPropertyAnimator viewPropertyAnimator = this.o0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(u0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.n0 = new OverScroller(context);
    }

    public final void s() {
        gk3 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof gk3) {
                wrapper = (gk3) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    r6.g("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.m0 = dVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.f) this.m0).n = this.b;
            int i = this.d0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, prg> weakHashMap = epg.a;
                epg.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.W = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.a0) {
            this.a0 = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.e.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.e.o(i);
    }

    public void setOverlayMode(boolean z) {
        this.V = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.fk3
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.e.setWindowCallback(callback);
    }

    @Override // defpackage.fk3
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        s();
        this.e.setIcon(drawable);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }
}
