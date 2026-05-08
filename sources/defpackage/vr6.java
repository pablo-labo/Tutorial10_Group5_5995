package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vr6 {
    public static final void a(v51 v51Var, u51 u51Var, e eVar, String str, String str2, b bVar, final int i, final int i2) {
        int i3;
        int i4;
        final v51 v51Var2;
        final u51 u51Var2;
        final String str3;
        final e eVar2;
        final String str4;
        u51Var.getClass();
        c cVarH = bVar.h(-1365978242);
        if ((i & 6) == 0) {
            i3 = (cVarH.d(v51Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.d(u51Var.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
        } else {
            i4 = i3 | (cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        int i6 = i2 & 32;
        int i7 = i4 | (cVarH.K(str) ? 16384 : 8192) | (i6 != 0 ? 196608 : cVarH.K(str2) ? 131072 : 65536);
        if ((74899 & i7) == 74898 && cVarH.i()) {
            cVarH.D();
            str4 = str2;
            str3 = str;
            eVar2 = eVar;
            u51Var2 = u51Var;
            v51Var2 = v51Var;
        } else {
            if (i5 != 0) {
                eVar = e.a.b;
            }
            e eVar3 = eVar;
            if (i6 != 0) {
                str2 = null;
            }
            String str5 = str2;
            int i8 = i7 << 3;
            b(v51Var, u51Var, eVar3, str, str5, cVarH, (i7 & 8190) | (458752 & i8) | (i8 & 3670016));
            v51Var2 = v51Var;
            u51Var2 = u51Var;
            str3 = str;
            eVar2 = eVar3;
            str4 = str5;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ur6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vr6.a(v51Var2, u51Var2, eVar2, str3, str4, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static final void b(v51 v51Var, u51 u51Var, e eVar, String str, String str2, b bVar, int i) {
        int i2;
        double d;
        long j;
        long j2;
        long j3;
        tjf tjfVar;
        String str3;
        ?? r3;
        double d2;
        c cVar;
        j6g j6gVar;
        tjf tjfVarA;
        c cVar2;
        c cVarH = bVar.h(-1907095006);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(v51Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(u51Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(0) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= cVarH.K(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= cVarH.K(str2) ? 1048576 : 524288;
        }
        if ((i3 & 599187) == 599186 && cVarH.i()) {
            cVarH.D();
            cVar2 = cVarH;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String str4 = str2 == null ? "IdlAvatar" : str2;
            e eVarA = f.a(eVar, str4);
            int iOrdinal = v51Var.ordinal();
            if (iOrdinal == 0) {
                d = 9.33d;
            } else if (iOrdinal == 1) {
                d = 17.78d;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                d = 48.89d;
            }
            switch (u51Var.ordinal()) {
                case 0:
                    j = o97Var.c.e.a.a;
                    break;
                case 1:
                    j = o97Var.c.e.b.a;
                    break;
                case 2:
                    j = o97Var.c.e.c.a;
                    break;
                case 3:
                    j = o97Var.c.e.d.a;
                    break;
                case 4:
                    j = o97Var.c.e.e.a;
                    break;
                case 5:
                    j = o97Var.c.e.f.a;
                    break;
                case 6:
                    j = o97Var.c.e.g.a;
                    break;
                case 7:
                    j = o97Var.c.e.h.a;
                    break;
                default:
                    l.g();
                    return;
            }
            long j4 = j;
            switch (u51Var.ordinal()) {
                case 0:
                    j2 = o97Var.c.e.a.b;
                    break;
                case 1:
                    j2 = o97Var.c.e.b.b;
                    break;
                case 2:
                    j2 = o97Var.c.e.c.b;
                    break;
                case 3:
                    j2 = o97Var.c.e.d.b;
                    break;
                case 4:
                    j2 = o97Var.c.e.e.b;
                    break;
                case 5:
                    j2 = o97Var.c.e.f.b;
                    break;
                case 6:
                    j2 = o97Var.c.e.g.b;
                    break;
                case 7:
                    j2 = o97Var.c.e.h.b;
                    break;
                default:
                    l.g();
                    return;
            }
            int iOrdinal2 = v51Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    tjfVarA = tjf.a(o97Var.j.g, j4, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210);
                } else {
                    if (iOrdinal2 != 2) {
                        l.g();
                        return;
                    }
                    tjfVarA = tjf.a(o97Var.j.b, j4, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210);
                }
                tjfVar = tjfVarA;
                j3 = j4;
            } else {
                j3 = j4;
                tjfVar = new tjf(j4, hh2.t(9), to5.d0, null, 0L, 0, 0L, 16777208);
            }
            e eVarB = a.b(g.n(eVarA, v51Var.a()), j2, ggd.a);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
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
            cVarH.L(857268699);
            cVarH.U(false);
            cVarH.L(857268897);
            cVarH.L(857277700);
            e.a aVar2 = e.a.b;
            if (str == null) {
                j6gVar = null;
                str3 = str4;
                r3 = 0;
                d2 = d;
                cVar = cVarH;
            } else {
                str3 = str4;
                r3 = 0;
                d2 = d;
                cif.b(str, f.a(aVar2, str4.concat("_Text")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65532);
                cVar = cVarH;
                j6gVar = j6g.a;
            }
            cVar.U(r3);
            cVar.L(857277908);
            if (j6gVar == null) {
                float f = (float) d2;
                vq6.b(z2b.a(R.drawable.person, r3, cVar), "", f.a(g.o(aVar2, f, f), str3.concat("_Icon")), j3, cVar, 48, 0);
                j6g j6gVar2 = j6g.a;
            }
            cVar.U(r3);
            j6g j6gVar3 = j6g.a;
            cVar.U(r3);
            cVar.U(true);
            cVar2 = cVar;
        }
        i iVarW = cVar2.W();
        if (iVarW != null) {
            iVarW.d = new k72(v51Var, u51Var, eVar, str, str2, i);
        }
    }
}
