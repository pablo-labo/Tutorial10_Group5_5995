package defpackage;

import androidx.compose.ui.e;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r1f {

    public static final class a extends mj8 implements Function2<th7, iq2, Pair<? extends oa4<w1f>, ? extends w1f>> {
        final /* synthetic */ boolean $enableDismissFromEndToStart;
        final /* synthetic */ boolean $enableDismissFromStartToEnd;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ v1f $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1f v1fVar, boolean z, boolean z2, boolean z3) {
            super(2);
            this.$state = v1fVar;
            this.$enableDismissFromStartToEnd = z;
            this.$isRtl = z2;
            this.$enableDismissFromEndToStart = z3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Pair<? extends oa4<w1f>, ? extends w1f> invoke(th7 th7Var, iq2 iq2Var) {
            long j = th7Var.a;
            long j2 = iq2Var.a;
            q1f q1fVar = new q1f(this.$enableDismissFromStartToEnd, this.$isRtl, (int) (j >> 32), this.$enableDismissFromEndToStart);
            qa4<w1f> qa4Var = new qa4<>();
            q1fVar.invoke(qa4Var);
            return new Pair<>(new lb9(qa4Var.a), (w1f) this.$state.b.h.getValue());
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $backgroundContent;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ boolean $enableDismissFromEndToStart;
        final /* synthetic */ boolean $enableDismissFromStartToEnd;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ e $modifier;
        final /* synthetic */ v1f $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v1f v1fVar, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, e eVar, boolean z, boolean z2, boolean z3, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var2, int i, int i2) {
            super(2);
            this.$state = v1fVar;
            this.$backgroundContent = wu5Var;
            this.$modifier = eVar;
            this.$enableDismissFromStartToEnd = z;
            this.$enableDismissFromEndToStart = z2;
            this.$gesturesEnabled = z3;
            this.$content = wu5Var2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            r1f.a(this.$state, this.$backgroundContent, this.$modifier, this.$enableDismissFromStartToEnd, this.$enableDismissFromEndToStart, this.$gesturesEnabled, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.v1f r26, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r27, androidx.compose.ui.e r28, boolean r29, boolean r30, boolean r31, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r32, androidx.compose.runtime.b r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1f.a(v1f, wu5, androidx.compose.ui.e, boolean, boolean, boolean, wu5, androidx.compose.runtime.b, int, int):void");
    }
}
