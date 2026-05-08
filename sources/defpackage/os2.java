package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class os2 {
    public final Object a;
    public final View b;

    public os2(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            h5.b(this.a).notifyViewsDisappeared(this.b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h5.b(this.a).newAutofillId(this.b.getAutofillId(), j);
        }
        return null;
    }

    public final xrg c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new xrg(h5.b(this.a).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            h5.b(this.a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            h5.b(this.a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.a).notifyViewTextChanged(autofillId, str);
        }
    }
}
