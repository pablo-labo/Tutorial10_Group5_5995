package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Dynamic;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.BrandedAdsLoggingRequestParams;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.BrandedAdsDto;
import com.indeed.android.myjobs.data.model.dto.Event5722DTO;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.ex7;
import defpackage.pr1;
import defpackage.qu2;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ObsoleteSdkInt"})
public class u63 implements s63, nvh, b6d, rqe {
    public final /* synthetic */ int a;
    public static final u63 b = new u63(2);
    public static final float[] c = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final int[] d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final Object e = new Object();
    public static final nfa f = new nfa("StdlibClassFinder", 3);
    public static final u63 V = new u63(7);
    public static final u63 W = new u63(8);
    public static final u63 X = new u63(9);
    public static final u63 Y = new u63(10);
    public static final u63 Z = new u63(11);
    public static final u63 a0 = new u63(12);

    public /* synthetic */ u63(int i) {
        this.a = i;
    }

    public static final String A(long j, Context context) {
        context.getClass();
        Date date = new Date(j);
        String string = context.getString(R.string.nexus_complete_by, new SimpleDateFormat(DateFormat.is24HourFormat(context) ? "HH:mm" : "h:mm a", Locale.getDefault()).format(date), new SimpleDateFormat("MMMM d", Locale.getDefault()).format(date));
        string.getClass();
        return string;
    }

    public static final String B(long j) {
        String str = new SimpleDateFormat("EEEE, MMMM d", Locale.getDefault()).format(new Date(j));
        str.getClass();
        return str;
    }

