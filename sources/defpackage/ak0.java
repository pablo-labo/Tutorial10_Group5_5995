package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class ak0 extends vj0 {
    public final zj0 d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public ak0(zj0 zj0Var) {
        super(zj0Var);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = zj0Var;
    }

    @Override // defpackage.vj0
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        zj0 zj0Var = this.d;
        Context context = zj0Var.getContext();
        int[] iArr = wac.g;
        umf umfVarE = umf.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = umfVarE.b;
        epg.n(zj0Var, zj0Var.getContext(), iArr, attributeSet, umfVarE.b, R.attr.seekBarStyle);
        Drawable drawableC = umfVarE.c(0);
        if (drawableC != null) {
            zj0Var.setThumb(drawableC);
        }
        Drawable drawableB = umfVarE.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(zj0Var);
            drawableB.setLayoutDirection(zj0Var.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(zj0Var.getDrawableState());
            }
            c();
        }
        zj0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = ac4.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = umfVarE.a(2);
            this.h = true;
        }
        umfVarE.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
