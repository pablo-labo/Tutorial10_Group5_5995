package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s4i implements Runnable {
    public final /* synthetic */ int a = 1;
    public final f3i b;

    public s4i(m4i m4iVar) {
        this.b = m4iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkInfo activeNetworkInfo;
        int i = this.a;
        boolean z = true;
        f3i f3iVar = this.b;
        switch (i) {
            case 0:
                m4i m4iVar = (m4i) f3iVar;
                m4iVar.b();
                if (!m4iVar.f().m0.b()) {
                    long jA = m4iVar.f().n0.a();
                    m4iVar.f().n0.b(jA + 1);
                    if (jA < 5) {
                        i0i i0iVar = m4iVar.a;
                        ewh ewhVar = i0iVar.X;
                        a0i a0iVar = i0iVar.Y;
                        i0i.i(a0iVar);
                        a0iVar.b();
                        q7i q7iVar = i0iVar.g0;
                        i0i.i(q7iVar);
                        i0i.i(q7iVar);
                        zvh zvhVarO = i0iVar.o();
                        zvhVarO.k();
                        String str = zvhVarO.c;
                        eyh eyhVar = i0iVar.W;
                        i0i.c(eyhVar);
                        Pair<String, Boolean> pairJ = eyhVar.j(str);
                        wmi wmiVar = i0iVar.V;
                        wmiVar.a.getClass();
                        Boolean boolM = wmiVar.m("google_analytics_adid_collection_enabled");
                        if (boolM != null && !boolM.booleanValue()) {
                            z = false;
                        }
                        if (!z || ((Boolean) pairJ.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairJ.first)) {
                            i0i.i(ewhVar);
                            ewhVar.b0.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                        } else {
                            i0i.i(q7iVar);
                            q7iVar.g();
                            URL url = null;
                            try {
                                activeNetworkInfo = ((ConnectivityManager) q7iVar.a.a.getSystemService("connectivity")).getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                yei yeiVar = i0iVar.a0;
                                i0i.c(yeiVar);
                                i0iVar.o().a.V.o();
                                String str2 = (String) pairJ.first;
                                long jA2 = eyhVar.n0.a() - 1;
                                try {
                                    fib.f(str2);
                                    fib.f(str);
                                    String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v29000." + yeiVar.l0()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + jA2;
                                    if (str.equals(yeiVar.a.V.h("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    url = new URL(strConcat);
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    yeiVar.zzr().f.a(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                } catch (MalformedURLException e2) {
                                    e = e2;
                                    yeiVar.zzr().f.a(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                }
                                i0i.i(q7iVar);
                                c1i c1iVar = new c1i(i0iVar, 0);
                                q7iVar.b();
                                q7iVar.g();
                                fib.i(url);
                                q7iVar.zzq().n(new v7i(q7iVar, str, url, c1iVar));
                            } else {
                                i0i.i(ewhVar);
                                ewhVar.X.b("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                    } else {
                        m4iVar.zzr().X.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        m4iVar.f().m0.a(true);
                    }
                } else {
                    m4iVar.zzr().b0.b("Deferred Deep Link already retrieved. Not fetching again.");
                }
                break;
            default:
                fei feiVar = (fei) f3iVar;
                i0i i0iVar2 = feiVar.X;
                a0i a0iVar2 = i0iVar2.Y;
                i0i.i(a0iVar2);
                a0iVar2.b();
                wgh wghVar = new wgh(feiVar);
                wghVar.h();
                feiVar.c = wghVar;
                i0iVar2.V.c = feiVar.a;
                rji rjiVar = new rji(feiVar);
                rjiVar.h();
                feiVar.f = rjiVar;
                a8i a8iVar = new a8i(feiVar);
                a8iVar.h();
                feiVar.W = a8iVar;
                ydi ydiVar = new ydi(feiVar);
                ydiVar.h();
                feiVar.e = ydiVar;
                feiVar.d = new wxh(feiVar);
                if (feiVar.c0 != feiVar.d0) {
                    ewh ewhVar2 = i0iVar2.X;
                    i0i.i(ewhVar2);
                    ewhVar2.f.c("Not all upload components initialized", Integer.valueOf(feiVar.c0), Integer.valueOf(feiVar.d0));
                }
                feiVar.Y = true;
                a0i a0iVar3 = i0iVar2.Y;
                eyh eyhVar2 = i0iVar2.W;
                i0i.i(a0iVar3);
                a0iVar3.b();
                feiVar.z().Z();
                i0i.c(eyhVar2);
                uyh uyhVar = eyhVar2.e;
                if (uyhVar.a() == 0) {
                    i0iVar2.c0.getClass();
                    uyhVar.b(System.currentTimeMillis());
                }
                feiVar.K();
                break;
        }
    }

    public s4i(fei feiVar, qei qeiVar) {
        this.b = feiVar;
    }
}
