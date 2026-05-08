package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rd9 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ fd9 $components;
        final /* synthetic */ String $content;
        final /* synthetic */ md9 $flavour;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, md9 md9Var, String str, fd9 fd9Var) {
            super(2);
            this.$modifier = eVar;
            this.$flavour = md9Var;
            this.$content = str;
            this.$components = fd9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
        @Override // kotlin.jvm.functions.Function2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g invoke(androidx.compose.runtime.b r18, java.lang.Integer r19) {
            /*
                Method dump skipped, instruction units count: 661
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rd9.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ zc9 $annotator;
        final /* synthetic */ cd9 $colors;
        final /* synthetic */ fd9 $components;
        final /* synthetic */ String $content;
        final /* synthetic */ id9 $dimens;
        final /* synthetic */ ld9 $extendedSpans;
        final /* synthetic */ md9 $flavour;
        final /* synthetic */ o37 $imageTransformer;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ud9 $padding;
        final /* synthetic */ ae9 $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, cd9 cd9Var, ae9 ae9Var, e eVar, ud9 ud9Var, id9 id9Var, md9 md9Var, o37 o37Var, zc9 zc9Var, ld9 ld9Var, fd9 fd9Var, int i, int i2, int i3) {
            super(2);
            this.$content = str;
            this.$colors = cd9Var;
            this.$typography = ae9Var;
            this.$modifier = eVar;
            this.$padding = ud9Var;
            this.$dimens = id9Var;
            this.$flavour = md9Var;
            this.$imageTransformer = o37Var;
            this.$annotator = zc9Var;
            this.$extendedSpans = ld9Var;
            this.$components = fd9Var;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            rd9.a(this.$content, this.$colors, this.$typography, this.$modifier, this.$padding, this.$dimens, this.$flavour, this.$imageTransformer, this.$annotator, this.$extendedSpans, this.$components, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r19, defpackage.cd9 r20, defpackage.ae9 r21, androidx.compose.ui.e r22, defpackage.ud9 r23, defpackage.id9 r24, defpackage.md9 r25, defpackage.o37 r26, defpackage.zc9 r27, defpackage.ld9 r28, defpackage.fd9 r29, androidx.compose.runtime.b r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd9.a(java.lang.String, cd9, ae9, androidx.compose.ui.e, ud9, id9, md9, o37, zc9, ld9, fd9, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final boolean b(y yVar, fd9 fd9Var, String str, boolean z, androidx.compose.runtime.b bVar, int i, int i2) {
        j6g j6gVar;
        yVar.getClass();
        fd9Var.getClass();
        str.getClass();
        bVar.u(2015809952);
        boolean z2 = (i2 & 8) != 0 ? true : z;
        ed9 ed9Var = new ed9(str, yVar, (ae9) bVar.M(rk2.e));
        bVar.u(-1097402255);
        if (z2) {
            jh2.f(bVar, g.h(e.a.b, ((ud9) bVar.M(rk2.f)).h()));
        }
        bVar.J();
        en6 type = yVar.getType();
        boolean zB = wl7.b(type, zd9.a);
        qb2 qb2Var = qb2.a;
        if (zB) {
            bVar.u(-1097398174);
            fd9Var.getText().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, zd9.p)) {
            bVar.u(-1097396319);
            fd9Var.k().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.V)) {
            bVar.u(-1097394265);
            fd9Var.r().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.W)) {
            bVar.u(-1097392025);
            fd9Var.a().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.o0)) {
            bVar.u(-1097389946);
            fd9Var.i().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.p0)) {
            bVar.u(-1097387898);
            fd9Var.s().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.q0)) {
            bVar.u(-1097385850);
            fd9Var.p().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.r0)) {
            bVar.u(-1097383802);
            fd9Var.n().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.s0)) {
            bVar.u(-1097381754);
            fd9Var.l().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.t0)) {
            bVar.u(-1097379706);
            fd9Var.e().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.m0)) {
            bVar.u(-1097377556);
            fd9Var.h().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.n0)) {
            bVar.u(-1097375220);
            fd9Var.g().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.f)) {
            bVar.u(-1097372792);
            fd9Var.b().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.Z)) {
            bVar.u(-1097370553);
            fd9Var.d().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.d)) {
            bVar.u(-1097368247);
            fd9Var.j().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.c)) {
            bVar.u(-1097365813);
            fd9Var.o().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.k0)) {
            bVar.u(-1097363613);
            fd9Var.c().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, pg8.c0)) {
            bVar.u(-1097361332);
            fd9Var.m().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else if (wl7.b(type, zd9.B)) {
            bVar.u(-1097358772);
            fd9Var.f().j(qb2Var, ed9Var, bVar, Integer.valueOf(i & 14));
            bVar.J();
        } else {
            bVar.u(341675958);
            yu5<pb2, en6, ed9, androidx.compose.runtime.b, Integer, j6g> yu5VarQ = fd9Var.q();
            if (yu5VarQ == null) {
                j6gVar = null;
            } else {
                yu5VarQ.t(qb2Var, yVar.getType(), ed9Var, bVar, Integer.valueOf(i & 14));
                j6gVar = j6g.a;
            }
            z = j6gVar != null;
            bVar.J();
        }
        boolean z3 = z;
        if (!z3) {
            Iterator<T> it = yVar.a().iterator();
            while (it.hasNext()) {
                b((y) it.next(), fd9Var, str, z2, bVar, i & 65422, 0);
            }
        }
        bVar.J();
        return z3;
    }
}
