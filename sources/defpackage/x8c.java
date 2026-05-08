package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 x8c, still in use, count: 1, list:
  (r1v1 x8c) from 0x0041: INVOKE (r11v2 android.util.SparseArray), (1 int), (r1v1 x8c) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)]
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
/* JADX INFO: loaded from: classes2.dex */
public final class x8c {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);

    private final int value;

    static {
        x8c x8cVar = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, x8cVar);
        sparseArray.put(1, x8cVar);
        sparseArray.put(2, x8cVar);
        sparseArray.put(3, x8cVar);
        sparseArray.put(4, x8cVar);
        sparseArray.put(-1, x8cVar);
    }

    public x8c(int i) {
        this.value = i;
    }

    public static x8c valueOf(String str) {
        return (x8c) Enum.valueOf(x8c.class, str);
    }

    public static x8c[] values() {
        return (x8c[]) b.clone();
    }
}
