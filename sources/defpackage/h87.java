package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h87 implements g87 {
    public nm0 a;

    @Override // defpackage.g87
    public final String b() {
        return this.a.k("deviceId");
    }

    @Override // defpackage.g87
    public final void c(String str) {
        if (str == null) {
            return;
        }
        nm0 nm0Var = this.a;
        nm0Var.b("deviceId", str);
        nm0Var.i("pref.device_reassign_has_executed", true);
    }

    @Override // defpackage.g87
    public final boolean d() {
        nm0 nm0Var = this.a;
        String strK = nm0Var.k("deviceId");
        boolean zA = nm0Var.a("pref.device_reassign_has_executed", false);
        boolean z = !zA || strK == null;
        ArrayList arrayList = lz2.a;
        if (strK == null) {
            strK = "<notset>";
        }
        lz2.d("DeviceId", "needsReassignment=" + z + ", hasReassigned=" + zA + ", deviceId=" + strK, false, null);
        if (z) {
            nm0Var.i("pref.device_reassign_has_executed", false);
            lz2.d("DeviceId", "reassign executed flag set to FALSE", false, null);
        }
        return z;
    }
}
