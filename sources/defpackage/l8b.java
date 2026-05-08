package defpackage;

import android.provider.Settings;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l8b implements j8b {
    public final /* synthetic */ n8b a;
    public final /* synthetic */ j8b b;

    public /* synthetic */ l8b(n8b n8bVar, j8b j8bVar) {
        this.a = n8bVar;
        this.b = j8bVar;
    }

    @Override // defpackage.j8b
    public final void a(HashMap map) {
        n8b n8bVar = this.a;
        map.put("android.permission.WRITE_SETTINGS", n8bVar.l(Settings.System.canWrite(n8bVar.a.getApplicationContext()) ? 0 : -1, "android.permission.WRITE_SETTINGS"));
        this.b.a(map);
    }
}
