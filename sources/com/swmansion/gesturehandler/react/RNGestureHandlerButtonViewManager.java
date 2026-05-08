package com.swmansion.gesturehandler.react;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.e;
import defpackage.aqg;
import defpackage.knc;
import defpackage.mkf;
import defpackage.mw9;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.scc;
import defpackage.snc;
import defpackage.sqg;
import defpackage.tcc;
import defpackage.wl7;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lscc;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "Lj6g;", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", "borderRadius", "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", "borderTopLeftRadius", "setBorderTopLeftRadius", "borderTopRightRadius", "setBorderTopRightRadius", "borderBottomLeftRadius", "setBorderBottomLeftRadius", "borderBottomRightRadius", "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lsqg;", "getDelegate", "()Lsqg;", "mDelegate", "Lsqg;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements scc<a> {
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final sqg<a> mDelegate;

    public static final class a extends ViewGroup implements e.InterfaceC0193e {
        public static a m0;
        public static a n0;
        public float V;
        public float W;
        public Integer a;
        public float a0;
        public Integer b;
        public float b0;
        public boolean c;
        public Integer c0;
        public boolean d;
        public String d0;
        public float e;
        public boolean e0;
        public float f;
        public int f0;
        public boolean g0;
        public long h0;
        public int i0;
        public boolean j0;
        public boolean k0;
        public static final TypedValue l0 = new TypedValue();
        public static final tcc o0 = new tcc();

        private final boolean getHasBorderRadii() {
            return (this.e == 0.0f && this.f == 0.0f && this.V == 0.0f && this.W == 0.0f && this.a0 == 0.0f) ? false : true;
        }

        public static boolean j(aqg aqgVar) {
            Iterator<View> it = aqgVar.iterator();
            while (true) {
                knc kncVar = (knc) it;
                if (!kncVar.hasNext()) {
                    return false;
                }
                View view = (View) kncVar.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.k0 || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && j(new aqg((ViewGroup) view))) {
                    return true;
                }
            }
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean a() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean b(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
                return false;
            }
            boolean zK = k();
            if (zK) {
                this.k0 = true;
            }
            return zK;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean c() {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final boolean d(View view) {
            return e.InterfaceC0193e.a.a(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.View
        public final void drawableHotspotChanged(float f, float f2) {
            a aVar = m0;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean e(View view, MotionEvent motionEvent) {
            if (view != null) {
                return Boolean.valueOf(view.onTouchEvent(motionEvent));
            }
            return null;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void f(MotionEvent motionEvent) {
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final Boolean g(GestureHandler gestureHandler) {
            gestureHandler.getClass();
            return null;
        }

        public final float getBorderBottomLeftRadius() {
            return this.W;
        }

        public final float getBorderBottomRightRadius() {
            return this.a0;
        }

        public final Integer getBorderColor() {
            return this.c0;
        }

        public final float getBorderRadius() {
            return this.e;
        }

        public final String getBorderStyle() {
            return this.d0;
        }

        public final float getBorderTopLeftRadius() {
            return this.f;
        }

        public final float getBorderTopRightRadius() {
            return this.V;
        }

        public final float getBorderWidth() {
            return this.b0;
        }

        public final boolean getExclusive() {
            return this.e0;
        }

        public final Integer getRippleColor() {
            return this.a;
        }

        public final Integer getRippleRadius() {
            return this.b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.c;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC0193e
        public final void h(MotionEvent motionEvent) {
            if (m0 == this) {
                m0 = null;
                n0 = this;
            }
            this.k0 = false;
        }

        public final float[] i() {
            float f = this.f;
            float f2 = this.V;
            float f3 = this.a0;
            float f4 = this.W;
            float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
            ArrayList arrayList = new ArrayList(8);
            for (int i = 0; i < 8; i++) {
                float f5 = fArr[i];
                if (f5 == 0.0f) {
                    f5 = this.e;
                }
                arrayList.add(Float.valueOf(f5));
            }
            return z92.w1(arrayList);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k() {
            /*
                r7 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r7.getChildCount()
                r3 = 1
                if (r1 >= r2) goto Lb
                r2 = r3
                goto Lc
            Lb:
                r2 = r0
            Lc:
                if (r2 == 0) goto L6d
                int r2 = r1 + 1
                android.view.View r1 = r7.getChildAt(r1)
                if (r1 == 0) goto L69
                boolean r4 = r1 instanceof com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a
                if (r4 == 0) goto L28
                r4 = r1
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = (com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a) r4
                boolean r5 = r4.k0
                if (r5 != 0) goto L80
                boolean r4 = r4.isPressed()
                if (r4 == 0) goto L28
                goto L80
            L28:
                boolean r4 = r1 instanceof android.view.ViewGroup
                if (r4 == 0) goto L67
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                knc r4 = new knc
                r4.<init>(r1, r3)
            L33:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r4.next()
                android.view.View r1 = (android.view.View) r1
                boolean r5 = r1 instanceof com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a
                if (r5 == 0) goto L51
                r5 = r1
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r5 = (com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a) r5
                boolean r6 = r5.k0
                if (r6 != 0) goto L64
                boolean r5 = r5.isPressed()
                if (r5 == 0) goto L51
                goto L64
            L51:
                boolean r5 = r1 instanceof android.view.ViewGroup
                if (r5 == 0) goto L33
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                aqg r5 = new aqg
                r5.<init>(r1)
                boolean r1 = j(r5)
                if (r1 == 0) goto L33
                goto L64
            L63:
                r3 = r0
            L64:
                if (r3 == 0) goto L67
                goto L80
            L67:
                r1 = r2
                goto L2
            L69:
                defpackage.k20.o()
                return r0
            L6d:
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r1 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.m0
                if (r1 != 0) goto L74
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.m0 = r7
                return r3
            L74:
                boolean r2 = r7.e0
                if (r2 == 0) goto L7b
                if (r1 != r7) goto L80
                goto L7f
            L7b:
                boolean r7 = r1.e0
                if (r7 != 0) goto L80
            L7f:
                return r3
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.k():boolean");
        }

        public final void l() {
            ColorStateList colorStateList;
            RippleDrawable rippleDrawable;
            PathEffect dashPathEffect;
            if (this.g0) {
                this.g0 = false;
                if (this.f0 == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Integer num = this.a;
                if (num != null && num.intValue() == 0) {
                    rippleDrawable = null;
                } else {
                    int[][] iArr = {new int[]{R.attr.state_enabled}};
                    Integer num2 = this.b;
                    Integer num3 = this.a;
                    if (num3 != null) {
                        colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
                    } else {
                        Resources.Theme theme = getContext().getTheme();
                        TypedValue typedValue = l0;
                        theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true);
                        colorStateList = new ColorStateList(iArr, new int[]{typedValue.data});
                    }
                    rippleDrawable = new RippleDrawable(colorStateList, null, this.d ? null : new ShapeDrawable(new RectShape()));
                    if (num2 != null) {
                        rippleDrawable.setRadius((int) nn2.G(num2.intValue()));
                    }
                }
                PaintDrawable paintDrawable = new PaintDrawable(0);
                if (getHasBorderRadii()) {
                    paintDrawable.setCornerRadii(i());
                }
                if (this.b0 > 0.0f) {
                    Paint paint = paintDrawable.getPaint();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(this.b0);
                    Integer num4 = this.c0;
                    paint.setColor(num4 != null ? num4.intValue() : -16777216);
                    String str = this.d0;
                    if (wl7.b(str, "dotted")) {
                        float f = this.b0;
                        dashPathEffect = new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                    } else if (wl7.b(str, "dashed")) {
                        float f2 = this.b0 * 3.0f;
                        dashPathEffect = new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                    } else {
                        dashPathEffect = null;
                    }
                    paint.setPathEffect(dashPathEffect);
                }
                if (getHasBorderRadii() && rippleDrawable != null) {
                    PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                    paintDrawable2.setCornerRadii(i());
                    rippleDrawable.setDrawableByLayerId(R.id.mask, paintDrawable2);
                }
                if (this.c) {
                    setForeground(rippleDrawable);
                    int i = this.f0;
                    if (i != 0) {
                        m(i, paintDrawable, null);
                        return;
                    }
                    return;
                }
                int i2 = this.f0;
                if (i2 == 0 && this.a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{rippleDrawable, paintDrawable}));
                } else {
                    m(i2, paintDrawable, rippleDrawable);
                }
            }
        }

        public final void m(int i, PaintDrawable paintDrawable, RippleDrawable rippleDrawable) {
            PaintDrawable paintDrawable2 = new PaintDrawable(i);
            if (getHasBorderRadii()) {
                paintDrawable2.setCornerRadii(i());
            }
            setBackground(new LayerDrawable(rippleDrawable != null ? new Drawable[]{paintDrawable2, rippleDrawable, paintDrawable} : new Drawable[]{paintDrawable2, paintDrawable}));
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.getClass();
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            Object tag = getTag(com.indeed.android.jobsearch.R.id.react_test_id);
            if (tag instanceof String) {
                accessibilityNodeInfo.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            motionEvent.getClass();
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            this.j0 = true;
            return super.onKeyUp(i, keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            motionEvent.getClass();
            long eventTime = motionEvent.getEventTime();
            int action = motionEvent.getAction();
            a aVar = m0;
            if (aVar != null && aVar != this && aVar.e0) {
                if (isPressed()) {
                    setPressed(false);
                }
                this.h0 = eventTime;
                this.i0 = action;
                return false;
            }
            if (motionEvent.getAction() == 3 && m0 == this) {
                m0 = null;
                n0 = this;
            }
            if (this.h0 == eventTime && this.i0 == action && action != 3) {
                return false;
            }
            this.h0 = eventTime;
            this.i0 = action;
            return super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean performClick() {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.performClick():boolean");
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.f0 = i;
            this.g0 = true;
        }

        public final void setBorderBottomLeftRadius(float f) {
            this.W = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setBorderBottomRightRadius(float f) {
            this.a0 = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setBorderColor(Integer num) {
            this.c0 = num;
            this.g0 = true;
        }

        public final void setBorderRadius(float f) {
            this.e = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setBorderStyle(String str) {
            this.d0 = str;
            this.g0 = true;
        }

        public final void setBorderTopLeftRadius(float f) {
            this.f = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setBorderTopRightRadius(float f) {
            this.V = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setBorderWidth(float f) {
            this.b0 = f * getResources().getDisplayMetrics().density;
            this.g0 = true;
        }

        public final void setExclusive(boolean z) {
            this.e0 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0086 A[EDGE_INSN: B:64:0x0086->B:51:0x0086 BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0080], EDGE_INSN: B:65:0x0086->B:51:0x0086 BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0080], EDGE_INSN: B:66:0x0086->B:51:0x0086 BREAK  A[LOOP:0: B:14:0x001b->B:48:0x0080]] */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setPressed(boolean r8) {
            /*
                r7 = this;
                if (r8 == 0) goto La
                boolean r0 = r7.k()
                if (r0 == 0) goto La
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.n0 = r7
            La:
                boolean r0 = r7.e0
                r1 = 0
                if (r0 != 0) goto L86
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.m0
                r2 = 1
                if (r0 == 0) goto L1a
                boolean r0 = r0.e0
                if (r0 != r2) goto L1a
                goto L86
            L1a:
                r0 = r1
            L1b:
                int r3 = r7.getChildCount()
                if (r0 >= r3) goto L23
                r3 = r2
                goto L24
            L23:
                r3 = r1
            L24:
                if (r3 == 0) goto L87
                int r3 = r0 + 1
                android.view.View r0 = r7.getChildAt(r0)
                if (r0 == 0) goto L82
                boolean r4 = r0 instanceof com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a
                if (r4 == 0) goto L40
                r4 = r0
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = (com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a) r4
                boolean r5 = r4.k0
                if (r5 != 0) goto L86
                boolean r4 = r4.isPressed()
                if (r4 == 0) goto L40
                goto L86
            L40:
                boolean r4 = r0 instanceof android.view.ViewGroup
                if (r4 == 0) goto L80
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                knc r4 = new knc
                r4.<init>(r0, r2)
            L4b:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L7c
                java.lang.Object r0 = r4.next()
                android.view.View r0 = (android.view.View) r0
                boolean r5 = r0 instanceof com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a
                if (r5 == 0) goto L69
                r5 = r0
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r5 = (com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a) r5
                boolean r6 = r5.k0
                if (r6 != 0) goto L7a
                boolean r5 = r5.isPressed()
                if (r5 == 0) goto L69
                goto L7a
            L69:
                boolean r5 = r0 instanceof android.view.ViewGroup
                if (r5 == 0) goto L4b
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                aqg r5 = new aqg
                r5.<init>(r0)
                boolean r0 = j(r5)
                if (r0 == 0) goto L4b
            L7a:
                r0 = r2
                goto L7d
            L7c:
                r0 = r1
            L7d:
                if (r0 == 0) goto L80
                goto L86
            L80:
                r0 = r3
                goto L1b
            L82:
                defpackage.k20.o()
                return
            L86:
                r2 = r1
            L87:
                if (r8 == 0) goto L8f
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.m0
                if (r0 == r7) goto L8f
                if (r2 == 0) goto L94
            L8f:
                r7.k0 = r8
                super.setPressed(r8)
            L94:
                if (r8 != 0) goto L9c
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r8 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.m0
                if (r8 != r7) goto L9c
                r7.k0 = r1
            L9c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.a = num;
            this.g0 = true;
        }

        public final void setRippleRadius(Integer num) {
            this.b = num;
            this.g0 = true;
        }

        public final void setTouched(boolean z) {
            this.k0 = z;
        }

        public final void setUseBorderlessDrawable(boolean z) {
            this.d = z;
        }

        public final void setUseDrawableOnForeground(boolean z) {
            this.c = z;
            this.g0 = true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RNGestureHandlerButtonViewManager() {
        int i = 1;
        super(null, i, 0 == true ? 1 : 0);
        this.mDelegate = new mw9(this, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(mkf context) {
        context.getClass();
        a aVar = new a(context);
        aVar.d0 = "solid";
        aVar.e0 = true;
        aVar.h0 = -1L;
        aVar.i0 = -1;
        aVar.setOnClickListener(a.o0);
        aVar.setClickable(true);
        aVar.setFocusable(true);
        aVar.g0 = true;
        aVar.setClipChildren(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "backgroundColor")
    public void setBackgroundColor(a view, int backgroundColor) {
        view.getClass();
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(a view, float borderBottomLeftRadius) {
        view.getClass();
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(a view, float borderBottomRightRadius) {
        view.getClass();
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // defpackage.scc
    @snc(name = "borderColor")
    public void setBorderColor(a view, Integer borderColor) {
        view.getClass();
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "borderRadius")
    public void setBorderRadius(a view, float borderRadius) {
        view.getClass();
        view.setBorderRadius(borderRadius);
    }

    @Override // defpackage.scc
    @snc(name = "borderStyle")
    public void setBorderStyle(a view, String borderStyle) {
        view.getClass();
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(a view, float borderTopLeftRadius) {
        view.getClass();
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @snc(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(a view, float borderTopRightRadius) {
        view.getClass();
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // defpackage.scc
    @snc(name = "borderWidth")
    public void setBorderWidth(a view, float borderWidth) {
        view.getClass();
        view.setBorderWidth(borderWidth);
    }

    @Override // defpackage.scc
    @snc(name = "borderless")
    public void setBorderless(a view, boolean useBorderlessDrawable) {
        view.getClass();
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // defpackage.scc
    @snc(name = "enabled")
    public void setEnabled(a view, boolean enabled) {
        view.getClass();
        view.setEnabled(enabled);
    }

    @Override // defpackage.scc
    @snc(name = "exclusive")
    public void setExclusive(a view, boolean exclusive) {
        view.getClass();
        view.setExclusive(exclusive);
    }

    @Override // defpackage.scc
    @TargetApi(23)
    @snc(name = "foreground")
    public void setForeground(a view, boolean useDrawableOnForeground) {
        view.getClass();
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // defpackage.scc
    @snc(name = "rippleColor")
    public void setRippleColor(a view, Integer rippleColor) {
        view.getClass();
        view.setRippleColor(rippleColor);
    }

    @Override // defpackage.scc
    @snc(name = "rippleRadius")
    public void setRippleRadius(a view, int rippleRadius) {
        view.getClass();
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // defpackage.scc
    @snc(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a view, boolean touchSoundDisabled) {
        view.getClass();
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
