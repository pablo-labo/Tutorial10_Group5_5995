package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.indeed.android.jobsearch.R;
import defpackage.aj0;
import defpackage.cj0;
import defpackage.ek0;
import defpackage.ff9;
import defpackage.jkf;
import defpackage.lac;
import defpackage.oe9;
import defpackage.ue9;
import defpackage.wj0;
import defpackage.xe9;
import defpackage.ye9;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends ek0 {
    @Override // defpackage.ek0
    public final aj0 a(Context context, AttributeSet attributeSet) {
        return new oe9(context, attributeSet);
    }

    @Override // defpackage.ek0
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.ek0
    public final cj0 c(Context context, AttributeSet attributeSet) {
        ue9 ue9Var = new ue9(ff9.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        Context context2 = ue9Var.getContext();
        TypedArray typedArrayD = jkf.d(context2, attributeSet, lac.t, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (typedArrayD.hasValue(0)) {
            ue9Var.setButtonTintList(ye9.b(context2, typedArrayD, 0));
        }
        ue9Var.f = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        return ue9Var;
    }

    @Override // defpackage.ek0
    public final wj0 d(Context context, AttributeSet attributeSet) {
        xe9 xe9Var = new xe9(ff9.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = xe9Var.getContext();
        TypedArray typedArrayD = jkf.d(context2, attributeSet, lac.u, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            xe9Var.setButtonTintList(ye9.b(context2, typedArrayD, 0));
        }
        xe9Var.f = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        return xe9Var;
    }

    @Override // defpackage.ek0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
