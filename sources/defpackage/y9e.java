package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y9e implements cse {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final String f;
    public final String g;
    public Integer h;
    public Long i;

    public static final class a {
        public static y9e a(HashMap map) {
            Object obj = map.get("firstEventId");
            if (obj instanceof String) {
                Object obj2 = map.get("firstEventTimestamp");
                if (obj2 instanceof String) {
                    Object obj3 = map.get(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY);
                    if (obj3 instanceof String) {
                        Object obj4 = map.get("previousSessionId");
                        if (!(obj4 instanceof String)) {
                            obj4 = null;
                        }
                        String str = obj4 instanceof String ? (String) obj4 : null;
                        Object obj5 = map.get("sessionIndex");
                        if (obj5 instanceof Integer) {
                            Object obj6 = map.get("userId");
                            if (obj6 instanceof String) {
                                Object obj7 = map.get("storageMechanism");
                                if (obj7 instanceof String) {
                                    Object obj8 = map.get("eventIndex");
                                    Integer num = obj8 instanceof Integer ? (Integer) obj8 : null;
                                    Object obj9 = map.get("lastUpdate");
                                    return new y9e((String) obj, (String) obj2, (String) obj3, str, ((Number) obj5).intValue(), (String) obj6, (String) obj7, num, obj9 instanceof Long ? (Long) obj9 : null);
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public y9e(String str, String str2, String str3, String str4, int i, String str5, String str6, Integer num, Long l) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = num;
        this.i = l;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put("firstEventId", this.a);
        map.put("firstEventTimestamp", this.b);
        map.put(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, this.c);
        map.put("previousSessionId", this.d);
        map.put("sessionIndex", Integer.valueOf(this.e));
        map.put("userId", this.f);
        map.put("storageMechanism", this.g);
        Integer num = this.h;
        if (num != null) {
            map.put("eventIndex", Integer.valueOf(num.intValue()));
        }
        return map;
    }

    public final void b(long j, String str) {
        this.d = this.c;
        yjg yjgVar = yjg.a;
        this.c = t40.h();
        this.e++;
        this.h = 0;
        this.a = str;
        this.b = yjg.c(j);
        this.i = Long.valueOf(System.currentTimeMillis());
    }
}
