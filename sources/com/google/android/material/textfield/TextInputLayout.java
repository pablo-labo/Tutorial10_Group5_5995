package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.indeed.android.jobsearch.R;
import defpackage.ac4;
import defpackage.be0;
import defpackage.bf1;
import defpackage.bg;
import defpackage.bia;
import defpackage.dz3;
import defpackage.eb2;
import defpackage.ec3;
import defpackage.ece;
import defpackage.epg;
import defpackage.ff9;
import defpackage.gsg;
import defpackage.gt4;
import defpackage.h92;
import defpackage.hcf;
import defpackage.i62;
import defpackage.j65;
import defpackage.jkf;
import defpackage.k0;
import defpackage.l5;
import defpackage.lac;
import defpackage.me9;
import defpackage.nw1;
import defpackage.oa3;
import defpackage.osf;
import defpackage.pj0;
import defpackage.pnb;
import defpackage.prg;
import defpackage.t6;
import defpackage.tdf;
import defpackage.umf;
import defpackage.va7;
import defpackage.w20;
import defpackage.y5;
import defpackage.ye9;
import defpackage.ze9;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public final int A0;
    public boolean A1;
    public int B0;
    public boolean B1;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public final Rect I0;
    public final Rect J0;
    public final RectF K0;
    public Typeface L0;
    public final CheckableImageButton M0;
    public ColorStateList N0;
    public boolean O0;
    public PorterDuff.Mode P0;
    public boolean Q0;
    public ColorDrawable R0;
    public int S0;
    public View.OnLongClickListener T0;
    public final LinkedHashSet<f> U0;
    public int V;
    public int V0;
    public int W;
    public final SparseArray<gt4> W0;
    public final CheckableImageButton X0;
    public final LinkedHashSet<g> Y0;
    public ColorStateList Z0;
    public final FrameLayout a;
    public final va7 a0;
    public boolean a1;
    public final LinearLayout b;
    public boolean b0;
    public PorterDuff.Mode b1;
    public final LinearLayout c;
    public int c0;
    public boolean c1;
    public final FrameLayout d;
    public boolean d0;
    public ColorDrawable d1;
    public EditText e;
    public AppCompatTextView e0;
    public int e1;
    public CharSequence f;
    public int f0;
    public Drawable f1;
    public int g0;
    public View.OnLongClickListener g1;
    public CharSequence h0;
    public View.OnLongClickListener h1;
    public boolean i0;
    public final CheckableImageButton i1;
    public AppCompatTextView j0;
    public ColorStateList j1;
    public ColorStateList k0;
    public ColorStateList k1;
    public int l0;
    public ColorStateList l1;
    public j65 m0;
    public int m1;
    public j65 n0;
    public int n1;
    public ColorStateList o0;
    public int o1;
    public ColorStateList p0;
    public ColorStateList p1;
    public CharSequence q0;
    public int q1;
    public final AppCompatTextView r0;
    public int r1;
    public CharSequence s0;
    public int s1;
    public final AppCompatTextView t0;
    public int t1;
    public boolean u0;
    public int u1;
    public CharSequence v0;
    public boolean v1;
    public boolean w0;
    public final h92 w1;
    public ze9 x0;
    public boolean x1;
    public ze9 y0;
    public boolean y1;
    public final ece z0;
    public ValueAnimator z1;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.B1, false);
            if (textInputLayout.b0) {
                textInputLayout.n(editable.length());
            }
            if (textInputLayout.i0) {
                textInputLayout.t(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.X0;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.w1.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends y5 {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.y5
        public void d(t6 t6Var, View view) {
            AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z = textInputLayout.v1;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            if (!zIsEmpty) {
                t6Var.x(text);
            } else if (!TextUtils.isEmpty(string)) {
                t6Var.x(string);
                if (!z && placeholderText != null) {
                    t6Var.x(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                t6Var.x(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setHintText(string);
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        float f2;
        int i;
        int i2;
        int resourceId;
        super(ff9.a(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        this.V = -1;
        this.W = -1;
        this.a0 = new va7(this);
        this.I0 = new Rect();
        this.J0 = new Rect();
        this.K0 = new RectF();
        this.U0 = new LinkedHashSet<>();
        this.V0 = 0;
        SparseArray<gt4> sparseArray = new SparseArray<>();
        this.W0 = sparseArray;
        this.Y0 = new LinkedHashSet<>();
        h92 h92Var = new h92(this);
        this.w1 = h92Var;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.c = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.d = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = be0.a;
        h92Var.H = linearInterpolator;
        h92Var.h();
        h92Var.G = linearInterpolator;
        h92Var.h();
        if (h92Var.h != 8388659) {
            h92Var.h = 8388659;
            h92Var.h();
        }
        jkf.a(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        int[] iArr = lac.I;
        jkf.b(context2, attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 20, 18, 33, 38, 42);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        umf umfVar = new umf(context2, typedArrayObtainStyledAttributes);
        this.u0 = typedArrayObtainStyledAttributes.getBoolean(41, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.y1 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        this.x1 = typedArrayObtainStyledAttributes.getBoolean(35, true);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        ece eceVarA = ece.b(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout).a();
        this.z0 = eceVarA;
        this.A0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.C0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.F0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.D0 = this.E0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(8, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, -1.0f);
        ece.a aVarE = eceVarA.e();
        if (dimension >= 0.0f) {
            f2 = 0.0f;
            aVarE.e = new k0(dimension);
        } else {
            f2 = 0.0f;
        }
        if (dimension2 >= f2) {
            aVarE.f = new k0(dimension2);
        }
        if (dimension3 >= f2) {
            aVarE.g = new k0(dimension3);
        }
        if (dimension4 >= f2) {
            aVarE.h = new k0(dimension4);
        }
        this.z0 = aVarE.a();
        ColorStateList colorStateListA = ye9.a(context2, umfVar, 5);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.q1 = defaultColor;
            this.H0 = defaultColor;
            if (colorStateListA.isStateful()) {
                this.r1 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.s1 = colorStateListA.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.t1 = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.s1 = this.q1;
                ColorStateList colorStateListZ = pnb.z(context2, R.color.mtrl_filled_background_color);
                this.r1 = colorStateListZ.getColorForState(new int[]{-16842910}, -1);
                this.t1 = colorStateListZ.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            i = 0;
        } else {
            i = 0;
            this.H0 = 0;
            this.q1 = 0;
            this.r1 = 0;
            this.s1 = 0;
            this.t1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListA2 = umfVar.a(1);
            this.l1 = colorStateListA2;
            this.k1 = colorStateListA2;
        }
        ColorStateList colorStateListA3 = ye9.a(context2, umfVar, 12);
        this.o1 = typedArrayObtainStyledAttributes.getColor(12, i);
        this.m1 = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.u1 = context2.getColor(R.color.mtrl_textinput_disabled_color);
        this.n1 = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListA3 != null) {
            setBoxStrokeColorStateList(colorStateListA3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setBoxStrokeErrorColor(ye9.a(context2, umfVar, 13));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(42, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(42, 0));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(33, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(28);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.i1 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (ye9.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            setErrorIconDrawable(umfVar.b(30));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            setErrorIconTintList(ye9.a(context2, umfVar, 31));
        }
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            setErrorIconTintMode(gsg.d(typedArrayObtainStyledAttributes.getInt(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, prg> weakHashMap = epg.a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(37, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(36);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(50, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(49);
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(53, 0);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(52);
        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(63, 0);
        CharSequence text5 = typedArrayObtainStyledAttributes.getText(62);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(17, -1));
        this.g0 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        this.f0 = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.M0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (ye9.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setStartIconDrawable(umfVar.b(59));
            if (typedArrayObtainStyledAttributes.hasValue(58)) {
                setStartIconContentDescription(typedArrayObtainStyledAttributes.getText(58));
            }
            setStartIconCheckable(typedArrayObtainStyledAttributes.getBoolean(57, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(60)) {
            setStartIconTintList(ye9.a(context2, umfVar, 60));
        }
        if (typedArrayObtainStyledAttributes.hasValue(61)) {
            setStartIconTintMode(gsg.d(typedArrayObtainStyledAttributes.getInt(61, -1), null));
        }
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.X0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (ye9.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(24, 0);
        sparseArray.append(-1, new oa3(this, resourceId7));
        sparseArray.append(0, new bia(this, 0));
        if (resourceId7 == 0) {
            i2 = resourceId3;
            resourceId = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        } else {
            i2 = resourceId3;
            resourceId = resourceId7;
        }
        sparseArray.append(1, new com.google.android.material.textfield.c(this, resourceId));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, resourceId7));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, resourceId7));
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getInt(25, 0));
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(23));
            }
            setEndIconCheckable(typedArrayObtainStyledAttributes.getBoolean(22, true));
        } else if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setEndIconMode(typedArrayObtainStyledAttributes.getBoolean(46, false) ? 1 : 0);
            setEndIconContentDescription(typedArrayObtainStyledAttributes.getText(44));
            if (typedArrayObtainStyledAttributes.hasValue(47)) {
                setEndIconTintList(ye9.a(context2, umfVar, 47));
            }
            if (typedArrayObtainStyledAttributes.hasValue(48)) {
                setEndIconTintMode(gsg.d(typedArrayObtainStyledAttributes.getInt(48, -1), null));
            }
        }
        if (!typedArrayObtainStyledAttributes.hasValue(46)) {
            if (typedArrayObtainStyledAttributes.hasValue(26)) {
                setEndIconTintList(ye9.a(context2, umfVar, 26));
            }
            if (typedArrayObtainStyledAttributes.hasValue(27)) {
                setEndIconTintMode(gsg.d(typedArrayObtainStyledAttributes.getInt(27, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.r0 = appCompatTextView;
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.t0 = appCompatTextView2;
        appCompatTextView2.setId(R.id.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        appCompatTextView2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z2);
        setHelperText(text2);
        setHelperTextTextAppearance(i2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId2);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.g0);
        setCounterOverflowTextAppearance(this.f0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId4);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId5);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId6);
        if (typedArrayObtainStyledAttributes.hasValue(34)) {
            setErrorTextColor(umfVar.a(34));
        }
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setHelperTextColor(umfVar.a(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(43)) {
            setHintTextColor(umfVar.a(43));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterTextColor(umfVar.a(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setCounterOverflowTextColor(umfVar.a(19));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setPlaceholderTextColor(umfVar.a(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(54)) {
            setPrefixTextColor(umfVar.a(54));
        }
        if (typedArrayObtainStyledAttributes.hasValue(64)) {
            setSuffixTextColor(umfVar.a(64));
        }
        setCounterEnabled(z3);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        umfVar.f();
        setImportantForAccessibility(2);
        epg.g.b(this, 1);
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private gt4 getEndIconDelegate() {
        int i = this.V0;
        SparseArray<gt4> sparseArray = this.W0;
        gt4 gt4Var = sparseArray.get(i);
        return gt4Var != null ? gt4Var : sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.i1;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.V0 == 0 || !g()) {
            return null;
        }
        return this.X0;
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.e != null) {
            l5.q("We already have an EditText, can only have one");
            return;
        }
        if (this.V0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        setMinWidth(this.V);
        setMaxWidth(this.W);
        h();
        setTextInputAccessibilityDelegate(new e(this));
        Typeface typeface = this.e.getTypeface();
        h92 h92Var = this.w1;
        nw1 nw1Var = h92Var.v;
        if (nw1Var != null) {
            nw1Var.d = true;
        }
        if (h92Var.s != typeface) {
            h92Var.s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (h92Var.t != typeface) {
            h92Var.t = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            h92Var.h();
        }
        float textSize = this.e.getTextSize();
        if (h92Var.i != textSize) {
            h92Var.i = textSize;
            h92Var.h();
        }
        int gravity = this.e.getGravity();
        int i = (gravity & (-113)) | 48;
        if (h92Var.h != i) {
            h92Var.h = i;
            h92Var.h();
        }
        if (h92Var.g != gravity) {
            h92Var.g = gravity;
            h92Var.h();
        }
        this.e.addTextChangedListener(new a());
        if (this.k1 == null) {
            this.k1 = this.e.getHintTextColors();
        }
        if (this.u0) {
            if (TextUtils.isEmpty(this.v0)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.w0 = true;
        }
        if (this.e0 != null) {
            n(this.e.getText().length());
        }
        q();
        this.a0.b();
        this.b.bringToFront();
        this.c.bringToFront();
        this.d.bringToFront();
        this.i1.bringToFront();
        Iterator<f> it = this.U0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.i1.setVisibility(z ? 0 : 8);
        this.d.setVisibility(z ? 8 : 0);
        x();
        if (this.V0 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.v0)) {
            return;
        }
        this.v0 = charSequence;
        h92 h92Var = this.w1;
        if (charSequence == null || !TextUtils.equals(h92Var.w, charSequence)) {
            h92Var.w = charSequence;
            h92Var.x = null;
            Bitmap bitmap = h92Var.z;
            if (bitmap != null) {
                bitmap.recycle();
                h92Var.z = null;
            }
            h92Var.h();
        }
        if (this.v1) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.i0 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.j0 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            j65 j65Var = new j65();
            j65Var.c = 87L;
            LinearInterpolator linearInterpolator = be0.a;
            j65Var.d = linearInterpolator;
            this.m0 = j65Var;
            j65Var.b = 67L;
            j65 j65Var2 = new j65();
            j65Var2.c = 87L;
            j65Var2.d = linearInterpolator;
            this.n0 = j65Var2;
            AppCompatTextView appCompatTextView2 = this.j0;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.l0);
            setPlaceholderTextColor(this.k0);
            AppCompatTextView appCompatTextView3 = this.j0;
            if (appCompatTextView3 != null) {
                this.a.addView(appCompatTextView3);
                this.j0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView4 = this.j0;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setVisibility(8);
            }
            this.j0 = null;
        }
        this.i0 = z;
    }

    public final void a(float f2) {
        h92 h92Var = this.w1;
        if (h92Var.c == f2) {
            return;
        }
        if (this.z1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z1 = valueAnimator;
            valueAnimator.setInterpolator(be0.b);
            this.z1.setDuration(167L);
            this.z1.addUpdateListener(new d());
        }
        this.z1.setFloatValues(h92Var.c, f2);
        this.z1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        int i3;
        ze9 ze9Var = this.x0;
        if (ze9Var == null) {
            return;
        }
        ze9Var.setShapeAppearanceModel(this.z0);
        if (this.B0 == 2 && (i2 = this.D0) > -1 && (i3 = this.G0) != 0) {
            ze9 ze9Var2 = this.x0;
            ze9Var2.a.j = i2;
            ze9Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i3);
            ze9.b bVar = ze9Var2.a;
            if (bVar.d != colorStateListValueOf) {
                bVar.d = colorStateListValueOf;
                ze9Var2.onStateChange(ze9Var2.getState());
            }
        }
        int iC = this.H0;
        if (this.B0 == 1) {
            TypedValue typedValueA = me9.a(getContext(), R.attr.colorSurface);
            iC = eb2.c(this.H0, typedValueA != null ? typedValueA.data : 0);
        }
        this.H0 = iC;
        this.x0.k(ColorStateList.valueOf(iC));
        if (this.V0 == 3) {
            this.e.getBackground().invalidateSelf();
        }
        ze9 ze9Var3 = this.y0;
        if (ze9Var3 != null) {
            if (this.D0 > -1 && (i = this.G0) != 0) {
                ze9Var3.k(ColorStateList.valueOf(i));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.X0, this.a1, this.Z0, this.c1, this.b1);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.w0;
            this.w0 = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.w0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.B1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.u0) {
            h92 h92Var = this.w1;
            h92Var.getClass();
            int iSave = canvas.save();
            if (h92Var.x != null && h92Var.b) {
                h92Var.N.getLineLeft(0);
                h92Var.E.setTextSize(h92Var.B);
                float f2 = h92Var.q;
                float f3 = h92Var.r;
                float f4 = h92Var.A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                h92Var.N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        ze9 ze9Var = this.y0;
        if (ze9Var != null) {
            Rect bounds = ze9Var.getBounds();
            bounds.top = bounds.bottom - this.D0;
            this.y0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.A1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            h92 r3 = r4.w1
            if (r3 == 0) goto L2f
            r3.C = r1
            android.content.res.ColorStateList r1 = r3.l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.e
            if (r3 == 0) goto L47
            java.util.WeakHashMap<android.view.View, prg> r3 = defpackage.epg.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.s(r0, r2)
        L47:
            r4.q()
            r4.z()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.A1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        float fD;
        if (!this.u0) {
            return 0;
        }
        int i = this.B0;
        h92 h92Var = this.w1;
        if (i == 0 || i == 1) {
            fD = h92Var.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = h92Var.d() / 2.0f;
        }
        return (int) fD;
    }

    public final boolean f() {
        return this.u0 && !TextUtils.isEmpty(this.v0) && (this.x0 instanceof ec3);
    }

    public final boolean g() {
        return this.d.getVisibility() == 0 && this.X0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public ze9 getBoxBackground() {
        int i = this.B0;
        if (i == 1 || i == 2) {
            return this.x0;
        }
        bg.h();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.H0;
    }

    public int getBoxBackgroundMode() {
        return this.B0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.C0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        ze9 ze9Var = this.x0;
        return ze9Var.a.a.h.a(ze9Var.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        ze9 ze9Var = this.x0;
        return ze9Var.a.a.g.a(ze9Var.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        ze9 ze9Var = this.x0;
        return ze9Var.a.a.f.a(ze9Var.g());
    }

    public float getBoxCornerRadiusTopStart() {
        ze9 ze9Var = this.x0;
        return ze9Var.a.a.e.a(ze9Var.g());
    }

    public int getBoxStrokeColor() {
        return this.o1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.p1;
    }

    public int getBoxStrokeWidth() {
        return this.E0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.F0;
    }

    public int getCounterMaxLength() {
        return this.c0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.b0 && this.d0 && (appCompatTextView = this.e0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.o0;
    }

    public ColorStateList getCounterTextColor() {
        return this.o0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.k1;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.X0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.X0.getDrawable();
    }

    public int getEndIconMode() {
        return this.V0;
    }

    public CheckableImageButton getEndIconView() {
        return this.X0;
    }

    public CharSequence getError() {
        va7 va7Var = this.a0;
        if (va7Var.k) {
            return va7Var.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.a0.m;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.a0.l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.i1.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        AppCompatTextView appCompatTextView = this.a0.l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        va7 va7Var = this.a0;
        if (va7Var.q) {
            return va7Var.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.a0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.u0) {
            return this.v0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.w1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        h92 h92Var = this.w1;
        return h92Var.e(h92Var.l);
    }

    public ColorStateList getHintTextColor() {
        return this.l1;
    }

    public int getMaxWidth() {
        return this.W;
    }

    public int getMinWidth() {
        return this.V;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.X0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.X0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.i0) {
            return this.h0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.l0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.k0;
    }

    public CharSequence getPrefixText() {
        return this.q0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.r0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.r0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.M0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.M0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.s0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.t0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.t0;
    }

    public Typeface getTypeface() {
        return this.L0;
    }

    public final void h() {
        int i = this.B0;
        if (i != 0) {
            ece eceVar = this.z0;
            if (i == 1) {
                this.x0 = new ze9(eceVar);
                this.y0 = new ze9();
            } else {
                if (i != 2) {
                    l5.q(w20.k(new StringBuilder(), this.B0, " is illegal; only @BoxBackgroundMode constants are supported."));
                    return;
                }
                if (!this.u0 || (this.x0 instanceof ec3)) {
                    this.x0 = new ze9(eceVar);
                } else {
                    this.x0 = new ec3(eceVar);
                }
                this.y0 = null;
            }
        } else {
            this.x0 = null;
            this.y0 = null;
        }
        EditText editText = this.e;
        if (editText != null && this.x0 != null && editText.getBackground() == null && this.B0 != 0) {
            EditText editText2 = this.e;
            ze9 ze9Var = this.x0;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            editText2.setBackground(ze9Var);
        }
        z();
        if (this.B0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.C0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ye9.d(getContext())) {
                this.C0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.e != null && this.B0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.e;
                WeakHashMap<View, prg> weakHashMap2 = epg.a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ye9.d(getContext())) {
                EditText editText4 = this.e;
                WeakHashMap<View, prg> weakHashMap3 = epg.a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.B0 != 0) {
            r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public final void m(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final void n(int i) {
        boolean z = this.d0;
        int i2 = this.c0;
        if (i2 == -1) {
            this.e0.setText(String.valueOf(i));
            this.e0.setContentDescription(null);
            this.d0 = false;
        } else {
            this.d0 = i > i2;
            Context context = getContext();
            this.e0.setContentDescription(context.getString(this.d0 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.c0)));
            if (z != this.d0) {
                o();
            }
            String str = bf1.b;
            bf1 bf1Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? bf1.e : bf1.d;
            AppCompatTextView appCompatTextView = this.e0;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.c0));
            bf1Var.getClass();
            tdf.d dVar = tdf.a;
            appCompatTextView.setText(string != null ? bf1Var.c(string).toString() : null);
        }
        if (this.e == null || z == this.d0) {
            return;
        }
        s(false, false);
        z();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.e0;
        if (appCompatTextView != null) {
            m(appCompatTextView, this.d0 ? this.f0 : this.g0);
            if (!this.d0 && (colorStateList2 = this.o0) != null) {
                this.e0.setTextColor(colorStateList2);
            }
            if (!this.d0 || (colorStateList = this.p0) == null) {
                return;
            }
            this.e0.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.I0;
            dz3.a(this, editText, rect);
            ze9 ze9Var = this.y0;
            if (ze9Var != null) {
                int i5 = rect.bottom;
                ze9Var.setBounds(rect.left, i5 - this.F0, rect.right, i5);
            }
            if (this.u0) {
                float textSize = this.e.getTextSize();
                h92 h92Var = this.w1;
                if (h92Var.i != textSize) {
                    h92Var.i = textSize;
                    h92Var.h();
                }
                int gravity = this.e.getGravity();
                int i6 = (gravity & (-113)) | 48;
                if (h92Var.h != i6) {
                    h92Var.h = i6;
                    h92Var.h();
                }
                if (h92Var.g != gravity) {
                    h92Var.g = gravity;
                    h92Var.h();
                }
                if (this.e == null) {
                    bg.h();
                    return;
                }
                WeakHashMap<View, prg> weakHashMap = epg.a;
                boolean z2 = getLayoutDirection() == 1;
                int i7 = rect.bottom;
                Rect rect2 = this.J0;
                rect2.bottom = i7;
                int i8 = this.B0;
                int i9 = rect.left;
                AppCompatTextView appCompatTextView = this.r0;
                if (i8 == 1) {
                    int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + i9;
                    if (this.q0 != null && !z2) {
                        compoundPaddingLeft = (compoundPaddingLeft - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.C0;
                    int compoundPaddingRight = rect.right - this.e.getCompoundPaddingRight();
                    if (this.q0 != null && z2) {
                        compoundPaddingRight += appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i8 != 2) {
                    int compoundPaddingLeft2 = this.e.getCompoundPaddingLeft() + i9;
                    if (this.q0 != null && !z2) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - appCompatTextView.getMeasuredWidth()) + appCompatTextView.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.e.getCompoundPaddingRight();
                    if (this.q0 != null && z2) {
                        compoundPaddingRight2 += appCompatTextView.getMeasuredWidth() - appCompatTextView.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.e.getPaddingLeft() + i9;
                    rect2.top = rect.top - e();
                    rect2.right = rect.right - this.e.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = h92Var.e;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    h92Var.D = true;
                    h92Var.g();
                }
                if (this.e == null) {
                    bg.h();
                    return;
                }
                TextPaint textPaint = h92Var.F;
                textPaint.setTextSize(h92Var.i);
                textPaint.setTypeface(h92Var.t);
                textPaint.setLetterSpacing(0.0f);
                float f2 = -textPaint.ascent();
                rect2.left = this.e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.B0 != 1 || this.e.getMinLines() > 1) ? rect.top + this.e.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.B0 != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = h92Var.d;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    h92Var.D = true;
                    h92Var.g();
                }
                h92Var.h();
                if (!f() || this.v1) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zP = p();
        if (z || zP) {
            this.e.post(new c());
        }
        if (this.j0 != null && (editText = this.e) != null) {
            this.j0.setGravity(editText.getGravity());
            this.j0.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setError(savedState.c);
        if (savedState.d) {
            this.X0.post(new b());
        }
        setHint(savedState.e);
        setHelperText(savedState.f);
        setPlaceholderText(savedState.V);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.a0.e()) {
            savedState.c = getError();
        }
        savedState.d = this.V0 != 0 && this.X0.d;
        savedState.e = getHint();
        savedState.f = getHelperText();
        savedState.V = getPlaceholderText();
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.B0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = ac4.a;
        Drawable drawableMutate = background.mutate();
        va7 va7Var = this.a0;
        if (va7Var.e()) {
            AppCompatTextView appCompatTextView2 = va7Var.l;
            drawableMutate.setColorFilter(pj0.c(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.d0 && (appCompatTextView = this.e0) != null) {
            drawableMutate.setColorFilter(pj0.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void r() {
        if (this.B0 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        va7 va7Var = this.a0;
        boolean zE = va7Var.e();
        ColorStateList colorStateList2 = this.k1;
        h92 h92Var = this.w1;
        if (colorStateList2 != null) {
            h92Var.i(colorStateList2);
            ColorStateList colorStateList3 = this.k1;
            if (h92Var.k != colorStateList3) {
                h92Var.k = colorStateList3;
                h92Var.h();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.k1;
            int colorForState = this.u1;
            if (colorStateList4 != null) {
                colorForState = colorStateList4.getColorForState(new int[]{-16842910}, colorForState);
            }
            h92Var.i(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (h92Var.k != colorStateListValueOf) {
                h92Var.k = colorStateListValueOf;
                h92Var.h();
            }
        } else if (zE) {
            AppCompatTextView appCompatTextView2 = va7Var.l;
            h92Var.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.d0 && (appCompatTextView = this.e0) != null) {
            h92Var.i(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.l1) != null) {
            h92Var.i(colorStateList);
        }
        if (z3 || !this.x1 || (isEnabled() && z4)) {
            if (z2 || this.v1) {
                ValueAnimator valueAnimator = this.z1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z1.cancel();
                }
                if (z && this.y1) {
                    a(1.0f);
                } else {
                    h92Var.j(1.0f);
                }
                this.v1 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.e;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z2 || !this.v1) {
            ValueAnimator valueAnimator2 = this.z1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z1.cancel();
            }
            if (z && this.y1) {
                a(0.0f);
            } else {
                h92Var.j(0.0f);
            }
            if (f() && !((ec3) this.x0).n0.isEmpty() && f()) {
                ((ec3) this.x0).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.v1 = true;
            AppCompatTextView appCompatTextView3 = this.j0;
            if (appCompatTextView3 != null && this.i0) {
                appCompatTextView3.setText((CharSequence) null);
                osf.a(this.a, this.n0);
                this.j0.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            this.q1 = i;
            this.s1 = i;
            this.t1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.q1 = defaultColor;
        this.H0 = defaultColor;
        this.r1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.s1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.t1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.B0) {
            return;
        }
        this.B0 = i;
        if (this.e != null) {
            h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.C0 = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.o1 != i) {
            this.o1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.m1 = colorStateList.getDefaultColor();
            this.u1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.n1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.o1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.o1 != colorStateList.getDefaultColor()) {
            this.o1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.p1 != colorStateList) {
            this.p1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.E0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.F0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.b0 != z) {
            va7 va7Var = this.a0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.e0 = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.L0;
                if (typeface != null) {
                    this.e0.setTypeface(typeface);
                }
                this.e0.setMaxLines(1);
                va7Var.a(this.e0, 2);
                ((ViewGroup.MarginLayoutParams) this.e0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.e0 != null) {
                    EditText editText = this.e;
                    n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                va7Var.h(this.e0, 2);
                this.e0 = null;
            }
            this.b0 = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.c0 != i) {
            if (i > 0) {
                this.c0 = i;
            } else {
                this.c0 = -1;
            }
            if (!this.b0 || this.e0 == null) {
                return;
            }
            EditText editText = this.e;
            n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.k1 = colorStateList;
        this.l1 = colorStateList;
        if (this.e != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.X0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.X0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? pnb.A(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.V0;
        this.V0 = i;
        Iterator<g> it = this.Y0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.B0)) {
            getEndIconDelegate().a();
            c();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.B0 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.g1;
        CheckableImageButton checkableImageButton = this.X0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.g1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.X0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            this.a1 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.b1 != mode) {
            this.b1 = mode;
            this.c1 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (g() != z) {
            this.X0.setVisibility(z ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        va7 va7Var = this.a0;
        if (!va7Var.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            va7Var.g();
            return;
        }
        va7Var.c();
        va7Var.j = charSequence;
        va7Var.l.setText(charSequence);
        int i = va7Var.h;
        if (i != 1) {
            va7Var.i = 1;
        }
        va7Var.j(i, va7Var.i, va7Var.i(va7Var.l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        va7 va7Var = this.a0;
        va7Var.m = charSequence;
        AppCompatTextView appCompatTextView = va7Var.l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        va7 va7Var = this.a0;
        TextInputLayout textInputLayout = va7Var.b;
        if (va7Var.k == z) {
            return;
        }
        va7Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(va7Var.a);
            va7Var.l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            va7Var.l.setTextAlignment(5);
            Typeface typeface = va7Var.u;
            if (typeface != null) {
                va7Var.l.setTypeface(typeface);
            }
            int i = va7Var.n;
            va7Var.n = i;
            AppCompatTextView appCompatTextView2 = va7Var.l;
            if (appCompatTextView2 != null) {
                va7Var.b.m(appCompatTextView2, i);
            }
            ColorStateList colorStateList = va7Var.o;
            va7Var.o = colorStateList;
            AppCompatTextView appCompatTextView3 = va7Var.l;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = va7Var.m;
            va7Var.m = charSequence;
            AppCompatTextView appCompatTextView4 = va7Var.l;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            va7Var.l.setVisibility(4);
            AppCompatTextView appCompatTextView5 = va7Var.l;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            appCompatTextView5.setAccessibilityLiveRegion(1);
            va7Var.a(va7Var.l, 0);
        } else {
            va7Var.g();
            va7Var.h(va7Var.l, 0);
            va7Var.l = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        va7Var.k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? pnb.A(getContext(), i) : null);
        k(this.i1, this.j1);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.h1;
        CheckableImageButton checkableImageButton = this.i1;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.h1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.i1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.j1 = colorStateList;
        CheckableImageButton checkableImageButton = this.i1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.i1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        va7 va7Var = this.a0;
        va7Var.n = i;
        AppCompatTextView appCompatTextView = va7Var.l;
        if (appCompatTextView != null) {
            va7Var.b.m(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        va7 va7Var = this.a0;
        va7Var.o = colorStateList;
        AppCompatTextView appCompatTextView = va7Var.l;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.x1 != z) {
            this.x1 = z;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        va7 va7Var = this.a0;
        if (zIsEmpty) {
            if (va7Var.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!va7Var.q) {
            setHelperTextEnabled(true);
        }
        va7Var.c();
        va7Var.p = charSequence;
        va7Var.r.setText(charSequence);
        int i = va7Var.h;
        if (i != 2) {
            va7Var.i = 2;
        }
        va7Var.j(i, va7Var.i, va7Var.i(va7Var.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        va7 va7Var = this.a0;
        va7Var.t = colorStateList;
        AppCompatTextView appCompatTextView = va7Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        va7 va7Var = this.a0;
        TextInputLayout textInputLayout = va7Var.b;
        if (va7Var.q == z) {
            return;
        }
        va7Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(va7Var.a);
            va7Var.r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            va7Var.r.setTextAlignment(5);
            Typeface typeface = va7Var.u;
            if (typeface != null) {
                va7Var.r.setTypeface(typeface);
            }
            va7Var.r.setVisibility(4);
            AppCompatTextView appCompatTextView2 = va7Var.r;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i = va7Var.s;
            va7Var.s = i;
            AppCompatTextView appCompatTextView3 = va7Var.r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i);
            }
            ColorStateList colorStateList = va7Var.t;
            va7Var.t = colorStateList;
            AppCompatTextView appCompatTextView4 = va7Var.r;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            va7Var.a(va7Var.r, 1);
        } else {
            va7Var.c();
            int i2 = va7Var.h;
            if (i2 == 2) {
                va7Var.i = 0;
            }
            va7Var.j(i2, va7Var.i, va7Var.i(va7Var.r, null));
            va7Var.h(va7Var.r, 1);
            va7Var.r = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        va7Var.q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        va7 va7Var = this.a0;
        va7Var.s = i;
        AppCompatTextView appCompatTextView = va7Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.u0) {
            this.u0 = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.v0)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.w0 = true;
            } else {
                this.w0 = false;
                if (!TextUtils.isEmpty(this.v0) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.v0);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        h92 h92Var = this.w1;
        TextInputLayout textInputLayout = h92Var.a;
        hcf hcfVar = new hcf(textInputLayout.getContext(), i);
        ColorStateList colorStateList = hcfVar.j;
        if (colorStateList != null) {
            h92Var.l = colorStateList;
        }
        float f2 = hcfVar.k;
        if (f2 != 0.0f) {
            h92Var.j = f2;
        }
        ColorStateList colorStateList2 = hcfVar.a;
        if (colorStateList2 != null) {
            h92Var.L = colorStateList2;
        }
        h92Var.J = hcfVar.e;
        h92Var.K = hcfVar.f;
        h92Var.I = hcfVar.g;
        h92Var.M = hcfVar.i;
        nw1 nw1Var = h92Var.v;
        if (nw1Var != null) {
            nw1Var.d = true;
        }
        i62 i62Var = new i62(h92Var);
        hcfVar.a();
        h92Var.v = new nw1(i62Var, hcfVar.n);
        hcfVar.c(textInputLayout.getContext(), h92Var.v);
        h92Var.h();
        this.l1 = h92Var.l;
        if (this.e != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.l1 != colorStateList) {
            if (this.k1 == null) {
                this.w1.i(colorStateList);
            }
            this.l1 = colorStateList;
            if (this.e != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.W = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.V = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? pnb.A(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.V0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.Z0 = colorStateList;
        this.a1 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.b1 = mode;
        this.c1 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.i0 && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.i0) {
                setPlaceholderTextEnabled(true);
            }
            this.h0 = charSequence;
        }
        EditText editText = this.e;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.l0 = i;
        AppCompatTextView appCompatTextView = this.j0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            AppCompatTextView appCompatTextView = this.j0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.q0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.r0.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i) {
        this.r0.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.r0.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.M0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.M0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d(checkableImageButton, this.O0, this.N0, this.Q0, this.P0);
            setStartIconVisible(true);
            k(checkableImageButton, this.N0);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.T0;
        CheckableImageButton checkableImageButton = this.M0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.T0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.M0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            this.O0 = true;
            d(this.M0, true, colorStateList, this.Q0, this.P0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.P0 != mode) {
            this.P0 = mode;
            this.Q0 = true;
            d(this.M0, this.O0, this.N0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.M0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.s0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.t0.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i) {
        this.t0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.t0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            epg.o(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.L0) {
            this.L0 = typeface;
            h92 h92Var = this.w1;
            nw1 nw1Var = h92Var.v;
            boolean z2 = true;
            if (nw1Var != null) {
                nw1Var.d = true;
            }
            if (h92Var.s != typeface) {
                h92Var.s = typeface;
                z = true;
            } else {
                z = false;
            }
            if (h92Var.t != typeface) {
                h92Var.t = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                h92Var.h();
            }
            va7 va7Var = this.a0;
            if (typeface != va7Var.u) {
                va7Var.u = typeface;
                AppCompatTextView appCompatTextView = va7Var.l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = va7Var.r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.e0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i) {
        FrameLayout frameLayout = this.a;
        if (i != 0 || this.v1) {
            AppCompatTextView appCompatTextView = this.j0;
            if (appCompatTextView == null || !this.i0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            osf.a(frameLayout, this.n0);
            this.j0.setVisibility(4);
            return;
        }
        AppCompatTextView appCompatTextView2 = this.j0;
        if (appCompatTextView2 == null || !this.i0) {
            return;
        }
        appCompatTextView2.setText(this.h0);
        osf.a(frameLayout, this.m0);
        this.j0.setVisibility(0);
        this.j0.bringToFront();
    }

    public final void u() {
        int paddingStart;
        if (this.e == null) {
            return;
        }
        if (this.M0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.e;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.e.getCompoundPaddingBottom();
        WeakHashMap<View, prg> weakHashMap2 = epg.a;
        this.r0.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        this.r0.setVisibility((this.q0 == null || this.v1) ? 8 : 0);
        p();
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.p1.getDefaultColor();
        int colorForState = this.p1.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.p1.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.G0 = colorForState2;
        } else if (z2) {
            this.G0 = colorForState;
        } else {
            this.G0 = defaultColor;
        }
    }

    public final void x() {
        int paddingEnd;
        if (this.e == null) {
            return;
        }
        if (g() || this.i1.getVisibility() == 0) {
            paddingEnd = 0;
        } else {
            EditText editText = this.e;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.e.getPaddingTop();
        int paddingBottom = this.e.getPaddingBottom();
        WeakHashMap<View, prg> weakHashMap2 = epg.a;
        this.t0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void y() {
        AppCompatTextView appCompatTextView = this.t0;
        int visibility = appCompatTextView.getVisibility();
        boolean z = (this.s0 == null || this.v1) ? false : true;
        appCompatTextView.setVisibility(z ? 0 : 8);
        if (visibility != appCompatTextView.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        p();
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.x0 == null || this.B0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.e) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        va7 va7Var = this.a0;
        if (!zIsEnabled) {
            this.G0 = this.u1;
        } else if (va7Var.e()) {
            if (this.p1 != null) {
                w(z2, z3);
            } else {
                AppCompatTextView appCompatTextView2 = va7Var.l;
                this.G0 = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
            }
        } else if (!this.d0 || (appCompatTextView = this.e0) == null) {
            if (z2) {
                this.G0 = this.o1;
            } else if (z3) {
                this.G0 = this.n1;
            } else {
                this.G0 = this.m1;
            }
        } else if (this.p1 != null) {
            w(z2, z3);
        } else {
            this.G0 = appCompatTextView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && va7Var.k && va7Var.e()) {
            z = true;
        }
        setErrorIconVisible(z);
        k(this.i1, this.j1);
        k(this.M0, this.N0);
        ColorStateList colorStateList = this.Z0;
        CheckableImageButton checkableImageButton = this.X0;
        k(checkableImageButton, colorStateList);
        gt4 endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof com.google.android.material.textfield.b) {
            if (!va7Var.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                AppCompatTextView appCompatTextView3 = va7Var.l;
                drawableMutate.setTint(appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        int i = this.D0;
        if (z2 && isEnabled()) {
            this.D0 = this.F0;
        } else {
            this.D0 = this.E0;
        }
        if (this.D0 != i && this.B0 == 2 && f() && !this.v1) {
            if (f()) {
                ((ec3) this.x0).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            i();
        }
        if (this.B0 == 1) {
            if (!isEnabled()) {
                this.H0 = this.r1;
            } else if (z3 && !z2) {
                this.H0 = this.t1;
            } else if (z2) {
                this.H0 = this.s1;
            } else {
                this.H0 = this.q1;
            }
        }
        b();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence V;
        public CharSequence c;
        public boolean d;
        public CharSequence e;
        public CharSequence f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.c = (CharSequence) creator.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
            this.e = (CharSequence) creator.createFromParcel(parcel);
            this.f = (CharSequence) creator.createFromParcel(parcel);
            this.V = (CharSequence) creator.createFromParcel(parcel);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + " hint=" + ((Object) this.e) + " helperText=" + ((Object) this.f) + " placeholderText=" + ((Object) this.V) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.V, parcel, i);
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

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.X0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.X0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            c();
            k(checkableImageButton, this.Z0);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.u0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.X0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.X0.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.M0.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.i1.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.a0.k);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? pnb.A(getContext(), i) : null);
    }
}
