package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vq6 {
    public static final e a = g.n(e.a.b, 24.0f);

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ p37 $imageVector;
        final /* synthetic */ e $modifier;
        final /* synthetic */ long $tint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p37 p37Var, String str, e eVar, long j, int i, int i2) {
            super(2);
            this.$imageVector = p37Var;
            this.$contentDescription = str;
            this.$modifier = eVar;
            this.$tint = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            vq6.a(this.$imageVector, this.$contentDescription, this.$modifier, this.$tint, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ e $modifier;
        final /* synthetic */ x2b $painter;
        final /* synthetic */ long $tint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x2b x2bVar, String str, e eVar, long j, int i, int i2) {
            super(2);
            this.$painter = x2bVar;
            this.$contentDescription = str;
            this.$modifier = eVar;
            this.$tint = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            vq6.b(this.$painter, this.$contentDescription, this.$modifier, this.$tint, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<s5e, j6g> {
        final /* synthetic */ String $contentDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.$contentDescription = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            s5e s5eVar2 = s5eVar;
            o5e.f(s5eVar2, this.$contentDescription);
            o5e.i(s5eVar2, 5);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.p37 r15, java.lang.String r16, androidx.compose.ui.e r17, long r18, androidx.compose.runtime.b r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq6.a(p37, java.lang.String, androidx.compose.ui.e, long, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.x2b r16, java.lang.String r17, androidx.compose.ui.e r18, long r19, androidx.compose.runtime.b r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq6.b(x2b, java.lang.String, androidx.compose.ui.e, long, androidx.compose.runtime.b, int, int):void");
    }
}
