package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.b0;
import defpackage.be0;
import defpackage.ece;
import defpackage.epg;
import defpackage.gkf;
import defpackage.gt4;
import defpackage.hgd;
import defpackage.hh1;
import defpackage.k0;
import defpackage.me9;
import defpackage.nd4;
import defpackage.nf4;
import defpackage.od4;
import defpackage.pd4;
import defpackage.prg;
import defpackage.qd4;
import defpackage.t6;
import defpackage.ze9;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends gt4 {
    public final a e;
    public final ViewOnFocusChangeListenerC0156b f;
    public final c g;
    public final d h;

    @SuppressLint({"ClickableViewAccessibility"})
    public final e i;
    public boolean j;
    public boolean k;
    public long l;
    public StateListDrawable m;
    public ze9 n;
    public AccessibilityManager o;
    public ValueAnimator p;
    public ValueAnimator q;

    public class a extends gkf {

        /* JADX INFO: renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        public class RunnableC0155a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public RunnableC0155a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsPopupShowing = this.a.isPopupShowing();
                b bVar = b.this;
                bVar.g(zIsPopupShowing);
                bVar.j = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // defpackage.gkf, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            b bVar = b.this;
            EditText editText = bVar.a.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                b0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                return;
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (bVar.o.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !bVar.c.hasFocus()) {
                autoCompleteTextView.dismissDropDown();
            }
            autoCompleteTextView.post(new RunnableC0155a(autoCompleteTextView));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.b$b, reason: collision with other inner class name */
    public class ViewOnFocusChangeListenerC0156b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0156b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            b bVar = b.this;
            bVar.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            bVar.g(false);
            bVar.j = false;
        }
    }

    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, defpackage.y5
        public final void d(t6 t6Var, View view) {
            AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
            super.d(t6Var, view);
            if (!b.f(b.this.a.getEditText())) {
                t6Var.n(Spinner.class.getName());
            }
            if (accessibilityNodeInfo.isShowingHintText()) {
                accessibilityNodeInfo.setHintText(null);
            }
        }

        @Override // defpackage.y5
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            b bVar = b.this;
            TextInputLayout textInputLayout = bVar.a;
            EditText editText = textInputLayout.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                b0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                return;
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && bVar.o.isTouchExplorationEnabled() && !b.f(textInputLayout.getEditText())) {
                b.d(bVar, autoCompleteTextView);
            }
        }
    }

    public class d implements TextInputLayout.f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                b0.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                return;
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            b bVar = b.this;
            a aVar = bVar.e;
            TextInputLayout textInputLayout2 = bVar.a;
            int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(bVar.n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(bVar.m);
            }
            if (autoCompleteTextView.getKeyListener() == null) {
                int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                ze9 boxBackground = textInputLayout2.getBoxBackground();
                int iZ = hh1.z(autoCompleteTextView, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iZ2 = hh1.z(autoCompleteTextView, R.attr.colorSurface);
                    ze9 ze9Var = new ze9(boxBackground.a.a);
                    int iG = hh1.G(iZ, 0.1f, iZ2);
                    ze9Var.k(new ColorStateList(iArr, new int[]{iG, 0}));
                    ze9Var.setTint(iZ2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iG, iZ2});
                    ze9 ze9Var2 = new ze9(boxBackground.a.a);
                    ze9Var2.setTint(-1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ze9Var, ze9Var2), boxBackground});
                    WeakHashMap<View, prg> weakHashMap = epg.a;
                    autoCompleteTextView.setBackground(layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{hh1.G(iZ, 0.1f, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                    WeakHashMap<View, prg> weakHashMap2 = epg.a;
                    autoCompleteTextView.setBackground(rippleDrawable);
                }
            }
            autoCompleteTextView.setOnTouchListener(new od4(bVar, autoCompleteTextView));
            autoCompleteTextView.setOnFocusChangeListener(bVar.f);
            autoCompleteTextView.setOnDismissListener(new pd4(bVar));
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(aVar);
            autoCompleteTextView.addTextChangedListener(aVar);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (autoCompleteTextView.getKeyListener() == null) {
                CheckableImageButton checkableImageButton = bVar.c;
                WeakHashMap<View, prg> weakHashMap3 = epg.a;
                checkableImageButton.setImportantForAccessibility(2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(bVar.g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class e implements TextInputLayout.g {

        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.removeTextChangedListener(b.this.e);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            b.d(bVar, (AutoCompleteTextView) bVar.a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new ViewOnFocusChangeListenerC0156b();
        this.g = new c(textInputLayout);
        this.h = new d();
        this.i = new e();
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    public static void d(b bVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - bVar.l;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            bVar.j = false;
        }
        if (bVar.j) {
            bVar.j = false;
            return;
        }
        bVar.g(!bVar.k);
        if (!bVar.k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public static boolean f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    @Override // defpackage.gt4
    public final void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ze9 ze9VarE = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        ze9 ze9VarE2 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = ze9VarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, ze9VarE);
        this.m.addState(new int[0], ze9VarE2);
        int i = this.d;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new f());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.U0;
        d dVar = this.h;
        linkedHashSet.add(dVar);
        if (textInputLayout.e != null) {
            dVar.a(textInputLayout);
        }
        textInputLayout.Y0.add(this.i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = be0.a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67L);
        valueAnimatorOfFloat.addUpdateListener(new nd4(this));
        this.q = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50L);
        valueAnimatorOfFloat2.addUpdateListener(new nd4(this));
        this.p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new qd4(this));
        this.o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // defpackage.gt4
    public final boolean b(int i) {
        return i != 0;
    }

    public final ze9 e(float f2, float f3, float f4, int i) {
        hgd hgdVar = new hgd();
        hgd hgdVar2 = new hgd();
        hgd hgdVar3 = new hgd();
        hgd hgdVar4 = new hgd();
        nf4 nf4Var = new nf4();
        nf4 nf4Var2 = new nf4();
        nf4 nf4Var3 = new nf4();
        nf4 nf4Var4 = new nf4();
        k0 k0Var = new k0(f2);
        k0 k0Var2 = new k0(f2);
        k0 k0Var3 = new k0(f3);
        k0 k0Var4 = new k0(f3);
        ece eceVar = new ece();
        eceVar.a = hgdVar;
        eceVar.b = hgdVar2;
        eceVar.c = hgdVar3;
        eceVar.d = hgdVar4;
        eceVar.e = k0Var;
        eceVar.f = k0Var2;
        eceVar.g = k0Var4;
        eceVar.h = k0Var3;
        eceVar.i = nf4Var;
        eceVar.j = nf4Var2;
        eceVar.k = nf4Var3;
        eceVar.l = nf4Var4;
        Paint paint = ze9.l0;
        String simpleName = ze9.class.getSimpleName();
        Context context = this.b;
        int iB = me9.b(context, simpleName, R.attr.colorSurface);
        ze9 ze9Var = new ze9();
        ze9Var.i(context);
        ze9Var.k(ColorStateList.valueOf(iB));
        ze9Var.j(f4);
        ze9Var.setShapeAppearanceModel(eceVar);
        ze9.b bVar = ze9Var.a;
        if (bVar.g == null) {
            bVar.g = new Rect();
        }
        ze9Var.a.g.set(0, i, 0, i);
        ze9Var.invalidateSelf();
        return ze9Var;
    }

    public final void g(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.q.cancel();
            this.p.start();
        }
    }
}
