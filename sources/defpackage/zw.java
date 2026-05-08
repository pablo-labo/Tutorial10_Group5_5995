package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand;
import com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import defpackage.jq7;
import defpackage.xh8;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zw implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ zw(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                mx.b(nx.a);
                return j6g.a;
            case 1:
                e95[] e95VarArrValues = e95.values();
                e95VarArrValues.getClass();
                return new aw4(e95VarArrValues, "com.indeed.android.ghostwriter.models.backend.FieldType");
            case 2:
                qm4.b(in4.a, "Edit");
                return j6g.a;
            case 3:
                return new gt0(new by8(mve.a, qp1.b(na8.a)), 0);
            case 4:
                return j6g.a;
            case 5:
                return j6g.a;
            case 6:
                return new rna("com.indeed.android.jsmappservices.bridge.IncrementPushSignificantEventCommand", IncrementPushSignificantEventCommand.INSTANCE, new Annotation[0]);
            case 7:
                return j6g.a;
            case 8:
                ra8 ra8VarA = sa8.a(new xr(5));
                xh8 xh8Var = m97.a;
                InputStream inputStreamOpenRawResource = ((Context) (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getResources().openRawResource(R.raw.available_country_sites_fallback);
                inputStreamOpenRawResource.getClass();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, a32.b);
                try {
                    String strY = nn2.y(inputStreamReader);
                    inputStreamReader.close();
                    List<n97> list = (List) ra8VarA.c(new gt0(n97.Companion.serializer(), 0), strY);
                    ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                    for (n97 n97Var : list) {
                        String str = n97Var.a;
                        String str2 = n97Var.b;
                        String str3 = n97Var.c;
                        List<String> list2 = n97Var.e;
                        List<String> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list3, 10));
                        for (String str4 : list3) {
                            arrayList2.add(ULocale.getDisplayLanguage(str4, str4));
                        }
                        arrayList.add(new n97(list2, arrayList2, str, str2, str3));
                    }
                    return arrayList;
                } finally {
                }
            case DatadogLogGenerator.CRASH /* 9 */:
                ho7[] ho7VarArrValues = ho7.values();
                ho7VarArrValues.getClass();
                return new aw4(ho7VarArrValues, "com.indeed.android.messaging.api.messaging.logging.ItemType");
            case 10:
                return new gt0(ni1.a, 0);
            case 11:
                return new rna("Ace", jq7.a.INSTANCE, new Annotation[0]);
            case 12:
                return eq7.Companion.serializer();
            case 13:
                return bg3.a();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                ArrayList arrayList3 = lz2.a;
                lz2.d("LaunchViewModel", "urlRegistry cache updated successfully", false, null);
                zo6 zo6Var = zo6.a;
                eq3 eq3Var = a74.a;
                eu2 eu2VarA = f13.a(no3.c);
                zo6Var.getClass();
                u63.Y(eu2VarA, null, null, new yo6(2, null), 3);
                return j6g.a;
            case 16:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 17:
                epa epaVar = epa.a;
                return epa.a().a();
            case 18:
                return new rna("com.indeed.android.jsmappservices.bridge.OpenAndroidAppInfoCommand", OpenAndroidAppInfoCommand.INSTANCE, new Annotation[0]);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return j6g.a;
            case 20:
                m2c.b(hvb.d, "");
                return j6g.a;
            case 21:
                ScreenDummyLayoutHelper.a aVar = ScreenDummyLayoutHelper.Y;
                return "[RNScreens] Attempt to require missing react context";
            default:
                return Boolean.TRUE;
        }
    }
}
