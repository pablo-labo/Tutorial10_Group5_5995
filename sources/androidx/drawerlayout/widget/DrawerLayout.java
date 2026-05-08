package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import defpackage.epg;
import defpackage.kf7;
import defpackage.mkf;
import defpackage.oc4;
import defpackage.prg;
import defpackage.qac;
import defpackage.rzg;
import defpackage.t6;
import defpackage.tpg;
import defpackage.v6;
import defpackage.w40;
import defpackage.y5;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] u0 = {R.attr.colorPrimaryDark};
    public static final int[] v0 = {R.attr.layout_gravity};
    public static final boolean w0;
    public final tpg V;
    public final f W;
    public float a;
    public final f a0;
    public final int b;
    public int b0;
    public int c;
    public boolean c0;
    public float d;
    public boolean d0;
    public final Paint e;
    public int e0;
    public final tpg f;
    public int f0;
    public int g0;
    public int h0;
    public boolean i0;
    public d j0;
    public ArrayList k0;
    public float l0;
    public float m0;
    public Drawable n0;
    public WindowInsets o0;
    public boolean p0;
    public final ArrayList<View> q0;
    public Rect r0;
    public Matrix s0;
    public final a t0;

    public class a implements v6 {
        public a() {
        }

        @Override // defpackage.v6
        public final boolean a(View view) {
            if (!DrawerLayout.j(view)) {
                return false;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.f(view) == 2) {
                return false;
            }
            drawerLayout.b(view);
            return true;
        }
    }

    public class b extends y5 {
        public b() {
            new Rect();
        }

        @Override // defpackage.y5
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = drawerLayout.e();
            if (viewE == null) {
                return true;
            }
            int iG = drawerLayout.g(viewE);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            Gravity.getAbsoluteGravity(iG, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // defpackage.y5
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            int[] iArr = DrawerLayout.u0;
            AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            t6Var.n("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) t6.a.e.a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) t6.a.f.a);
        }

        @Override // defpackage.y5
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.u0;
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public static final class c extends y5 {
        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                t6Var.b = -1;
                accessibilityNodeInfo.setParent(null);
            }
        }
    }

    public interface d {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;
    }

    public class f extends tpg.c {
        public final int a;
        public tpg b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewD;
                int width;
                f fVar = f.this;
                DrawerLayout drawerLayout = DrawerLayout.this;
                int i = fVar.b.o;
                int i2 = fVar.a;
                boolean z = i2 == 3;
                if (z) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewD != null) {
                    if (((!z || viewD.getLeft() >= width) && (z || viewD.getLeft() <= width)) || drawerLayout.f(viewD) != 0) {
                        return;
                    }
                    e eVar = (e) viewD.getLayoutParams();
                    fVar.b.s(viewD, width, viewD.getTop());
                    eVar.c = true;
                    drawerLayout.invalidate();
                    View viewD2 = drawerLayout.d(i2 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        drawerLayout.b(viewD2);
                    }
                    if (drawerLayout.i0) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.i0 = true;
                }
            }
        }

        public f(int i) {
            this.a = i;
        }

        @Override // tpg.c
        public final int a(View view, int i) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // tpg.c
        public final int b(View view, int i) {
            return view.getTop();
        }

        @Override // tpg.c
        public final int c(View view) {
            if (DrawerLayout.k(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // tpg.c
        public final void e(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewD = i3 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
            if (viewD == null || drawerLayout.f(viewD) != 0) {
                return;
            }
            this.b.b(viewD, i2);
        }

        @Override // tpg.c
        public final void f() {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // tpg.c
        public final void g(View view, int i) {
            ((e) view.getLayoutParams()).c = false;
            int i2 = this.a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewD = drawerLayout.d(i2);
            if (viewD != null) {
                drawerLayout.b(viewD);
            }
        }

        @Override // tpg.c
        public final void h(int i) {
            int i2;
            View rootView;
            View view = this.b.t;
            DrawerLayout drawerLayout = DrawerLayout.this;
            int i3 = drawerLayout.f.a;
            int i4 = drawerLayout.V.a;
            if (i3 == 1 || i4 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (i3 != 2 && i4 != 2) {
                    i2 = 0;
                }
            }
            if (view != null && i == 0) {
                float f = ((e) view.getLayoutParams()).b;
                if (f == 0.0f) {
                    e eVar = (e) view.getLayoutParams();
                    if ((eVar.d & 1) == 1) {
                        eVar.d = 0;
                        ArrayList arrayList = drawerLayout.k0;
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                ((d) drawerLayout.k0.get(size)).b(view);
                            }
                        }
                        drawerLayout.p(view, false);
                        drawerLayout.o(view);
                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                } else if (f == 1.0f) {
                    e eVar2 = (e) view.getLayoutParams();
                    if ((eVar2.d & 1) == 0) {
                        eVar2.d = 1;
                        ArrayList arrayList2 = drawerLayout.k0;
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ((d) drawerLayout.k0.get(size2)).a(view);
                            }
                        }
                        drawerLayout.p(view, true);
                        drawerLayout.o(view);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i2 != drawerLayout.b0) {
                drawerLayout.b0 = i2;
                ArrayList arrayList3 = drawerLayout.k0;
                if (arrayList3 != null) {
                    for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                        ((d) drawerLayout.k0.get(size3)).c(i2);
                    }
                }
            }
        }

        @Override // tpg.c
        public final void i(View view, int i, int i2) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.a(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
            drawerLayout.n(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // tpg.c
        public final void j(View view, float f, float f2) {
            int i;
            float f3 = ((e) view.getLayoutParams()).b;
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.q(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // tpg.c
        public final boolean k(View view, int i) {
            if (!DrawerLayout.k(view)) {
                return false;
            }
            int i2 = this.a;
            DrawerLayout drawerLayout = DrawerLayout.this;
            return drawerLayout.a(view, i2) && drawerLayout.f(view) == 0;
        }
    }

    static {
        w0 = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(mkf mkfVar) {
        super(mkfVar, null, com.indeed.android.jobsearch.R.attr.drawerLayoutStyle);
        new c();
        this.c = -1728053248;
        this.e = new Paint();
        this.d0 = true;
        this.e0 = 3;
        this.f0 = 3;
        this.g0 = 3;
        this.h0 = 3;
        this.t0 = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        f fVar = new f(3);
        this.W = fVar;
        f fVar2 = new f(5);
        this.a0 = fVar2;
        tpg tpgVar = new tpg(getContext(), this, fVar);
        tpgVar.b = (int) (tpgVar.b * 1.0f);
        this.f = tpgVar;
        tpgVar.q = 1;
        tpgVar.n = f3;
        fVar.b = tpgVar;
        tpg tpgVar2 = new tpg(getContext(), this, fVar2);
        tpgVar2.b = (int) (1.0f * tpgVar2.b);
        this.V = tpgVar2;
        tpgVar2.q = 2;
        tpgVar2.n = f3;
        fVar2.b = tpgVar2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setImportantForAccessibility(1);
        epg.o(this, new b());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new oc4());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = mkfVar.obtainStyledAttributes(u0);
            try {
                this.n0 = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = mkfVar.obtainStyledAttributes(null, qac.a, com.indeed.android.jobsearch.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.a = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.a = getResources().getDimension(com.indeed.android.jobsearch.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.q0 = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String h(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean i(View view) {
        return ((e) view.getLayoutParams()).a == 0;
    }

    public static boolean j(View view) {
        if (k(view)) {
            return (((e) view.getLayoutParams()).d & 1) == 1;
        }
        w40.m("View ", view, " is not a drawer");
        return false;
    }

    public static boolean k(View view) {
        int i = ((e) view.getLayoutParams()).a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i) {
        return (g(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.q0;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!k(childAt)) {
                arrayList2.add(childAt);
            } else if (j(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || k(view)) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final void b(View view) {
        if (!k(view)) {
            w40.m("View ", view, " is not a sliding drawer");
            return;
        }
        e eVar = (e) view.getLayoutParams();
        if (this.d0) {
            eVar.b = 0.0f;
            eVar.d = 0;
        } else {
            eVar.d |= 4;
            if (a(view, 3)) {
                this.f.s(view, -view.getWidth(), view.getTop());
            } else {
                this.V.s(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c(boolean z) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (k(childAt) && (!z || eVar.c)) {
                zS |= a(childAt, 3) ? this.f.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.V.s(childAt, getWidth(), childAt.getTop());
                eVar.c = false;
            }
        }
        f fVar = this.W;
        DrawerLayout.this.removeCallbacks(fVar.c);
        f fVar2 = this.a0;
        DrawerLayout.this.removeCallbacks(fVar2.c);
        if (zS) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((e) getChildAt(i).getLayoutParams()).b);
        }
        this.d = fMax;
        boolean zG = this.f.g();
        boolean zG2 = this.V.g();
        if (zG || zG2) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.r0 == null) {
                this.r0 = new Rect();
            }
            childAt.getHitRect(this.r0);
            if (this.r0.contains((int) x, (int) y) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.s0 == null) {
                            this.s0 = new Matrix();
                        }
                        matrix.invert(this.s0);
                        motionEventObtain.transform(this.s0);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zI = i(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zI) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && k(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.d;
        if (f2 > 0.0f && zI) {
            int i4 = this.c;
            Paint paint = this.e;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (k(childAt)) {
                if (!k(childAt)) {
                    w40.m("View ", childAt, " is not a drawer");
                    return null;
                }
                if (((e) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!k(view)) {
            w40.m("View ", view, " is not a drawer");
            return 0;
        }
        int i = ((e) view.getLayoutParams()).a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.e0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.g0 : this.h0;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f0;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.h0 : this.g0;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.g0;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.e0 : this.f0;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.h0;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.f0 : this.e0;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int g(View view) {
        int i = ((e) view.getLayoutParams()).a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.a = 0;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            e eVar2 = new e(eVar);
            eVar2.a = 0;
            eVar2.a = eVar.a;
            return eVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar3 = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar3.a = 0;
            return eVar3;
        }
        e eVar4 = new e(layoutParams);
        eVar4.a = 0;
        return eVar4;
    }

    public float getDrawerElevation() {
        return this.a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.n0;
    }

    public final void l(View view) {
        if (!k(view)) {
            w40.m("View ", view, " is not a sliding drawer");
            return;
        }
        e eVar = (e) view.getLayoutParams();
        if (this.d0) {
            eVar.b = 1.0f;
            eVar.d = 1;
            p(view, true);
            o(view);
        } else {
            eVar.d |= 2;
            if (a(view, 3)) {
                this.f.s(view, 0, view.getTop());
            } else {
                this.V.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void m(int i, int i2) {
        View viewD;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.e0 = i;
        } else if (i2 == 5) {
            this.f0 = i;
        } else if (i2 == 8388611) {
            this.g0 = i;
        } else if (i2 == 8388613) {
            this.h0 = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f : this.V).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(absoluteGravity)) != null) {
                l(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public final void n(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.b) {
            return;
        }
        eVar.b = f2;
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d) this.k0.get(size)).d(view, f2);
            }
        }
    }

    public final void o(View view) {
        t6.a aVar = t6.a.o;
        epg.k(view, aVar.a());
        if (!j(view) || f(view) == 2) {
            return;
        }
        epg.m(view, aVar, this.t0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d0 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p0 || this.n0 == null) {
            return;
        }
        WindowInsets windowInsets = this.o0;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.n0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.n0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            tpg r1 = r8.f
            boolean r2 = r1.r(r9)
            tpg r3 = r8.V
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.g
            r6 = r6[r0]
            float[] r7 = r1.e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.W
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$f$a r9 = r9.c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.a0
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$f$a r9 = r9.c
            r0.removeCallbacks(r9)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.i0 = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.l0 = r0
            r8.m0 = r9
            float r5 = r8.d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = i(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.i0 = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.e) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r8 = r8.i0
            if (r8 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || e() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        int i5;
        boolean z2 = true;
        this.c0 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i6 - r11) / f4;
                        i5 = i6 - ((int) (eVar.b * f4));
                    }
                    boolean z3 = f2 != eVar.b ? z2 : false;
                    int i9 = eVar.a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z3) {
                        n(childAt, f2);
                    }
                    int i17 = eVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (w0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            kf7 kf7VarK = rzg.h(null, rootWindowInsets).a.k();
            tpg tpgVar = this.f;
            tpgVar.o = Math.max(tpgVar.p, kf7VarK.a);
            tpg tpgVar2 = this.V;
            tpgVar2.o = Math.max(tpgVar2.p, kf7VarK.c);
        }
        this.c0 = false;
        this.d0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        int i = savedState.c;
        if (i != 0 && (viewD = d(i)) != null) {
            l(viewD);
        }
        int i2 = savedState.d;
        if (i2 != 3) {
            m(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            m(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            m(i4, 8388611);
        }
        int i5 = savedState.V;
        if (i5 != 3) {
            m(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            int i2 = eVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.c = eVar.a;
                break;
            }
        }
        savedState.d = this.e0;
        savedState.e = this.f0;
        savedState.f = this.g0;
        savedState.V = this.h0;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            tpg r0 = r6.f
            r0.k(r7)
            tpg r1 = r6.V
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.c(r3)
            r6.i0 = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = i(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.l0
            float r1 = r1 - r4
            float r4 = r6.m0
            float r7 = r7 - r4
            int r0 = r0.b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r4 = (androidx.drawerlayout.widget.DrawerLayout.e) r4
            int r4 = r4.d
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.f(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.c(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.l0 = r0
            r6.m0 = r7
            r6.i0 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || k(childAt)) && !(z && childAt == view)) {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c0) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.a = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (k(childAt)) {
                float f3 = this.a;
                WeakHashMap<View, prg> weakHashMap = epg.a;
                epg.d.k(childAt, f3);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.j0;
        if (dVar2 != null && (arrayList = this.k0) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.k0 == null) {
                this.k0 = new ArrayList();
            }
            this.k0.add(dVar);
        }
        this.j0 = dVar;
    }

    public void setDrawerLockMode(int i) {
        m(i, 3);
        m(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.n0 = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.n0 = new ColorDrawable(i);
        invalidate();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int V;
        public int c;
        public int d;
        public int e;
        public int f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.V = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.V);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.n0 = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0);
        eVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }
}
