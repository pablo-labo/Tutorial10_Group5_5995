package defpackage;

import com.wlproctor.common.model.Payload;
import com.wlproctor.common.model.TestBucket;
import com.wlproctor.loader.jsonmodels.UnexpectedPayloadException;
import defpackage.j88;
import defpackage.mob;
import defpackage.uu9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class v45 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[uu9.values().length];
            try {
                uu9.a aVar = uu9.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uu9.a aVar2 = uu9.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uu9.a aVar3 = uu9.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uu9.a aVar4 = uu9.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uu9.a aVar5 = uu9.a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uu9.a aVar6 = uu9.a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uu9.a aVar7 = uu9.a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                uu9.a aVar8 = uu9.a;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static final ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(a((JSONArray) obj));
            } else {
                obj.getClass();
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap b(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(next, b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, a((JSONArray) obj));
            } else {
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public static final hd7 c(j88.e eVar, Map<String, Integer> map) {
        eVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j88.f fVar = eVar.c;
        Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            mob mobVar = ((j88.a) it.next()).b;
            linkedHashMap.put(mobVar.a, d(mobVar));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = fVar.c.iterator();
        while (it2.hasNext()) {
            mob mobVar2 = ((j88.d) it2.next()).b;
            linkedHashMap2.put(mobVar2.a, d(mobVar2));
        }
        jpb jpbVar = new jpb(fVar.e, fVar.a, fVar.g, map, new vob(fVar.d, linkedHashMap, linkedHashMap2), fVar.f);
        String str = eVar.a;
        if (str == null) {
            str = "";
        }
        k83 k83Var = new k83(str);
        String str2 = (String) eVar.d;
        String str3 = (String) eVar.e;
        j88.b bVar = eVar.f;
        return new hd7(jpbVar, k83Var, str2, str3, bVar != null ? new lx0(bVar.a, bVar.c, bVar.d, bVar.g, bVar.b, bVar.f, bVar.e, bVar.h, bVar.i, bVar.j) : null, eVar.g, eVar.h);
    }

    public static final TestBucket d(mob mobVar) throws JSONException, UnexpectedPayloadException {
        Payload payload;
        Payload payload2;
        Payload payload3;
        mob.a aVar = mobVar.b;
        int i = aVar.a;
        String str = aVar.b;
        mob.b bVar = aVar.c;
        if (bVar != null) {
            String str2 = bVar.a;
            String str3 = mobVar.a;
            uu9 uu9Var = bVar.b;
            int i2 = 0;
            switch (uu9Var == null ? -1 : a.a[uu9Var.ordinal()]) {
                case 1:
                    payload = new Payload(Double.valueOf(Double.parseDouble(str2)), null, null, null, null, null, null, null, 254, null);
                    break;
                case 2:
                    JSONArray jSONArray = new JSONArray(str2);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    while (i2 < length) {
                        arrayList.add(Double.valueOf(jSONArray.getDouble(i2)));
                        i2++;
                    }
                    payload = new Payload(null, arrayList, null, null, null, null, null, null, 253, null);
                    break;
                case 3:
                    payload2 = new Payload(null, null, Long.valueOf(Long.parseLong(str2)), null, null, null, null, null, 251, null);
                    payload = payload2;
                    break;
                case 4:
                    JSONArray jSONArray2 = new JSONArray(str2);
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = jSONArray2.length();
                    while (i2 < length2) {
                        arrayList2.add(Long.valueOf(jSONArray2.getLong(i2)));
                        i2++;
                    }
                    payload3 = new Payload(null, null, null, arrayList2, null, null, null, null, 247, null);
                    payload = payload3;
                    break;
                case 5:
                    payload = new Payload(null, null, null, null, str2, null, null, null, 239, null);
                    break;
                case 6:
                    JSONArray jSONArray3 = new JSONArray(str2);
                    ArrayList arrayList3 = new ArrayList();
                    int length3 = jSONArray3.length();
                    while (i2 < length3) {
                        arrayList3.add(jSONArray3.getString(i2));
                        i2++;
                    }
                    payload2 = new Payload(null, null, null, null, null, arrayList3, null, null, 223, null);
                    payload = payload2;
                    break;
                case 7:
                    JSONObject jSONObject = new JSONObject(str2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    itKeys.getClass();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            linkedHashMap.put(next, b((JSONObject) obj));
                        } else if (obj instanceof JSONArray) {
                            linkedHashMap.put(next, a((JSONArray) obj));
                        } else {
                            linkedHashMap.put(next, obj);
                        }
                    }
                    payload3 = new Payload(null, null, null, null, null, null, linkedHashMap, null, 191, null);
                    payload = payload3;
                    break;
                case 8:
                    payload = new Payload(null, null, null, null, str2, null, null, null, 239, null);
                    break;
                default:
                    throw new UnexpectedPayloadException(str3, String.valueOf(uu9Var), str2);
            }
        } else {
            Payload.INSTANCE.getClass();
            payload = Payload.EMPTY;
        }
        return new TestBucket("DEPRECATED", i, str, payload);
    }
}
