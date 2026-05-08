package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.backend.util.ProctorTests;
import com.indeed.android.jsmappservices.bridge.results.NativeResult;
import com.indeed.android.jsmappservices.bridge.results.NativeResultObj;
import com.indeed.android.jsmappservices.bridge.results.NativeResultObj$$serializer;
import com.indeed.android.jsmappservices.bridge.results.NativeStringResultObj;
import com.indeed.android.jsmappservices.bridge.results.NativeStringResultObj$$serializer;
import defpackage.nz0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class as0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ as0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = 12;
        switch (this.a) {
            case 0:
                bs0[] bs0VarArrValues = bs0.values();
                bs0VarArrValues.getClass();
                return new aw4(bs0VarArrValues, "com.indeed.android.messaging.api.messaging.logging.ArchiveCause");
            case 1:
                return new gt0(nz0.a.a, 0);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                return new gt0(d4f.Companion.serializer(), 0);
            case 4:
                return new n2c(new o8d(), new zcd());
            case 5:
                ne4 ne4Var = ls2.a;
                return Float.valueOf(1.0f);
            case 6:
                return j6g.a;
            case 7:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return new gt0(ni1.a, 0);
            case 10:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 11:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.jsmappservices.bridge.results.NativeResult", iwcVar.b(NativeResult.class), new yd8[]{iwcVar.b(NativeResultObj.class), iwcVar.b(NativeStringResultObj.class)}, new KSerializer[]{NativeResultObj$$serializer.INSTANCE, NativeStringResultObj$$serializer.INSTANCE}, new Annotation[0]);
            case 12:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new o7(i));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new yy0());
                arrayList.add(new h77());
                arrayList.add(new f87());
                arrayList.add(new i77());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case 13:
                return ProctorTests._childSerializers$_anonymous_();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                lr5 lr5Var = m2c.e;
                if (lr5Var == null) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.c("ProfileViewModelBridge", "FragmentManager is null, cannot show resume file options bottom sheet", false, null, 12);
                } else {
                    ArrayList arrayList3 = lz2.a;
                    Log.d("ProfileViewModelBridge", "Showing resume file options bottom sheet", null);
                    ((i1g) cr8.p(i1g.class)).a(lr5Var, new f8d());
                }
                return j6g.a;
            case 15:
                return new p4e();
            default:
                return j6g.a;
        }
    }
}
