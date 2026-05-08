package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gt4 {
    public final TextInputLayout a;
    public final Context b;
    public final CheckableImageButton c;
    public final int d;

    public gt4(TextInputLayout textInputLayout, int i) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
        this.d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }
}
