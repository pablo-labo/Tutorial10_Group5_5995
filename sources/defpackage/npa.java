package defpackage;

import android.os.SystemClock;
import defpackage.aga;
import defpackage.lpa;
import defpackage.xr1;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class npa implements Callback {
    public final /* synthetic */ lpa.a a;
    public final /* synthetic */ lpa b;
    public final /* synthetic */ aga.a c;

    public npa(lpa.a aVar, lpa lpaVar, aga.a aVar2) {
        this.a = aVar;
        this.b = lpaVar;
        this.c = aVar2;
    }

    @Override // okhttp3.Callback
    public final void h(Call call, IOException iOException) {
        lpa.J1(this.b, call, iOException, this.c);
    }

    @Override // okhttp3.Callback
    public final void p(Call call, Response response) throws IOException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lpa.a aVar = this.a;
        aVar.g = jElapsedRealtime;
        ResponseBody responseBody = response.V;
        aga.a aVar2 = this.c;
        lpa lpaVar = this.b;
        try {
            if (responseBody == null) {
                lpa.J1(lpaVar, call, lpa.K1(lpaVar, "Response body null: " + response, response), aVar2);
                return;
            }
            try {
                if (response.h()) {
                    d2f d2fVar = xr1.c;
                    String strA = response.f.a("Content-Range");
                    if (strA == null) {
                        strA = null;
                    }
                    xr1 xr1VarB = xr1.a.b(strA);
                    if (xr1VarB != null && (xr1VarB.a != 0 || xr1VarB.b != Integer.MAX_VALUE)) {
                        aVar.e = xr1VarB;
                        aVar.d = 8;
                    }
                    aVar2.c(responseBody.a(), responseBody.getD() < 0 ? 0 : (int) responseBody.getD());
                } else {
                    lpa.J1(lpaVar, call, lpa.K1(lpaVar, "Unexpected HTTP code " + response, response), aVar2);
                }
            } catch (Exception e) {
                lpa.J1(lpaVar, call, e, aVar2);
            }
            j6g j6gVar = j6g.a;
            responseBody.close();
        } finally {
        }
    }
}
