package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.p7d;

/* JADX INFO: loaded from: classes2.dex */
public final class nbh<R extends p7d> extends BasePendingResult<R> {
    public final Status k;

    public nbh(Status status) {
        super(null);
        this.k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R c(Status status) {
        return this.k;
    }
}
