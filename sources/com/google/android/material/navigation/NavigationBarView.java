package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.customview.view.AbsSavedState;
import com.indeed.android.jobsearch.R;
import defpackage.bk1;
import defpackage.ece;
import defpackage.epg;
import defpackage.ff9;
import defpackage.fu2;
import defpackage.jkf;
import defpackage.k0;
import defpackage.ka2;
import defpackage.lac;
import defpackage.oze;
import defpackage.prg;
import defpackage.qca;
import defpackage.rca;
import defpackage.umf;
import defpackage.ydd;
import defpackage.ye9;
import defpackage.ze9;
import defpackage.zj1;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {
    public final qca a;
    public final rca b;
    public final NavigationBarPresenter c;
    public ColorStateList d;
    public oze e;
    public b f;

    public interface a {
    }

    public interface b {
    }

    public NavigationBarView(fu2 fu2Var) {
        super(ff9.a(fu2Var, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), null, R.attr.bottomNavigationStyle);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        navigationBarPresenter.b = false;
        this.c = navigationBarPresenter;
        Context context = getContext();
        jkf.a(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        int[] iArr = lac.A;
        jkf.b(context, null, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 10, 9);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        umf umfVar = new umf(context, typedArrayObtainStyledAttributes);
        qca qcaVar = new qca(context, getClass(), getMaxItemCount());
        this.a = qcaVar;
        zj1 zj1Var = new zj1(context);
        this.b = zj1Var;
        navigationBarPresenter.a = zj1Var;
        navigationBarPresenter.c = 1;
        zj1Var.setPresenter(navigationBarPresenter);
        qcaVar.b(navigationBarPresenter, qcaVar.a);
        getContext();
        navigationBarPresenter.a.t0 = qcaVar;
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            zj1Var.setIconTintList(umfVar.a(5));
        } else {
            zj1Var.setIconTintList(zj1Var.c());
        }
        setItemIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            setItemTextAppearanceInactive(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            setItemTextAppearanceActive(typedArrayObtainStyledAttributes.getResourceId(9, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            setItemTextColor(umfVar.a(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ze9 ze9Var = new ze9();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                ze9Var.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            ze9Var.i(context);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            setBackground(ze9Var);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setItemPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setItemPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        getBackground().mutate().setTintList(ye9.a(context, umfVar, 0));
        setLabelVisibilityMode(typedArrayObtainStyledAttributes.getInteger(12, -1));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            zj1Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(ye9.a(context, umfVar, 8));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, lac.z);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes2.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(ye9.b(context, typedArrayObtainStyledAttributes2, 2));
            setItemActiveIndicatorShapeAppearance(ece.a(context, typedArrayObtainStyledAttributes2.getResourceId(4, 0), 0, new k0(0.0f)).a());
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(13, 0);
            navigationBarPresenter.b = true;
            getMenuInflater().inflate(resourceId3, qcaVar);
            navigationBarPresenter.b = false;
            navigationBarPresenter.j(true);
        }
        umfVar.f();
        addView(zj1Var);
        qcaVar.e = new com.google.android.material.navigation.a((bk1) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.e == null) {
            this.e = new oze(getContext());
        }
        return this.e;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.b.getItemActiveIndicatorMarginHorizontal();
    }

    public ece getItemActiveIndicatorShapeAppearance() {
        return this.b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.d;
    }

    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.a;
    }

    public k getMenuView() {
        return this.b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.c;
    }

    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka2.G(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        Bundle bundle = savedState.c;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.a.u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jVar.f(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableH;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.c = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.a.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return savedState;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelableH = jVar.h()) != null) {
                    sparseArray.put(id, parcelableH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ka2.E(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(ece eceVar) {
        this.b.setItemActiveIndicatorShapeAppearance(eceVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.b.setItemBackground(drawable);
        this.d = null;
    }

    public void setItemBackgroundResource(int i) {
        this.b.setItemBackgroundRes(i);
        this.d = null;
    }

    public void setItemIconSize(int i) {
        this.b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = this.d;
        rca rcaVar = this.b;
        if (colorStateList2 == colorStateList) {
            if (colorStateList != null || rcaVar.getItemBackground() == null) {
                return;
            }
            rcaVar.setItemBackground(null);
            return;
        }
        this.d = colorStateList;
        if (colorStateList == null) {
            rcaVar.setItemBackground(null);
        } else {
            rcaVar.setItemBackground(new RippleDrawable(ydd.a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        rca rcaVar = this.b;
        if (rcaVar.getLabelVisibilityMode() != i) {
            rcaVar.setLabelVisibilityMode(i);
            this.c.j(false);
        }
    }

    public void setOnItemReselectedListener(a aVar) {
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f = bVar;
    }

    public void setSelectedItemId(int i) {
        qca qcaVar = this.a;
        MenuItem menuItemFindItem = qcaVar.findItem(i);
        if (menuItemFindItem == null || qcaVar.q(menuItemFindItem, this.c, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }
}
