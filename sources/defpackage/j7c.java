package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j7c {
    public static final j7c a = new j7c();
    public static final fgd b = ggd.a;
    public static final float c = 80.0f;
    public static final float d = 3.0f;

    public static final class a extends mj8 implements wu5<Boolean, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ long $color;
        final /* synthetic */ w7c $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, w7c w7cVar) {
            super(3);
            this.$color = j;
            this.$state = w7cVar;
        }

        @Override // defpackage.wu5
        public final j6g q(Boolean bool, androidx.compose.runtime.b bVar, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.a(zBooleanValue) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && bVar2.i()) {
                bVar2.D();
            } else if (zBooleanValue) {
                bVar2.L(576835739);
                dvf<Float> dvfVar = o7c.a;
                z2c.a(2.5f, 0, 390, 24, this.$color, 0L, bVar2, g.n(e.a.b, 16.0f));
                bVar2.F();
            } else {
                bVar2.L(577079337);
                boolean zK = bVar2.K(this.$state);
                w7c w7cVar = this.$state;
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new i7c(w7cVar);
                    bVar2.p(objV);
                }
                o7c.b((gu5) objV, this.$color, bVar2, 0);
                bVar2.F();
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ boolean $isRefreshing;
        final /* synthetic */ e $modifier;
        final /* synthetic */ w7c $state;
        final /* synthetic */ float $threshold;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w7c w7cVar, boolean z, e eVar, long j, long j2, float f, int i, int i2) {
            super(2);
            this.$state = w7cVar;
            this.$isRefreshing = z;
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$color = j2;
            this.$threshold = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            j7c.this.a(this.$state, this.$isRefreshing, this.$modifier, this.$containerColor, this.$color, this.$threshold, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.w7c r18, boolean r19, androidx.compose.ui.e r20, long r21, long r23, float r25, androidx.compose.runtime.b r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7c.a(w7c, boolean, androidx.compose.ui.e, long, long, float, androidx.compose.runtime.b, int, int):void");
    }
}
