package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class drd extends e4 {
    public static final /* synthetic */ int k = 0;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.drd a(android.app.Activity r6) {
            /*
                java.lang.String r0 = r6.getLocalClassName()
                r0.getClass()
                java.lang.String r1 = "drd"
                java.lang.Class r2 = r6.getClass()
                r3 = 0
                r4 = 1
                java.lang.String r5 = "snowplowScreenId"
                java.lang.reflect.Field r5 = r2.getField(r5)     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                boolean r5 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                if (r5 == 0) goto L24
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                goto L6a
            L20:
                r6 = move-exception
                goto L3d
            L22:
                r6 = move-exception
                goto L50
            L24:
                java.lang.String r6 = "The value of field `snowplowScreenId` on Activity `%s` has to be a String."
                java.lang.String r5 = r2.getSimpleName()     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                java.lang.String r6 = java.lang.String.format(r6, r5)     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                defpackage.c49.b(r1, r6, r5)     // Catch: java.lang.Exception -> L20 java.lang.NoSuchFieldException -> L22
                goto L69
            L3d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Error retrieving value of field `snowplowScreenId`: "
                r2.<init>(r4)
                java.lang.String r2 = defpackage.b0.h(r6, r2)
                java.lang.Object[] r6 = new java.lang.Object[]{r6}
                defpackage.c49.b(r1, r2, r6)
                goto L69
            L50:
                java.lang.String r2 = r2.getSimpleName()
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
                java.lang.String r4 = "Field `snowplowScreenId` not found on Activity `%s`."
                java.lang.String r2 = java.lang.String.format(r4, r2)
                java.lang.Object[] r6 = new java.lang.Object[]{r6}
                defpackage.c49.a(r1, r2, r6)
            L69:
                r6 = r3
            L6a:
                int r1 = r0.length()
                if (r1 <= 0) goto L72
                r1 = r0
                goto L7e
            L72:
                if (r6 == 0) goto L7c
                int r1 = r6.length()
                if (r1 <= 0) goto L7c
                r1 = r6
                goto L7e
            L7c:
                java.lang.String r1 = "Unknown"
            L7e:
                drd r2 = new drd
                r2.<init>(r1, r3)
                r2.i = r0
                r2.j = r6
                r2.d = r0
                r2.h = r3
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: drd.a.a(android.app.Activity):drd");
        }
    }

    public drd(String str, UUID uuid) {
        if (str.length() <= 0) {
            l5.q("Name cannot be empty");
            throw null;
        }
        this.b = str;
        String string = uuid != null ? uuid.toString() : null;
        if (string == null) {
            yjg yjgVar = yjg.a;
            string = t40.h();
        }
        this.c = string;
    }

    @Override // defpackage.rx4
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("id", this.c);
        map.put("name", this.b);
        String str = this.d;
        if (str != null) {
            map.put("type", str);
        }
        String str2 = this.f;
        if (str2 != null) {
            map.put("previousId", str2);
        }
        String str3 = this.e;
        if (str3 != null) {
            map.put("previousName", str3);
        }
        String str4 = this.g;
        if (str4 != null) {
            map.put("previousType", str4);
        }
        String str5 = this.h;
        if (str5 != null) {
            map.put("transitionType", str5);
        }
        return map;
    }

    @Override // defpackage.e4
    public final String d() {
        return "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0";
    }
}
