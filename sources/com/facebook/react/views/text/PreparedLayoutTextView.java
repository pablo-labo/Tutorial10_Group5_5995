package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import defpackage.epg;
import defpackage.f84;
import defpackage.fxa;
import defpackage.gf9;
import defpackage.pq3;
import defpackage.r6;
import defpackage.s6;
import defpackage.uz;
import defpackage.v71;
import defpackage.xoc;
import defpackage.y5;
import defpackage.yjc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002 !R.\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Landroid/view/ViewGroup;", "Lyjc;", "Lcom/facebook/react/views/text/PreparedLayout;", "value", "c", "Lcom/facebook/react/views/text/PreparedLayout;", "getPreparedLayout", "()Lcom/facebook/react/views/text/PreparedLayout;", "setPreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;)V", "preparedLayout", "Lfxa;", "d", "Lfxa;", "getOverflow", "()Lfxa;", "setOverflow", "(Lfxa;)V", "overflow", "", "e", "Ljava/lang/Integer;", "getSelectionColor", "()Ljava/lang/Integer;", "setSelectionColor", "(Ljava/lang/Integer;)V", "selectionColor", "", "getText", "()Ljava/lang/CharSequence;", "text", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class PreparedLayoutTextView extends ViewGroup implements yjc {
    public static final Paint f = new Paint();
    public List<? extends ClickableSpan> a;
    public b b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public PreparedLayout preparedLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public fxa overflow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Integer selectionColor;

    public static final class a {
        public static final a a = new a();
        public static ArrayList b;
        public static ArrayList c;

        public final void a(Layout layout, Canvas canvas, Path path, Paint paint) {
            layout.getClass();
            canvas.getClass();
            if (path != null) {
                if (b == null) {
                    b = new ArrayList();
                }
                if (c == null) {
                    c = new ArrayList();
                }
            }
            layout.draw(canvas, b, c, path, paint, 0);
        }
    }

    public static final class b {
        public int a;
        public int b;
        public Path c;
    }

    public final void a() {
        this.b = null;
        invalidate();
    }

    public final <T> T b(int i, int i2, Class<T> cls) {
        float paragraphRight;
        float lineLeft;
        int paddingLeft = i - getPaddingLeft();
        int paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        int i3 = 0;
        int iB = i2 - (paddingTop + (preparedLayout != null ? gf9.b(preparedLayout.c) : 0));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        int offsetForHorizontal = -1;
        if (preparedLayout2 != null) {
            Layout layout = preparedLayout2.a;
            int lineForVertical = layout.getLineForVertical(iB);
            if (layout.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                lineLeft = layout.getLineLeft(lineForVertical);
                paragraphRight = layout.getLineRight(lineForVertical);
            } else {
                boolean z = layout.getParagraphDirection(lineForVertical) == -1;
                float width = z ? layout.getWidth() - layout.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
                paragraphRight = z ? layout.getParagraphRight(lineForVertical) : layout.getLineMax(lineForVertical);
                lineLeft = width;
            }
            float f2 = paddingLeft;
            if (f2 >= lineLeft && f2 <= paragraphRight) {
                try {
                    offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        if (offsetForHorizontal >= 0) {
            CharSequence text = getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls);
                spans.getClass();
                if (spans.length != 0) {
                    if (spans.length > 2) {
                        r6.g("Check failed.");
                        return null;
                    }
                    while (i3 < spans.length) {
                        int i4 = i3 + 1;
                        try {
                            T t = (T) spans[i3];
                            int spanFlags = spanned.getSpanFlags(t);
                            int i5 = spanFlags & 18;
                            int spanStart = (i5 == 0 && (spanFlags & 17) == 0) ? spanned.getSpanStart(t) + 1 : spanned.getSpanStart(t);
                            int spanEnd = (i5 == 0 && (spanFlags & 34) == 0) ? spanned.getSpanEnd(t) - 1 : spanned.getSpanEnd(t);
                            if (offsetForHorizontal >= spanStart && offsetForHorizontal <= spanEnd) {
                                return t;
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            s6.j(e.getMessage());
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void c(int i, int i2) {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            r6.g("Required value was null.");
            return;
        }
        Layout layout = preparedLayout.a;
        if (i < 0 || i2 > layout.getText().length() || i >= i2) {
            int length = layout.getText().length();
            StringBuilder sbF = uz.f("setSelection start and end are not in valid range. start: ", i, ", end: ", i2, ", text length: ");
            sbF.append(length);
            throw new IllegalArgumentException(sbF.toString());
        }
        b bVar = this.b;
        if (bVar == null) {
            Path path = new Path();
            layout.getSelectionPath(i, i2, path);
            b bVar2 = new b();
            bVar2.a = i;
            bVar2.b = i2;
            bVar2.c = path;
            this.b = bVar2;
        } else {
            bVar.a = i;
            bVar.b = i2;
            layout.getSelectionPath(i, i2, bVar.c);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        y5 y5VarD = epg.d(this);
        return ((y5VarD instanceof com.facebook.react.views.text.a) && ((com.facebook.react.views.text.a) y5VarD).m(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final fxa getOverflow() {
        return this.overflow;
    }

    public final PreparedLayout getPreparedLayout() {
        return this.preparedLayout;
    }

    public final Integer getSelectionColor() {
        return this.selectionColor;
    }

    @f84
    public final CharSequence getText() {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout != null) {
            return preparedLayout.a.getText();
        }
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        canvas.getClass();
        if (this.overflow != fxa.b) {
            v71.a(this, canvas);
        }
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        canvas.translate(paddingLeft, paddingTop + (preparedLayout != null ? preparedLayout.c : 0.0f));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        Layout layout = preparedLayout2 != null ? preparedLayout2.a : null;
        if (layout != null) {
            b bVar = this.b;
            Paint paint = f;
            if (bVar != null) {
                Integer num = this.selectionColor;
                if (num != null) {
                    iA = num.intValue();
                } else {
                    Context context = getContext();
                    context.getClass();
                    iA = pq3.a(context);
                }
                paint.setColor(iA);
            }
            int i = Build.VERSION.SDK_INT;
            b bVar2 = this.b;
            if (i >= 34) {
                a.a.a(layout, canvas, bVar2 != null ? bVar2.c : null, paint);
            } else {
                layout.draw(canvas, bVar2 != null ? bVar2.c : null, paint, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!this.a.isEmpty() && !z) {
            a();
        }
        super.onFocusChanged(z, i, rect);
        y5 y5VarD = epg.d(this);
        if (y5VarD == null || !(y5VarD instanceof com.facebook.react.views.text.a)) {
            return;
        }
        ((com.facebook.react.views.text.a) y5VarD).r(z, i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!isEnabled() || this.a.isEmpty()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            a();
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) b((int) motionEvent.getX(), (int) motionEvent.getY(), ClickableSpan.class);
        if (clickableSpan == null) {
            a();
            return super.onTouchEvent(motionEvent);
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                return true;
            }
            a();
            clickableSpan.onClick(this);
            return true;
        }
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            r6.g("Required value was null.");
            return false;
        }
        Layout layout = preparedLayout.a;
        CharSequence text = layout.getText();
        text.getClass();
        int spanStart = ((Spanned) text).getSpanStart(clickableSpan);
        CharSequence text2 = layout.getText();
        text2.getClass();
        c(spanStart, ((Spanned) text2).getSpanEnd(clickableSpan));
        return true;
    }

    @Override // defpackage.yjc
    public final int reactTagForTouch(float f2, float f3) {
        xoc xocVar = (xoc) b(gf9.b(f2), gf9.b(f3), xoc.class);
        return xocVar != null ? xocVar.a : getId();
    }

    public final void setOverflow(fxa fxaVar) {
        fxaVar.getClass();
        if (this.overflow != fxaVar) {
            this.overflow = fxaVar;
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPreparedLayout(com.facebook.react.views.text.PreparedLayout r7) {
        /*
            r6 = this;
            com.facebook.react.views.text.PreparedLayout r0 = r6.preparedLayout
            boolean r0 = defpackage.wl7.b(r0, r7)
            if (r0 != 0) goto L78
            com.facebook.react.views.text.PreparedLayoutTextView$b r0 = r6.b
            if (r0 == 0) goto L3b
            if (r7 == 0) goto L38
            android.text.Layout r1 = r7.a
            com.facebook.react.views.text.PreparedLayout r2 = r6.preparedLayout
            if (r2 == 0) goto L1b
            android.text.Layout r2 = r2.a
            java.lang.CharSequence r2 = r2.getText()
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.CharSequence r3 = r1.getText()
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L38
            int r2 = r0.a
            int r3 = r0.b
            android.graphics.Path r0 = r0.c
            r1.getSelectionPath(r2, r3, r0)
            goto L3b
        L38:
            r6.a()
        L3b:
            zr4 r0 = defpackage.zr4.a
            if (r7 == 0) goto L71
            android.text.Layout r1 = r7.a
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L71
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L4c
            goto L71
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L52:
            int r3 = r1.length()
            if (r2 >= r3) goto L71
            r3 = r1
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r4 = r1.length()
            java.lang.Class<android.text.style.ClickableSpan> r5 = android.text.style.ClickableSpan.class
            int r4 = r3.nextSpanTransition(r2, r4, r5)
            java.lang.Object[] r2 = r3.getSpans(r2, r4, r5)
            r2.getClass()
            defpackage.w92.x0(r0, r2)
            r2 = r4
            goto L52
        L71:
            r6.a = r0
            r6.preparedLayout = r7
            r6.invalidate()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.PreparedLayoutTextView.setPreparedLayout(com.facebook.react.views.text.PreparedLayout):void");
    }

    public final void setSelectionColor(Integer num) {
        this.selectionColor = num;
    }
}
