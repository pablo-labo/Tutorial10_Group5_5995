package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.ff9;
import defpackage.jkf;
import defpackage.lac;
import defpackage.prg;
import defpackage.t6;
import defpackage.vk5;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ChipGroup extends vk5 {
    public boolean V;
    public boolean W;
    public final a a0;
    public final d b0;
    public int c0;
    public boolean d0;
    public int e;
    public int f;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.d0) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.W) {
                chipGroup.d(compoundButton.getId(), true);
                chipGroup.c0 = compoundButton.getId();
                return;
            }
            int id = compoundButton.getId();
            int i = chipGroup.c0;
            if (!z) {
                if (i == id) {
                    chipGroup.setCheckedId(-1);
                }
            } else {
                if (i != -1 && i != id && chipGroup.V) {
                    chipGroup.d(i, false);
                }
                chipGroup.setCheckedId(id);
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
    }

    public interface c {
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener a;

        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    view2.setId(View.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(chipGroup.a0);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        this.a0 = new a();
        d dVar = new d();
        this.b0 = dVar;
        this.c0 = -1;
        this.d0 = false;
        TypedArray typedArrayD = jkf.d(getContext(), attributeSet, lac.g, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        int resourceId = typedArrayD.getResourceId(0, -1);
        if (resourceId != -1) {
            this.c0 = resourceId;
        }
        typedArrayD.recycle();
        super.setOnHierarchyChangeListener(dVar);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.c0 = i;
    }

    @Override // defpackage.vk5
    public final boolean a() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.c0;
                if (i2 != -1 && this.V) {
                    d(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void c(int i) {
        int i2 = this.c0;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.V) {
            d(i2, false);
        }
        if (i != -1) {
            d(i, true);
        }
        setCheckedId(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final void d(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.d0 = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.d0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.V) {
            return this.c0;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.V) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.c0;
        if (i != -1) {
            d(i, true);
            setCheckedId(this.c0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(getRowCount(), this.c ? getChipCount() : -1, this.V ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f != i) {
            this.f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(c cVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.b0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.W = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.V != z) {
            this.V = z;
            this.d0 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.d0 = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // defpackage.vk5
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
