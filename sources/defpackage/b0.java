package defpackage;

import android.content.Context;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.s;
import com.facebook.react.bridge.Promise;
import com.google.android.recaptcha.internal.zzeu;
import com.google.firebase.FirebaseCommonRegistrar;
import defpackage.e75;
import defpackage.in3;
import defpackage.lz8;
import defpackage.zu8;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements lz8.a, in3.a.InterfaceC0270a, ru5, e75.b, zu8.a, m.a, s.e, wq2 {
    public final /* synthetic */ int a;

    public /* synthetic */ b0(int i) {
        this.a = i;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return CodedOutputStream.T1(i) + i2 + i3 + i4;
    }

    public static int e(hva hvaVar, int i, int i2) {
        return (hvaVar.hashCode() + i) * i2;
    }

    public static String h(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String k(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ void l() {
        throw new UnsupportedOperationException();
    }

    public static void m(int i) {
        throw new UnknownFieldException(p6.c(i, "An unknown field for index "));
    }

    public static /* synthetic */ void n(int i, int i2, Throwable th) throws zzeu {
        throw new zzeu(i, i2, th);
    }

    public static /* synthetic */ void o(String str) {
        throw new RuntimeException(str);
    }

    public static void p(String str, Promise promise) {
        promise.reject(new Exception(str));
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void s(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void t() {
        throw new AssertionError();
    }

    public static /* synthetic */ void u(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        vdb vdbVar = (vdb) obj;
        switch (this.a) {
            case 18:
                vdbVar.O();
                break;
            default:
                vdbVar.s();
                break;
        }
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        return new al3((d82) obj);
    }

    @Override // in3.a.InterfaceC0270a
    public Constructor b() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(m55.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // zu8.a
    public String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        j jVarZ0 = kVar.Z0();
        j jVarZ02 = kVar.Z0();
        Objects.requireNonNull(jVarZ02);
        jVarZ0.U0(new sm3(jVarZ02, 1));
    }

    @Override // androidx.media3.session.s.e
    public void i(r.c cVar, int i) {
        cVar.getClass();
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return Double.valueOf(ka6Var.T0());
    }

    public /* synthetic */ b0(Object obj, int i) {
        this.a = i;
    }
}
