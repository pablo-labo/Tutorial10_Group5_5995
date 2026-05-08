package defpackage;

import android.graphics.Bitmap;
import java.io.EOFException;
import kotlin.Lazy;
import okhttp3.Headers;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class zt1 {
    public final Lazy a;
    public final Lazy b;
    public final long c;
    public final long d;
    public final boolean e;
    public final Headers f;

    public zt1(uqc uqcVar) throws EOFException {
        xt1 xt1Var = new xt1(this);
        qt8 qt8Var = qt8.c;
        this.a = boa.E(qt8Var, xt1Var);
        this.b = boa.E(qt8Var, new yt1(this));
        this.c = Long.parseLong(uqcVar.S(Long.MAX_VALUE));
        this.d = Long.parseLong(uqcVar.S(Long.MAX_VALUE));
        this.e = Integer.parseInt(uqcVar.S(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(uqcVar.S(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            String strS = uqcVar.S(Long.MAX_VALUE);
            Bitmap.Config[] configArr = m.a;
            int iR = zve.R(strS, ':', 0, false, 6);
            if (iR == -1) {
                h5.k("Unexpected header: ".concat(strS));
                throw null;
            }
            builder.d(zve.s0(strS.substring(0, iR)).toString(), strS.substring(iR + 1));
        }
        this.f = builder.e();
    }

    public final void a(tqc tqcVar) {
        tqcVar.z0(this.c);
        tqcVar.writeByte(10);
        tqcVar.z0(this.d);
        tqcVar.writeByte(10);
        tqcVar.z0(this.e ? 1L : 0L);
        tqcVar.writeByte(10);
        Headers headers = this.f;
        tqcVar.z0(headers.size());
        tqcVar.writeByte(10);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            tqcVar.Y(headers.b(i));
            tqcVar.Y(": ");
            tqcVar.Y(headers.g(i));
            tqcVar.writeByte(10);
        }
    }

    public zt1(Response response) {
        xt1 xt1Var = new xt1(this);
        qt8 qt8Var = qt8.c;
        this.a = boa.E(qt8Var, xt1Var);
        this.b = boa.E(qt8Var, new yt1(this));
        this.c = response.Z;
        this.d = response.a0;
        this.e = response.e != null;
        this.f = response.f;
    }
}
