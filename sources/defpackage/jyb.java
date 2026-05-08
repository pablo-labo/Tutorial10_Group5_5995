package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ftg;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jyb {
    public static final void a(final String str, final Function1<? super String, j6g> function1, final String str2, final boolean z, final String str3, boolean z2, d3a d3aVar, String str4, final gu5<j6g> gu5Var, boolean z3, e eVar, String str5, fh8 fh8Var, ftg ftgVar, String str6, b bVar, final int i, final int i2, final int i3) {
        int i4;
        d3a d3aVar2;
        String str7;
        final e eVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final boolean z4;
        final fh8 fh8Var2;
        final ftg ftgVar2;
        final String str8;
        final d3a d3aVar3;
        final String str9;
        c cVar;
        final String str10;
        d3a d3aVar4;
        int i10;
        fh8 fh8Var3;
        int i11;
        ftg ftgVar3;
        e eVar3;
        String str11;
        str.getClass();
        function1.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(1563241664);
        if ((i & 6) == 0) {
            i4 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cVarH.K(str2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i12 = i & 3072;
        int i13 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i12 == 0) {
            i4 |= cVarH.a(z) ? 2048 : 1024;
        }
        int i14 = i4;
        if ((i & 24576) == 0) {
            i14 |= cVarH.K(str3) ? 16384 : 8192;
        }
        int i15 = i3 & 64;
        if (i15 != 0) {
            i14 |= 1572864;
            d3aVar2 = d3aVar;
        } else {
            d3aVar2 = d3aVar;
            if ((i & 1572864) == 0) {
                i14 |= cVarH.K(d3aVar2) ? 1048576 : 524288;
            }
        }
        int i16 = i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i16 != 0) {
            i14 |= 12582912;
            str7 = str4;
        } else {
            str7 = str4;
            if ((i & 12582912) == 0) {
                i14 |= cVarH.K(str7) ? 8388608 : 4194304;
            }
        }
        int i17 = i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i17 != 0) {
            i5 = i2 | 6;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            if ((i2 & 6) == 0) {
                i5 = i2 | (cVarH.K(eVar2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i18 = i3 & 2048;
        if (i18 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= cVarH.K(str5) ? 32 : 16;
        }
        int i19 = i5;
        int i20 = i3 & 4096;
        if (i20 != 0) {
            i6 = i19 | 384;
        } else {
            int i21 = i19;
            if ((i2 & 384) == 0) {
                i21 |= cVarH.K(fh8Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            i6 = i21;
        }
        int i22 = i3 & 8192;
        if (i22 != 0) {
            i7 = i6 | 3072;
        } else {
            int i23 = i6;
            if (cVarH.K(ftgVar)) {
                i13 = 2048;
            }
            i7 = i23 | i13;
        }
        int i24 = i3 & 16384;
        if (i24 != 0) {
            i8 = i16;
            i9 = i7 | 24576;
        } else {
            i8 = i16;
            i9 = i7 | (cVarH.K(str6) ? 16384 : 8192);
        }
        if (cVarH.o(i14 & 1, ((i14 & 4727955) == 4727954 && (i9 & 9363) == 9362) ? false : true)) {
            boolean z5 = (i3 & 32) != 0 ? false : z2;
            b.a.C0020a c0020a = b.a.a;
            if (i15 != 0) {
                Object objV = cVarH.v();
                if (objV == c0020a) {
                    objV = v40.a(cVarH);
                }
                d3aVar4 = (d3a) objV;
            } else {
                d3aVar4 = d3aVar2;
            }
            String str12 = i8 != 0 ? null : str7;
            boolean z6 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? true : z3;
            e.a aVar = e.a.b;
            e eVar4 = i17 != 0 ? aVar : eVar2;
            String str13 = i18 != 0 ? "" : str5;
            if (i20 != 0) {
                fh8Var3 = fh8.e;
                i10 = i22;
            } else {
                i10 = i22;
                fh8Var3 = fh8Var;
            }
            if (i10 != 0) {
                int i25 = i14;
                ftgVar3 = ftg.a.a;
                i11 = i25;
            } else {
                i11 = i14;
                ftgVar3 = ftgVar;
            }
            if (i24 != 0) {
                eVar3 = eVar4;
                str11 = null;
            } else {
                eVar3 = eVar4;
                str11 = str6;
            }
            o97 o97Var = (o97) cVarH.M(p97.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar = (g4a) objV2;
            int i26 = i9;
            z2 = z5;
            kv6.a(str2, null, str12, null, z, null, cVarH, ((i11 >> 6) & 14) | ((i11 >> 15) & 896) | (458752 & (i11 << 6)), 90);
            String str14 = str12;
            String str15 = new String();
            String strI = ak2.I(R.string.desc_clear_text_input, cVarH);
            o97.g gVar = o97Var.i;
            e eVar5 = eVar3;
            e eVarJ = f.j(eVar5, 0.0f, 4.0f, 0.0f, 24.0f, 5);
            boolean z7 = (i11 & 57344) == 16384;
            Object objV3 = cVarH.v();
            if (z7 || objV3 == c0020a) {
                objV3 = new zz4(str3, 3);
                cVarH.p(objV3);
            }
            e eVarB = b5e.b(eVarJ, false, (Function1) objV3);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new ch4(3, g4aVar);
                cVarH.p(objV4);
            }
            cVar = cVarH;
            dz6.b(str, function1, str15, strI, (Function1) objV4, eVarB, null, null, null, null, fh8Var3, null, str11, ftgVar3, str13, d3aVar4, cVar, (i11 & 14) | 24576 | (i11 & 112), ((i26 >> 3) & 112) | (i26 & 57344) | ((i26 << 12) & 29360128) | ((i26 << 21) & 234881024) | ((i11 << 9) & 1879048192), 112576);
            cVar.U(true);
            fh8Var2 = fh8Var3;
            str8 = str11;
            ftgVar2 = ftgVar3;
            str10 = str13;
            d3aVar3 = d3aVar4;
            z4 = z6;
            str9 = str14;
            eVar2 = eVar5;
        } else {
            cVarH.D();
            z4 = z3;
            fh8Var2 = fh8Var;
            ftgVar2 = ftgVar;
            str8 = str6;
            d3aVar3 = d3aVar2;
            str9 = str7;
            cVar = cVarH;
            str10 = str5;
        }
        final boolean z8 = z2;
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: iyb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    jyb.a(str, function1, str2, z, str3, z8, d3aVar3, str9, gu5Var, z4, eVar2, str10, fh8Var2, ftgVar2, str8, (b) obj, iL, iL2, i3);
                    return j6g.a;
                }
            };
        }
    }
}
