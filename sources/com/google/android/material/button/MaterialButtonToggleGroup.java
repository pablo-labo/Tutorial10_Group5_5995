package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.indeed.android.jobsearch.R;
import defpackage.ece;
import defpackage.epg;
import defpackage.ff9;
import defpackage.gsg;
import defpackage.jkf;
import defpackage.k0;
import defpackage.lac;
import defpackage.prg;
import defpackage.s03;
import defpackage.t6;
import defpackage.y5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int c0 = 0;
    public boolean V;
    public boolean W;
    public final ArrayList a;
    public boolean a0;
    public final c b;
    public int b0;
    public final f c;
    public final LinkedHashSet<e> d;
    public final a e;
    public Integer[] f;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.f0).compareTo(Boolean.valueOf(materialButton4.f0));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends y5 {
        public b() {
        }

        @Override // defpackage.y5
        public final void d(t6 t6Var, View view) {
            this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
            int i = MaterialButtonToggleGroup.c0;
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                        i4++;
                    }
                    i3++;
                }
            }
            t6Var.q(t6.f.a(0, 1, i2, ((MaterialButton) view).f0, 1));
        }
    }

    public class c implements MaterialButton.a {
        public c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public final void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.V) {
                return;
            }
            if (materialButtonToggleGroup.W) {
                materialButtonToggleGroup.b0 = z ? materialButton.getId() : -1;
            }
            if (materialButtonToggleGroup.d(materialButton.getId(), z)) {
                materialButtonToggleGroup.b(materialButton.getId(), materialButton.f0);
            }
            materialButtonToggleGroup.invalidate();
        }
    }

    public static class d {
        public static final k0 e = new k0(0.0f);
        public final s03 a;
        public final s03 b;
        public final s03 c;
        public final s03 d;

        public d(s03 s03Var, s03 s03Var2, s03 s03Var3, s03 s03Var4) {
            this.a = s03Var;
            this.b = s03Var3;
            this.c = s03Var4;
            this.d = s03Var2;
        }
    }

    public interface e {
        void a();
    }

    public class f implements MaterialButton.b {
        public f() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(ff9.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.b = new c();
        this.c = new f();
        this.d = new LinkedHashSet<>();
        this.e = new a();
        this.V = false;
        TypedArray typedArrayD = jkf.d(getContext(), attributeSet, lac.q, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(2, false));
        this.b0 = typedArrayD.getResourceId(0, -1);
        this.a0 = typedArrayD.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayD.recycle();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.b0 = i;
        b(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.e.add(this.b);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.f0) {
            d(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        ece shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.a.add(new d(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        epg.o(materialButton, new b());
    }

    public final void b(int i, boolean z) {
        Iterator<e> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final boolean d(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.a0 && checkedButtonIds.isEmpty()) {
            View viewFindViewById = findViewById(i);
            if (viewFindViewById instanceof MaterialButton) {
                this.V = true;
                ((MaterialButton) viewFindViewById).setChecked(true);
                this.V = false;
            }
            this.b0 = i;
            return false;
        }
        if (z && this.W) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                View viewFindViewById2 = findViewById(iIntValue);
                if (viewFindViewById2 instanceof MaterialButton) {
                    this.V = true;
                    ((MaterialButton) viewFindViewById2).setChecked(false);
                    this.V = false;
                }
                b(iIntValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                ece.a aVarE = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    k0 k0Var = d.e;
                    if (i == firstVisibleChildIndex) {
                        dVar = z ? gsg.c(this) ? new d(k0Var, k0Var, dVar2.b, dVar2.c) : new d(dVar2.a, dVar2.d, k0Var, k0Var) : new d(dVar2.a, k0Var, dVar2.b, k0Var);
                    } else if (i == lastVisibleChildIndex) {
                        dVar = z ? gsg.c(this) ? new d(dVar2.a, dVar2.d, k0Var, k0Var) : new d(k0Var, k0Var, dVar2.b, dVar2.c) : new d(k0Var, dVar2.d, k0Var, dVar2.c);
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    aVarE.e = new k0(0.0f);
                    aVarE.f = new k0(0.0f);
                    aVarE.g = new k0(0.0f);
                    aVarE.h = new k0(0.0f);
                } else {
                    aVarE.e = dVar2.a;
                    aVarE.h = dVar2.d;
                    aVarE.f = dVar2.b;
                    aVarE.g = dVar2.c;
                }
                materialButton.setShapeAppearanceModel(aVarE.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.W) {
            return this.b0;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.f0) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.b0;
        if (i == -1 || (materialButton = (MaterialButton) findViewById(i)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t6.e.a(1, getVisibleButtonCount(), this.W ? 1 : 2).a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.e.remove(this.b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.a0 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.W != z) {
            this.W = z;
            this.V = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                materialButton.setChecked(false);
                b(materialButton.getId(), false);
            }
            this.V = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
