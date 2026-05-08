package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dv7 implements kh5 {
    public static final dv7 a = new dv7();

    @Override // defpackage.kh5
    public final ui8 a(j5c j5cVar, String str, mge mgeVar, mge mgeVar2) {
        j5cVar.getClass();
        str.getClass();
        mgeVar.getClass();
        mgeVar2.getClass();
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return lx4.c(kx4.Z, str, mgeVar.toString(), mgeVar2.toString());
        }
        if (!j5cVar.o(od8.g)) {
            return yi8.a(mgeVar, mgeVar2);
        }
        cjc cjcVar = new cjc(mgeVar, mgeVar2);
        vi8.a.d(mgeVar, mgeVar2);
        return cjcVar;
    }
}
