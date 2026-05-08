package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ere;
import defpackage.t4c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cf0 {
    public final xx9 a;
    public final cla b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t4c.b.c.EnumC0421c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    public cf0(xx9 xx9Var, cla claVar) {
        xx9Var.getClass();
        claVar.getClass();
        this.a = xx9Var;
        this.b = claVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bf0 a(defpackage.t4c r11, defpackage.o8a r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf0.a(t4c, o8a):bf0");
    }

    public final boolean b(up2<?> up2Var, ui8 ui8Var, t4c.b.c cVar) {
        t4c.b.c.EnumC0421c enumC0421cH = cVar.H();
        int i = enumC0421cH == null ? -1 : a.a[enumC0421cH.ordinal()];
        if (i != 10) {
            xx9 xx9Var = this.a;
            if (i != 13) {
                return wl7.b(up2Var.a(xx9Var), ui8Var);
            }
            if (up2Var instanceof rt0) {
                T t = ((rt0) up2Var).a;
                if (((List) t).size() == cVar.z().size()) {
                    ui8 ui8VarG = xx9Var.l().g(ui8Var);
                    if (ui8VarG != null) {
                        Iterable iterableH = u63.H((Collection) t);
                        if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
                            return true;
                        }
                        Iterator<Integer> it = iterableH.iterator();
                        while (((nh7) it).c) {
                            int iNextInt = ((fh7) it).nextInt();
                            up2<?> up2Var2 = (up2) ((List) t).get(iNextInt);
                            t4c.b.c cVarY = cVar.y(iNextInt);
                            cVarY.getClass();
                            if (!b(up2Var2, ui8VarG, cVarY)) {
                            }
                        }
                        return true;
                    }
                }
            }
            r40.g(up2Var, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        v62 v62VarD = ui8Var.M0().d();
        t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
        if (t52Var == null) {
            return true;
        }
        n8a n8aVar = ei8.e;
        if (ei8.b(t52Var, ere.a.Q)) {
            return true;
        }
        return false;
    }

    public final up2<?> c(ui8 ui8Var, t4c.b.c cVar, o8a o8aVar) {
        o8aVar.getClass();
        boolean zBooleanValue = ch5.N.c(cVar.D()).booleanValue();
        t4c.b.c.EnumC0421c enumC0421cH = cVar.H();
        switch (enumC0421cH == null ? -1 : a.a[enumC0421cH.ordinal()]) {
            case 1:
                byte bF = (byte) cVar.F();
                return zBooleanValue ? new zzf(bF) : new wr1(bF);
            case 2:
                return new y22(Character.valueOf((char) cVar.F()));
            case 3:
                short sF = (short) cVar.F();
                return zBooleanValue ? new z4g(sF) : new pee(sF);
            case 4:
                int iF = (int) cVar.F();
                return zBooleanValue ? new k4g(iF) : new wh7(iF);
            case 5:
                long jF = cVar.F();
                return zBooleanValue ? new q4g(jF) : new t59(jF);
            case 6:
                return new hi5(cVar.E());
            case 7:
                return new b94(cVar.B());
            case 8:
                return new oi1(Boolean.valueOf(cVar.F() != 0));
            case DatadogLogGenerator.CRASH /* 9 */:
                return new pve(o8aVar.getString(cVar.G()));
            case 10:
                return new me8(q8a.a(o8aVar, cVar.A()), cVar.x());
            case 11:
                return new dw4(q8a.a(o8aVar, cVar.A()), n8a.f(o8aVar.getString(cVar.C())));
            case 12:
                t4c t4cVarW = cVar.w();
                t4cVarW.getClass();
                return new kf0(a(t4cVarW, o8aVar));
            case 13:
                List<t4c.b.c> listZ = cVar.z();
                listZ.getClass();
                List<t4c.b.c> list = listZ;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (t4c.b.c cVar2 : list) {
                    mge mgeVarE = this.a.l().e();
                    cVar2.getClass();
                    arrayList.add(c(mgeVarE, cVar2, o8aVar));
                }
                return new uyf(arrayList, ui8Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.H() + " (expected " + ui8Var + ')').toString());
        }
    }
}
