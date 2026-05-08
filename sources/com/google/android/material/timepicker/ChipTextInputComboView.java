package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.gkf;
import defpackage.xr5;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip a;
    public final EditText b;
    public final TextView c;

    public class a extends gkf {
        public a() {
        }

        @Override // defpackage.gkf, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            Chip chip = chipTextInputComboView.a;
            if (zIsEmpty) {
                chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
            } else {
                chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        this.c = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.a;
        chip.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.b;
        editText.setVisibility(i);
        chip.setVisibility(z ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new xr5(editText, 1));
            if (TextUtils.isEmpty(editText.getText())) {
                return;
            }
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.a.toggle();
    }
}
