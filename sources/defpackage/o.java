package defpackage;

import defpackage.ue4;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final Hashtable a;
    public static final Hashtable b;

    public static class a extends r5h {
        @Override // defpackage.r5h
        public final q5h a() {
            BigInteger bigInteger = new BigInteger(1, sh6.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03"));
            BigInteger bigInteger2 = new BigInteger(1, sh6.a("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00"));
            BigInteger bigInteger3 = new BigInteger(1, sh6.a("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F"));
            BigInteger bigInteger4 = new BigInteger(1, sh6.a("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1"));
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ue4.d dVar = new ue4.d(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigIntegerValueOf);
            return new q5h(dVar, new s5h(dVar, sh6.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigInteger4, bigIntegerValueOf, null);
        }
    }

    static {
        a aVar = new a();
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        u uVar = p.a;
        hashtable.put(qve.a("FRP256v1"), uVar);
        hashtable3.put(uVar, "FRP256v1");
        hashtable2.put(uVar, aVar);
    }
}
