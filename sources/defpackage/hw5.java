package defpackage;

import defpackage.ue4;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public final class hw5 {
    public static final Hashtable a;
    public static final Hashtable b;

    public static class a extends r5h {
        @Override // defpackage.r5h
        public final q5h a() {
            BigInteger bigIntegerA = hw5.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger bigIntegerA2 = hw5.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger bigIntegerA3 = hw5.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger bigIntegerA4 = hw5.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ue4.d dVar = new ue4.d(bigIntegerA, bigIntegerA2, bigIntegerA3, bigIntegerA4, bigIntegerValueOf);
            return new q5h(dVar, new s5h(dVar, sh6.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerA4, bigIntegerValueOf, null);
        }
    }

    public static class b extends r5h {
        @Override // defpackage.r5h
        public final q5h a() {
            BigInteger bigIntegerA = hw5.a("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger bigIntegerA2 = hw5.a("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger bigIntegerA3 = hw5.a("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger bigIntegerA4 = hw5.a("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ue4.d dVar = new ue4.d(bigIntegerA, bigIntegerA2, bigIntegerA3, bigIntegerA4, bigIntegerValueOf);
            return new q5h(dVar, new s5h(dVar, sh6.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerA4, bigIntegerValueOf, null);
        }
    }

    static {
        a aVar = new a();
        b bVar = new b();
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        u uVar = iw5.b;
        hashtable.put(qve.a("wapip192v1"), uVar);
        hashtable3.put(uVar, "wapip192v1");
        hashtable2.put(uVar, bVar);
        u uVar2 = iw5.a;
        hashtable.put(qve.a("sm2p256v1"), uVar2);
        hashtable3.put(uVar2, "sm2p256v1");
        hashtable2.put(uVar2, aVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, sh6.a(str));
    }
}
