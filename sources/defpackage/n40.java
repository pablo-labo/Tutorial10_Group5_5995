package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class n40 implements h51 {
    public final AndroidComposeView a;
    public final p51 b;
    public final AutofillManager c;
    public final AutofillId d;

    public n40(AndroidComposeView androidComposeView, p51 p51Var) {
        this.a = androidComposeView;
        this.b = p51Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            r6.g("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw l6.k("Required value was null.");
        }
        this.d = autofillId;
    }
}
