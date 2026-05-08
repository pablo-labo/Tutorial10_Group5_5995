package defpackage;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.MotionEvent;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements tlg, nvh, SuccessContinuation, n5d {
    public static final h4 W;
    public static final h4 X;
    public static final long[] Y;
    public static final Object Z;
    public static wtg a0;
    public static final h4 b0;
    public static final ah2 c;
    public static final h4 c0;
    public static final ah2 d;
    public static final h4 d0;
    public static final ah2 e;
    public static v70 e0;
    public static final ah2 f;
    public static y40 f0;
    public static ax1 g0;
    public final /* synthetic */ int a;
    public static final lu2[] b = new lu2[0];
    public static final ah2 V = new ah2(-854943991, new c10(3), false);

    static {
        final int i = 0;
        c = new ah2(1696139835, new ph2(i), false);
        d = new ah2(1192723769, new wu5() { // from class: oi2
            @Override // defpackage.wu5
            public final Object q(Object obj, Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        b bVar = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((fhd) obj).getClass();
                        if (!bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                            bVar.D();
                        }
                        break;
                    case 1:
                        bka bkaVar = (bka) obj;
                        b bVar2 = (b) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        bkaVar.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= bVar2.K(bkaVar) ? 4 : 2;
                        }
                        if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            aka.b(bkaVar, bVar2, iIntValue2 & 14);
                        } else {
                            bVar2.D();
                        }
                        break;
                    default:
                        b bVar3 = (b) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        ((pb2) obj).getClass();
                        if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            cif.b("Your content here", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 6, 0, 131070);
                        } else {
                            bVar3.D();
                        }
                        break;
                }
                return j6g.a;
            }
        }, false);
        final int i2 = 1;
        e = new ah2(554038843, new ph2(i2), false);
        f = new ah2(1236398842, new wu5() { // from class: oi2
            @Override // defpackage.wu5
            public final Object q(Object obj, Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        b bVar = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((fhd) obj).getClass();
                        if (!bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                            bVar.D();
                        }
                        break;
                    case 1:
                        bka bkaVar = (bka) obj;
                        b bVar2 = (b) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        bkaVar.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= bVar2.K(bkaVar) ? 4 : 2;
                        }
                        if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            aka.b(bkaVar, bVar2, iIntValue2 & 14);
                        } else {
                            bVar2.D();
                        }
                        break;
                    default:
                        b bVar3 = (b) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        ((pb2) obj).getClass();
                        if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            cif.b("Your content here", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 6, 0, 131070);
                        } else {
                            bVar3.D();
                        }
                        break;
                }
                return j6g.a;
            }
        }, false);
        new ah2(-1565223878, new mi2(i2), false);
        final int i3 = 2;
        new ah2(-201474530, new wu5() { // from class: oi2
            @Override // defpackage.wu5
            public final Object q(Object obj, Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        b bVar = (b) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((fhd) obj).getClass();
                        if (!bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                            bVar.D();
                        }
                        break;
                    case 1:
                        bka bkaVar = (bka) obj;
                        b bVar2 = (b) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        bkaVar.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= bVar2.K(bkaVar) ? 4 : 2;
                        }
                        if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            aka.b(bkaVar, bVar2, iIntValue2 & 14);
                        } else {
                            bVar2.D();
                        }
                        break;
                    default:
                        b bVar3 = (b) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        ((pb2) obj).getClass();
                        if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            cif.b("Your content here", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 6, 0, 131070);
                        } else {
                            bVar3.D();
                        }
                        break;
                }
                return j6g.a;
            }
        }, false);
        W = new h4(6);
        X = new h4(7);
        Y = new long[]{878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};
        Z = new Object();
        b0 = new h4(10);
        c0 = new h4(11);
        d0 = new h4(12);
    }

    public /* synthetic */ h4(int i) {
        this.a = i;
    }

    public static void A(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[9];
        s(jArr, jArr3);
        v(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            s(jArr2, jArr3);
            v(jArr3, jArr2);
        }
    }

    public static final void B(neb nebVar, long j, Function1 function1, boolean z) {
        aj7 aj7Var = nebVar.b;
        MotionEvent motionEvent = aj7Var != null ? (MotionEvent) aj7Var.b.b : null;
        if (motionEvent == null) {
            l5.q("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }

    public static ComponentName C(Context context, Intent intent) {
        synchronized (Z) {
            try {
                if (a0 == null) {
                    wtg wtgVar = new wtg(context);
                    a0 = wtgVar;
                    wtgVar.b.setReferenceCounted(true);
                    wtgVar.f = true;
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    a0.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ky3 b(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        io5 io5VarA = jo5.a(f2);
        if (io5VarA == null) {
            io5VarA = new ix8(f2);
        }
        return new ky3(f3, f2, io5VarA);
    }

    public static final void e(final c4g c4gVar, final boolean z, final hee heeVar, final i7d i7dVar, final gu5 gu5Var, b bVar, final int i) {
        c cVarH = bVar.h(1993411407);
        int i2 = i | (cVarH.x(c4gVar) ? 4 : 2) | (cVarH.a(z) ? 32 : 16) | (cVarH.K(heeVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(i7dVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            b4g.p(c4gVar.b, c4gVar.c, c4gVar.a, c4gVar.d, false, cVarH, 24576, 32);
            if (!z || heeVar == null) {
                cVarH.L(-795360461);
            } else {
                cVarH.L(-792850019);
                c7d.b(gu5Var, heeVar, i7dVar.b, cVarH, ((i2 >> 3) & 112) | ((i2 >> 12) & 14));
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, heeVar, i7dVar, gu5Var, i) { // from class: a57
                public final /* synthetic */ boolean b;
                public final /* synthetic */ hee c;
                public final /* synthetic */ i7d d;
                public final /* synthetic */ gu5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(9);
                    h4.e(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static final void g(int i) {
        if (i >= 1) {
            return;
        }
        h5.k(p6.c(i, "Expected positive parallelism level, but got "));
    }

    public static int h(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, lm0.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final i74 i(SavedJobsDto savedJobsDto) {
        Long sortingTimeStamp;
        ArrayList arrayList = new ArrayList();
        UserJobStatus candidateStatus = savedJobsDto.getCandidateStatus();
        if (candidateStatus != null) {
            arrayList.add(new Pair(candidateStatus, "CANDIDATE"));
        }
        UserJobStatus selfReportedStatus = savedJobsDto.getSelfReportedStatus();
        if (selfReportedStatus != null) {
            arrayList.add(new Pair(selfReportedStatus, "SELF_REPORTED"));
        }
        Object next = null;
        if (arrayList.isEmpty()) {
            return new i74(null, "APPLIED", "");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long timestamp = ((UserJobStatus) ((Pair) next).d()).getTimestamp();
                do {
                    Object next2 = it.next();
                    long timestamp2 = ((UserJobStatus) ((Pair) next2).d()).getTimestamp();
                    if (timestamp < timestamp2) {
                        next = next2;
                        timestamp = timestamp2;
                    }
                } while (it.hasNext());
            }
        }
        next.getClass();
        Pair pair = (Pair) next;
        UserJobStatus userJobStatus = (UserJobStatus) pair.a();
        String str = (String) pair.b();
        long timestamp3 = (i6a.f() && wl7.b(str, "SELF_REPORTED") && (sortingTimeStamp = savedJobsDto.getSortingTimeStamp()) != null) ? sortingTimeStamp.longValue() : userJobStatus.getTimestamp();
        return new i74(Long.valueOf(timestamp3), userJobStatus.getStatus(), str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r3.equals("REJECTED") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3.equals("OFFER") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.equals("HIRED") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        if (r3.equals("INTERVIEW") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (r1 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        r3 = r1.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        if (defpackage.wl7.b(r3, "VIEWED") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        r2 = r1.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        if (defpackage.wl7.b(r2, "CONTACTING") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        return i(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
    
        if (defpackage.i6a.f() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
    
        r6 = r6.getSortingTimeStamp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e7, code lost:
    
        if (r6 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e9, code lost:
    
        r1 = r6.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
    
        r1 = r0.getTimestamp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f3, code lost:
    
        r1 = r0.getTimestamp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
    
        return new defpackage.i74(java.lang.Long.valueOf(r1), r0.getStatus(), "SELF_REPORTED");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.i74 j(com.indeed.android.myjobs.data.model.dto.SavedJobsDto r6) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4.j(com.indeed.android.myjobs.data.model.dto.SavedJobsDto):i74");
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        k20.p();
        return null;
    }

    public static float m(MotionEvent motionEvent, boolean z) {
        motionEvent.getClass();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getX(i);
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float x = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                x = motionEvent.getX(i3) + x;
            }
        }
        return x / i2;
    }

    public static float n(MotionEvent motionEvent, boolean z) {
        motionEvent.getClass();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            int i = pointerCount - 1;
            if (i == actionIndex) {
                i = pointerCount - 2;
            }
            return motionEvent.getY(i);
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float y = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount2; i3++) {
            if (i3 != actionIndex) {
                i2++;
                y = motionEvent.getY(i3) + y;
            }
        }
        return y / i2;
    }

    public static final long o(o94 o94Var) {
        float x = o94Var.a.getX();
        float y = o94Var.a.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        p(jArr, jArr4);
        p(jArr2, jArr5);
        long[] jArr6 = new long[26];
        r(jArr4[0], jArr5[0], jArr6, 0);
        r(jArr4[1], jArr5[1], jArr6, 2);
        r(jArr4[2], jArr5[2], jArr6, 4);
        r(jArr4[3], jArr5[3], jArr6, 6);
        r(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        r(j6 ^ j13, j8 ^ j15, jArr6, 18);
        r(j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = jArr5[2] ^ j18;
        r(j17, j18, jArr6, 22);
        r(j19, j20, jArr6, 24);
        r(j2, j4, jArr6, 10);
        r(j6, j8, jArr6, 12);
        r(j10, j12, jArr6, 14);
        r(j14, j16, jArr6, 16);
        long j21 = jArr6[0];
        jArr3[0] = j21;
        long j22 = jArr6[9];
        jArr3[9] = j22;
        long j23 = jArr6[0];
        long j24 = j23 ^ jArr6[1];
        long j25 = j24 ^ jArr6[2];
        long j26 = j25 ^ jArr6[10];
        jArr3[1] = j26;
        long j27 = jArr6[3] ^ jArr6[4];
        long j28 = j25 ^ (j27 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j28;
        long j29 = j24 ^ j27;
        long j30 = jArr6[5] ^ jArr6[6];
        long j31 = jArr6[8];
        long j32 = (j29 ^ j30) ^ j31;
        long j33 = jArr6[13] ^ jArr6[14];
        long j34 = jArr6[18];
        long j35 = jArr6[22];
        long j36 = jArr6[24];
        long j37 = (j32 ^ j33) ^ ((j34 ^ j35) ^ j36);
        jArr3[3] = j37;
        long j38 = jArr6[7] ^ j31;
        long j39 = jArr6[9];
        long j40 = j38 ^ j39;
        long j41 = j40 ^ jArr6[17];
        jArr3[8] = j41;
        long j42 = (j40 ^ j30) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j42;
        long j43 = jArr6[19] ^ jArr6[20];
        long j44 = jArr6[25];
        long j45 = jArr6[23];
        long j46 = j43 ^ (j44 ^ j36);
        long j47 = (j46 ^ (j34 ^ j45)) ^ (j42 ^ j26);
        jArr3[4] = j47;
        long j48 = jArr6[21];
        long j49 = (j46 ^ (j28 ^ j41)) ^ (j48 ^ j35);
        jArr3[5] = j49;
        long j50 = (((((j32 ^ j23) ^ j39) ^ j33) ^ j48) ^ j45) ^ j44;
        jArr3[6] = j50;
        jArr3[0] = j21 ^ (j26 << 57);
        jArr3[1] = (j26 >>> 7) ^ (j28 << 50);
        jArr3[2] = (j28 >>> 14) ^ (j37 << 43);
        jArr3[3] = (j37 >>> 21) ^ (j47 << 36);
        jArr3[4] = (j47 >>> 28) ^ (j49 << 29);
        jArr3[5] = (j49 >>> 35) ^ (j50 << 22);
        jArr3[6] = (j50 >>> 42) ^ (j42 << 15);
        jArr3[7] = (j42 >>> 49) ^ (j41 << 8);
        jArr3[8] = (j41 >>> 56) ^ (j22 << 1);
        jArr3[9] = j22 >>> 63;
    }

    public static void r(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void s(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            wab.j(i << 1, jArr[i], jArr2);
        }
        jArr2[8] = wab.i((int) jArr[4]);
    }

    public static final String t(Throwable th) {
        th.getClass();
        String localizedMessage = th.getLocalizedMessage();
        Throwable cause = th.getCause();
        return z92.W0(ut0.i0(new String[]{localizedMessage, cause != null ? t(cause) : null}), ": ", null, null, null, 62);
    }

    public static void u(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        q(jArr, jArr2, jArr4);
        v(jArr4, jArr3);
    }

    public static void v(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static final e w(e eVar, float f2) {
        return (f2 == 1.0f && f2 == 1.0f) ? eVar : a.c(eVar, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, null, 524284);
    }

    public static final int x(kzd kzdVar, int i) {
        int i2;
        int[] iArr = kzdVar.e;
        int i3 = i + 1;
        int length = kzdVar.d.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static void y(List list, bjb bjbVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (bjbVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static void z(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        s(jArr, jArr3);
        v(jArr3, jArr2);
    }

    @Override // defpackage.tlg
    public Object a(com.airbnb.lottie.parser.moshi.a aVar, float f2) {
        return Integer.valueOf(Math.round(ec8.d(aVar) * f2));
    }

    @Override // defpackage.n5d
    public ss4 c(ova ovaVar) {
        return ss4.a;
    }

    @Override // defpackage.zs4
    public boolean d(Object obj, File file, ova ovaVar) throws Throwable {
        try {
            pr1.d(((v86) ((f5d) obj).get()).a.a.a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 10:
                List<svh<?>> list = djh.a;
                return Boolean.valueOf(((vgi) wgi.b.zza()).zza());
            default:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zzf());
        }
    }
}
