package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hi8 {
    public final a a;
    public final us9 b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String f;
    public final int g;

    public enum a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        public static final C0256a a = new C0256a();
        public static final LinkedHashMap b;
        private final int id;

        /* JADX INFO: renamed from: hi8$a$a, reason: collision with other inner class name */
        public static final class C0256a {
        }

        static {
            a[] aVarArrValues = values();
            int iV = kc9.V(aVarArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.id), aVar);
            }
            b = linkedHashMap;
        }

        a(int i) {
            this.id = i;
        }
    }

    public hi8(a aVar, us9 us9Var, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        aVar.getClass();
        this.a = aVar;
        this.b = us9Var;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
    }

    public final String toString() {
        return this.a + " version=" + this.b;
    }
}
