package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Pools$SimplePool;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import defpackage.be0;
import defpackage.e6f;
import defpackage.epg;
import defpackage.ff9;
import defpackage.gp4;
import defpackage.gsg;
import defpackage.jkf;
import defpackage.ka2;
import defpackage.l5;
import defpackage.lac;
import defpackage.pgb;
import defpackage.pnb;
import defpackage.prg;
import defpackage.qnf;
import defpackage.r6;
import defpackage.t6;
import defpackage.v40;
import defpackage.wac;
import defpackage.ydd;
import defpackage.ye9;
import defpackage.z0b;
import defpackage.ze9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.d
public class TabLayout extends HorizontalScrollView {
    public static final pgb G0 = new pgb(16);
    public ValueAnimator A0;
    public ViewPager B0;
    public g C0;
    public b D0;
    public boolean E0;
    public final Pools$SimplePool F0;
    public final int V;
    public final int W;
    public final ArrayList<f> a;
    public ColorStateList a0;
    public f b;
    public ColorStateList b0;
    public final e c;
    public ColorStateList c0;
    public final int d;
    public Drawable d0;
    public final int e;
    public int e0;
    public final int f;
    public final float f0;
    public final float g0;
    public final int h0;
    public int i0;
    public final int j0;
    public final int k0;
    public final int l0;
    public final int m0;
    public int n0;
    public final int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public int t0;
    public int u0;
    public boolean v0;
    public com.google.android.material.tabs.a w0;
    public c x0;
    public final ArrayList<c> y0;
    public i z0;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.B0 == viewPager) {
                tabLayout.f();
            }
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a(T t);
    }

    public interface d extends c<f> {
    }

    public class e extends LinearLayout {
        public static final /* synthetic */ int e = 0;
        public ValueAnimator a;
        public int b;
        public float c;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.c(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                e.this.b = this.a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                e.this.b = this.a;
            }
        }

        public e(Context context) {
            super(context);
            this.b = -1;
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.b);
            TabLayout tabLayout = TabLayout.this;
            com.google.android.material.tabs.a aVar = tabLayout.w0;
            Drawable drawable = tabLayout.d0;
            aVar.getClass();
            RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.d0.getBounds();
            tabLayout.d0.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.d0;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.d0.getBounds().bottom);
            } else {
                tabLayout.w0.b(tabLayout, view, view2, f, tabLayout.d0);
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            postInvalidateOnAnimation();
        }

        public final void d(int i, int i2, boolean z) {
            View childAt = getChildAt(this.b);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.a.removeAllUpdateListeners();
                this.a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(be0.b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i));
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.d0.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.d0.getIntrinsicHeight();
            }
            int i = tabLayout.p0;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.d0.getBounds().width() > 0) {
                Rect bounds = tabLayout.d0.getBounds();
                tabLayout.d0.setBounds(bounds.left, height, bounds.right, iHeight);
                Drawable drawable = tabLayout.d0;
                int i2 = tabLayout.e0;
                if (i2 != 0) {
                    drawable.setTint(i2);
                } else {
                    drawable.setTintList(null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(this.b, -1, false);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.n0 == 1 || tabLayout.q0 == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) gsg.b(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.n0 = 0;
                    tabLayout.j(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public static class f {
        public CharSequence a;
        public int b = -1;
        public View c;
        public TabLayout d;
        public h e;
    }

    public static class g implements ViewPager.i {
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public g(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i2 = this.c;
                tabLayout.h(i, f, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i) {
            this.b = this.c;
            this.c = i;
        }
    }

    public final class h extends LinearLayout {
        public static final /* synthetic */ int d0 = 0;
        public TextView V;
        public ImageView W;
        public f a;
        public Drawable a0;
        public TextView b;
        public int b0;
        public ImageView c;
        public View d;
        public BadgeDrawable e;
        public View f;

        public h(Context context) {
            super(context);
            this.b0 = 2;
            e(context);
            int i = TabLayout.this.d;
            int i2 = TabLayout.this.e;
            int i3 = TabLayout.this.f;
            int i4 = TabLayout.this.V;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.r0 ? 1 : 0);
            setClickable(true);
            epg.f.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        }

        private BadgeDrawable getBadge() {
            return this.e;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.e == null) {
                this.e = BadgeDrawable.b(getContext());
            }
            b();
            BadgeDrawable badgeDrawable = this.e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            r6.g("Unable to create badge");
            return null;
        }

        public final void a() {
            if (this.e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.d;
                if (view != null) {
                    BadgeDrawable badgeDrawable = this.e;
                    if (badgeDrawable != null) {
                        WeakReference<FrameLayout> weakReference = badgeDrawable.e0;
                        if ((weakReference != null ? weakReference.get() : null) != null) {
                            WeakReference<FrameLayout> weakReference2 = badgeDrawable.e0;
                            (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                        } else {
                            view.getOverlay().remove(badgeDrawable);
                        }
                    }
                    this.d = null;
                }
            }
        }

        public final void b() {
            if (this.e != null) {
                if (this.f != null) {
                    a();
                    return;
                }
                TextView textView = this.b;
                if (textView == null || this.a == null) {
                    a();
                    return;
                }
                if (this.d == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.b;
                if (this.e == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeDrawable badgeDrawable = this.e;
                Rect rect = new Rect();
                textView2.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.l(textView2, null);
                WeakReference<FrameLayout> weakReference = badgeDrawable.e0;
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    WeakReference<FrameLayout> weakReference2 = badgeDrawable.e0;
                    (weakReference2 != null ? weakReference2.get() : null).setForeground(badgeDrawable);
                } else {
                    textView2.getOverlay().add(badgeDrawable);
                }
                this.d = textView2;
            }
        }

        public final void c(View view) {
            BadgeDrawable badgeDrawable = this.e;
            if (badgeDrawable == null || view != this.d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.l(view, null);
        }

        public final void d() {
            f fVar = this.a;
            View view = fVar != null ? fVar.c : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.V = textView2;
                if (textView2 != null) {
                    this.b0 = textView2.getMaxLines();
                }
                this.W = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f;
                if (view2 != null) {
                    removeView(view2);
                    this.f = null;
                }
                this.V = null;
                this.W = null;
            }
            boolean z = false;
            if (this.f == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.indeed.android.jobsearch.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.indeed.android.jobsearch.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.b = textView3;
                    addView(textView3);
                    this.b0 = this.b.getMaxLines();
                }
                TextView textView4 = this.b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.W);
                ColorStateList colorStateList = tabLayout.a0;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                f(this.b, this.c);
                b();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView5 = this.b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView5));
                }
            } else {
                TextView textView6 = this.V;
                if (textView6 != null || this.W != null) {
                    f(textView6, this.W);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.a)) {
                setContentDescription(fVar.a);
            }
            if (fVar != null) {
                TabLayout tabLayout2 = fVar.d;
                if (tabLayout2 == null) {
                    l5.q("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = tabLayout2.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == fVar.b) {
                    z = true;
                }
            }
            setSelected(z);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.a0;
            if ((drawable == null || !drawable.isStateful()) ? false : this.a0.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.h0;
            if (i != 0) {
                Drawable drawableA = pnb.A(context, i);
                this.a0 = drawableA;
                if (drawableA != null && drawableA.isStateful()) {
                    this.a0.setState(getDrawableState());
                }
            } else {
                this.a0 = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (tabLayout.c0 != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = ydd.a(tabLayout.c0);
                boolean z = tabLayout.v0;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z ? null : gradientDrawable2);
            }
            WeakHashMap<View, prg> weakHashMap = epg.a;
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f(TextView textView, ImageView imageView) {
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(null);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText((CharSequence) null);
                    this.a.getClass();
                    textView.setVisibility(0);
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) gsg.b(getContext(), 8);
                if (TabLayout.this.r0) {
                    if (iB != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar = this.a;
            qnf.a(this, zIsEmpty ? fVar != null ? fVar.a : null : null);
        }

        public int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.e;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.e.d()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) t6.f.a(0, 1, this.a.b, isSelected(), 1).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) t6.a.g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.indeed.android.jobsearch.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.i0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = tabLayout.f0;
                int i3 = this.b0;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.g0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int maxLines = this.b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.q0 == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.b.setTextSize(0, f);
                    this.b.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            f fVar = this.a;
            TabLayout tabLayout = fVar.d;
            if (tabLayout != null) {
                tabLayout.g(fVar, true);
                return true;
            }
            l5.q("Tab not attached to a TabLayout");
            return false;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.a) {
                this.a = fVar;
                d();
            }
        }
    }

    public static class i implements d {
        public final ViewPager a;

        public i(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(f fVar) {
            this.a.setCurrentItem(fVar.b);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, com.indeed.android.jobsearch.R.attr.tabStyle, com.indeed.android.jobsearch.R.style.Widget_Design_TabLayout), attributeSet, com.indeed.android.jobsearch.R.attr.tabStyle);
        this.a = new ArrayList<>();
        this.d0 = new GradientDrawable();
        this.e0 = 0;
        this.i0 = Integer.MAX_VALUE;
        this.t0 = -1;
        this.y0 = new ArrayList<>();
        this.F0 = new Pools$SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.c = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = jkf.d(context2, attributeSet, lac.F, com.indeed.android.jobsearch.R.attr.tabStyle, com.indeed.android.jobsearch.R.style.Widget_Design_TabLayout, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            ze9 ze9Var = new ze9();
            ze9Var.k(ColorStateList.valueOf(colorDrawable.getColor()));
            ze9Var.i(context2);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            ze9Var.j(epg.d.e(this));
            setBackground(ze9Var);
        }
        setSelectedTabIndicator(ye9.c(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        eVar.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.V = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.d = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.e = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.f = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.V = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        int resourceId = typedArrayD.getResourceId(23, com.indeed.android.jobsearch.R.style.TextAppearance_Design_Tab);
        this.W = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, wac.x);
        try {
            this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.a0 = ye9.b(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(24)) {
                this.a0 = ye9.b(context2, typedArrayD, 24);
            }
            if (typedArrayD.hasValue(22)) {
                this.a0 = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayD.getColor(22, 0), this.a0.getDefaultColor()});
            }
            this.b0 = ye9.b(context2, typedArrayD, 3);
            gsg.d(typedArrayD.getInt(4, -1), null);
            this.c0 = ye9.b(context2, typedArrayD, 21);
            this.o0 = typedArrayD.getInt(6, 300);
            this.j0 = typedArrayD.getDimensionPixelSize(14, -1);
            this.k0 = typedArrayD.getDimensionPixelSize(13, -1);
            this.h0 = typedArrayD.getResourceId(0, 0);
            this.m0 = typedArrayD.getDimensionPixelSize(1, 0);
            this.q0 = typedArrayD.getInt(15, 1);
            this.n0 = typedArrayD.getInt(2, 0);
            this.r0 = typedArrayD.getBoolean(12, false);
            this.v0 = typedArrayD.getBoolean(25, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.g0 = resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.design_tab_text_size_2line);
            this.l0 = resources.getDimensionPixelSize(com.indeed.android.jobsearch.R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        ArrayList<f> arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.j0;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.q0;
        if (i3 == 0 || i3 == 2) {
            return this.l0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        e eVar = this.c;
        int childCount = eVar.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = eVar.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public final void a(View view) {
        if (!(view instanceof e6f)) {
            l5.q("Only TabItem instances can be added to TabLayout");
            return;
        }
        e6f e6fVar = (e6f) view;
        f fVar = (f) G0.acquire();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.d = this;
        Pools$SimplePool pools$SimplePool = this.F0;
        h hVar = pools$SimplePool != null ? (h) pools$SimplePool.acquire() : null;
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.a)) {
            hVar.setContentDescription(null);
        } else {
            hVar.setContentDescription(fVar.a);
        }
        fVar.e = hVar;
        if (!TextUtils.isEmpty(e6fVar.getContentDescription())) {
            fVar.a = e6fVar.getContentDescription();
            h hVar2 = fVar.e;
            if (hVar2 != null) {
                hVar2.d();
            }
        }
        ArrayList<f> arrayList = this.a;
        boolean zIsEmpty = arrayList.isEmpty();
        int size = arrayList.size();
        if (fVar.d != this) {
            l5.q("Tab belongs to a different TabLayout.");
            return;
        }
        fVar.b = size;
        arrayList.add(size, fVar);
        int size2 = arrayList.size();
        for (int i2 = size + 1; i2 < size2; i2++) {
            arrayList.get(i2).b = i2;
        }
        h hVar3 = fVar.e;
        hVar3.setSelected(false);
        hVar3.setActivated(false);
        int i3 = fVar.b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.q0 == 1 && this.n0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.c.addView(hVar3, i3, layoutParams);
        if (zIsEmpty) {
            TabLayout tabLayout = fVar.d;
            if (tabLayout != null) {
                tabLayout.g(fVar, true);
            } else {
                l5.q("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
    }

    public final void b(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            if (isLaidOut()) {
                e eVar = this.c;
                int childCount = eVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (eVar.getChildAt(i3).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iD = d(0.0f, i2);
                if (scrollX != iD) {
                    e();
                    this.A0.setIntValues(scrollX, iD);
                    this.A0.start();
                }
                ValueAnimator valueAnimator = eVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.a.cancel();
                }
                eVar.d(i2, this.o0, true);
                return;
            }
        }
        h(i2, 0.0f, true, true);
    }

    public final void c() {
        int i2 = this.q0;
        int iMax = (i2 == 0 || i2 == 2) ? Math.max(0, this.m0 - this.d) : 0;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        e eVar = this.c;
        eVar.setPaddingRelative(iMax, 0, 0, 0);
        int i3 = this.q0;
        if (i3 == 0) {
            int i4 = this.n0;
            if (i4 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i4 == 1) {
                eVar.setGravity(1);
            } else if (i4 == 2) {
            }
            eVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.n0 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            eVar.setGravity(1);
        }
        j(true);
    }

    public final int d(float f2, int i2) {
        e eVar;
        View childAt;
        int i3 = this.q0;
        if ((i3 != 0 && i3 != 2) || (childAt = (eVar = this.c).getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < eVar.getChildCount() ? eVar.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void e() {
        if (this.A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0 = valueAnimator;
            valueAnimator.setInterpolator(be0.b);
            this.A0.setDuration(this.o0);
            this.A0.addUpdateListener(new a());
        }
    }

    public final void f() {
        e eVar = this.c;
        int childCount = eVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            h hVar = (h) eVar.getChildAt(childCount);
            eVar.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.F0.a(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.a.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.d = null;
            next.e = null;
            next.a = null;
            next.b = -1;
            next.c = null;
            G0.a(next);
        }
        this.b = null;
    }

    public final void g(f fVar, boolean z) {
        f fVar2 = this.b;
        ArrayList<c> arrayList = this.y0;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).getClass();
                }
                b(fVar.b);
                return;
            }
            return;
        }
        int i2 = fVar != null ? fVar.b : -1;
        if (z) {
            if ((fVar2 == null || fVar2.b == -1) && i2 != -1) {
                h(i2, 0.0f, true, true);
            } else {
                b(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.b = fVar;
        if (fVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).getClass();
            }
        }
        if (fVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a(fVar);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.b;
        if (fVar != null) {
            return fVar.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabGravity() {
        return this.n0;
    }

    public ColorStateList getTabIconTint() {
        return this.b0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.u0;
    }

    public int getTabIndicatorGravity() {
        return this.p0;
    }

    public int getTabMaxWidth() {
        return this.i0;
    }

    public int getTabMode() {
        return this.q0;
    }

    public ColorStateList getTabRippleColor() {
        return this.c0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.d0;
    }

    public ColorStateList getTabTextColors() {
        return this.a0;
    }

    public final void h(int i2, float f2, boolean z, boolean z2) {
        int iRound = Math.round(i2 + f2);
        if (iRound >= 0) {
            e eVar = this.c;
            if (iRound >= eVar.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = eVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.a.cancel();
                }
                eVar.b = i2;
                eVar.c = f2;
                eVar.c(eVar.getChildAt(i2), eVar.getChildAt(eVar.b + 1), eVar.c);
            }
            ValueAnimator valueAnimator2 = this.A0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.A0.cancel();
            }
            scrollTo(i2 < 0 ? 0 : d(f2, i2), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void i(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.B0;
        if (viewPager2 != null) {
            g gVar = this.C0;
            if (gVar != null && (arrayList2 = viewPager2.v0) != null) {
                arrayList2.remove(gVar);
            }
            b bVar = this.D0;
            if (bVar != null && (arrayList = this.B0.x0) != null) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.z0;
        ArrayList<c> arrayList3 = this.y0;
        if (iVar != null) {
            arrayList3.remove(iVar);
            this.z0 = null;
        }
        if (viewPager != null) {
            this.B0 = viewPager;
            if (this.C0 == null) {
                this.C0 = new g(this);
            }
            g gVar2 = this.C0;
            gVar2.c = 0;
            gVar2.b = 0;
            if (viewPager.v0 == null) {
                viewPager.v0 = new ArrayList();
            }
            viewPager.v0.add(gVar2);
            i iVar2 = new i(viewPager);
            this.z0 = iVar2;
            if (!arrayList3.contains(iVar2)) {
                arrayList3.add(iVar2);
            }
            viewPager.getAdapter();
            if (this.D0 == null) {
                this.D0 = new b();
            }
            b bVar2 = this.D0;
            bVar2.getClass();
            if (viewPager.x0 == null) {
                viewPager.x0 = new ArrayList();
            }
            viewPager.x0.add(bVar2);
            h(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.B0 = null;
            f();
        }
        this.E0 = z;
    }

    public final void j(boolean z) {
        int i2 = 0;
        while (true) {
            e eVar = this.c;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.q0 == 1 && this.n0 == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.G(this);
        if (this.B0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                i((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E0) {
            setupWithViewPager(null);
            this.E0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i2 = 0;
        while (true) {
            e eVar = this.c;
            if (i2 >= eVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).a0) != null) {
                drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                hVar.a0.draw(canvas);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(1, getTabCount(), 1).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = defpackage.gsg.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.k0
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.gsg.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.i0 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.q0
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r7.measure(r6, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ka2.E(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        int i2 = 0;
        while (true) {
            e eVar = this.c;
            if (i2 >= eVar.getChildCount()) {
                c();
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                h hVar = (h) childAt;
                hVar.setOrientation(!TabLayout.this.r0 ? 1 : 0);
                TextView textView = hVar.V;
                if (textView == null && hVar.W == null) {
                    hVar.f(hVar.b, hVar.c);
                } else {
                    hVar.f(textView, hVar.W);
                }
            }
            i2++;
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.x0;
        ArrayList<c> arrayList = this.y0;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.x0 = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.A0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.d0 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.d0 = drawable;
            int intrinsicHeight = this.t0;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.c.b(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.e0 = i2;
        j(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.p0 != i2) {
            this.p0 = i2;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            this.c.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.t0 = i2;
        this.c.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.n0 != i2) {
            this.n0 = i2;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            ArrayList<f> arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = arrayList.get(i2).e;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(pnb.z(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.u0 = i2;
        if (i2 == 0) {
            this.w0 = new com.google.android.material.tabs.a();
        } else if (i2 == 1) {
            this.w0 = new gp4();
        } else {
            v40.j(i2, " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.s0 = z;
        int i2 = e.e;
        e eVar = this.c;
        eVar.a();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.q0) {
            this.q0 = i2;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.c0 == colorStateList) {
            return;
        }
        this.c0 = colorStateList;
        int i2 = 0;
        while (true) {
            e eVar = this.c;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                Context context = getContext();
                int i3 = h.d0;
                ((h) childAt).e(context);
            }
            i2++;
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(pnb.z(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            ArrayList<f> arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = arrayList.get(i2).e;
                if (hVar != null) {
                    hVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(z0b z0bVar) {
        f();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.v0 == z) {
            return;
        }
        this.v0 = z;
        int i2 = 0;
        while (true) {
            e eVar = this.c;
            if (i2 >= eVar.getChildCount()) {
                return;
            }
            View childAt = eVar.getChildAt(i2);
            if (childAt instanceof h) {
                Context context = getContext();
                int i3 = h.d0;
                ((h) childAt).e(context);
            }
            i2++;
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        i(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(pnb.A(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
