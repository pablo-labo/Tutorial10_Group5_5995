package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.gkf;
import defpackage.gt4;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends gt4 {
    public final a e;
    public final b f;
    public final C0157c g;

    public class a extends gkf {
        public a() {
        }

        @Override // defpackage.gkf, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c.this.c.setChecked(!c.d(r0));
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.c.setChecked(true ^ c.d(cVar));
            a aVar = cVar.e;
            editText.removeTextChangedListener(aVar);
            editText.addTextChangedListener(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.c$c, reason: collision with other inner class name */
    public class C0157c implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {
            public final /* synthetic */ EditText a;

            public a(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.removeTextChangedListener(c.this.e);
            }
        }

        public C0157c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            TextInputLayout textInputLayout = cVar.a;
            EditText editText = textInputLayout.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (c.d(cVar)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            textInputLayout.k(textInputLayout.X0, textInputLayout.Z0);
        }
    }

    public c(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new b();
        this.g = new C0157c();
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.gt4
    public final void a() {
        int i = this.d;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new d());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.U0;
        b bVar = this.f;
        linkedHashSet.add(bVar);
        if (textInputLayout.e != null) {
            bVar.a(textInputLayout);
        }
        textInputLayout.Y0.add(this.g);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
