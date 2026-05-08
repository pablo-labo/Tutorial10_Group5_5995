package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class mi8 implements TextWatcher {
    public final /* synthetic */ Function1<String, j6g> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mi8(Function1<? super String, j6g> function1) {
        this.a = function1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        this.a.invoke(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
