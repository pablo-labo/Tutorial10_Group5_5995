package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class rhc extends tp3 {
    public final String b;
    public final String c;
    public final e9a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhc(String str, String str2, e9a e9aVar) {
        super(e9aVar);
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
        this.d = e9aVar;
    }

    @Override // defpackage.tp3, defpackage.oec
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putString("homepageTk", this.b);
        bundle.putString("jobKey", this.c);
        bundle.putAll(this.d.toBundle());
        return bundle;
    }
}
