package defpackage;

import android.os.Trace;
import defpackage.gg8;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx8;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-linear-gradient_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lx8 extends sx9 {

    public static final class a implements Function2<mx8, int[], j6g> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, int[] iArr) {
            mx8 mx8Var2 = mx8Var;
            int[] iArr2 = iArr;
            mx8Var2.getClass();
            iArr2.getClass();
            mx8Var2.setColors(iArr2);
            return j6g.a;
        }
    }

    public static final class b implements Function2<mx8, float[], j6g> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, float[] fArr) {
            mx8 mx8Var2 = mx8Var;
            float[] fArr2 = fArr;
            mx8Var2.getClass();
            if (fArr2 != null) {
                mx8Var2.setLocations(fArr2);
            }
            return j6g.a;
        }
    }

    public static final class c implements Function2<mx8, Pair<? extends Float, ? extends Float>, j6g> {
        public static final c a = new c();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, Pair<? extends Float, ? extends Float> pair) {
            mx8 mx8Var2 = mx8Var;
            Pair<? extends Float, ? extends Float> pair2 = pair;
            mx8Var2.getClass();
            mx8Var2.e = new float[]{pair2 != null ? pair2.d().floatValue() : 0.5f, pair2 != null ? pair2.e().floatValue() : 0.0f};
            mx8Var2.a();
            return j6g.a;
        }
    }

    public static final class d implements Function2<mx8, Pair<? extends Float, ? extends Float>, j6g> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, Pair<? extends Float, ? extends Float> pair) {
            mx8 mx8Var2 = mx8Var;
            Pair<? extends Float, ? extends Float> pair2 = pair;
            mx8Var2.getClass();
            mx8Var2.f = new float[]{pair2 != null ? pair2.d().floatValue() : 0.5f, pair2 != null ? pair2.e().floatValue() : 1.0f};
            mx8Var2.a();
            return j6g.a;
        }
    }

    public static final class e implements Function2<mx8, float[], j6g> {
        public static final e a = new e();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, float[] fArr) {
            mx8 mx8Var2 = mx8Var;
            float[] fArr2 = fArr;
            mx8Var2.getClass();
            if (fArr2 == null) {
                fArr2 = new float[8];
                for (int i = 0; i < 8; i++) {
                    fArr2[i] = 0.0f;
                }
            }
            mx8Var2.setBorderRadii(fArr2);
            return j6g.a;
        }
    }

    public static final class f implements Function2<mx8, Boolean, j6g> {
        public static final f a = new f();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(mx8 mx8Var, Boolean bool) {
            mx8 mx8Var2 = mx8Var;
            Boolean bool2 = bool;
            mx8Var2.getClass();
            mx8Var2.setDither(bool2 != null ? bool2.booleanValue() : true);
            return j6g.a;
        }
    }

    public static final class g implements gu5<zf8> {
        public static final g a = new g();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(mx8.class);
        }
    }

    public static final class h implements gu5<zf8> {
        public static final h a = new h();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(int[].class);
        }
    }

    public static final class i implements gu5<zf8> {
        public static final i a = new i();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(float[].class);
        }
    }

    public static final class j implements gu5<zf8> {
        public static final j a = new j();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            Class cls = Float.TYPE;
            return fwc.c(Pair.class, gg8.a.a(fwc.d(cls)), gg8.a.a(fwc.d(cls)));
        }
    }

    public static final class k implements gu5<zf8> {
        public static final k a = new k();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            gg8 gg8Var = gg8.c;
            Class cls = Float.TYPE;
            return fwc.c(Pair.class, gg8.a.a(fwc.d(cls)), gg8.a.a(fwc.d(cls)));
        }
    }

    public static final class l implements gu5<zf8> {
        public static final l a = new l();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(float[].class);
        }
    }

    public static final class m implements gu5<zf8> {
        public static final m a = new m();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(Boolean.class);
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        spg spgVar;
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(lx8.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var = new vx9(this, 2);
            vx9Var.l = "ExpoLinearGradient";
            iwc iwcVar = fwc.a;
            spg spgVar2 = new spg(iwcVar.b(mx8.class), new xp8(iwcVar.b(mx8.class), false, g.a), null);
            LinkedHashMap linkedHashMap = spgVar2.d;
            zkd.p(spgVar2);
            a aVar = a.a;
            hb9 hb9Var = tf0.a;
            Pair pair = new Pair(iwcVar.b(int[].class), Boolean.FALSE);
            hb9 hb9Var2 = tf0.a;
            rf0 rf0Var = (rf0) hb9Var2.get(pair);
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(int[].class), false, h.a), null);
            }
            linkedHashMap.put("colors", new gn2("colors", rf0Var, aVar));
            b bVar = b.a;
            yd8 yd8VarB = iwcVar.b(float[].class);
            Boolean bool = Boolean.TRUE;
            rf0 rf0Var2 = (rf0) hb9Var2.get(new Pair(yd8VarB, bool));
            if (rf0Var2 == null) {
                spgVar = spgVar2;
                rf0Var2 = new rf0(new xp8(iwcVar.b(float[].class), true, i.a), null);
            } else {
                spgVar = spgVar2;
            }
            linkedHashMap.put("locations", new gn2("locations", rf0Var2, bVar));
            c cVar = c.a;
            rf0 rf0Var3 = (rf0) hb9Var2.get(new Pair(iwcVar.b(Pair.class), bool));
            if (rf0Var3 == null) {
                rf0Var3 = new rf0(new xp8(iwcVar.b(Pair.class), true, j.a), null);
            }
            linkedHashMap.put("startPoint", new gn2("startPoint", rf0Var3, cVar));
            d dVar = d.a;
            rf0 rf0Var4 = (rf0) hb9Var2.get(new Pair(iwcVar.b(Pair.class), bool));
            if (rf0Var4 == null) {
                rf0Var4 = new rf0(new xp8(iwcVar.b(Pair.class), true, k.a), null);
            }
            linkedHashMap.put("endPoint", new gn2("endPoint", rf0Var4, dVar));
            e eVar = e.a;
            rf0 rf0Var5 = (rf0) hb9Var2.get(new Pair(iwcVar.b(float[].class), bool));
            if (rf0Var5 == null) {
                rf0Var5 = new rf0(new xp8(iwcVar.b(float[].class), true, l.a), null);
            }
            linkedHashMap.put("borderRadii", new gn2("borderRadii", rf0Var5, eVar));
            f fVar = f.a;
            rf0 rf0Var6 = (rf0) hb9Var2.get(new Pair(iwcVar.b(Boolean.class), bool));
            if (rf0Var6 == null) {
                rf0Var6 = new rf0(new xp8(iwcVar.b(Boolean.class), true, m.a), null);
            }
            linkedHashMap.put("dither", new gn2("dither", rf0Var6, fVar));
            vx9Var.o(spgVar.a());
            return vx9Var.k();
        } finally {
            Trace.endSection();
        }
    }
}
