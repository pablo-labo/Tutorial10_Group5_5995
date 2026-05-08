package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.br3;
import defpackage.gg2;
import defpackage.ka2;
import defpackage.sac;
import defpackage.vjg;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View implements e {
    public long A0;
    public long B0;
    public long C0;
    public long D0;
    public int E0;
    public long[] F0;
    public boolean[] G0;
    public final Paint V;
    public final Paint W;
    public final Rect a;
    public final Paint a0;
    public final Rect b;
    public final Paint b0;
    public final Rect c;
    public final Drawable c0;
    public final Rect d;
    public final int d0;
    public final Paint e;
    public final int e0;
    public final Paint f;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public final int k0;
    public final int l0;
    public final StringBuilder m0;
    public final Formatter n0;
    public final gg2 o0;
    public final CopyOnWriteArraySet<e.a> p0;
    public final Point q0;
    public final float r0;
    public int s0;
    public long t0;
    public int u0;
    public Rect v0;
    public final ValueAnimator w0;
    public float x0;
    public boolean y0;
    public boolean z0;

    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.V = paint3;
        Paint paint4 = new Paint();
        this.W = paint4;
        Paint paint5 = new Paint();
        this.a0 = paint5;
        Paint paint6 = new Paint();
        this.b0 = paint6;
        paint6.setAntiAlias(true);
        this.p0 = new CopyOnWriteArraySet<>();
        this.q0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.r0 = f;
        this.l0 = c(f, -50);
        int iC = c(f, 4);
        int iC2 = c(f, 26);
        int iC3 = c(f, 4);
        int iC4 = c(f, 12);
        int iC5 = c(f, 0);
        int iC6 = c(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sac.b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.c0 = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iC2 = Math.max(drawable.getMinimumHeight(), iC2);
                }
                this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iC);
                this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iC2);
                this.f0 = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iC3);
                this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iC4);
                this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iC5);
                this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iC6);
                int i = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i4 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i5 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.d0 = iC;
            this.e0 = iC2;
            this.f0 = 0;
            this.g0 = iC3;
            this.h0 = iC4;
            this.i0 = iC5;
            this.j0 = iC6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.c0 = null;
        }
        StringBuilder sb = new StringBuilder();
        this.m0 = sb;
        this.n0 = new Formatter(sb, Locale.getDefault());
        this.o0 = new gg2(this, 1);
        Drawable drawable2 = this.c0;
        if (drawable2 != null) {
            this.k0 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.k0 = (Math.max(this.i0, Math.max(this.h0, this.j0)) + 1) / 2;
        }
        this.x0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.w0 = valueAnimator;
        valueAnimator.addUpdateListener(new br3(this, 0));
        this.B0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.s0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.t0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.B0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.s0);
    }

    private String getProgressText() {
        return vjg.D(this.m0, this.n0, this.C0);
    }

    private long getScrubberPosition() {
        Rect rect = this.b;
        if (rect.width() <= 0 || this.B0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.B0) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.e
    public final void a(e.a aVar) {
        aVar.getClass();
        this.p0.add(aVar);
    }

    @Override // androidx.media3.ui.e
    public final void b(long[] jArr, boolean[] zArr, int i) {
        ka2.l(i == 0 || !(jArr == null || zArr == null));
        this.E0 = i;
        this.F0 = jArr;
        this.G0 = zArr;
        g();
    }

    public final boolean d(long j) {
        long j2 = this.B0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.z0 ? this.A0 : this.C0;
        long j4 = vjg.j(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (this.z0) {
            h(j4);
        } else {
            e(j4);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.A0 = j;
        this.z0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e.a> it = this.p0.iterator();
        while (it.hasNext()) {
            it.next().x(j);
        }
    }

    public final void f(boolean z) {
        removeCallbacks(this.o0);
        this.z0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.p0.iterator();
        while (it.hasNext()) {
            it.next().F(this.A0, z);
        }
    }

    public final void g() {
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        long j = this.z0 ? this.A0 : this.C0;
        if (this.B0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.D0) / this.B0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.B0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.e
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.b.width() / this.r0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.B0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    public final void h(long j) {
        if (this.A0 == j) {
            return;
        }
        this.A0 = j;
        Iterator<e.a> it = this.p0.iterator();
        while (it.hasNext()) {
            it.next().C(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.c0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.B0;
        Paint paint = this.V;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.c;
            int i2 = rect3.left;
            int i3 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i3), rect2.right);
            int i4 = rect.right;
            if (iMax < i4) {
                canvas.drawRect(iMax, iCenterY, i4, i, paint);
            }
            int iMax2 = Math.max(i2, rect2.right);
            if (i3 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i3, i, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.e);
            }
            if (this.E0 != 0) {
                long[] jArr = this.F0;
                jArr.getClass();
                boolean[] zArr = this.G0;
                zArr.getClass();
                int i5 = this.g0;
                int i6 = i5 / 2;
                int i7 = 0;
                int i8 = 0;
                while (i8 < this.E0) {
                    int i9 = i8;
                    canvas.drawRect(Math.min(rect.width() - i5, Math.max(i7, ((int) ((((long) rect.width()) * vjg.j(jArr[i8], 0L, this.B0)) / this.B0)) - i6)) + rect.left, iCenterY, r3 + i5, i, zArr[i8] ? this.a0 : this.W);
                    i8 = i9 + 1;
                    i7 = i7;
                }
            }
            canvas2 = canvas;
        }
        if (this.B0 > 0) {
            int i10 = vjg.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.c0;
            if (drawable == null) {
                canvas2.drawCircle(i10, iCenterY2, (int) ((((this.z0 || isFocused()) ? this.j0 : isEnabled() ? this.h0 : this.i0) * this.x0) / 2.0f), this.b0);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.x0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.x0)) / 2;
                drawable.setBounds(i10 - intrinsicWidth, iCenterY2 - intrinsicHeight, i10 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.z0 || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.B0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.d(r0)
            if (r0 == 0) goto L2e
            gg2 r5 = r4.o0
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.z0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.f(r5)
            return r3
        L2e:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.y0 ? 0 : this.k0;
        int i8 = this.f0;
        int i9 = this.d0;
        int i10 = this.e0;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.v0) == null || rect.width() != i5 || this.v0.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.v0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.e0;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.c0;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.c0;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.B0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.q0
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.b
            android.graphics.Rect r5 = r9.d
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.z0
            if (r10 == 0) goto La1
            int r10 = r9.l0
            if (r2 >= r10) goto L52
            int r10 = r9.u0
            int r0 = r0 - r10
            int r0 = r0 / r7
            int r0 = r0 + r10
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.vjg.i(r10, r0, r1)
            r5.right = r10
            goto L60
        L52:
            r9.u0 = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.vjg.i(r10, r0, r1)
            r5.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.h(r0)
            r9.g()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.z0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.f(r1)
            return r6
        L7d:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r4.left
            int r1 = r4.right
            int r10 = defpackage.vjg.i(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.e(r0)
            r9.g()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.B0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.W.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.e
    public void setBufferedPosition(long j) {
        if (this.D0 == j) {
            return;
        }
        this.D0 = j;
        g();
    }

    @Override // androidx.media3.ui.e
    public void setDuration(long j) {
        if (this.B0 == j) {
            return;
        }
        this.B0 = j;
        if (this.z0 && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.e
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.z0 || z) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i) {
        ka2.l(i > 0);
        this.s0 = i;
        this.t0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        ka2.l(j > 0);
        this.s0 = -1;
        this.t0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.a0.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    @Override // androidx.media3.ui.e
    public void setPosition(long j) {
        if (this.C0 == j) {
            return;
        }
        this.C0 = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i) {
        this.b0.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.V.setColor(i);
        invalidate(this.a);
    }
}
