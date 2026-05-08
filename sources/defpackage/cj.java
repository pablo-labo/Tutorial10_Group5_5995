package defpackage;

import android.net.Uri;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj) {
        x1c x1cVar = (x1c) this.b;
        Uri uri = (Uri) obj;
        synchronized (x1cVar) {
            ((gme) x1cVar.b0).setValue(s88.a(x1cVar.n(), null, null, null, null, null, null, null, null, null, null, null, uri, 16383));
        }
        return j6g.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051c  */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, bs4] */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj.invoke(java.lang.Object):java.lang.Object");
    }
}
