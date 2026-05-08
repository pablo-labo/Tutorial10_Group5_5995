package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public enum okh {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final dqh b;
    private final int zzr;

    static {
        unh unhVar = new unh();
        unhVar.a = new Object[8];
        unhVar.b = 0;
        for (okh okhVar : values()) {
            Integer numValueOf = Integer.valueOf(okhVar.zzr);
            int i = unhVar.b + 1;
            Object[] objArr = unhVar.a;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                unhVar.a = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = unhVar.a;
            int i3 = unhVar.b;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = okhVar;
            unhVar.b = i3 + 1;
        }
        qnh qnhVar = unhVar.c;
        if (qnhVar != null) {
            throw qnhVar.a();
        }
        dqh dqhVarA = dqh.a(unhVar.b, unhVar.a, unhVar);
        qnh qnhVar2 = unhVar.c;
        if (qnhVar2 != null) {
            throw qnhVar2.a();
        }
        b = dqhVarA;
    }

    okh(int i) {
        this.zzr = i;
    }
}
