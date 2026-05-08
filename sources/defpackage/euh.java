package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;

/* JADX INFO: loaded from: classes2.dex */
public interface euh extends IInterface {
    void A(Status status, ExecuteResult executeResult);

    void L(Status status, InitResult initResult);
}
