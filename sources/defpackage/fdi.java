package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class fdi extends qrh {
    public final /* synthetic */ TaskCompletionSource a;

    public fdi(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.euh
    public final void A(Status status, ExecuteResult executeResult) {
    }

    @Override // defpackage.euh
    public final void L(Status status, InitResult initResult) {
        status.getClass();
        zte.f(status, initResult, this.a);
    }
}
