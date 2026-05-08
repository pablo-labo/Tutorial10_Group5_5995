package defpackage;

import android.util.JsonReader;
import androidx.activity.result.ActivityResult;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.x33;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k20 implements p55, v84, x33.a, lz8.a, jg2, lz8.b, x.e, n8 {
    public final /* synthetic */ int a;

    public /* synthetic */ k20(int i) {
        this.a = i;
    }

    public static int b(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static ve4 j(ve4 ve4Var, ve4 ve4Var2, ve4 ve4Var3) {
        return ve4Var.n().a(ve4Var2).a(ve4Var3);
    }

    public static String l(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static List m(String str, ud2 ud2Var, zr4 zr4Var, zr4 zr4Var2, zr4 zr4Var3) {
        return u63.Z(new pd2(str, ud2Var, zr4Var, zr4Var2, zr4Var3));
    }

    public static /* synthetic */ void n() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void o() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ja.k("Null libraryName");
                        return null;
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null arch");
                        return null;
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        ja.k("Null buildId");
                        return null;
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " arch" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" libraryName");
        }
        if (strNextString3 == null) {
            strConcat = strConcat.concat(" buildId");
        }
        if (strConcat.isEmpty()) {
            return new y11(strNextString, strNextString2, strNextString3);
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ((ActivityResult) obj).getClass();
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        switch (this.a) {
            case DatadogLogGenerator.CRASH /* 9 */:
                return ExecutorsRegistrar.c.get();
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(l7dVar);
        }
    }

    @Override // defpackage.v84
    public double f(double d) {
        double d2 = d < 0.0d ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
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
        return new m55[]{new l20()};
    }

    @Override // lz8.b
    public void i(Object obj, bh5 bh5Var) {
        ((gdb.c) obj).o(new gdb.b(bh5Var));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    public /* synthetic */ k20(Object obj, int i) {
        this.a = i;
    }
}
