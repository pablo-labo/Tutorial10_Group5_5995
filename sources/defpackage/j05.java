package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j05 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final /* synthetic */ a[] a;
        public static final /* synthetic */ wv4 b;
        private final String value;

        static {
            a[] aVarArr = {new a("StartObserving", 0, "startObserving"), new a("StopObserving", 1, "stopObserving")};
            a = aVarArr;
            b = new wv4(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a.clone();
        }

        public final String a() {
            return this.value;
        }
    }
}
