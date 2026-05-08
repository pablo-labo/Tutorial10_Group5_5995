package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.a72;
import defpackage.b72;
import defpackage.be0;
import defpackage.c72;
import defpackage.d72;
import defpackage.gt4;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends gt4 {
    public final C0153a e;
    public final b f;
    public final c g;
    public final d h;
    public AnimatorSet i;
    public ValueAnimator j;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0153a implements TextWatcher {
        public C0153a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a aVar = a.this;
            if (aVar.a.getSuffixText() != null) {
                return;
            }
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            a aVar = a.this;
            textInputLayout.setEndIconVisible(a.d(aVar));
            textInputLayout.setEndIconCheckable(false);
            b bVar = aVar.f;
            editText.setOnFocusChangeListener(bVar);
            aVar.c.setOnFocusChangeListener(bVar);
            C0153a c0153a = aVar.e;
            editText.removeTextChangedListener(c0153a);
            editText.addTextChangedListener(c0153a);
        }
    }

    public class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        public class RunnableC0154a implements Runnable {
            public final /* synthetic */ EditText a;

            public RunnableC0154a(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.removeTextChangedListener(a.this.e);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i) {
            a aVar = a.this;
            CheckableImageButton checkableImageButton = aVar.c;
            b bVar = aVar.f;
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0154a(editText));
            if (editText.getOnFocusChangeListener() == bVar) {
                editText.setOnFocusChangeListener(null);
            }
            if (checkableImageButton.getOnFocusChangeListener() == bVar) {
                checkableImageButton.setOnFocusChangeListener(null);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TextInputLayout textInputLayout = a.this.a;
            Editable text = textInputLayout.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            textInputLayout.k(textInputLayout.X0, textInputLayout.Z0);
        }
    }

    public a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new C0153a();
        this.f = new b();
        this.g = new c();
        this.h = new d();
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.a.getEditText();
        if (editText != null) {
            return (editText.hasFocus() || aVar.c.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }

    @Override // defpackage.gt4
    public final void a() {
        int i = this.d;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new e());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.U0;
        c cVar = this.g;
        linkedHashSet.add(cVar);
        if (textInputLayout.e != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.Y0.add(this.h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(be0.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new d72(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = be0.a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new c72(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.i.addListener(new a72(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new c72(this));
        this.j = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new b72(this));
    }

    @Override // defpackage.gt4
    public final void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        e(z);
    }

    public final void e(boolean z) {
        boolean z2 = this.a.g() == z;
        if (z && !this.i.isRunning()) {
            this.j.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.i.cancel();
        this.j.start();
        if (z2) {
            this.j.end();
        }
    }
}
