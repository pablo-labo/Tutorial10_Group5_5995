package defpackage;

import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.kv8;
import defpackage.lx5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class v7a {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kv8.a.values().length];
            try {
                iArr[kv8.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[j7f.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[4] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 5;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements goa, ev5 {
        public final /* synthetic */ vi1 a;

        public b(vi1 vi1Var) {
            this.a = vi1Var;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof goa) && (obj instanceof ev5)) {
                return this.a == ((ev5) obj).c();
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0add  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.e8a r69, final defpackage.kjg r70, kotlin.jvm.functions.Function2 r71, androidx.compose.runtime.b r72, int r73) {
        /*
            Method dump skipped, instruction units count: 2840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7a.a(e8a, kjg, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int):void");
    }

    public static final long b(pld pldVar, fr0 fr0Var, mk7 mk7Var, rs0 rs0Var, bn7 bn7Var, j7f j7fVar) {
        List<InvitedJobDto> invitedJobs;
        int i = 0;
        try {
            int iOrdinal = j7fVar.ordinal();
            if (iOrdinal == 0) {
                List<SavedJobsDto> list = ((old) pldVar.c.getValue()).a;
                if (list != null) {
                    List<SavedJobsDto> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            if (!((SavedJobsDto) it.next()).isJobUnSave() && (i2 = i2 + 1) < 0) {
                                u63.n0();
                                throw null;
                            }
                        }
                        i = i2;
                    }
                    return i;
                }
            } else if (iOrdinal == 1) {
                EmployerInvitationDto employerInvitationDto = ((an7) bn7Var.c.getValue()).a;
                if (employerInvitationDto != null && (invitedJobs = employerInvitationDto.getInvitedJobs()) != null) {
                    return invitedJobs.size();
                }
            } else if (iOrdinal == 2) {
                if (((old) fr0Var.c.getValue()).a != null) {
                    return r3.size();
                }
            } else if (iOrdinal == 3) {
                if (((ml7) mk7Var.c.getValue()).a != null) {
                    return r3.size();
                }
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((old) rs0Var.c.getValue()).a != null) {
                    return r3.size();
                }
            }
            return 0L;
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b("MyJobsScreen", "Error getting job count for tab", false, e);
            return 0L;
        }
    }

    public static final ss8 c(Map map, j7f j7fVar, androidx.compose.runtime.b bVar) {
        ss8 ss8VarA = (ss8) map.get(j7fVar);
        if (ss8VarA == null) {
            bVar.L(1542256128);
            ss8VarA = us8.a(bVar);
        } else {
            bVar.L(1542255291);
        }
        bVar.F();
        return ss8VarA;
    }

    public static final int d(g4a<Integer> g4aVar) {
        return g4aVar.getValue().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(g4a g4aVar, g4a g4aVar2, pld pldVar, fr0 fr0Var, mk7 mk7Var, rs0 rs0Var, bn7 bn7Var, int i) {
        try {
            if (!((Boolean) g4aVar.getValue()).booleanValue() || i == ((Number) g4aVar2.getValue()).intValue()) {
                return;
            }
            j7f j7fVarM = u63.M(i);
            final String strN = u63.N(i);
            final long jB = b(pldVar, fr0Var, mk7Var, rs0Var, bn7Var, j7fVarM);
            if (strN.length() > 0) {
                c05.a.invoke(tx5.g(c05.b, "myjobs_native_screen", new Function1() { // from class: a05
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lx5.b bVar = (lx5.b) obj;
                        w40.l(bVar, "elementName", "tab", "subTabName", strN);
                        bVar.b("result", Long.valueOf(jB));
                        return j6g.a;
                    }
                }, 2));
                g4aVar2.setValue(Integer.valueOf(i));
            }
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b("MyJobsScreen", "Error logging tab impression", false, e);
        }
    }
}
