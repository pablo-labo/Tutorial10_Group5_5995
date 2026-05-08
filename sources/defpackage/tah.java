package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class tah extends mbh {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ GoogleApiActivity b;

    public tah(Intent intent, GoogleApiActivity googleApiActivity) {
        this.a = intent;
        this.b = googleApiActivity;
    }

    @Override // defpackage.mbh
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
