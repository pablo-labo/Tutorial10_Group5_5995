package defpackage;

import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import android.view.contentcapture.ContentCaptureSession;
import androidx.media3.session.k;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import defpackage.fid;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.x33;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5 implements p55, rt1, v84, x33.a, lz8.a, jg2, wq2, lz8.b, fid.a {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static String c(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    public static StringBuilder g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void j(long j, String str, StringBuilder sb) {
        sb.append((Object) da2.i(j));
        sb.append(str);
    }

    public static /* synthetic */ void k(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(BatchMetricsDispatcher.FILE_NAME)) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ja.k("Null filename");
                    return null;
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    ja.k("Null contents");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " filename" : "";
        if (bArrDecode == null) {
            strConcat = strConcat.concat(" contents");
        }
        if (strConcat.isEmpty()) {
            return new b21(strNextString, bArrDecode);
        }
        r6.g("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        switch (this.a) {
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((ExecutorService) obj).shutdown();
                break;
            default:
                ((vdb) obj).q();
                break;
        }
    }

    @Override // fid.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                ja.k("Null backendName");
                return null;
            }
            jnb jnbVarB = mnb.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            arrayList.add(new v31(string, bArrDecode, jnbVarB));
        }
        return arrayList;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return ExecutorsRegistrar.b.get();
    }

    @Override // defpackage.v84
    public double f(double d) {
        float[] fArr = ya2.a;
        return ya2.b(ya2.c, d);
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new i5()};
    }

    @Override // lz8.b
    public void i(Object obj, bh5 bh5Var) {
        ((gdb.c) obj).o(new gdb.b(bh5Var));
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

    public /* synthetic */ h5(int i) {
        this.a = i;
    }

    public /* synthetic */ h5(k kVar) {
        this.a = 15;
    }
}
