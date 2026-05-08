package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.lj8;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import defpackage.ytc;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zx6 {

    public static final class a implements Function2<b, Integer, j6g> {
        public final /* synthetic */ ux6 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ o97 c;
        public final /* synthetic */ String d;

        public a(ux6 ux6Var, String str, o97 o97Var, String str2) {
            this.a = ux6Var;
            this.b = str;
            this.c = o97Var;
            this.d = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2;
            b bVar3 = bVar;
            if ((num.intValue() & 3) == 2 && bVar3.i()) {
                bVar3.D();
            } else {
                ux6 ux6Var = this.a;
                ux6Var.getClass();
                bVar3.L(-852423275);
                bVar3.F();
                if (1.0f <= 0.0d) {
                    yd7.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                int iHashCode = Long.hashCode(bVar3.k());
                t8b t8bVarM = bVar3.m();
                e eVarC = c.c(bVar3, layoutWeightElement);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar3.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar3.B();
                if (bVar3.f()) {
                    bVar3.y(aVar);
                } else {
                    bVar3.n();
                }
                ygg.y(bVar3, ob2VarA, gl2.a.g);
                ygg.y(bVar3, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar3, iHashCode, c0251a);
                }
                ygg.y(bVar3, eVarC, gl2.a.d);
                bVar3.L(-589403678);
                String str = this.b;
                if (str != null) {
                    le0 le0VarD = zx6.d(ux6Var.a, str, bVar3);
                    o97 o97Var = this.c;
                    cif.c(le0VarD, f.a(e.a.b, this.d.concat("_ItemText")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tjf.a(o97Var.j.f, o97Var.c.a.c, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar3, 0, 0, 131068);
                    bVar2 = bVar3;
                } else {
                    bVar2 = bVar3;
                }
                bVar2.F();
                bVar2.L(-589390055);
                bVar2.F();
                bVar2.q();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.ux6 r56, final defpackage.gu5<defpackage.j6g> r57, androidx.compose.ui.e r58, java.lang.String r59, java.lang.String r60, androidx.compose.runtime.b r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx6.a(ux6, gu5, androidx.compose.ui.e, java.lang.String, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(final String str, final ArrayList arrayList, final boolean z, final Function1 function1, final Function1 function12, final Function1 function13, final String str2, e eVar, final String str3, final boolean z2, final String str4, fh8 fh8Var, yg8 yg8Var, final String str5, sm5 sm5Var, final String str6, b bVar, final int i) {
        final yg8 yg8Var2;
        final sm5 sm5Var2;
        final e eVar2;
        final fh8 fh8Var2;
        str.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        str2.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-197206733);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(arrayList) ? 32 : 16);
        boolean zA = cVarH.a(z);
        int i3 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i4 = i2 | (zA ? 256 : 128) | (cVarH.x(function12) ? 16384 : 8192) | (cVarH.x(function13) ? 131072 : 65536) | (cVarH.K(str2) ? 1048576 : 524288) | 100663296 | (cVarH.K(str3) ? 536870912 : 268435456);
        int i5 = (cVarH.a(z2) ? 4 : 2) | 805306416;
        if (cVarH.K(str4)) {
            i3 = 256;
        }
        int i6 = i5 | i3 | 224256 | (cVarH.K(str5) ? 1048576 : 524288) | 113246208;
        if ((i4 & 306783379) == 306783378 && (306783379 & i6) == 306783378 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
            fh8Var2 = fh8Var;
            yg8Var2 = yg8Var;
            sm5Var2 = sm5Var;
        } else {
            fh8 fh8Var3 = fh8.e;
            cVarH.L(1849434622);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new sm5();
                cVarH.p(objV);
            }
            sm5 sm5Var3 = (sm5) objV;
            cVarH.U(false);
            e.a aVar = e.a.b;
            c(str, arrayList, z, function1, function12, function13, str2, aVar, str3, z2, str4, null, str5, sm5Var3, str6, cVarH, i4 & 2147483646, (i6 & 8190) | 1769472 | ((i6 << 3) & 29360128) | 905969664, 6);
            yg8Var2 = yg8.g;
            cVarH = cVarH;
            sm5Var2 = sm5Var3;
            eVar2 = aVar;
            fh8Var2 = fh8Var3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, arrayList, z, function1, function12, function13, str2, eVar2, str3, z2, str4, fh8Var2, yg8Var2, str5, sm5Var2, str6, i) { // from class: vx6
                public final /* synthetic */ String V;
                public final /* synthetic */ e W;
                public final /* synthetic */ String X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ String Z;
                public final /* synthetic */ String a;
                public final /* synthetic */ fh8 a0;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ yg8 b0;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String c0;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ sm5 d0;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ String e0;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(12585985);
                    zx6.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final String str, final ArrayList arrayList, final boolean z, final Function1 function1, final Function1 function12, final Function1 function13, final String str2, final e eVar, final String str3, final boolean z2, final String str4, ar6 ar6Var, final String str5, final sm5 sm5Var, final String str6, b bVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        final ar6 ar6Var2;
        androidx.compose.runtime.c cVar;
        fh8 fh8Var = fh8.e;
        str.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        str2.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1679036405);
        if ((i & 6) == 0) {
            i4 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cVarH.x(arrayList) ? 32 : 16;
        }
        int i7 = i & 384;
        int i8 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i7 == 0) {
            i4 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i9 = i & 3072;
        int i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i9 == 0) {
            i4 |= cVarH.x(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= cVarH.x(function12) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= cVarH.x(function13) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= cVarH.K(str2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= cVarH.K("") ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= cVarH.K(eVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= cVarH.K(str3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (cVarH.a(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cVarH.d(-1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cVarH.K(str4)) {
                i8 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            i5 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (cVarH.d(-1)) {
                i10 = 2048;
            }
            i5 |= i10;
        }
        int i11 = i5 | 24576;
        if ((i2 & 196608) == 0) {
            i11 |= cVarH.K(fh8Var) ? 131072 : 65536;
        }
        int i12 = i2 & 1572864;
        yg8 yg8Var = yg8.g;
        if (i12 == 0) {
            i11 |= cVarH.K(yg8Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= cVarH.K(str5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i11 |= cVarH.a(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= cVarH.K(sm5Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (cVarH.K(str6) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i6 & 3) == 2 && cVarH.i()) {
            cVarH.D();
            ar6Var2 = ar6Var;
            cVar = cVarH;
        } else {
            int i13 = i11;
            long j = ((o97) cVarH.M(p97.a)).c.b.a;
            ytc.a aVar = ytc.a;
            e.a aVar2 = e.a.b;
            e eVarB = androidx.compose.foundation.a.b(aVar2, j, aVar);
            String str7 = str6 == null ? "IdlSuggestList" : str6;
            e eVarA = f.a(eVar, str7);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            cVarH.L(1849434622);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar = (g4a) objV2;
            cVarH.U(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            cVarH.L(-1746271574);
            int i14 = i4;
            boolean z3 = ((i13 & 1879048192) == 536870912) | ((i4 & 896) == 256);
            Object objV3 = cVarH.v();
            lj8 bVar2 = null;
            if (z3 || objV3 == c0020a) {
                objV3 = new ay6(z, sm5Var, g4aVar, null);
                cVarH.p(objV3);
            }
            int i15 = 0;
            cVarH.U(false);
            to4.d(cVarH, boolValueOf, (Function2) objV3);
            if (str3 != null) {
                bVar2 = z2 ? new lj8.b(str3, true) : new lj8.a(str3, false);
                j6g j6gVar = j6g.a;
            }
            lj8 lj8Var = bVar2;
            ob2 ob2VarA = mb2.a(new vs0.i(4.0f, true, new us0(i15)), c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            int i16 = i14 & 14;
            int i17 = i14 >> 9;
            int i18 = i13 << 18;
            ar6 ar6Var3 = ar6.Filled;
            dz6.b(str, function12, "", str2, function1, androidx.compose.ui.focus.c.a(aVar2, sm5Var), lj8Var, str4, null, ar6Var3, fh8Var, yg8Var, str5, null, str7.concat("_TextInput"), null, cVarH, (i17 & 7168) | (i17 & 112) | i16 | ((i14 >> 15) & 896) | ((i14 << 3) & 57344) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), ((i13 >> 12) & 1022) | ((i13 >> 9) & 57344) | (3670016 & (i13 >> 6)), 696320);
            ar6Var2 = ar6Var3;
            cVar = cVarH;
            cVar.L(-535727685);
            if (!arrayList.isEmpty() && z) {
                e eVarA2 = f.a(eVar, str7.concat("_Expanded"));
                cVar.L(-1224400529);
                boolean zX = cVar.x(arrayList) | cVar.K(eVarB) | ((i14 & 458752) == 131072) | (i16 == 4) | cVar.K(str7);
                Object objV4 = cVar.v();
                if (zX || objV4 == c0020a) {
                    wx6 wx6Var = new wx6(arrayList, eVarB, function13, str, str7, g4aVar);
                    cVar.p(wx6Var);
                    objV4 = wx6Var;
                }
                cVar.U(false);
                hn8.b(eVarA2, null, null, false, null, null, null, false, null, (Function1) objV4, cVar, 0, 510);
            }
            cVar.U(false);
            cVar.U(true);
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: xx6
                {
                    fh8 fh8Var2 = fh8.e;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fh8 fh8Var2 = fh8.e;
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    int iL3 = ka2.L(i3);
                    zx6.c(str, arrayList, z, function1, function12, function13, str2, eVar, str3, z2, str4, ar6Var2, str5, sm5Var, str6, (b) obj, iL, iL2, iL3);
                    return j6g.a;
                }
            };
        }
    }

    public static final le0 d(String str, String str2, b bVar) {
        bVar.L(-1517475568);
        o97 o97Var = (o97) bVar.M(p97.a);
        int iS = zve.S(str, str2, 0, true, 2);
        if (iS == -1) {
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str);
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((le0.b.a) arrayList.get(i)).a(sb.length()));
            }
            le0 le0Var = new le0(string, arrayList2);
            bVar.F();
            return le0Var;
        }
        int length = str2.length() + iS;
        String strSubstring = str.substring(0, iS);
        String strSubstring2 = str.substring(iS, length);
        String strSubstring3 = str.substring(length);
        le0.b bVar2 = new le0.b();
        o97.c cVar = o97Var.f;
        int iK = bVar2.k(new foe(0L, 0L, cVar.c, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
        try {
            bVar2.g(strSubstring);
            j6g j6gVar = j6g.a;
            bVar2.i(iK);
            iK = bVar2.k(new foe(0L, 0L, cVar.a, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
            try {
                bVar2.g(strSubstring2);
                bVar2.i(iK);
                iK = bVar2.k(new foe(0L, 0L, cVar.c, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531));
                try {
                    bVar2.g(strSubstring3);
                    bVar2.i(iK);
                    le0 le0VarL = bVar2.l();
                    bVar.F();
                    return le0VarL;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
