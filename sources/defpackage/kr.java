package defpackage;

import android.content.Context;
import android.net.Uri;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.results.NavigateToLoginResult;
import defpackage.cga;
import defpackage.mt7;
import defpackage.qq7;
import defpackage.vid;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import okhttp3.Dispatcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kr implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ kr(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws JSONException, IOException {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return j6g.a;
            case 2:
                return Uri.parse("android-app://com.indeed.android.jobsearch.widget.rj");
            case 3:
                return j6g.a;
            case 4:
                InputStream inputStreamOpenRawResource = ((Context) e87.a.getValue()).getResources().openRawResource(R.raw.indeedcountries);
                inputStreamOpenRawResource.getClass();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, a32.b);
                try {
                    String strY = nn2.y(inputStreamReader);
                    inputStreamReader.close();
                    JSONArray jSONArray = new JSONArray(strY);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("cc");
                        String string2 = jSONObject.getString("hl");
                        String string3 = jSONObject.getString(LogAttributes.HOST);
                        string.getClass();
                        string2.getClass();
                        string3.getClass();
                        ck6 ck6Var = new ck6(string, string2, string3);
                        String strM = z3.m(string, ":", string2);
                        if (linkedHashMap.containsKey(strM)) {
                            Object obj = linkedHashMap.get(strM);
                            StringBuilder sbF = u40.f("An existing host configuration for ", string, ":", string2, " has been defined before: ");
                            sbF.append(obj);
                            throw new IllegalStateException(sbF.toString().toString());
                        }
                        linkedHashMap.put(strM, ck6Var);
                        linkedHashMap.putIfAbsent(string, ck6Var);
                    }
                    if (linkedHashMap.containsKey("US")) {
                        return linkedHashMap;
                    }
                    r6.g("Error in indeedcountries.json: US is not defined");
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0h.q(inputStreamReader, th);
                        throw th2;
                    }
                }
            case 5:
                return new gt0(mve.a, 0);
            case 6:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 7:
                return qq7.g.Companion.serializer();
            case 8:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tare.nav.search.JSTSerpTarget", iwcVar.b(mt7.class), new yd8[]{iwcVar.b(mt7.b.class)}, new KSerializer[]{mt7.b.a.a}, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                NavigateToLoginResult.Companion companion = NavigateToLoginResult.Companion;
                x49[] x49VarArrValues = x49.values();
                x49VarArrValues.getClass();
                return new aw4(x49VarArrValues, "com.indeed.android.jsmappservices.bridge.results.LoginResult");
            case 10:
                Dispatcher dispatcher = new Dispatcher();
                synchronized (dispatcher) {
                    dispatcher.a = 15;
                    j6g j6gVar = j6g.a;
                }
                dispatcher.d();
                return dispatcher;
            case 11:
                m2c.a(hvb.e0);
                return j6g.a;
            case 12:
                m2c.c(pjb.V);
                return j6g.a;
            case 13:
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                int i2 = 0;
                List listP1 = z92.p1((List) l8e.a.getValue(), new hrc(i2));
                ArrayList arrayList = new ArrayList();
                int size = listP1.size();
                while (i2 < size) {
                    q85 q85Var = (q85) listP1.get(i2);
                    q85Var.getClass();
                    cga.a aVarB = q85Var.b();
                    yd8 yd8VarType = q85Var.type();
                    Pair pair = yd8VarType == null ? null : new Pair(aVarB, yd8VarType);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i2++;
                }
                return arrayList;
            case 15:
                return new kdd();
            case 16:
                iwc iwcVar2 = fwc.a;
                return new atd("com.indeed.android.realtimemessaging.models.SSEEvent", iwcVar2.b(vid.class), new yd8[]{iwcVar2.b(vid.b.class), iwcVar2.b(vid.c.class), iwcVar2.b(vid.d.class), iwcVar2.b(vid.e.class), iwcVar2.b(vid.f.class), iwcVar2.b(vid.g.class), iwcVar2.b(vid.h.class)}, new KSerializer[]{vid.b.a.a, vid.c.a.a, vid.d.a.a, new rna("com.indeed.android.realtimemessaging.models.SSEEvent.Heartbeat", vid.e.INSTANCE, new Annotation[0]), vid.f.a.a, vid.g.a.a, vid.h.a.a}, new Annotation[0]);
            case 17:
                throw new IllegalStateException("LocalTimelineModuleType not provided");
            case 18:
                ((at7) cr8.p(at7.class)).f(null, ht7.b, "tare-debug-screen", new ue(19));
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return j6g.a;
            default:
                g3a<jz2<j6g>> g3aVar = kqg.a;
                j6g j6gVar2 = j6g.a;
                g3aVar.k(new jz2<>(j6gVar2));
                return j6gVar2;
        }
    }
}
