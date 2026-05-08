package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarPresenter;
import defpackage.t6;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rca extends ViewGroup implements k {
    public static final int[] u0 = {R.attr.state_checked};
    public static final int[] v0 = {-16842910};
    public int V;
    public int W;
    public final p11 a;
    public ColorStateList a0;
    public final a b;
    public int b0;
    public final pgb c;
    public ColorStateList c0;
    public final SparseArray<View.OnTouchListener> d;
    public final ColorStateList d0;
    public int e;
    public int e0;
    public oca[] f;
    public int f0;
    public Drawable g0;
    public int h0;
    public SparseArray<BadgeDrawable> i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public ece p0;
    public boolean q0;
    public ColorStateList r0;
    public NavigationBarPresenter s0;
    public f t0;

    public class a implements View.OnClickListener {
        public final /* synthetic */ zj1 a;

        public a(zj1 zj1Var) {
            this.a = zj1Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((oca) view).getItemData();
            zj1 zj1Var = this.a;
            if (zj1Var.t0.q(itemData, zj1Var.s0, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public rca(Context context) {
        super(context);
        this.c = new pgb(5);
        this.d = new SparseArray<>(5);
        this.V = 0;
        this.W = 0;
        this.i0 = new SparseArray<>(5);
        this.j0 = -1;
        this.k0 = -1;
        this.q0 = false;
        this.d0 = c();
        p11 p11Var = new p11();
        this.a = p11Var;
        p11Var.M(0);
        Context context2 = getContext();
        int integer = getResources().getInteger(com.indeed.android.jobsearch.R.integer.material_motion_duration_long_1);
        TypedValue typedValueA = me9.a(context2, com.indeed.android.jobsearch.R.attr.motionDurationLong1);
        if (typedValueA != null && typedValueA.type == 16) {
            integer = typedValueA.data;
        }
        p11Var.B(integer);
        p11Var.D(yz9.c(getContext(), be0.b));
        p11Var.J(new pjf());
        this.b = new a((zj1) this);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setImportantForAccessibility(1);
    }

    private oca getNewItem() {
        oca ocaVar = (oca) this.c.acquire();
        return ocaVar == null ? e(getContext()) : ocaVar;
    }

    private void setBadgeIfNeeded(oca ocaVar) {
        BadgeDrawable badgeDrawable;
        int id = ocaVar.getId();
        if (id == -1 || (badgeDrawable = this.i0.get(id)) == null) {
            return;
        }
        ocaVar.setBadge(badgeDrawable);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void a(f fVar) {
        this.t0 = fVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void b() {
        removeAllViews();
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                if (ocaVar != null) {
                    this.c.a(ocaVar);
                    ImageView imageView = ocaVar.c0;
                    if (ocaVar.t0 != null) {
                        if (imageView != null) {
                            ocaVar.setClipChildren(true);
                            ocaVar.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = ocaVar.t0;
                            if (badgeDrawable != null) {
                                WeakReference<FrameLayout> weakReference = badgeDrawable.e0;
                                if ((weakReference != null ? weakReference.get() : null) != null) {
                                    WeakReference<FrameLayout> weakReference2 = badgeDrawable.e0;
                                    (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        ocaVar.t0 = null;
                    }
                    ocaVar.h0 = null;
                    ocaVar.n0 = 0.0f;
                    ocaVar.a = false;
                }
            }
        }
        if (this.t0.f.size() == 0) {
            this.V = 0;
            this.W = 0;
            this.f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.t0.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.t0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.i0.size(); i2++) {
            int iKeyAt = this.i0.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.i0.delete(iKeyAt);
            }
        }
        this.f = new oca[this.t0.f.size()];
        int i3 = this.e;
        boolean z = i3 != -1 ? i3 == 0 : this.t0.l().size() > 3;
        for (int i4 = 0; i4 < this.t0.f.size(); i4++) {
            this.s0.b = true;
            this.t0.getItem(i4).setCheckable(true);
            this.s0.b = false;
            oca newItem = getNewItem();
            this.f[i4] = newItem;
            newItem.setIconTintList(this.a0);
            newItem.setIconSize(this.b0);
            newItem.setTextColor(this.d0);
            newItem.setTextAppearanceInactive(this.e0);
            newItem.setTextAppearanceActive(this.f0);
            newItem.setTextColor(this.c0);
            int i5 = this.j0;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.k0;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            newItem.setActiveIndicatorWidth(this.m0);
            newItem.setActiveIndicatorHeight(this.n0);
            newItem.setActiveIndicatorMarginHorizontal(this.o0);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.q0);
            newItem.setActiveIndicatorEnabled(this.l0);
            Drawable drawable = this.g0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.h0);
            }
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.e);
            h hVar = (h) this.t0.getItem(i4);
            newItem.c(hVar);
            newItem.setItemPosition(i4);
            int i7 = hVar.a;
            newItem.setOnTouchListener(this.d.get(i7));
            newItem.setOnClickListener(this.b);
            int i8 = this.V;
            if (i8 != 0 && i7 == i8) {
                this.W = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.t0.f.size() - 1, this.W);
        this.W = iMin;
        this.t0.getItem(iMin).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListZ = pnb.z(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.indeed.android.jobsearch.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListZ.getDefaultColor();
        int[] iArr = u0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = v0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListZ.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final ze9 d() {
        if (this.p0 == null || this.r0 == null) {
            return null;
        }
        ze9 ze9Var = new ze9(this.p0);
        ze9Var.k(this.r0);
        return ze9Var;
    }

    public abstract yj1 e(Context context);

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.i0;
    }

    public ColorStateList getIconTintList() {
        return this.a0;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.r0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.l0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.n0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.o0;
    }

    public ece getItemActiveIndicatorShapeAppearance() {
        return this.p0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.m0;
    }

    public Drawable getItemBackground() {
        oca[] ocaVarArr = this.f;
        return (ocaVarArr == null || ocaVarArr.length <= 0) ? this.g0 : ocaVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.h0;
    }

    public int getItemIconSize() {
        return this.b0;
    }

    public int getItemPaddingBottom() {
        return this.k0;
    }

    public int getItemPaddingTop() {
        return this.j0;
    }

    public int getItemTextAppearanceActive() {
        return this.f0;
    }

    public int getItemTextAppearanceInactive() {
        return this.e0;
    }

    public ColorStateList getItemTextColor() {
        return this.c0;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    public f getMenu() {
        return this.t0;
    }

    public int getSelectedItemId() {
        return this.V;
    }

    public int getSelectedItemPosition() {
        return this.W;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(1, this.t0.l().size(), 1).a);
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.i0 = sparseArray;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setBadge(sparseArray.get(ocaVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.a0 = colorStateList;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.l0 = z;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.n0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.o0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.q0 = z;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ece eceVar) {
        this.p0 = eceVar;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.m0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.g0 = drawable;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.h0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.b0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.k0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.j0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.c0;
                if (colorStateList != null) {
                    ocaVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.e0 = i;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.c0;
                if (colorStateList != null) {
                    ocaVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.c0 = colorStateList;
        oca[] ocaVarArr = this.f;
        if (ocaVarArr != null) {
            for (oca ocaVar : ocaVarArr) {
                ocaVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.s0 = navigationBarPresenter;
    }
}
