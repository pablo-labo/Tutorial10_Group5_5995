package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class deh extends ieh {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ p7d c(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void i(vf0.b bVar) {
        vdh vdhVar = (vdh) bVar;
        teh tehVar = (teh) vdhVar.i();
        beh behVar = new beh(this);
        GoogleSignInOptions googleSignInOptions = vdhVar.B;
        Parcel parcelC = tehVar.c();
        int i = rdh.a;
        parcelC.writeStrongBinder(behVar);
        rdh.c(parcelC, googleSignInOptions);
        tehVar.e(parcelC, 102);
    }
}
