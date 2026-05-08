package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ohc extends tp3 {
    public final String b;
    public final nhc c;
    public final String d;
    public final e9a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohc(String str, nhc nhcVar, String str2, e9a e9aVar) {
        super(e9aVar);
        str.getClass();
        this.b = str;
        this.c = nhcVar;
        this.d = str2;
        this.e = e9aVar;
    }

    @Override // defpackage.tp3, defpackage.oec
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putString("trigger", this.c.a());
        bundle.putString("source", this.d);
        bundle.putString("url", this.b);
        bundle.putAll(this.e.toBundle());
        return bundle;
    }
}
