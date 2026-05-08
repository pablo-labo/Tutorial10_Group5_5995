package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class l6i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                aki akiVar = ((m4i) obj).W;
                i0i i0iVar = akiVar.a;
                a0i a0iVar = i0iVar.Y;
                m4i m4iVar = i0iVar.e0;
                eyh eyhVar = i0iVar.W;
                i0i.i(a0iVar);
                a0iVar.b();
                if (akiVar.c()) {
                    if (akiVar.b()) {
                        i0i.c(eyhVar);
                        eyhVar.p0.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        i0i.h(m4iVar);
                        m4iVar.r("auto", "_cmpx", bundle);
                    } else {
                        i0i.c(eyhVar);
                        yyh yyhVar = eyhVar.p0;
                        String strA = yyhVar.a();
                        if (TextUtils.isEmpty(strA)) {
                            ewh ewhVar = i0iVar.X;
                            i0i.i(ewhVar);
                            ewhVar.V.b("Cache still valid but referrer not found");
                        } else {
                            long jA = ((eyhVar.q0.a() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jA);
                            i0i.h(m4iVar);
                            m4iVar.r((String) pair.first, "_cmp", (Bundle) pair.second);
                        }
                        yyhVar.b(null);
                    }
                    i0i.c(eyhVar);
                    eyhVar.q0.b(0L);
                    break;
                }
                break;
            case 1:
                ((c8i) obj).Y = null;
                break;
            default:
                y8i y8iVar = ((ibi) obj).c;
                ComponentName componentName = new ComponentName(y8iVar.a.a, "com.google.android.gms.measurement.AppMeasurementService");
                y8iVar.b();
                if (y8iVar.d != null) {
                    y8iVar.d = null;
                    y8iVar.zzr().c0.a(componentName, "Disconnected from device MeasurementService");
                    y8iVar.b();
                    y8iVar.s();
                }
                break;
        }
    }
}
