package defpackage;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vm1 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ vm1(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = 13;
        switch (this.a) {
            case 0:
                iwc iwcVar = fwc.a;
                break;
            case 4:
                try {
                    Object objInvoke = c45.class.getMethod("getPackageList", null).invoke(null, null);
                    objInvoke.getClass();
                } catch (Exception e) {
                    Log.e("ExpoModulesPackage", "Couldn't get expo package list.", e);
                    return zr4.a;
                }
                break;
            case 12:
                iwc iwcVar2 = fwc.a;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                c05.a.invoke(tx5.e(c05.b, "nextStepsPromoImpression", "myjobs_native_screen", null, 12));
                break;
            case 15:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new cp0(i));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new lee());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                break;
            case 17:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                break;
            case 18:
                m2c.c(pjb.a);
                break;
        }
        return j6g.a;
    }
}
