package defpackage;

import android.graphics.BlurMaskFilter;
import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hx6 implements wu5<e, b, Integer, e> {
    public final /* synthetic */ long a;

    public hx6(long j) {
        this.a = j;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        num.intValue();
        eVar2.getClass();
        bVar2.L(415385639);
        bVar2.L(1849434622);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = g80.a();
            bVar2.p(objV);
        }
        u2b u2bVar = (u2b) objV;
        bVar2.F();
        float fT1 = ((iy3) bVar2.M(um2.h)).t1(4.0f);
        bVar2.L(1849434622);
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            objV2 = new BlurMaskFilter(fT1, BlurMaskFilter.Blur.NORMAL);
            bVar2.p(objV2);
        }
        BlurMaskFilter blurMaskFilter = (BlurMaskFilter) objV2;
        bVar2.F();
        bVar2.L(-1224400529);
        boolean zX = bVar2.x(u2bVar) | bVar2.c(4.0f) | bVar2.x(blurMaskFilter);
        long j = this.a;
        boolean zE = bVar2.e(j) | zX | bVar2.c(0.0f) | bVar2.c(2.0f);
        Object objV3 = bVar2.v();
        if (zE || objV3 == c0020a) {
            objV3 = new rz4(u2bVar, blurMaskFilter, j);
            bVar2.p(objV3);
        }
        bVar2.F();
        e eVarA = a.a(eVar2, (Function1) objV3);
        bVar2.F();
        return eVarA;
    }
}
