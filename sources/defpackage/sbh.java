package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.p7d;

/* JADX INFO: loaded from: classes2.dex */
public final class sbh<R extends p7d> extends BasePendingResult<R> {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R c(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
