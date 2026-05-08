package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 extends SeekBar {
    public final ak0 a;

    public zj0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        lkf.a(this, getContext());
        ak0 ak0Var = new ak0(this);
        this.a = ak0Var;
        ak0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ak0 ak0Var = this.a;
        zj0 zj0Var = ak0Var.d;
        Drawable drawable = ak0Var.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(zj0Var.getDrawableState())) {
            zj0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.d(canvas);
    }
}
