package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.badge.BadgeDrawable;
import defpackage.epg;
import defpackage.t6;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oca extends FrameLayout implements k.a {
    public static final int[] u0 = {R.attr.state_checked};
    public static final c v0 = new c();
    public static final d w0 = new d();
    public int V;
    public boolean W;
    public boolean a;
    public final FrameLayout a0;
    public int b;
    public final View b0;
    public int c;
    public final ImageView c0;
    public float d;
    public final ViewGroup d0;
    public float e;
    public final TextView e0;
    public float f;
    public final TextView f0;
    public int g0;
    public h h0;
    public ColorStateList i0;
    public Drawable j0;
    public Drawable k0;
    public ValueAnimator l0;
    public c m0;
    public float n0;
    public boolean o0;
    public int p0;
    public int q0;
    public boolean r0;
    public int s0;
    public BadgeDrawable t0;

    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ yj1 a;

        public a(yj1 yj1Var) {
            this.a = yj1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BadgeDrawable badgeDrawable;
            yj1 yj1Var = this.a;
            ImageView imageView = yj1Var.c0;
            if (imageView.getVisibility() != 0 || (badgeDrawable = yj1Var.t0) == null) {
                return;
            }
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.l(imageView, null);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oca.this.f(this.a);
        }
    }

    public static class c {
        public float a(float f, float f2) {
            return 1.0f;
        }
    }

    public static class d extends c {
        @Override // oca.c
        public final float a(float f, float f2) {
            return be0.a(0.4f, 1.0f, f);
        }
    }

    public oca(Context context) {
        super(context);
        this.a = false;
        this.g0 = -1;
        this.m0 = v0;
        this.n0 = 0.0f;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = false;
        this.s0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.a0 = (FrameLayout) findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_icon_container);
        this.b0 = findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_icon_view);
        this.c0 = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_labels_group);
        this.d0 = viewGroup;
        TextView textView = (TextView) findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_small_label_view);
        this.e0 = textView;
        TextView textView2 = (TextView) findViewById(com.indeed.android.jobsearch.R.id.navigation_bar_item_large_label_view);
        this.f0 = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.c = viewGroup.getPaddingBottom();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a((yj1) this));
        }
    }

    public static void d(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void e(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void g(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.a0;
        return frameLayout != null ? frameLayout : this.c0;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof oca) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.t0;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return this.c0.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.t0;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.t0.W.Z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.c0.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public final void a(float f, float f2) {
        this.d = f - f2;
        this.e = (f2 * 1.0f) / f;
        this.f = (f * 1.0f) / f2;
    }

    public final void b(float f, float f2) {
        View view = this.b0;
        if (view != null) {
            c cVar = this.m0;
            cVar.getClass();
            float fA = 1.0f;
            view.setScaleX(be0.a(0.4f, 1.0f, f));
            view.setScaleY(cVar.a(f, f2));
            float f3 = f2 == 0.0f ? 0.8f : 0.0f;
            float f4 = f2 == 0.0f ? 1.0f : 0.2f;
            if (f < f3) {
                fA = 0.0f;
            } else if (f <= f4) {
                fA = be0.a(0.0f, 1.0f, (f - f3) / (f4 - f3));
            }
            view.setAlpha(fA);
        }
        this.n0 = f;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.h0 = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        qnf.a(this, !TextUtils.isEmpty(hVar.r) ? hVar.r : hVar.e);
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.a = true;
    }

    public final void f(int i) {
        View view = this.b0;
        if (view == null) {
            return;
        }
        int iMin = Math.min(this.p0, i - (this.s0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.r0 && this.V == 2) ? iMin : this.q0;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.b0;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public BadgeDrawable getBadge() {
        return this.t0;
    }

    public int getItemBackgroundResId() {
        return com.indeed.android.jobsearch.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.h0;
    }

    public int getItemDefaultMarginResId() {
        return com.indeed.android.jobsearch.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.g0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.d0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.d0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.h0;
        if (hVar != null && hVar.isCheckable() && this.h0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, u0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.t0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            h hVar = this.h0;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.h0.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.t0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) t6.f.a(0, 1, getItemVisiblePosition(), isSelected(), 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) t6.a.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.indeed.android.jobsearch.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.b0;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.o0 = z;
        View view = this.b0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.q0 = i;
        f(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.s0 = i;
        f(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.r0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.p0 = i;
        f(getWidth());
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.t0 = badgeDrawable;
        ImageView imageView = this.c0;
        if (imageView == null || badgeDrawable == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        BadgeDrawable badgeDrawable2 = this.t0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        badgeDrawable2.setBounds(rect);
        badgeDrawable2.l(imageView, null);
        WeakReference<FrameLayout> weakReference = badgeDrawable2.e0;
        if ((weakReference != null ? weakReference.get() : null) == null) {
            imageView.getOverlay().add(badgeDrawable2);
        } else {
            WeakReference<FrameLayout> weakReference2 = badgeDrawable2.e0;
            (weakReference2 != null ? weakReference2.get() : null).setForeground(badgeDrawable2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oca.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e0.setEnabled(z);
        this.f0.setEnabled(z);
        this.c0.setEnabled(z);
        if (!z) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.f.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            epg.f.a(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.j0) {
            return;
        }
        this.j0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.k0 = drawable;
            ColorStateList colorStateList = this.i0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.c0.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.c0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.i0 = colorStateList;
        if (this.h0 == null || (drawable = this.k0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.k0.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setBackground(drawable);
    }

    public void setItemPaddingBottom(int i) {
        if (this.c != i) {
            this.c = i;
            h hVar = this.h0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.b != i) {
            this.b = i;
            h hVar = this.h0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.g0 = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.V != i) {
            this.V = i;
            if (this.r0 && i == 2) {
                this.m0 = w0;
            } else {
                this.m0 = v0;
            }
            f(getWidth());
            h hVar = this.h0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.W != z) {
            this.W = z;
            h hVar = this.h0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextView textView = this.f0;
        textView.setTextAppearance(i);
        a(this.e0.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.e0;
        textView.setTextAppearance(i);
        a(textView.getTextSize(), this.f0.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.e0.setTextColor(colorStateList);
            this.f0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.e0.setText(charSequence);
        this.f0.setText(charSequence);
        h hVar = this.h0;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.h0;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.h0.r;
        }
        qnf.a(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
