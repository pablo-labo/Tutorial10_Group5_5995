package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xq4 implements TextWatcher {
    public final EditText a;
    public a b;
    public boolean c = true;

    public static class a extends d.f implements Runnable {
        public final WeakReference a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            xq4.a((EditText) this.a.get(), 1);
        }
    }

    public xq4(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d dVarA = d.a();
            if (editableText == null) {
                length = 0;
            } else {
                dVarA.getClass();
                length = editableText.length();
            }
            dVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && d.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = d.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    d.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            d dVarA = d.a();
            if (this.b == null) {
                this.b = new a(editText);
            }
            dVarA.h(this.b);
        }
    }
}
