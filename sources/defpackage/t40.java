package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import androidx.media3.common.a;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.lz8;
import defpackage.wr3;
import defpackage.x33;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t40 implements v84, ScheduledExecutorServiceFactory, x33.a, lz8.a, jg2, wr3.a, mhf {
    public final /* synthetic */ int a;

    public static int c(int i, int i2, tjf tjfVar) {
        return (tjfVar.hashCode() + i) * i2;
    }

    public static lr5 g(crb crbVar) {
        lr5 lr5VarU = crbVar.requireActivity().u();
        lr5VarU.getClass();
        return lr5VarU;
    }

    public static String h() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String i(Object obj, String str) {
        return str + obj;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2) {
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + obj + obj2 + i);
    }

    public static void n(a.C0036a c0036a, zpf zpfVar) {
        zpfVar.d(new a(c0036a));
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static void p(String str, String str2, String str3) {
        zkd.T(str3, str + str2);
    }

    public static /* synthetic */ void q(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Long lValueOf = null;
        Long lValueOf2 = null;
        String strNextString = null;
        String str = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null name");
                        return null;
                    }
                    break;
                    break;
                case "size":
                    lValueOf2 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    str = new String(Base64.decode(jsonReader.nextString(), 2), v33.a);
                    break;
                case "baseAddress":
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = lValueOf == null ? " baseAddress" : "";
        if (lValueOf2 == null) {
            strConcat = strConcat.concat(" size");
        }
        if (strNextString == null) {
            strConcat = strConcat.concat(" name");
        }
        if (strConcat.isEmpty()) {
            return new j21(lValueOf.longValue(), lValueOf2.longValue(), strNextString, str);
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.mhf
    public boolean b(qtc qtcVar, qtc qtcVar2) {
        return qtcVar.g(qtcVar2);
    }

    @Override // com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory
    public ScheduledExecutorService create(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        return CoreFeature.DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$lambda$12(internalLogger, str, backPressureStrategy);
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return FirebaseSessionsRegistrar.m27getComponents$lambda2(l7dVar);
    }

    @Override // defpackage.v84
    public double f(double d) {
        float[] fArr = ya2.a;
        return ya2.c(ya2.d, d);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 6:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // wr3.a
    public void j(j6c j6cVar) {
    }

    public /* synthetic */ t40(int i) {
        this.a = i;
    }
}
