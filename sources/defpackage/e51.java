package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e51 {
    public static final void a(final jhf jhfVar, final boolean z, final boolean z2, final Function1 function1, final gu5 gu5Var, final int i, final boolean z3, b bVar, final int i2) {
        jhfVar.getClass();
        function1.getClass();
        c cVarH = bVar.h(89818695);
        int i3 = i2 | (cVarH.K(jhfVar) ? 4 : 2) | (cVarH.a(z) ? 32 : 16) | (cVarH.a(z2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192) | (cVarH.d(i) ? 131072 : 65536) | (cVarH.a(z3) ? 1048576 : 524288);
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            cVarH.v0();
            if ((i2 & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            e eVarF = g.f(e.a.b, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.i, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            zu6.a(null, false, bh2.c(575507500, new Function2() { // from class: y41
                /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
                    /*
                        r17 = this;
                        r0 = r17
                        r9 = r18
                        androidx.compose.runtime.b r9 = (androidx.compose.runtime.b) r9
                        r1 = r19
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        r2 = r1 & 3
                        r3 = 2
                        r13 = 1
                        if (r2 == r3) goto L16
                        r2 = r13
                        goto L17
                    L16:
                        r2 = 0
                    L17:
                        r1 = r1 & r13
                        boolean r1 = r9.o(r1, r2)
                        if (r1 == 0) goto Lc1
                        r14 = 1065353216(0x3f800000, float:1.0)
                        androidx.compose.ui.e$a r15 = androidx.compose.ui.e.a.b
                        boolean r1 = r1
                        r2 = -576425130(0xffffffffdda47356, float:-1.4812387E18)
                        if (r1 != 0) goto L65
                        r1 = r2
                        gu5 r2 = r2
                        if (r2 == 0) goto L62
                        r3 = -565451378(0xffffffffde4be58e, float:-3.67307637E18)
                        r9.L(r3)
                        r3 = 2131953158(0x7f130606, float:1.954278E38)
                        java.lang.String r3 = defpackage.ak2.I(r3, r9)
                        androidx.compose.ui.e r4 = androidx.compose.foundation.layout.g.f(r15, r14)
                        java.lang.String r5 = "AutocompleteSheetSkipButton"
                        androidx.compose.ui.e r4 = androidx.compose.ui.platform.f.a(r4, r5)
                        r11 = 384(0x180, float:5.38E-43)
                        r12 = 504(0x1f8, float:7.06E-43)
                        r5 = r1
                        r1 = r3
                        r3 = r4
                        r4 = 0
                        r6 = r5
                        r5 = 0
                        r7 = r6
                        r6 = 0
                        r8 = r7
                        r7 = 0
                        r10 = r8
                        r8 = 0
                        r16 = r10
                        r10 = r9
                        r9 = 0
                        r14 = r16
                        defpackage.gt6.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    L5e:
                        r10.F()
                        goto L6b
                    L62:
                        r14 = r1
                    L63:
                        r10 = r9
                        goto L67
                    L65:
                        r14 = r2
                        goto L63
                    L67:
                        r10.L(r14)
                        goto L5e
                    L6b:
                        boolean r1 = r3
                        if (r1 == 0) goto Lbd
                        r1 = -565059972(0xffffffffde51de7c, float:-3.78066523E18)
                        r10.L(r1)
                        int r1 = r4
                        java.lang.String r1 = defpackage.ak2.I(r1, r10)
                        kotlin.jvm.functions.Function1 r2 = r5
                        boolean r3 = r10.K(r2)
                        jhf r0 = r6
                        boolean r4 = r10.K(r0)
                        r3 = r3 | r4
                        java.lang.Object r4 = r10.v()
                        if (r3 != 0) goto L92
                        androidx.compose.runtime.b$a$a r3 = androidx.compose.runtime.b.a.a
                        if (r4 != r3) goto L9a
                    L92:
                        rr r4 = new rr
                        r4.<init>(r13, r2, r0)
                        r10.p(r4)
                    L9a:
                        gu5 r4 = (defpackage.gu5) r4
                        r0 = 1065353216(0x3f800000, float:1.0)
                        androidx.compose.ui.e r0 = androidx.compose.foundation.layout.g.f(r15, r0)
                        java.lang.String r2 = "AutocompleteSheetSubmitButton"
                        androidx.compose.ui.e r2 = androidx.compose.ui.platform.f.a(r0, r2)
                        r9 = r10
                        r10 = 384(0x180, float:5.38E-43)
                        r11 = 504(0x1f8, float:7.06E-43)
                        r3 = 0
                        r0 = r1
                        r1 = r4
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        defpackage.gt6.h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        r10 = r9
                    Lb9:
                        r10.F()
                        goto Lc5
                    Lbd:
                        r10.L(r14)
                        goto Lb9
                    Lc1:
                        r10 = r9
                        r10.D()
                    Lc5:
                        j6g r0 = defpackage.j6g.a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.y41.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, cVarH), null, cVarH, 384, 27);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, z2, function1, gu5Var, i, z3, i2) { // from class: z41
                public final /* synthetic */ boolean V;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    e51.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r44, final java.lang.String r45, java.lang.String r46, java.lang.String r47, final boolean r48, final boolean r49, final java.lang.String r50, final java.util.List r51, final kotlin.jvm.functions.Function1 r52, final defpackage.gu5 r53, final kotlin.jvm.functions.Function1 r54, defpackage.gu5 r55, final defpackage.gu5 r56, java.lang.Float r57, kotlin.jvm.functions.Function1 r58, final defpackage.hw9 r59, int r60, java.util.List r61, java.lang.String r62, boolean r63, boolean r64, androidx.compose.runtime.b r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e51.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, gu5, kotlin.jvm.functions.Function1, gu5, gu5, java.lang.Float, kotlin.jvm.functions.Function1, hw9, int, java.util.List, java.lang.String, boolean, boolean, androidx.compose.runtime.b, int, int, int):void");
    }
}
