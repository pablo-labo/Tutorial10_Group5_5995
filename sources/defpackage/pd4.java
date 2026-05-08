package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* JADX INFO: loaded from: classes2.dex */
public final class pd4 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ b a;

    public pd4(b bVar) {
        this.a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        b bVar = this.a;
        bVar.j = true;
        bVar.l = System.currentTimeMillis();
        bVar.g(false);
    }
}
