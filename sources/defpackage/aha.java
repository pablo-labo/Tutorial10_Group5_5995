package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class aha extends bq2<yga> {
    public final ConnectivityManager f;
    public final zga g;

    public aha(Context context, x2h x2hVar) {
        super(context, x2hVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new zga(this);
    }

    @Override // defpackage.bq2
    public final yga a() {
        return bha.a(this.f);
    }

    @Override // defpackage.bq2
    public final void d() {
        try {
            z39.d().a(bha.a, "Registering network callback");
            jfa.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            z39.d().c(bha.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            z39.d().c(bha.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.bq2
    public final void e() {
        try {
            z39.d().a(bha.a, "Unregistering network callback");
            hfa.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            z39.d().c(bha.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            z39.d().c(bha.a, "Received exception while unregistering network callback", e2);
        }
    }
}
