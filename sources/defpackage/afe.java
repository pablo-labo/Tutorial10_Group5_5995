package defpackage;

import android.util.Log;
import defpackage.gg8;
import defpackage.s98;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
public final class afe {
    public final ew4 a;
    public final d2f b;
    public final MediaType c;
    public final d2f d;

    public static final class a extends mj8 implements gu5<bb8> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final bb8 invoke() {
            return new bb8();
        }
    }

    public static final class b extends mj8 implements gu5<OkHttpClient> {
        public static final b a = new b(0);

        @Override // defpackage.gu5
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builderE = new OkHttpClient().e();
            builderE.b(15L, TimeUnit.SECONDS);
            return new OkHttpClient(builderE);
        }
    }

    public afe(ew4 ew4Var) {
        ew4Var.getClass();
        this.a = ew4Var;
        this.b = boa.D(b.a);
        MediaType.e.getClass();
        this.c = MediaType.Companion.a("application/json; charset=utf-8");
        this.d = boa.D(a.a);
    }

    public final boolean a(Request request, int i) {
        OkHttpClient okHttpClient = (OkHttpClient) this.b.getValue();
        okHttpClient.getClass();
        Response responseB = new RealCall(okHttpClient, request, false).b();
        try {
            int i2 = responseB.d;
            if (200 <= i2 && i2 < 300) {
                responseB.close();
                return true;
            }
            if (400 > i2 || i2 >= 500) {
                responseB.close();
                return false;
            }
            Log.e("SignalsApi", "Signals was not able to properly validate payload, swallowing " + i + " events", new Throwable("Signals unexpected 4xx"));
            responseB.close();
            return true;
        } finally {
        }
    }

    public final boolean b(ArrayList arrayList) throws IOException {
        List listM0 = z92.M0(arrayList);
        if (((ArrayList) listM0).isEmpty()) {
            return true;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write((byte[]) it.next());
            }
            Request.Builder builder = new Request.Builder();
            builder.g(this.a.c);
            RequestBody.Companion companion = RequestBody.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            MediaType.e.getClass();
            builder.e("POST", RequestBody.Companion.d(companion, byteArray, MediaType.Companion.a("avro/binary"), 0, 6));
            builder.d("indeed-signal-application-id", "jobsearch-android");
            boolean zA = a(builder.b(), arrayList.size());
            byteArrayOutputStream.close();
            return zA;
        } finally {
        }
    }

    public final boolean c(ArrayList arrayList) {
        List<JsonObject> listM0 = z92.M0(arrayList);
        if (((ArrayList) listM0).isEmpty()) {
            return true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive jsonPrimitiveC = la8.c("jobsearch-android");
        jsonPrimitiveC.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<JsonElement> arrayList3 = new ArrayList(t92.r0(listM0, 10));
        for (JsonObject jsonObject : listM0) {
            s98.a aVar = s98.d;
            ((bb8) this.d.getValue()).getClass();
            jsonObject.getClass();
            JsonObject jsonObjectF = la8.f(cb8.a.e(JsonObject.Companion.serializer(), jsonObject));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObjectF.a.entrySet()) {
                if (!wl7.b(entry.getKey(), "__kotlinx_serialization_type")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            v1 v1Var = aVar.b;
            gg8 gg8Var = gg8.c;
            gg8 gg8VarA = gg8.a.a(fwc.d(String.class));
            gg8 gg8VarA2 = gg8.a.a(fwc.d(JsonElement.class));
            iwc iwcVar = fwc.a;
            arrayList3.add(aVar.e(awd.k(v1Var, iwcVar.k(iwcVar.b(Map.class), Arrays.asList(gg8VarA, gg8VarA2), false)), linkedHashMap2));
        }
        for (JsonElement jsonElement : arrayList3) {
            jsonElement.getClass();
            arrayList2.add(jsonElement);
        }
        JsonObject jsonObject2 = new JsonObject(linkedHashMap);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        s98.a aVar2 = s98.d;
        String strB = aVar2.b(awd.k(aVar2.b, fwc.d(JsonObject.class)), jsonObject2);
        companion.getClass();
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(strB, this.c);
        Request.Builder builder = new Request.Builder();
        builder.g(this.a.c);
        builder.e("POST", requestBody$Companion$toRequestBody$2A);
        return a(builder.b(), arrayList.size());
    }
}
