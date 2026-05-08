package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gk1 {
    public static final gk1 a = new gk1();

    public static final class a extends mj8 implements Function1<s5e, j6g> {
        final /* synthetic */ String $dragHandleDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.$dragHandleDescription = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            o5e.f(s5eVar, this.$dragHandleDescription);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ float $height;
        final /* synthetic */ float $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(2);
            this.$width = f;
            this.$height = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                hl1.a(g.o(e.a.b, this.$width, this.$height), bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $color;
        final /* synthetic */ float $height;
        final /* synthetic */ e $modifier;
        final /* synthetic */ dce $shape;
        final /* synthetic */ float $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, float f, float f2, dce dceVar, long j, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$width = f;
            this.$height = f2;
            this.$shape = dceVar;
            this.$color = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            gk1.this.a(this.$modifier, this.$width, this.$height, this.$shape, this.$color, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.e r23, float r24, float r25, defpackage.dce r26, long r27, androidx.compose.runtime.b r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk1.a(androidx.compose.ui.e, float, float, dce, long, androidx.compose.runtime.b, int, int):void");
    }
}
