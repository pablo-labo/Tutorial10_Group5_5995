package defpackage;

import android.util.JsonReader;
import androidx.media3.exoplayer.source.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.thread.FlushableExecutorService;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.gson.JsonParseException;
import defpackage.ax1;
import defpackage.lz8;
import defpackage.x33;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g7 implements v84, FlushableExecutorService.Factory, x33.a, lz8.a, jg2, x.e, wq2 {
    public final /* synthetic */ int a;

    public static String e(char c, String str, String str2) {
        return str + c + str2;
    }

    public static String h(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String i(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static void j(int i, String str, String str2) {
        zkd.T(str2, str + i);
    }

    public static void k(ax1.b bVar, long j) {
        bVar.a().h();
        bVar.h(j);
    }

    public static /* synthetic */ void l(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new JsonParseException(str, th);
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        List listD = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listD = x33.d(jsonReader, new w20(3));
                    if (listD == null) {
                        ja.k("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ja.k("Null name");
                        return null;
                    }
                    break;
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " name" : "";
        if (numValueOf == null) {
            strConcat = strConcat.concat(" importance");
        }
        if (listD == null) {
            strConcat = strConcat.concat(" frames");
        }
        if (strConcat.isEmpty()) {
            return new m21(numValueOf.intValue(), strNextString, listD);
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((o.b) obj).b.release();
    }

    @Override // com.datadog.android.core.thread.FlushableExecutorService.Factory
    public FlushableExecutorService create(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        return CoreFeature.DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$lambda$11(internalLogger, str, backPressureStrategy);
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return FirebaseSessionsRegistrar.m26getComponents$lambda1(l7dVar);
    }

    @Override // defpackage.v84
    public double f(double d) {
        float[] fArr = ya2.a;
        return ya2.d(ya2.d, d);
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        ((androidx.media3.session.o) sVar).getClass();
        dVar.e.getClass();
        throw null;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case DatadogLogGenerator.CRASH /* 9 */:
                v20Var.getClass();
                break;
            case 10:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    public /* synthetic */ g7(int i, Object obj, Object obj2) {
        this.a = i;
    }

    public /* synthetic */ g7(int i) {
        this.a = i;
    }
}
