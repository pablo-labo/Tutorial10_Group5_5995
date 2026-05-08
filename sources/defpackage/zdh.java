package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class zdh extends ieh {
    public final /* synthetic */ Context k;
    public final /* synthetic */ GoogleSignInOptions l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdh(pa6 pa6Var, Context context, GoogleSignInOptions googleSignInOptions) {
        super(pa6Var);
        this.k = context;
        this.l = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ p7d c(Status status) {
        return new fb6(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void i(vf0.b bVar) {
        teh tehVar = (teh) ((vdh) bVar).i();
        xdh xdhVar = new xdh(this);
        Parcel parcelC = tehVar.c();
        int i = rdh.a;
        parcelC.writeStrongBinder(xdhVar);
        rdh.c(parcelC, this.l);
        tehVar.e(parcelC, 101);
    }
}
