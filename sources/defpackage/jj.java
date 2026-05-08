package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jj implements xu5 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jj(luc lucVar, boolean z, gu5 gu5Var, iba ibaVar) {
        this.e = lucVar;
        this.b = z;
        this.c = gu5Var;
        this.d = ibaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj5 = this.e;
        iba ibaVar = this.d;
        gu5 gu5Var = this.c;
        switch (i) {
            case 0:
                luc lucVar = (luc) obj5;
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new rg(1);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                Locale locale = (Locale) lucVar.element;
                if (locale == null) {
                    locale = Locale.ROOT;
                }
                Locale locale2 = locale;
                boolean zK = bVar.K(gu5Var);
                Object objV2 = bVar.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new oi(0, gu5Var);
                    bVar.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX = bVar.x(ibaVar);
                Object objV3 = bVar.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new ie(ibaVar, 1);
                    bVar.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                pi piVar = new pi(0, ibaVar, lucVar);
                boolean zX2 = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                if (zX2 || objV4 == c0020a) {
                    objV4 = new id(ibaVar, 1);
                    bVar.p(objV4);
                }
                gu5 gu5Var4 = (gu5) objV4;
                boolean zX3 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX3 || objV5 == c0020a) {
                    objV5 = new ri(ibaVar, 0);
                    bVar.p(objV5);
                }
                o8g.a(0, gu5Var2, gu5Var3, piVar, gu5Var4, (gu5) objV5, bVar, locale2, this.b, false);
                return j6gVar;
            default:
                g4a g4aVar = (g4a) obj5;
                b bVar2 = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar2 = j6g.a;
                Object objV6 = bVar2.v();
                if (objV6 == c0020a) {
                    objV6 = new hu(1);
                    bVar2.p(objV6);
                }
                to4.b(j6gVar2, (Function1) objV6, bVar2);
                ig3 ig3Var = (ig3) g4aVar.getValue();
                boolean zK2 = bVar2.K(gu5Var);
                Object objV7 = bVar2.v();
                if (zK2 || objV7 == c0020a) {
                    objV7 = new nt(1, gu5Var);
                    bVar2.p(objV7);
                }
                gu5 gu5Var5 = (gu5) objV7;
                boolean zX4 = bVar2.x(ibaVar);
                Object objV8 = bVar2.v();
                if (zX4 || objV8 == c0020a) {
                    objV8 = new bs(ibaVar, 2);
                    bVar2.p(objV8);
                }
                gu5 gu5Var6 = (gu5) objV8;
                boolean zX5 = bVar2.x(ibaVar);
                Object objV9 = bVar2.v();
                if (zX5 || objV9 == c0020a) {
                    objV9 = new lh(ibaVar, 2);
                    bVar2.p(objV9);
                }
                gu5 gu5Var7 = (gu5) objV9;
                boolean zX6 = bVar2.x(ibaVar);
                Object objV10 = bVar2.v();
                if (zX6 || objV10 == c0020a) {
                    objV10 = new og(ibaVar, g4aVar, 1);
                    bVar2.p(objV10);
                }
                gu5 gu5Var8 = (gu5) objV10;
                Object objV11 = bVar2.v();
                if (objV11 == c0020a) {
                    objV11 = new nh(2, g4aVar);
                    bVar2.p(objV11);
                }
                qgg.b(this.b, gu5Var5, gu5Var6, gu5Var7, gu5Var8, (Function1) objV11, ig3Var, false, bVar2, 196608);
                return j6gVar2;
        }
    }

    public /* synthetic */ jj(boolean z, gu5 gu5Var, iba ibaVar, g4a g4aVar) {
        this.b = z;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = g4aVar;
    }
}