    public static final String C(Context context, long j, String str) {
        context.getClass();
        str.getClass();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            String string = context.getString(R.string.pretext_today, str);
            string.getClass();
            return string;
        }
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(6, -7);
        if (calendar2.after(calendar3)) {
            String string2 = context.getString(R.string.pretext_on_day, str, new String[]{context.getString(R.string.sun), context.getString(R.string.mon), context.getString(R.string.tue), context.getString(R.string.wed), context.getString(R.string.thu), context.getString(R.string.fri), context.getString(R.string.sat)}[calendar2.get(7) - 1]);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.pretext_on_date, str, new SimpleDateFormat("MMM d", Locale.getDefault()).format(calendar2.getTime()));
        string3.getClass();
        return string3;
    }

    public static final String D(Context context, long j, String str, String str2, UserJobStatus userJobStatus) {
        String string;
        context.getClass();
        str.getClass();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (userJobStatus != null) {
            ra8 ra8Var = i6a.a;
            if (((kr7) cr8.p(kr7.class)).e("myjobs_include_gd_applications_tog").a >= 1) {
                if (str2 == null) {
                    String string2 = context.getString(R.string.pretext_on_indeed);
                    string2.getClass();
                    string = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
                } else if (str2.equalsIgnoreCase("GLASSDOOR")) {
                    string = context.getString(R.string.pretext_on_platform, str, context.getString(R.string.partner_glassdoor));
                    string.getClass();
                } else {
                    string = context.getString(R.string.pretext_on_platform, str, str2);
                    string.getClass();
                }
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    String string3 = context.getString(R.string.pretext_today, string);
                    string3.getClass();
                    return string3;
                }
                Calendar calendar3 = Calendar.getInstance();
                calendar3.add(6, -7);
                if (calendar2.after(calendar3)) {
                    String string4 = context.getString(R.string.pretext_on_day, string, new String[]{context.getString(R.string.sun), context.getString(R.string.mon), context.getString(R.string.tue), context.getString(R.string.wed), context.getString(R.string.thu), context.getString(R.string.fri), context.getString(R.string.sat)}[calendar2.get(7) - 1]);
                    string4.getClass();
                    return string4;
                }
                String string5 = context.getString(R.string.pretext_on_date, string, new SimpleDateFormat("MMM d", Locale.getDefault()).format(calendar2.getTime()));
                string5.getClass();
                return string5;
            }
        }
        return C(context, j, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r3.equals("REJECTED") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3.equals("OFFER") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.equals("HIRED") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r3.equals("INTERVIEW") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r3 = r1.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        if (defpackage.wl7.b(r3, "VIEWED") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r2 = r1.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (defpackage.wl7.b(r2, "CONTACTING") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        return x(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        return new defpackage.i74(java.lang.Long.valueOf(r0.getTimestamp()), r0.getStatus(), "SELF_REPORTED");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.i74 E(com.indeed.android.myjobs.data.model.dto.SavedJobsDto r6) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u63.E(com.indeed.android.myjobs.data.model.dto.SavedJobsDto):i74");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r0.equals("REJECTED") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0.equals("OFFER") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0.equals("HIRED") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        if (r0.equals("INTERVIEW") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        r0 = r3.getCandidateStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        r0 = r0.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        if (defpackage.wl7.b(r0, "VIEWED") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
    
        r0 = r3.getCandidateStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        r1 = r0.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (defpackage.wl7.b(r1, "CONTACTING") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bb, code lost:
    
        return y(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
    
        return r3.getSelfReportedStatus().getStatus();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String F(com.indeed.android.myjobs.data.model.dto.SavedJobsDto r3) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u63.F(com.indeed.android.myjobs.data.model.dto.SavedJobsDto):java.lang.String");
    }

    public static final String G(Context context, SavedJobsDto savedJobsDto) {
        context.getClass();
        savedJobsDto.getClass();
        Event5722DTO event5722DTO = savedJobsDto.getEvent5722DTO();
        if (event5722DTO != null) {
            Boolean boolIsApplicationImpacted = event5722DTO.isApplicationImpacted();
            Boolean bool = Boolean.TRUE;
            if (wl7.b(boolIsApplicationImpacted, bool)) {
                return !wl7.b(event5722DTO.isJobHosted(), bool) ? context.getString(R.string.my_jobs_error_message_tpia) : savedJobsDto.isJobExpired() ? context.getString(R.string.my_jobs_error_message_hosted_expired) : context.getString(R.string.my_jobs_error_message_hosted_active);
            }
        }
        return null;
    }

    public static oh7 H(Collection collection) {
        collection.getClass();
        return new oh7(0, collection.size() - 1, 1);
    }

    public static final ex7 I(v03 v03Var) {
        ex7 ex7Var = (ex7) v03Var.h1(ex7.a.a);
        if (ex7Var != null) {
            return ex7Var;
        }
        ja.i(v03Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static int J(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final String K() {
        List<String> listA0 = a0("droid_native_myjobs", "droid_native_myjobs_nonia", "droid_save_continue_btn_tst", "droid_native_myjobs_suggest_hires", "droid_native_myjobs_primary_subtab_tst", "droid_native_myjobs_for_pro", "droid_native_myjobs_top_choice_features", "droid_native_myjobs_mads", "droid_myjobs_shared_hire_tst", "droid_native_myjobs_buttons_api_migration", "jsj_ifl7_tst", "droid_native_myjobs_ghosted_application_signals_tst", "droid_native_myjobs_application_insights_tst", "droidnative_myjobs_next_steps_dashboard", "myjobs_nexus_ai_recruiter_tog");
        ArrayList arrayList = new ArrayList();
        for (String str : listA0) {
            arrayList.add(str + ((kr7) cr8.p(kr7.class)).e(str).a);
        }
        return z92.W0(arrayList, ",", null, null, null, 62);
    }

    public static final ViewParent L(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final j7f M(int i) {
        boolean zI = i6a.i();
        j7f j7fVar = j7f.c;
        j7f j7fVar2 = j7f.d;
        j7f j7fVar3 = j7f.e;
        j7f j7fVar4 = j7f.a;
        return zI ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? j7fVar4 : j7fVar3 : j7fVar2 : j7fVar : j7f.b : j7fVar4 : i != 0 ? i != 1 ? i != 2 ? i != 3 ? j7fVar4 : j7fVar3 : j7fVar2 : j7fVar : j7fVar4;
    }

    public static final String N(int i) {
        return i6a.i() ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "Archived" : "Interview" : "Applied" : "Invitations" : "Saved" : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "Archived" : "Interview" : "Applied" : "Saved";
    }

    public static final long O(SavedJobsDto savedJobsDto) {
        savedJobsDto.getClass();
        if (((int) savedJobsDto.getApplyTime()) != 0) {
            return savedJobsDto.getApplyTime();
        }
        UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
        return userJobStatus != null ? userJobStatus.getTimestamp() : System.currentTimeMillis();
    }

    public static void P(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void Q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        P(jArr, jArr4);
        P(jArr2, jArr5);
        R(jArr4[0], jArr5[0], jArr3, 0);
        R(jArr4[1], jArr5[1], jArr3, 1);
        R(jArr4[2], jArr5[2], jArr3, 2);
        R(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        R(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        R(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        R(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        R(j, j3, jArr6, 0);
        R(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = (j5 ^ j6) ^ jArr3[3];
        jArr3[3] = j9;
        long j10 = (j6 ^ j7) ^ jArr3[4];
        jArr3[4] = j10;
        long j11 = j7 ^ jArr3[5];
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 60);
        jArr3[1] = (j13 >>> 4) ^ (j8 << 56);
        jArr3[2] = (j8 >>> 8) ^ (j9 << 52);
        jArr3[3] = (j9 >>> 12) ^ (j10 << 48);
        jArr3[4] = (j10 >>> 16) ^ (j11 << 44);
        jArr3[5] = (j11 >>> 20) ^ (j14 << 40);
        jArr3[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr3[7] = j15 >>> 28;
    }

    public static void R(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (1152921504606846975L & j7);
        int i5 = i + 1;
        jArr[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j8) << 4) ^ (j7 >>> 60)) ^ jArr[i5];
    }

    public static void S(long[] jArr, long[] jArr2) {
        wab.j(0, jArr[0], jArr2);
        wab.j(2, jArr[1], jArr2);
        wab.j(4, jArr[2], jArr2);
        long j = jArr[3];
        jArr2[6] = wab.i((int) j);
        jArr2[7] = ((long) wab.h((int) (j >>> 32))) & 4294967295L;
    }

    public static o74 T(ex7 ex7Var, bz7 bz7Var) {
        return ex7Var instanceof d78 ? ((d78) ex7Var).L(true, bz7Var) : ex7Var.v(bz7Var.i(), true, new wy7(1, bz7Var, bz7.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean U(v03 v03Var) {
        ex7 ex7Var = (ex7) v03Var.h1(ex7.a.a);
        if (ex7Var != null) {
            return ex7Var.isActive();
        }
        return true;
    }

    public static final boolean V(SavedJobsDto savedJobsDto) {
        savedJobsDto.getClass();
        ra8 ra8Var = i6a.a;
        if (((kr7) cr8.p(kr7.class)).e("myjobs_nexus_ai_recruiter_tog").a >= 1) {
            String aiRecruiterWorkflowResumeUrl = savedJobsDto.getAiRecruiterWorkflowResumeUrl();
            if (aiRecruiterWorkflowResumeUrl == null) {
                aiRecruiterWorkflowResumeUrl = "";
            }
            boolean z = zve.s0(aiRecruiterWorkflowResumeUrl).toString().length() > 0;
            Long aiRecruiterWorkflowStartTimestampMs = savedJobsDto.getAiRecruiterWorkflowStartTimestampMs();
            boolean z2 = (aiRecruiterWorkflowStartTimestampMs != null ? aiRecruiterWorkflowStartTimestampMs.longValue() : 0L) > 0;
            Long aiRecruiterWorkflowExpiresAtMs = savedJobsDto.getAiRecruiterWorkflowExpiresAtMs();
            if (aiRecruiterWorkflowExpiresAtMs != null) {
                long jLongValue = aiRecruiterWorkflowExpiresAtMs.longValue();
                if (z && z2 && System.currentTimeMillis() <= jLongValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (d[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static final uqe X(e13 e13Var, v03 v03Var, i13 i13Var, Function2 function2) {
        v03 v03VarB = x03.b(e13Var, v03Var);
        i13Var.getClass();
        uqe lt8Var = i13Var == i13.b ? new lt8(v03VarB, function2) : new uqe(v03VarB, true);
        lt8Var.l0(i13Var, lt8Var, function2);
        return lt8Var;
    }

    public static /* synthetic */ uqe Y(e13 e13Var, v03 v03Var, i13 i13Var, Function2 function2, int i) {
        if ((i & 1) != 0) {
            v03Var = vr4.a;
        }
        if ((i & 2) != 0) {
            i13Var = i13.a;
        }
        return X(e13Var, v03Var, i13Var, function2);
    }

    public static List Z(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List a0(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return zr4.a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List b0(Object obj) {
        return obj != null ? Z(obj) : zr4.a;
    }

    public static void c0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        Q(jArr, jArr2, jArr4);
        h0(jArr4, jArr3);
    }

    public static ArrayList d0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new xs0(objArr, true));
    }

    public static final void e(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        gu5 gu5Var3;
        gu5 gu5Var4;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -16525442);
        int i2 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        int i3 = 0;
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            rm0.a(R.drawable.app_rating_splash, ak2.I(R.string.app_rating_dialog_multi_splash_title, cVarC), null, ak2.I(R.string.app_rating_dialog_multi_splash_button_yes, cVarC), ak2.I(R.string.app_rating_dialog_multi_splash_button_no, cVarC), gu5Var3, gu5Var4, cVarC, (i2 << 15) & 4128768, 4);
        } else {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new sm0(i, i3, gu5Var3, gu5Var4);
        }
    }

    public static final List e0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Z(list.get(0)) : zr4.a;
    }

    public static qy7 f() {
        return new qy7(null);
    }

    public static qs9 f0(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            r40.h("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    qs9 qs9Var = new qs9();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    qs9Var.b = byteBufferDuplicate;
                    qs9Var.a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    qs9Var.c = i6;
                    qs9Var.d = qs9Var.b.getShort(i6);
                    return qs9Var;
                }
            }
        }
        r40.h("Cannot read metadata.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(defpackage.kb2 r36, defpackage.nzf r37, defpackage.ede r38, defpackage.ah2 r39, androidx.compose.runtime.b r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u63.g(kb2, nzf, ede, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final Object g0(Object obj) {
        return obj instanceof rf2 ? r7d.a(((rf2) obj).a) : obj;
    }

    public static final ArrayList h(Object obj, gk0 gk0Var, List list, List list2) throws IOException {
        ds3 x5gVar;
        Object objA;
        List<Pair> list3 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
        boolean z = false;
        for (Pair pair : list3) {
            ExpectedType expectedType = (ExpectedType) pair.a();
            owf owfVar = (owf) pair.b();
            SingleType[] possibleTypes = expectedType.getA();
            int length = possibleTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    x5gVar = z67.a;
                    break;
                }
                SingleType singleType = possibleTypes[i];
                if (z) {
                    x5gVar = new x5g(obj, owfVar, gk0Var);
                    break;
                }
                if (singleType.a.a().n(obj) || (obj instanceof Dynamic)) {
                    try {
                        objA = (!owfVar.b() || (obj instanceof Dynamic)) ? owfVar.a(obj, gk0Var, true) : obj;
                    } catch (Throwable unused) {
                        objA = null;
                    }
                    if (objA != null) {
                        x5gVar = new yy2(objA);
                        break;
                    }
                }
                i++;
            }
            if (x5gVar instanceof yy2) {
                z = true;
            }
            arrayList.add(x5gVar);
        }
        if (z) {
            return arrayList;
        }
        throw new TypeCastException("Cannot cast '" + obj + "' to 'Either<" + z92.W0(list2, ", ", null, null, new xi(5), 30) + ">'");
    }

    public static void h0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    public static final void i(loe loeVar) {
        int i = loeVar.d;
        int[] iArr = loeVar.b;
        Object[] objArr = loeVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        loeVar.a = false;
        loeVar.d = i2;
    }

    public static final Object i0(v03 v03Var, Function2 function2) throws Throwable {
        d05 d05VarA;
        v03 v03VarA;
        long jR1;
        Thread threadCurrentThread = Thread.currentThread();
        qu2.a aVar = qu2.a.a;
        qu2 qu2Var = (qu2) v03Var.h1(aVar);
        vr4 vr4Var = vr4.a;
        if (qu2Var == null) {
            d05VarA = ukf.a();
            v03VarA = x03.a(vr4Var, v03Var.d1(d05VarA), true);
            eq3 eq3Var = a74.a;
            if (v03VarA != eq3Var && v03VarA.h1(aVar) == null) {
                v03VarA = v03VarA.d1(eq3Var);
            }
        } else {
            d05VarA = ukf.a.get();
            v03VarA = x03.a(vr4Var, v03Var, true);
            eq3 eq3Var2 = a74.a;
            if (v03VarA != eq3Var2 && v03VarA.h1(aVar) == null) {
                v03VarA = v03VarA.d1(eq3Var2);
            }
        }
        wh1 wh1Var = new wh1(v03VarA, threadCurrentThread, d05VarA);
        wh1Var.l0(i13.a, wh1Var, function2);
        d05 d05Var = wh1Var.e;
        if (d05Var != null) {
            int i = d05.f;
            d05Var.O1(false);
        }
        while (true) {
            if (d05Var != null) {
                try {
                    jR1 = d05Var.R1();
                } catch (Throwable th) {
                    if (d05Var != null) {
                        int i2 = d05.f;
                        d05Var.J1(false);
                    }
                    throw th;
                }
            } else {
                jR1 = Long.MAX_VALUE;
            }
            if (wh1Var.o0()) {
                break;
            }
            LockSupport.parkNanos(wh1Var, jR1);
            if (Thread.interrupted()) {
                wh1Var.q(new InterruptedException());
            }
        }
        if (d05Var != null) {
            int i3 = d05.f;
            d05Var.J1(false);
        }
        Object objR = pnb.R(d78.a.get(wh1Var));
        rf2 rf2Var = objR instanceof rf2 ? (rf2) objR : null;
        if (rf2Var == null) {
            return objR;
        }
        throw rf2Var.a;
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static ArrayList k(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new xs0(objArr, true));
    }

    public static tme k0(n55 n55Var, boolean z, boolean z2) {
        tme tmeVar;
        int i;
        long j;
        int i2;
        long jR;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int[] iArr;
        long length = n55Var.getLength();
        long j2 = -1;
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i6 != 0 && length <= 4096) {
            j3 = length;
        }
        int i7 = (int) j3;
        g4b g4bVar = new g4b(64);
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (i9 < i7) {
            g4bVar.G(8);
            if (!n55Var.d(g4bVar.a, i8, 8, true)) {
                break;
            }
            long jZ = g4bVar.z();
            int iJ = g4bVar.j();
            if (jZ == 1) {
                j = j2;
                n55Var.h(8, g4bVar.a, 8);
                i4 = 16;
                g4bVar.I(16);
                i2 = i9;
                jR = g4bVar.r();
                i3 = i6;
            } else {
                j = j2;
                if (jZ == 0) {
                    long length2 = n55Var.getLength();
                    if (length2 != j) {
                        jZ = (length2 - n55Var.j()) + 8;
                    }
                }
                long j4 = jZ;
                i2 = i9;
                jR = j4;
                i3 = i6;
                i4 = 8;
            }
            long j5 = i4;
            tmeVar = null;
            int i10 = 12;
            if (jR < j5) {
                return new hh2(i10);
            }
            int i11 = i2 + i4;
            if (iJ == 1836019574) {
                i7 += (int) jR;
                if (i3 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                i9 = i11;
                i6 = i3;
                j2 = j;
                i8 = 0;
            } else {
                if (iJ == 1836019558 || iJ == 1836475768) {
                    i = 1;
                    break;
                }
                if (iJ == 1835295092) {
                    z4 = true;
                }
                long j6 = length;
                if ((((long) i11) + jR) - j5 >= i7) {
                    i = 0;
                    break;
                }
                int i12 = (int) (jR - j5);
                i9 = i11 + i12;
                if (iJ != 1718909296) {
                    i5 = 0;
                    if (i12 != 0) {
                        n55Var.k(i12);
                    }
                } else {
                    if (i12 < 8) {
                        return new hh2(12);
                    }
                    g4bVar.G(i12);
                    i5 = 0;
                    n55Var.h(0, g4bVar.a, i12);
                    if (W(g4bVar.j(), z2)) {
                        z4 = true;
                    }
                    g4bVar.K(4);
                    int iA = g4bVar.a() / 4;
                    if (!z4 && iA > 0) {
                        iArr = new int[iA];
                        int i13 = 0;
                        while (true) {
                            if (i13 >= iA) {
                                z3 = z4;
                                break;
                            }
                            int iJ2 = g4bVar.j();
                            iArr[i13] = iJ2;
                            if (W(iJ2, z2)) {
                                z3 = true;
                                break;
                            }
                            i13++;
                        }
                    } else {
                        z3 = z4;
                        iArr = null;
                    }
                    if (!z3) {
                        n7g n7gVar = new n7g();
                        if (iArr == null) {
                            b47 b47Var = b47.a;
                            return n7gVar;
                        }
                        if (iArr.length == 0) {
                            b47 b47Var2 = b47.a;
                            return n7gVar;
                        }
                        new b47(Arrays.copyOf(iArr, iArr.length));
                        return n7gVar;
                    }
                    z4 = z3;
                }
                i8 = i5;
                i6 = i3;
                j2 = j;
                length = j6;
            }
        }
        tmeVar = null;
        i = i8;
        return !z4 ? mh2.Z : z != i ? i != 0 ? wg2.X : wg2.Y : tmeVar;
    }

    public static yr3 l(e13 e13Var, k89 k89Var, Function2 function2, int i) {
        v03 v03Var = k89Var;
        if ((i & 1) != 0) {
            v03Var = vr4.a;
        }
        yr3 yr3Var = new yr3(x03.b(e13Var, v03Var), true);
        yr3Var.l0(i13.a, yr3Var, function2);
        return yr3Var;
    }

    public static void l0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        S(jArr, jArr3);
        h0(jArr3, jArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, h, yv8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(defpackage.kv8 r5, defpackage.pu2 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.g
            if (r0 == 0) goto L13
            r0 = r6
            g r0 = (defpackage.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            g r0 = new g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r5 = r0.L$1
            luc r5 = (defpackage.luc) r5
            java.lang.Object r0 = r0.L$0
            kv8 r0 = (defpackage.kv8) r0
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L75
        L2d:
            r6 = move-exception
            goto L86
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L36:
            defpackage.r7d.b(r6)
            kv8$b r6 = r5.b()
            kv8$b r1 = kv8.b.d
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L48
            j6g r5 = defpackage.j6g.a
            return r5
        L48:
            luc r6 = new luc
            r6.<init>()
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L81
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L81
            r0.label = r2     // Catch: java.lang.Throwable -> L81
            qw1 r1 = new qw1     // Catch: java.lang.Throwable -> L81
            lu2 r0 = defpackage.ewa.v(r0)     // Catch: java.lang.Throwable -> L81
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L81
            r1.q()     // Catch: java.lang.Throwable -> L81
            h r0 = new h     // Catch: java.lang.Throwable -> L81
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L81
            r6.element = r0     // Catch: java.lang.Throwable -> L81
            r5.a(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r1.p()     // Catch: java.lang.Throwable -> L81
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r5
            r5 = r6
        L75:
            T r5 = r5.element
            yv8 r5 = (defpackage.yv8) r5
            if (r5 == 0) goto L7e
            r0.c(r5)
        L7e:
            j6g r5 = defpackage.j6g.a
            return r5
        L81:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L86:
            T r5 = r5.element
            yv8 r5 = (defpackage.yv8) r5
            if (r5 == 0) goto L8f
            r0.c(r5)
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u63.m(kv8, pu2):java.lang.Object");
    }

    public static void m0(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        S(jArr, jArr3);
        h0(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            S(jArr2, jArr3);
            h0(jArr3, jArr2);
        }
    }

    public static int n(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            l5.q(bg.d(size, "fromIndex (0) is greater than toIndex (", ")."));
        } else if (size > size2) {
            l5.s(w40.e("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = ak2.i((Comparable) arrayList.get(i3), comparable);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void n0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void o(v03 v03Var, CancellationException cancellationException) {
        ex7 ex7Var = (ex7) v03Var.h1(ex7.a.a);
        if (ex7Var != null) {
            ex7Var.h(cancellationException);
        }
    }

    public static void o0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Object p(ex7 ex7Var, c1f c1fVar) {
        ex7Var.h(null);
        Object objS0 = ex7Var.s0(c1fVar);
        return objS0 == g13.a ? objS0 : j6g.a;
    }

    public static final BrandedAdsLoggingRequestParams p0(BrandedAdsDto brandedAdsDto, String str) {
        brandedAdsDto.getClass();
        str.getClass();
        return new BrandedAdsLoggingRequestParams(str, brandedAdsDto.getCreativeKeyval(), brandedAdsDto.getMobtk(), brandedAdsDto.getFccKey(), brandedAdsDto.getFlowPage(), brandedAdsDto.getFlowType(), brandedAdsDto.getLogLabel(), null);
    }

    public static byte q(long j) {
        pnb.q((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static final Object q0(v03 v03Var, Function2 function2, lu2 lu2Var) throws Throwable {
        v03 context = lu2Var.getContext();
        v03 v03VarD1 = !((Boolean) v03Var.j1(Boolean.FALSE, new fj2(1, (byte) 0))).booleanValue() ? context.d1(v03Var) : x03.a(context, v03Var, false);
        u(v03VarD1);
        if (v03VarD1 == context) {
            vpd vpdVar = new vpd(lu2Var, v03VarD1);
            return a6g.a(vpdVar, true, vpdVar, function2);
        }
        qu2.a aVar = qu2.a.a;
        if (wl7.b(v03VarD1.h1(aVar), context.h1(aVar))) {
            z5g z5gVar = new z5g(lu2Var, v03VarD1);
            v03 v03Var2 = z5gVar.c;
            Object objC = rkf.c(v03Var2, null);
            try {
                return a6g.a(z5gVar, true, z5gVar, function2);
            } finally {
                rkf.a(v03Var2, objC);
            }
        }
        w64 w64Var = new w64(lu2Var, v03VarD1);
        try {
            mh2.w(ewa.v(ewa.s(w64Var, w64Var, function2)), j6g.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = w64.e;
            do {
                int i = atomicIntegerFieldUpdater.get(w64Var);
                if (i != 0) {
                    if (i != 2) {
                        r6.g("Already suspended");
                        return null;
                    }
                    Object objR = pnb.R(d78.a.get(w64Var));
                    if (objR instanceof rf2) {
                        throw ((rf2) objR).a;
                    }
                    return objR;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(w64Var, 0, 1));
            return g13.a;
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            w64Var.resumeWith(r7d.a(th));
            throw th;
        }
    }

    public static final double r(int i, int i2, int i3, int i4, tmd tmdVar) {
        double d2 = ((double) i3) / ((double) i);
        double d3 = ((double) i4) / ((double) i2);
        int iOrdinal = tmdVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d2, d3);
        }
        if (iOrdinal == 1) {
            return Math.min(d2, d3);
        }
        l.g();
        return 0.0d;
    }

    public static iy8 s() {
        return new iy8(10);
    }

    public static brg t(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (brg) objNewInstance;
        } catch (IllegalAccessException e2) {
            l6.p(m6.f(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (InstantiationException e3) {
            l6.p(m6.f(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (NoSuchMethodException e4) {
            l6.p(m6.f(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    public static final void u(v03 v03Var) {
        ex7 ex7Var = (ex7) v03Var.h1(ex7.a.a);
        if (ex7Var != null && !ex7Var.isActive()) {
            throw ex7Var.G();
        }
    }

    public static final ArrayList v(ArrayList arrayList, boolean z, Function1 function1) {
        function1.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - 1209600000;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Number) function1.invoke((SavedJobsDto) obj)).longValue() < jCurrentTimeMillis) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) function1.invoke((SavedJobsDto) obj2)).longValue() >= jCurrentTimeMillis) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public static final ArrayList w(List list, boolean z) {
        list.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - 1209600000;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SavedJobsDto) obj).getTimeStamp() < jCurrentTimeMillis) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((SavedJobsDto) obj2).getTimeStamp() >= jCurrentTimeMillis) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final i74 x(SavedJobsDto savedJobsDto) {
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
        return new i74(Long.valueOf(userJobStatus.getTimestamp()), userJobStatus.getStatus(), str);
    }

    public static final String y(SavedJobsDto savedJobsDto) {
        ArrayList arrayList = new ArrayList();
        if (savedJobsDto.getCandidateStatus() != null) {
            arrayList.add(savedJobsDto.getCandidateStatus());
        }
        if (savedJobsDto.getSelfReportedStatus() != null) {
            arrayList.add(savedJobsDto.getSelfReportedStatus());
        }
        if (arrayList.size() == 0) {
            return "APPLIED";
        }
        if (arrayList.size() > 1) {
            w92.E0(new gkg(), arrayList);
        }
        return ((UserJobStatus) arrayList.get(0)).getStatus();
    }

    public static final long z(SavedJobsDto savedJobsDto) {
        savedJobsDto.getClass();
        ArrayList arrayList = new ArrayList();
        if (savedJobsDto.getCandidateStatus() != null) {
            arrayList.add(savedJobsDto.getCandidateStatus());
        }
        if (savedJobsDto.getSelfReportedStatus() != null) {
            arrayList.add(savedJobsDto.getSelfReportedStatus());
        }
        if (arrayList.size() == 0) {
            return 0L;
        }
        if (arrayList.size() > 1) {
            w92.E0(new hkg(), arrayList);
        }
        return ((UserJobStatus) arrayList.get(0)).getTimestamp();
    }

    @Override // defpackage.s63
    public void a(Context context, c06 c06Var, CancellationSignal cancellationSignal, xr0 xr0Var, kk0 kk0Var) {
        context.getClass();
        c06Var.getClass();
        x63 x63Var = new x63(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            y63 y63Var = new y63(context);
            w63VarA = y63Var.isAvailableOnDevice() ? y63Var : null;
            if (w63VarA == null) {
                w63VarA = x63Var.a();
            }
        } else if (i <= 33) {
            w63VarA = x63Var.a();
        }
        w63 w63Var = w63VarA;
        if (w63Var == null) {
            kk0Var.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
        } else {
            w63Var.onGetCredential(context, c06Var, cancellationSignal, xr0Var, kk0Var);
        }
    }

    @Override // defpackage.b6d
    public f5d c(f5d f5dVar, ova ovaVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((v86) f5dVar.get()).a.a.a.d.asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = pr1.a;
        pr1.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new pr1.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new yr1(bArrArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // defpackage.rqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] d(java.lang.StackTraceElement[] r14) {
        /*
            r13 = this;
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            int r0 = r14.length
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1 = 0
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r2
        Ld:
            int r6 = r14.length
            if (r3 >= r6) goto L61
            r6 = r14[r3]
            java.lang.Object r7 = r13.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L4f
            int r8 = r7.intValue()
            int r9 = r3 - r8
            int r10 = r3 + r9
            int r11 = r14.length
            if (r10 <= r11) goto L26
            goto L4f
        L26:
            r10 = r1
        L27:
            if (r10 >= r9) goto L3b
            int r11 = r8 + r10
            r11 = r14[r11]
            int r12 = r3 + r10
            r12 = r14[r12]
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L38
            goto L4f
        L38:
            int r10 = r10 + 1
            goto L27
        L3b:
            int r7 = r7.intValue()
            int r7 = r3 - r7
            r8 = 10
            if (r5 >= r8) goto L4b
            java.lang.System.arraycopy(r14, r3, r0, r4, r7)
            int r4 = r4 + r7
            int r5 = r5 + 1
        L4b:
            int r7 = r7 + (-1)
            int r7 = r7 + r3
            goto L57
        L4f:
            r5 = r14[r3]
            r0[r4] = r5
            int r4 = r4 + 1
            r5 = r2
            r7 = r3
        L57:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.put(r6, r3)
            int r3 = r7 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r13 = new java.lang.StackTraceElement[r4]
            java.lang.System.arraycopy(r0, r1, r13, r1, r4)
            int r0 = r14.length
            if (r4 >= r0) goto L6a
            return r13
        L6a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u63.d(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 7:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzl());
            case 8:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zzs());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list3 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).zzi());
            case 10:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((cii) zhi.b.zza()).zza());
            case 11:
                List<svh<?>> list5 = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).b());
            default:
                List<svh<?>> list6 = djh.a;
                return Boolean.valueOf(((xii) uii.b.zza()).zza());
        }
    }
}
