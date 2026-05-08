package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.v7b;

/* JADX INFO: loaded from: classes2.dex */
public final class i9h implements v7b.a {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ j9h b;

    public i9h(j9h j9hVar, ieh iehVar) {
        this.b = j9hVar;
        this.a = iehVar;
    }

    @Override // v7b.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
