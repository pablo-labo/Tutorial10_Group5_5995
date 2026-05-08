package defpackage;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class hkc extends DrawerLayout {
    public int x0;
    public int y0;
    public boolean z0;

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            web.t(this, motionEvent);
            this.z0 = true;
            return true;
        } catch (IllegalArgumentException e) {
            s55.o("ReactNative", "Error intercepting touch event.", e);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 1 && this.z0) {
            web.s(this, motionEvent);
            this.z0 = false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    public final void q() {
        int i = this.x0;
        View viewD = d(i);
        if (viewD != null) {
            b(viewD);
        } else {
            bg.m(DrawerLayout.h(i), "No drawer view found with gravity ");
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void r() {
        int i = this.x0;
        View viewD = d(i);
        if (viewD != null) {
            l(viewD);
        } else {
            bg.m(DrawerLayout.h(i), "No drawer view found with gravity ");
        }
    }

    public final void s() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            DrawerLayout.e eVar = (DrawerLayout.e) layoutParams;
            eVar.a = this.x0;
            ((ViewGroup.MarginLayoutParams) eVar).width = this.y0;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    public final void setDrawerPosition$ReactAndroid_release(int i) {
        this.x0 = i;
        s();
    }

    public final void setDrawerWidth$ReactAndroid_release(int i) {
        this.y0 = i;
        s();
    }
}
