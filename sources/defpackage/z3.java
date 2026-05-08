package defpackage;

import android.net.Uri;
import androidx.compose.runtime.c;
import androidx.media3.session.i;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.internal.measurement.zzev;
import defpackage.e75;
import defpackage.lz8;
import io.jsonwebtoken.security.SignatureException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z3 implements p55, lz8.a, e75.b, m.a, x.e, n8 {
    public final /* synthetic */ int a;

    public static int b(int i, int i2, int i3) {
        return (zzev.d2(i) * i2) + i3;
    }

    public static int d(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static tf8 i(Class cls, String str, String str2, int i, iwc iwcVar) {
        return iwcVar.g(new l4c(cls, str, str2, i));
    }

    public static String k(c cVar, int i, int i2, c cVar2, boolean z) {
        cVar.L(i);
        String strI = ak2.I(i2, cVar2);
        cVar.U(z);
        return strI;
    }

    public static String l(String str, String str2, Uri uri) {
        return str + uri + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String o(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void p(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void r(Throwable th, Object obj, String str) {
        throw new SignatureException(str + obj, th);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = ura.l0;
        bool.getClass();
        if (bool.booleanValue()) {
            ((y2g) cr8.p(y2g.class)).a();
        } else {
            Integer numC = ((kq7) cr8.p(kq7.class)).c("Onboarding", 0, "PushNotificationDenyCount");
            ((kq7) cr8.p(kq7.class)).a(numC != null ? 1 + numC.intValue() : 1, "Onboarding", "PushNotificationDenyCount");
        }
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        if (((i) kVar).o0()) {
            throw null;
        }
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        zng zngVar = sVar.e;
        sVar.v(dVar);
        zngVar.getClass();
        return aw5.K1(new x9e(-6));
    }

    @Override // defpackage.p55
    public m55[] h() {
        switch (this.a) {
            case 1:
                return new m55[]{new sz(0)};
            default:
                return new m55[]{new vg5()};
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 6:
                v20Var.getClass();
                break;
            case 7:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        switch (this.a) {
            case DatadogLogGenerator.CRASH /* 9 */:
                return ByteBuffer.wrap(ka6Var.Z0(null).e());
            default:
                return Boolean.valueOf(ka6Var.O0());
        }
    }

    public /* synthetic */ z3(int i, Object obj, Object obj2) {
        this.a = i;
    }

    public /* synthetic */ z3(int i) {
        this.a = i;
    }
}
