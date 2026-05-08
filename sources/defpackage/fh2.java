package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fh2 {
    public static final ah2 a = new ah2(446723454, a.a, false);
    public static final ah2 b = new ah2(-877998884, b.a, false);
    public static final ah2 c = new ah2(-1421574347, c.a, false);
    public static final ah2 d = new ah2(-915435369, d.a, false);

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b(3);

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 17) == 16 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final c a = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements wu5<fhd, androidx.compose.runtime.b, Integer, j6g> {
        public static final d a = new d(3);

        @Override // defpackage.wu5
        public final j6g q(fhd fhdVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 17) == 16 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }
}
