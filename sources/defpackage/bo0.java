package defpackage;

import android.util.Log;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.locationselector.CountryConfig;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bo0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ bo0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                CountryConfig.Companion companion = CountryConfig.Companion;
                break;
            case 4:
                DisplayToastData.Companion companion2 = DisplayToastData.Companion;
                break;
            case 5:
                float f = da4.a;
                break;
            case 6:
                break;
            case 7:
                try {
                    Object objNewInstance = c45.class.getConstructor(null).newInstance(null);
                    objNewInstance.getClass();
                } catch (Exception e) {
                    Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e);
                    return null;
                }
                break;
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                mve mveVar = mve.a;
                break;
            case 10:
                break;
            case 11:
                mve mveVar2 = mve.a;
                break;
            case 12:
                break;
            case 13:
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                break;
            case 15:
                break;
            case 16:
                epa epaVar = epa.a;
                break;
            case 17:
                break;
            case 18:
                m2c.c(pjb.c);
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            default:
                int i = a.H0;
                break;
        }
        return j6g.a;
    }
}
