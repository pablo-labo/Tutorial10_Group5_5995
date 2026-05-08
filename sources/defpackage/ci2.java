package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ci2 {
    public static final ah2 a = new ah2(2096425134, a.a, false);
    public static final ah2 b = new ah2(1940444592, b.a, false);

    public static final class a extends mj8 implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a(3);

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            fhdVar.getClass();
            if ((iIntValue & 81) == 16 && bVar2.i()) {
                bVar2.D();
            } else {
                fif.b("OK", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 6, 0, 131070);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b(3);

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            fhdVar.getClass();
            if ((iIntValue & 81) == 16 && bVar2.i()) {
                bVar2.D();
            } else {
                fif.b("Cancel", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 6, 0, 131070);
            }
            return j6g.a;
        }
    }
}
