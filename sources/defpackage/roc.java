package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class roc extends wnc {
    public final qoc l0;
    public final ot7 m0;
    public final yo7 n0;
    public boolean o0;
    public int p0;
    public int q0;

    public roc(Context context, qoc qocVar) {
        super(context);
        this.l0 = qocVar;
        this.m0 = new ot7(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.n0 = new yo7(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // defpackage.wnc, defpackage.qfd
    public final void b(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcher;
        yo7 yo7Var;
        motionEvent.getClass();
        ReactHostImpl reactHostImplD = this.l0.d();
        if (reactHostImplD != null) {
            ReactInstance reactInstance = reactHostImplD.l;
            if (reactInstance != null) {
                eventDispatcher = reactInstance.f.getEventDispatcher();
                eventDispatcher.getClass();
            } else {
                eventDispatcher = c0h.V;
            }
        } else {
            eventDispatcher = null;
        }
        if (eventDispatcher == null) {
            return;
        }
        this.m0.c(motionEvent, eventDispatcher);
        if (view == null || (yo7Var = this.n0) == null) {
            return;
        }
        yo7Var.g(view, motionEvent, eventDispatcher);
    }

    @Override // defpackage.wnc, defpackage.qfd
    public final void e(ViewGroup viewGroup, MotionEvent motionEvent) {
        EventDispatcher eventDispatcher;
        ReactHostImpl reactHostImplD = this.l0.d();
        if (reactHostImplD != null) {
            ReactInstance reactInstance = reactHostImplD.l;
            if (reactInstance != null) {
                eventDispatcher = reactInstance.f.getEventDispatcher();
                eventDispatcher.getClass();
            } else {
                eventDispatcher = c0h.V;
            }
        } else {
            eventDispatcher = null;
        }
        if (eventDispatcher == null) {
            return;
        }
        ot7 ot7Var = this.m0;
        ot7Var.getClass();
        ot7Var.d = false;
        yo7 yo7Var = this.n0;
        if (yo7Var != null) {
            yo7Var.e = -1;
        }
    }

    @Override // defpackage.wnc
    public final void f(MotionEvent motionEvent, boolean z) {
        EventDispatcher eventDispatcher;
        motionEvent.getClass();
        yo7 yo7Var = this.n0;
        if (yo7Var == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                s55.n("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        ReactHostImpl reactHostImplD = this.l0.d();
        if (reactHostImplD != null) {
            ReactInstance reactInstance = reactHostImplD.l;
            if (reactInstance != null) {
                eventDispatcher = reactInstance.f.getEventDispatcher();
                eventDispatcher.getClass();
            } else {
                eventDispatcher = c0h.V;
            }
        } else {
            eventDispatcher = null;
        }
        if (eventDispatcher != null) {
            yo7Var.d(motionEvent, eventDispatcher, z);
        } else {
            s55.n("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
        }
    }

    @Override // defpackage.wnc
    public final void g(MotionEvent motionEvent) {
        EventDispatcher eventDispatcher;
        motionEvent.getClass();
        qoc qocVar = this.l0;
        ReactHostImpl reactHostImplD = qocVar.d();
        if (reactHostImplD != null) {
            ReactInstance reactInstance = reactHostImplD.l;
            if (reactInstance != null) {
                eventDispatcher = reactInstance.f.getEventDispatcher();
                eventDispatcher.getClass();
            } else {
                eventDispatcher = c0h.V;
            }
        } else {
            eventDispatcher = null;
        }
        if (eventDispatcher == null) {
            s55.n("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        } else {
            ReactHostImpl reactHostImplD2 = qocVar.d();
            this.m0.b(motionEvent, eventDispatcher, reactHostImplD2 != null ? reactHostImplD2.a() : null);
        }
    }

    @Override // defpackage.wnc
    public ReactContext getCurrentReactContext() {
        ReactHostImpl reactHostImplD;
        qoc qocVar = this.l0;
        if (qocVar.d() == null || (reactHostImplD = qocVar.d()) == null) {
            return null;
        }
        return reactHostImplD.a();
    }

    @Override // defpackage.wnc, defpackage.vnc
    public String getJSModuleName() {
        return this.l0.a.b();
    }

    @Override // defpackage.wnc, defpackage.vnc
    public int getUIManagerType() {
        return 2;
    }

    @Override // defpackage.wnc
    public final void h(StackOverflowError stackOverflowError) {
        String string = Objects.toString(stackOverflowError.getMessage(), "");
        string.getClass();
        IllegalViewOperationException illegalViewOperationException = new IllegalViewOperationException(string, this, stackOverflowError);
        ReactHostImpl reactHostImplD = this.l0.d();
        if (reactHostImplD == null) {
            throw illegalViewOperationException;
        }
        reactHostImplD.r(illegalViewOperationException);
    }

    @Override // defpackage.wnc
    public final boolean i() {
        qoc qocVar = this.l0;
        if (qocVar.d() == null) {
            return false;
        }
        ReactHostImpl reactHostImplD = qocVar.d();
        return (reactHostImplD != null ? reactHostImplD.a() : null) != null;
    }

    @Override // defpackage.wnc
    public final boolean j() {
        ReactHostImpl reactHostImplD;
        qoc qocVar = this.l0;
        return (qocVar.d() == null || (reactHostImplD = qocVar.d()) == null || reactHostImplD.l == null) ? false : true;
    }

    @Override // defpackage.wnc
    public final boolean l() {
        return this.l0.d() != null;
    }

    @Override // defpackage.wnc, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.o0 && z) {
            Point viewportOffset = getViewportOffset();
            this.l0.e(this.p0, this.q0, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // defpackage.wnc, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        Trace.beginSection(jpf.g("ReactSurfaceView.onMeasure"));
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                iMax = Math.max(iMax, childAt.getPaddingRight() + childAt.getPaddingLeft() + childAt.getMeasuredWidth() + childAt.getLeft());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                iMax2 = Math.max(iMax2, childAt2.getPaddingBottom() + childAt2.getPaddingTop() + childAt2.getMeasuredHeight() + childAt2.getTop());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, size2);
        this.o0 = true;
        this.p0 = i;
        this.q0 = i2;
        Point viewportOffset = getViewportOffset();
        this.l0.e(i, i2, viewportOffset.x, viewportOffset.y);
        Trace.endSection();
    }

    @Override // defpackage.wnc, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // defpackage.wnc
    public void setIsFabric(boolean z) {
        super.setIsFabric(true);
    }
}
