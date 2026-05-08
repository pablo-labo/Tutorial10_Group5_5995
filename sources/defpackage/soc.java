package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class soc extends SwipeRefreshLayout {
    public boolean E0;
    public boolean F0;
    public float G0;
    public final int H0;
    public float I0;
    public boolean J0;
    public boolean K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soc(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        this.H0 = ViewConfiguration.get(mkfVar).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean a() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.a();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.I0 = motionEvent.getX();
            this.J0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.I0);
            if (this.J0 || fAbs > this.H0) {
                this.J0 = true;
                return false;
            }
        }
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        web.t(this, motionEvent);
        this.K0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.E0) {
            return;
        }
        this.E0 = true;
        setProgressViewOffset(this.G0);
        setRefreshing(this.F0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 1 && this.K0) {
            web.s(this, motionEvent);
            this.K0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setProgressViewOffset(float f) {
        this.G0 = f;
        if (this.E0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            int iRound = Math.round(nn2.G(f)) - progressCircleDiameter;
            int iRound2 = Math.round(nn2.G(f + 64.0f)) - progressCircleDiameter;
            this.o0 = iRound;
            this.p0 = iRound2;
            this.y0 = true;
            f();
            this.c = false;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.F0 = z;
        if (this.E0) {
            super.setRefreshing(z);
        }
    }
}
