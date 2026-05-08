package defpackage;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class sfa {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 sfa$a, still in use, count: 1, list:
  (r2v1 sfa$a) from 0x0103: INVOKE (r0v17 android.util.SparseArray<sfa$a>), (1 int), (r2v1 sfa$a) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE(13),
        /* JADX INFO: Fake field, exist only in values array */
        EHRPD(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        COMBINED(100);

        public static final SparseArray<a> c;
        private final int value;

        static {
            a aVar = UNKNOWN_MOBILE_SUBTYPE;
            SparseArray<a> sparseArray = new SparseArray<>();
            c = sparseArray;
            sparseArray.put(0, aVar);
            sparseArray.put(1, aVar);
            sparseArray.put(2, aVar);
            sparseArray.put(3, aVar);
            sparseArray.put(4, aVar);
            sparseArray.put(5, aVar);
            sparseArray.put(6, aVar);
            sparseArray.put(7, aVar);
            sparseArray.put(8, aVar);
            sparseArray.put(9, aVar);
            sparseArray.put(10, aVar);
            sparseArray.put(11, aVar);
            sparseArray.put(12, aVar);
            sparseArray.put(13, aVar);
            sparseArray.put(14, aVar);
            sparseArray.put(15, aVar);
            sparseArray.put(16, aVar);
            sparseArray.put(17, aVar);
            sparseArray.put(18, aVar);
            sparseArray.put(19, aVar);
        }

        public a(int i) {
            this.value = i;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        public final int a() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 sfa$b, still in use, count: 1, list:
  (r1v0 sfa$b) from 0x00e0: INVOKE (r0v15 android.util.SparseArray<sfa$b>), (0 int), (r1v0 sfa$b) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(0),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI_P2P(13),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IA(14),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        NONE(-1);

        public static final SparseArray<b> b;
        private final int value;

        static {
            b bVar = NONE;
            SparseArray<b> sparseArray = new SparseArray<>();
            b = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar);
            sparseArray.put(2, bVar);
            sparseArray.put(3, bVar);
            sparseArray.put(4, bVar);
            sparseArray.put(5, bVar);
            sparseArray.put(6, bVar);
            sparseArray.put(7, bVar);
            sparseArray.put(8, bVar);
            sparseArray.put(9, bVar);
            sparseArray.put(10, bVar);
            sparseArray.put(11, bVar);
            sparseArray.put(12, bVar);
            sparseArray.put(13, bVar);
            sparseArray.put(14, bVar);
            sparseArray.put(15, bVar);
            sparseArray.put(16, bVar);
            sparseArray.put(17, bVar);
            sparseArray.put(-1, bVar);
        }

        public b(int i) {
            this.value = i;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public final int a() {
            return this.value;
        }
    }

    public abstract a a();

    public abstract b b();
}
