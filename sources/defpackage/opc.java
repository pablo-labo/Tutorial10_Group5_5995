package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.text.a;
import defpackage.cj1;
import defpackage.fxa;

/* JADX INFO: loaded from: classes2.dex */
public final class opc extends AppCompatTextView implements yjc {
    public static final ViewGroup.LayoutParams e0 = new ViewGroup.LayoutParams(0, 0);
    public float V;
    public int W;
    public boolean a;
    public boolean a0;
    public int b;
    public boolean b0;
    public TextUtils.TruncateAt c;
    public fxa c0;
    public boolean d;
    public Spannable d0;
    public float e;
    public float f;

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof rmf ? (ReactContext) ((rmf) context).getBaseContext() : (ReactContext) context;
    }

    public final void d() {
        if (!Float.isNaN(this.e)) {
            setTextSize(0, this.e);
        }
        if (Float.isNaN(this.V)) {
            return;
        }
        super.setLetterSpacing(this.V);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (epg.e(this) != null) {
            y5 y5VarD = epg.d(this);
            if (y5VarD instanceof w35) {
                return ((w35) y5VarD).l(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        y5 y5VarD = epg.d(this);
        return (y5VarD != null && getMovementMethod() == null && (y5VarD instanceof a) && ((a) y5VarD).m(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        this.b = Integer.MAX_VALUE;
        this.d = false;
        this.W = 0;
        this.a0 = false;
        this.b0 = false;
        this.c = TextUtils.TruncateAt.END;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.V = 0.0f;
        this.c0 = fxa.b;
        this.d0 = null;
    }

    public final void f() {
        e();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (getBackground() instanceof tl2) {
            Drawable background = getBackground();
            background.getClass();
            setBackground(((tl2) background).b);
        }
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        setJustificationMode(0);
        setLayoutParams(e0);
        TextUtils.TruncateAt truncateAt = null;
        setText((CharSequence) null);
        d();
        setGravity(8388659);
        setNumberOfLines(this.b);
        setAdjustFontSizeToFit(this.d);
        setLinkifyMask(this.W);
        setTextIsSelectable(this.a0);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.c);
        setEnabled(true);
        setFocusable(16);
        setHyphenationFrequency(0);
        if (this.b != Integer.MAX_VALUE && !this.d) {
            truncateAt = this.c;
        }
        setEllipsize(truncateAt);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.d0;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                if (phfVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a0) {
            setTextIsSelectable(false);
            setTextIsSelectable(true);
        } else {
            setTextIsSelectable(false);
        }
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                phfVar.c();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                phfVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Trace.beginSection(jpf.g("ReactTextView.onDraw"));
        try {
            Spannable spanned = getSpanned();
            if (this.d && spanned != null && this.b0) {
                this.b0 = false;
                lif.a(spanned, getWidth(), getHeight(), m6h.EXACTLY, this.f, this.b, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, getJustificationMode(), getPaint());
                setText(spanned);
            }
            if (this.c0 != fxa.b) {
                v71.a(this, canvas);
            }
            super.onDraw(canvas);
            Trace.endSection();
        } finally {
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                phfVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        y5 y5VarD = epg.d(this);
        if (y5VarD != null && (y5VarD instanceof a) && getMovementMethod() == null) {
            ((a) y5VarD).r(z, i, rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opc.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Trace.beginSection(jpf.g("ReactTextView.onMeasure"));
        try {
            super.onMeasure(i, i2);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                phfVar.f();
            }
        }
    }

    @Override // defpackage.yjc
    public final int reactTagForTouch(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i3);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                    xoc[] xocVarArr = (xoc[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, xoc.class);
                    if (xocVarArr != null) {
                        int length = text.length();
                        for (int i4 = 0; i4 < xocVarArr.length; i4++) {
                            int spanStart = spanned.getSpanStart(xocVarArr[i4]);
                            int spanEnd = spanned.getSpanEnd(xocVarArr[i4]);
                            if (spanEnd >= offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                                id = xocVarArr[i4].a;
                                length = i;
                            }
                        }
                        return id;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    s55.f("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
                }
            }
        }
        return id;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        v71.j(this, Integer.valueOf(i));
    }

    public void setBorderRadius(float f) {
        v71.m(this, zi1.values()[0], Float.isNaN(f) ? null : new ou8(nn2.C(f), pu8.a));
    }

    public void setBorderStyle(String str) {
        cj1 cj1VarA;
        if (str == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(str);
        }
        v71.n(this, cj1VarA);
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i) {
        super.setBreakStrategy(i);
        this.b0 = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.c = truncateAt;
    }

    public void setFontSize(float f) {
        this.e = (float) (this.d ? Math.ceil(nn2.H(f, Float.NaN)) : Math.ceil(nn2.G(f)));
        d();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = 8388611;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = 48;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i) {
        super.setHyphenationFrequency(i);
        this.b0 = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z) {
        super.setIncludeFontPadding(z);
        this.b0 = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.V = nn2.G(f) / this.e;
        d();
    }

    public void setLinkifyMask(int i) {
        this.W = i;
    }

    public void setMinimumFontSize(float f) {
        this.f = f;
        this.b0 = true;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.b = i;
        setMaxLines(i);
        this.b0 = true;
    }

    public void setOverflow(String str) {
        fxa fxaVar = fxa.b;
        if (str == null) {
            this.c0 = fxaVar;
        } else {
            fxa.a.getClass();
            fxa fxaVarA = fxa.a.a(str);
            if (fxaVarA != null) {
                fxaVar = fxaVarA;
            }
            this.c0 = fxaVar;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.d0 = spannable;
        this.b0 = true;
    }

    public void setText(npc npcVar) {
        Trace.beginSection(jpf.g("ReactTextView.setText(ReactTextUpdate)"));
        try {
            this.a = npcVar.c;
            if (getLayoutParams() == null) {
                setLayoutParams(e0);
            }
            Spannable spannable = npcVar.a;
            int i = this.W;
            if (i > 0) {
                Linkify.addLinks(spannable, i);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(spannable);
            float f = npcVar.d;
            float f2 = npcVar.e;
            float f3 = npcVar.f;
            float f4 = npcVar.g;
            if (f != -1.0f && f2 != -1.0f && f3 != -1.0f && f4 != -1.0f) {
                setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
            }
            int i2 = npcVar.h;
            if (i2 != getGravityHorizontal()) {
                setGravityHorizontal(i2);
            }
            int breakStrategy = getBreakStrategy();
            int i3 = npcVar.i;
            if (breakStrategy != i3) {
                setBreakStrategy(i3);
            }
            int justificationMode = getJustificationMode();
            int i4 = npcVar.j;
            if (justificationMode != i4) {
                setJustificationMode(i4);
            }
            requestLayout();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        this.a0 = z;
        super.setTextIsSelectable(z);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (phf phfVar : (phf[]) spanned.getSpans(0, spanned.length(), phf.class)) {
                if (phfVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
