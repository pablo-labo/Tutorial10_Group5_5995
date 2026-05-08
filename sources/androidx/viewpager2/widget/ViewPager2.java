package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.c;
import defpackage.bg;
import defpackage.epg;
import defpackage.jac;
import defpackage.l5;
import defpackage.nrg;
import defpackage.prg;
import defpackage.r6;
import defpackage.t6;
import defpackage.v6;
import defpackage.wm2;
import defpackage.wse;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final d V;
    public int W;
    public final Rect a;
    public Parcelable a0;
    public final Rect b;
    public final i b0;
    public final androidx.viewpager2.widget.a c;
    public final h c0;
    public int d;
    public final androidx.viewpager2.widget.c d0;
    public boolean e;
    public final androidx.viewpager2.widget.a e0;
    public final a f;
    public final wm2 f0;
    public final androidx.viewpager2.widget.b g0;
    public RecyclerView.j h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public final f l0;

    public class a extends c {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.e = true;
            viewPager2.d0.l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i) {
            a();
        }
    }

    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void R(RecyclerView.t tVar, RecyclerView.x xVar, t6 t6Var) {
            super.R(tVar, xVar, t6Var);
            ViewPager2.this.l0.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void T(RecyclerView.t tVar, RecyclerView.x xVar, View view, t6 t6Var) {
            int iE;
            int iE2;
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.V.getClass();
                iE = RecyclerView.m.E(view);
            } else {
                iE = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.V.getClass();
                iE2 = RecyclerView.m.E(view);
            } else {
                iE2 = 0;
            }
            t6Var.q(t6.f.a(iE, 1, iE2, false, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean e0(RecyclerView.t tVar, RecyclerView.x xVar, int i, Bundle bundle) {
            ViewPager2.this.l0.getClass();
            return super.e0(tVar, xVar, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean j0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void z0(RecyclerView.x xVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.z0(xVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    public static abstract class e {
        public void a(int i) {
        }

        public void b(int i, float f, int i2) {
        }

        public void c(int i) {
        }
    }

    public class f extends b {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.f c;

        public class a implements v6 {
            public a() {
            }

            @Override // defpackage.v6
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.j0) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public class b implements v6 {
            public b() {
            }

            @Override // defpackage.v6
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.j0) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a() {
            int iC;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            epg.l(viewPager2, R.id.accessibilityActionPageLeft);
            epg.h(viewPager2, 0);
            epg.l(viewPager2, R.id.accessibilityActionPageRight);
            epg.h(viewPager2, 0);
            epg.l(viewPager2, R.id.accessibilityActionPageUp);
            epg.h(viewPager2, 0);
            epg.l(viewPager2, R.id.accessibilityActionPageDown);
            epg.h(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (iC = viewPager2.getAdapter().c()) == 0 || !viewPager2.j0) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation != 0) {
                if (viewPager2.d < iC - 1) {
                    epg.m(viewPager2, new t6.a(R.id.accessibilityActionPageDown, (String) null), aVar);
                }
                if (viewPager2.d > 0) {
                    epg.m(viewPager2, new t6.a(R.id.accessibilityActionPageUp, (String) null), bVar);
                    return;
                }
                return;
            }
            boolean z = viewPager2.V.z() == 1;
            int i2 = z ? 16908360 : 16908361;
            if (z) {
                i = 16908361;
            }
            if (viewPager2.d < iC - 1) {
                epg.m(viewPager2, new t6.a(i2, (String) null), aVar);
            }
            if (viewPager2.d > 0) {
                epg.m(viewPager2, new t6.a(i, (String) null), bVar);
            }
        }
    }

    public interface g {
    }

    public class h extends u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.a0
        public final View c(RecyclerView.m mVar) {
            Object obj = ViewPager2.this.f0.a;
            return super.c(mVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.l0.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.d);
            accessibilityEvent.setToIndex(viewPager2.d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.j0 && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.j0 && super.onTouchEvent(motionEvent);
        }
    }

    public static class j implements Runnable {
        public final int a;
        public final RecyclerView b;

        public j(int i, i iVar) {
            this.a = i;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.j0(this.a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.c = aVar;
        this.e = false;
        this.f = new a();
        this.W = -1;
        this.h0 = null;
        this.i0 = false;
        this.j0 = true;
        this.k0 = -1;
        this.l0 = new f();
        i iVar = new i(context);
        this.b0 = iVar;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        iVar.setId(View.generateViewId());
        this.b0.setDescendantFocusability(131072);
        d dVar = new d();
        this.V = dVar;
        this.b0.setLayoutManager(dVar);
        this.b0.setScrollingTouchSlop(1);
        int[] iArr = jac.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        epg.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.b0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.b0;
            nrg nrgVar = new nrg();
            if (iVar2.v0 == null) {
                iVar2.v0 = new ArrayList();
            }
            iVar2.v0.add(nrgVar);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.d0 = cVar;
            this.f0 = new wm2(cVar);
            h hVar = new h();
            this.c0 = hVar;
            hVar.a(this.b0);
            this.b0.j(this.d0);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.e0 = aVar2;
            this.d0.a = aVar2;
            androidx.viewpager2.widget.d dVar2 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.e0.a.add(dVar2);
            this.e0.a.add(eVar);
            f fVar = this.l0;
            i iVar3 = this.b0;
            fVar.getClass();
            iVar3.setImportantForAccessibility(2);
            fVar.c = new androidx.viewpager2.widget.f(fVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.e0.a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b();
            this.g0 = bVar;
            this.e0.a.add(bVar);
            i iVar4 = this.b0;
            attachViewToParent(iVar4, 0, iVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        RecyclerView.e adapter;
        if (this.W == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.a0;
        if (parcelable != null) {
            if (adapter instanceof wse) {
                ((wse) adapter).b(parcelable);
            }
            this.a0 = null;
        }
        int iMax = Math.max(0, Math.min(this.W, adapter.c() - 1));
        this.d = iMax;
        this.W = -1;
        this.b0.g0(iMax);
        this.l0.a();
    }

    public final void b(int i2, boolean z) {
        Object obj = this.f0.a;
        c(i2, z);
    }

    public final void c(int i2, boolean z) {
        androidx.viewpager2.widget.a aVar;
        RecyclerView.e adapter = getAdapter();
        if (adapter == null) {
            if (this.W != -1) {
                this.W = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.c() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.c() - 1);
        int i3 = this.d;
        androidx.viewpager2.widget.c cVar = this.d0;
        if (iMin == i3 && cVar.f == 0) {
            return;
        }
        if (iMin == i3 && z) {
            return;
        }
        double d2 = i3;
        this.d = iMin;
        this.l0.a();
        if (cVar.f != 0) {
            cVar.e();
            c.a aVar2 = cVar.g;
            d2 = ((double) aVar2.a) + ((double) aVar2.b);
        }
        cVar.getClass();
        cVar.e = z ? 2 : 3;
        boolean z2 = cVar.i != iMin;
        cVar.i = iMin;
        cVar.c(2);
        if (z2 && (aVar = cVar.a) != null) {
            aVar.c(iMin);
        }
        i iVar = this.b0;
        if (!z) {
            iVar.g0(iMin);
            return;
        }
        double d3 = iMin;
        if (Math.abs(d3 - d2) <= 3.0d) {
            iVar.j0(iMin);
        } else {
            iVar.g0(d3 > d2 ? iMin - 3 : iMin + 3);
            iVar.post(new j(iMin, iVar));
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.b0.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.b0.canScrollVertically(i2);
    }

    public final void d() {
        h hVar = this.c0;
        if (hVar == null) {
            r6.g("Design assumption violated.");
            return;
        }
        d dVar = this.V;
        View viewC = hVar.c(dVar);
        if (viewC == null) {
            return;
        }
        dVar.getClass();
        int iE = RecyclerView.m.E(viewC);
        if (iE != this.d && getScrollState() == 0) {
            this.e0.c(iE);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).a;
            sparseArray.put(this.b0.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.l0.getClass();
        this.l0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.b0.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.b0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.k0;
    }

    public int getOrientation() {
        return this.V.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        int orientation = getOrientation();
        i iVar = this.b0;
        if (orientation == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.d0.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iC;
        int iC2;
        int iC3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            iC = 0;
            iC2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iC = viewPager2.getAdapter().c();
            iC2 = 1;
        } else {
            iC2 = viewPager2.getAdapter().c();
            iC = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(iC, iC2, 0).a);
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter == null || (iC3 = adapter.c()) == 0 || !viewPager2.j0) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < iC3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        i iVar = this.b0;
        int measuredWidth = iVar.getMeasuredWidth();
        int measuredHeight = iVar.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        iVar.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.b0, i2, i3);
        int measuredWidth = this.b0.getMeasuredWidth();
        int measuredHeight = this.b0.getMeasuredHeight();
        int measuredState = this.b0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.W = savedState.b;
        this.a0 = savedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.b0;
        savedState.a = iVar.getId();
        int i2 = this.W;
        if (i2 == -1) {
            i2 = this.d;
        }
        savedState.b = i2;
        Parcelable parcelable = this.a0;
        if (parcelable != null) {
            savedState.c = parcelable;
            return savedState;
        }
        Object adapter = iVar.getAdapter();
        if (adapter instanceof wse) {
            savedState.c = ((wse) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        f fVar = this.l0;
        fVar.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        fVar.getClass();
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i2 != 8192 && i2 != 4096) {
            bg.h();
            return false;
        }
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.j0) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.e eVar) {
        i iVar = this.b0;
        RecyclerView.e adapter = iVar.getAdapter();
        f fVar = this.l0;
        if (adapter != null) {
            adapter.a.unregisterObserver(fVar.c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f;
        if (adapter != null) {
            adapter.a.unregisterObserver(aVar);
        }
        iVar.setAdapter(eVar);
        this.d = 0;
        a();
        fVar.a();
        if (eVar != null) {
            eVar.a.registerObserver(fVar.c);
        }
        if (eVar != null) {
            eVar.a.registerObserver(aVar);
        }
    }

    public void setCurrentItem(int i2) {
        b(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.l0.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            l5.q("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.k0 = i2;
            this.b0.requestLayout();
        }
    }

    public void setOrientation(int i2) {
        this.V.Z0(i2);
        this.l0.a();
    }

    public void setPageTransformer(g gVar) {
        boolean z = this.i0;
        if (gVar != null) {
            if (!z) {
                this.h0 = this.b0.getItemAnimator();
                this.i0 = true;
            }
            this.b0.setItemAnimator(null);
        } else if (z) {
            this.b0.setItemAnimator(this.h0);
            this.h0 = null;
            this.i0 = false;
        }
        this.g0.getClass();
        if (gVar == null) {
            return;
        }
        this.g0.getClass();
        this.g0.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.j0 = z;
        this.l0.a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public Parcelable c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }
}
