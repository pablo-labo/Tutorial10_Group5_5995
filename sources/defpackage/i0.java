package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends ViewGroup {
    public boolean V;
    public boolean W;
    public final a a;
    public final Context b;
    public ActionMenuView c;
    public ActionMenuPresenter d;
    public int e;
    public prg f;

    public class a implements rrg {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // defpackage.rrg
        public final void a() {
            this.a = true;
        }

        @Override // defpackage.rrg
        public final void b() {
            i0.super.setVisibility(0);
            this.a = false;
        }

        @Override // defpackage.rrg
        public final void c() {
            if (this.a) {
                return;
            }
            i0 i0Var = i0.this;
            i0Var.f = null;
            i0.super.setVisibility(this.b);
        }
    }

    public i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final prg e(int i, long j) {
        prg prgVar = this.f;
        if (prgVar != null) {
            prgVar.b();
        }
        a aVar = this.a;
        if (i != 0) {
            prg prgVarA = epg.a(this);
            prgVarA.a(0.0f);
            prgVarA.c(j);
            i0.this.f = prgVarA;
            aVar.b = i;
            prgVarA.d(aVar);
            return prgVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        prg prgVarA2 = epg.a(this);
        prgVarA2.a(1.0f);
        prgVarA2.c(j);
        i0.this.f = prgVarA2;
        aVar.b = i;
        prgVarA2.d(aVar);
        return prgVarA2;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, wac.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            actionMenuPresenter.f0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            f fVar = actionMenuPresenter.c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.W = false;
        }
        if (!this.W) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.W = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.W = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = false;
        }
        if (!this.V) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.V = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.V = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            prg prgVar = this.f;
            if (prgVar != null) {
                prgVar.b();
            }
            super.setVisibility(i);
        }
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
