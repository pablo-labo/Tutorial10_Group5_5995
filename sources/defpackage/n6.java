package defpackage;

import android.os.Bundle;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.lz8;
import defpackage.wqf;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n6 implements wrf, lz8.a, s.e, x.e, ru5, dv5 {
    public final /* synthetic */ int a;

    public static pd7 a(iwc iwcVar, Class cls, qd7 qd7Var, Function1 function1) {
        qd7Var.a(iwcVar.b(cls), function1);
        return qd7Var.b();
    }

    public static /* synthetic */ void b(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void c(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void d(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // defpackage.wrf
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                mf3.b.getClass();
                return x33.a.a((v33) obj).getBytes(Charset.forName("UTF-8"));
            case DatadogLogGenerator.CRASH /* 9 */:
                return Long.valueOf(((s83) obj).b);
            case 11:
                return Boolean.valueOf(((String) obj).length() > 0);
            default:
                wqf.a aVar = (wqf.a) obj;
                aVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putBundle(wqf.a.f, aVar.b.d());
                bundle.putIntArray(wqf.a.g, aVar.d);
                bundle.putBooleanArray(wqf.a.h, aVar.e);
                bundle.putBoolean(wqf.a.i, aVar.c);
                return bundle;
        }
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        ((o) sVar).v(dVar);
        throw null;
    }

    @Override // androidx.media3.session.s.e
    public void i(r.c cVar, int i) {
        cVar.d(i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }

    public /* synthetic */ n6(int i) {
        this.a = i;
    }
}
