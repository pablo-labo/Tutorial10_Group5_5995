package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.microsoft.codepush.react.a;
import com.microsoft.codepush.react.g;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
@fd8
public class c0h implements EventDispatcher, nvh, hna {
    public static final c0h V;
    public static final ah2 X;
    public static final ah2 Y;
    public static final ah2 Z;
    public static final int b = 9;
    public static final int c = 6;
    public static final int d = 10;
    public static final int e = 5;
    public static final int f = 15;
    public static int p0;
    public final /* synthetic */ int a;
    public static final ah2 W = new ah2(-1213877460, new zj2(), false);
    public static final c0h a0 = new c0h(3);
    public static final w37 b0 = new w37(false);
    public static final kd9 c0 = new kd9("STRIKETHROUGH");
    public static final kd9 d0 = new kd9("TABLE");
    public static final kd9 e0 = new kd9("HEADER");
    public static final kd9 f0 = new kd9("ROW");
    public static final kd9 g0 = new kd9("INLINE_MATH");
    public static final kd9 h0 = new kd9("BLOCK_MATH");
    public static final c0h i0 = new c0h(6);
    public static final int[] j0 = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] k0 = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] l0 = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
    public static final c0h m0 = new c0h(8);
    public static final c0h n0 = new c0h(9);
    public static final c0h o0 = new c0h(10);

    static {
        int i = 1;
        V = new c0h(i);
        int i2 = 2;
        X = new ah2(-153324159, new jm0(i2), false);
        Y = new ah2(-797021283, new vj2(i), false);
        Z = new ah2(1668016787, new fn0(i2, (byte) 0), false);
    }

    public /* synthetic */ c0h(int i) {
        this.a = i;
    }

    public static final boolean A(d4c d4cVar) {
        d4cVar.getClass();
        return d4cVar.c() == null;
    }

    public static final boolean B() {
        return ((kr7) cr8.p(kr7.class)).e("prof_tabbed_exp_resume_data_import").a >= 1;
    }

    public static final boolean C() {
        return (((kr7) cr8.p(kr7.class)).e("droid_datadog_monitoring_tst").a == 1) && (((kr7) cr8.p(kr7.class)).e("droid_datadog_rum_parent").a == 1) && (((kr7) cr8.p(kr7.class)).e("droid_rich_profile_datadog_rum_tst").a == 2);
    }

    public static final boolean D() {
        return ((kr7) cr8.p(kr7.class)).e("droid_rn_profile").a == 2;
    }

    public static final boolean E() {
        if (F()) {
            return true;
        }
        return ((kr7) cr8.p(kr7.class)).e("jsj_crowtaxo_holdout_tst").a == 2 && ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_tst").a == 6;
    }

    public static final boolean F() {
        return ((kr7) cr8.p(kr7.class)).e("jsj_crowtaxo_holdout_tst").a == 2 && ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_tst").a == 8;
    }

    public static final boolean G() {
        return ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_resume_data_import").a >= 1;
    }

    public static final boolean H() {
        return ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_skillsets").a >= 1 && ((kr7) cr8.p(kr7.class)).e("droid_rich_profile_tst").a >= 8 && ((kr7) cr8.p(kr7.class)).e("rdp_pdf_resume_facelift").a == 1;
    }

    public static final boolean I() {
        return ((kr7) cr8.p(kr7.class)).e("profile_yoe_removal_tog").a == 1;
    }

    public static void J(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        h91.I(iArr, iArr2, iArr4);
        L(iArr4, iArr3);
    }

    public static String K(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            bufferedReader.close();
                            fileInputStream.close();
                            return string;
                        }
                        sb.append(line);
                        sb.append("\n");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (fileInputStream == null) {
                        throw th;
                    }
                    fileInputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            fileInputStream = null;
        }
    }

    public static void L(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (6803 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = (6803 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (6803 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[10]) & 4294967295L;
        long j8 = (6803 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[11]) & 4294967295L;
        long j10 = (6803 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[12]) & 4294967295L;
        long j12 = (6803 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = (6803 * j13) + j11 + (((long) iArr[6]) & 4294967295L) + (j12 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = (j14 >>> 32) + j13;
        long j16 = j15 & 4294967295L;
        long j17 = (6803 * j16) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j15 >>> 32;
        long j19 = (6803 * j18) + j16 + (((long) i2) & 4294967295L) + (j17 >>> 32);
        iArr2[1] = (int) j19;
        long j20 = j18 + (((long) i3) & 4294967295L) + (j19 >>> 32);
        iArr2[2] = (int) j20;
        long j21 = (j20 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j21;
        if (((j21 >>> 32) == 0 ? 0 : ka6.u0(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && h91.z(iArr2, j0))) {
            ka6.I(7, 6803, iArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void M(int r11, int[] r12) {
        /*
            r0 = 7
            if (r11 == 0) goto L3c
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 6803(0x1a93, double:3.361E-320)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r3 = r3 & r8
            long r1 = r1 + r3
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L3a
        L35:
            r11 = 3
            int r11 = defpackage.ka6.u0(r0, r11, r12)
        L3a:
            if (r11 != 0) goto L4a
        L3c:
            r11 = 6
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4f
            int[] r11 = defpackage.c0h.j0
            boolean r11 = defpackage.h91.z(r12, r11)
            if (r11 == 0) goto L4f
        L4a:
            r11 = 6803(0x1a93, float:9.533E-42)
            defpackage.ka6.I(r0, r11, r12)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0h.M(int, int[]):void");
    }

    public static final t52 N(xx9 xx9Var, mq5 mq5Var) {
        in9 in9VarT;
        xx9Var.getClass();
        mq5Var.getClass();
        nq5 nq5Var = mq5Var.a;
        if (!nq5Var.c()) {
            in9 in9VarN = xx9Var.S(mq5Var.b()).n();
            n8a n8aVarF = nq5Var.f();
            dia diaVar = dia.a;
            v62 v62VarD = ((d4) in9VarN).d(n8aVarF, diaVar);
            t52 t52Var = v62VarD instanceof t52 ? (t52) v62VarD : null;
            if (t52Var != null) {
                return t52Var;
            }
            t52 t52VarN = N(xx9Var, mq5Var.b());
            v62 v62VarD2 = (t52VarN == null || (in9VarT = t52VarN.T()) == null) ? null : in9VarT.d(nq5Var.f(), diaVar);
            if (v62VarD2 instanceof t52) {
                return (t52) v62VarD2;
            }
        }
        return null;
    }

    public static final void O(View view) {
        Boolean bool = (Boolean) view.getTag(R.id.original_focusability);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                O(childAt);
            }
        }
    }

    public static final boolean P(SavedJobsDto savedJobsDto) {
        savedJobsDto.getClass();
        return i6a.n() && savedJobsDto.isJobExpired();
    }

    public static dxa Q(File file) {
        Logger logger = ppa.a;
        file.getClass();
        return new dxa(new FileOutputStream(file, false), new kmf());
    }

    public static final hf7 R(File file) {
        Logger logger = ppa.a;
        file.getClass();
        return new hf7(new FileInputStream(file), kmf.d);
    }

    public static final hf7 S(InputStream inputStream) {
        Logger logger = ppa.a;
        inputStream.getClass();
        return new hf7(inputStream, new kmf());
    }

    public static void T(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        h91.N(iArr, iArr3);
        L(iArr3, iArr2);
    }

    public static void U(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        h91.N(iArr, iArr3);
        L(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h91.N(iArr2, iArr3);
            L(iArr3, iArr2);
        }
    }

    public static void V(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h91.P(iArr, iArr2, iArr3) != 0) {
            ka6.p1(7, 6803, iArr3);
        }
    }

    public static void W(File file, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    zipInputStream = new ZipInputStream(bufferedInputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            fileInputStream = null;
        }
        try {
            File file2 = new File(str);
            if (file2.exists()) {
                u(file2);
            }
            file2.mkdirs();
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    try {
                        zipInputStream.close();
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return;
                    } catch (IOException e2) {
                        a.a("Error closing IO resources.", e2);
                        return;
                    }
                }
                String name = nextEntry.getName();
                String str2 = file2.getCanonicalPath() + File.separator;
                String canonicalPath = new File(str2, name).getCanonicalPath();
                if (!canonicalPath.startsWith(str2)) {
                    r6.g("File is outside extraction target directory.");
                    canonicalPath = null;
                }
                File file3 = new File(canonicalPath);
                if (nextEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    File parentFile = file3.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    while (true) {
                        try {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i);
                            }
                        } finally {
                        }
                    }
                }
                long time = nextEntry.getTime();
                if (time > 0) {
                    file3.setLastModified(time);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (IOException e3) {
                    a.a("Error closing IO resources.", e3);
                    return;
                }
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public static final void X(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final int e(int i, j4a j4aVar) {
        int i2 = j4aVar.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = j4aVar.a;
            int i5 = ((mj7) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((mj7) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void f(ArrayList arrayList, long j) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Number) arrayList.get(i2)).longValue() < j) {
                i++;
            }
        }
        if (i > 0) {
            int i3 = size - i;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.set(i4, arrayList.get(i4 + i));
            }
            z92.K0(i, arrayList);
        }
    }

    public static final Exception g(p84 p84Var, String str, GetPublicKeyCredentialDomException getPublicKeyCredentialDomException) {
        return new GetPublicKeyCredentialDomException(p84Var, str);
    }

    public static final long h(long j, long j2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        it.getClass();
        long j3 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            long jLongValue = ((Number) next).longValue();
            if (j <= jLongValue && jLongValue < j2) {
                j3 = jLongValue;
            } else if (jLongValue >= j2) {
                break;
            }
        }
        return j3;
    }

    public static final boolean i(long j, long j2, ArrayList arrayList) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j <= jLongValue && jLongValue < j2) {
                return true;
            }
        }
        return false;
    }

    public static final tqc j(fie fieVar) {
        fieVar.getClass();
        return new tqc(fieVar);
    }

    public static final uqc k(pne pneVar) {
        pneVar.getClass();
        return new uqc(pneVar);
    }

    public static final void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
        }
    }

    public static final void n(int i, int i2) {
        if (i < 0 || i > i2) {
            l5.s(k20.l("index: ", i, i2, ", size: "));
        }
    }

    public static final void o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            v40.k(i3, uz.f("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            l5.q(k20.l("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final void p(View view) {
        Boolean bool = (Boolean) view.getTag(R.id.original_focusability);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (((View) view.getTag(R.id.accessibility_order_parent)) != null) {
            view.setTag(R.id.accessibility_order_parent, null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                p(childAt);
            }
        }
    }

    public static final void q(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                boa.h(th, th2);
            }
        }
    }

    public static void r(String str, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        File file = new File(str);
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (File file3 : file.listFiles()) {
            if (file3.isDirectory()) {
                r(g.a(str, file3.getName()), g.a(str2, file3.getName()));
            } else {
                File file4 = new File(file2, file3.getName());
                byte[] bArr = new byte[8192];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            fileOutputStream = new FileOutputStream(file4);
                            while (true) {
                                try {
                                    int i = bufferedInputStream.read(bArr);
                                    if (i <= 0) {
                                        try {
                                            break;
                                        } catch (IOException e2) {
                                            a.a("Error closing IO resources.", e2);
                                            return;
                                        }
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e3) {
                                            a.a("Error closing IO resources.", e3);
                                            return;
                                        }
                                    }
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                            fileInputStream2.close();
                            bufferedInputStream.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = null;
                        fileOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = null;
                    fileOutputStream = null;
                }
            }
        }
    }

    public static final long s(e2b e2bVar) {
        return gf9.c(e2bVar.l() * e2bVar.q()) + (((long) e2bVar.k()) * ((long) e2bVar.q()));
    }

    public static void t(String str) {
        if (str == null) {
            g.h("deleteDirectoryAtPath attempted with null directoryPath");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            u(file);
        }
    }

    public static void u(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    u(file2);
                } else {
                    file2.delete();
                }
            }
        }
        if (file.delete()) {
            return;
        }
        g.h("Error deleting file " + file.getName());
    }

    public static final void v(View view, List list) {
        if (!z92.I0(list, view.getTag(R.id.view_tag_native_id))) {
            if (view.getTag(R.id.original_focusability) == null) {
                view.setTag(R.id.original_focusability, Boolean.valueOf(view.isFocusable()));
            }
            view.setFocusable(false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                v(childAt, list);
            }
        }
    }

    public static final void w(q1a q1aVar, ww1 ww1Var, sn1 sn1Var, float f2, vbe vbeVar, odf odfVar, ib4 ib4Var) {
        ArrayList arrayList = q1aVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f3b f3bVar = (f3b) arrayList.get(i);
            f3bVar.a.k(ww1Var, sn1Var, f2, vbeVar, odfVar, ib4Var);
            ww1Var.f(0.0f, f3bVar.a.d());
        }
    }

    public static boolean x(String str) {
        return new File(str).exists();
    }

    public static final v62 y(aj3 aj3Var) {
        aj3 aj3VarD = aj3Var.d();
        if (aj3VarD == null || (aj3Var instanceof lya)) {
            return null;
        }
        if (!(aj3VarD.d() instanceof lya)) {
            return y(aj3VarD);
        }
        if (aj3VarD instanceof v62) {
            return (v62) aj3VarD;
        }
        return null;
    }

    public static final boolean z(AssertionError assertionError) {
        Logger logger = ppa.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? zve.L(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a(ox4 ox4Var) {
        ox4Var.getClass();
        s55.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + ox4Var.getEventName());
    }

    @Override // defpackage.hna
    public Object b() {
        return new ArrayDeque();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @sy3
    public void c() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d9a d9aVar) {
    }

    public void l(View view, List list, View[] viewArr) {
        int iIndexOf;
        list.getClass();
        Object tag = view.getTag(R.id.view_tag_native_id);
        view.setTag(R.id.accessibility_order_parent, this);
        if (z92.I0(list, tag) && (iIndexOf = list.indexOf(tag)) != -1) {
            viewArr[iIndexOf] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                l(childAt, list, viewArr);
            }
        }
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 8:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).f());
            case DatadogLogGenerator.CRASH /* 9 */:
                List<svh<?>> list2 = djh.a;
                return Boolean.valueOf(((uci) oci.b.zza()).zzb());
            default:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((pgi) qgi.b.zza()).zzd());
        }
    }
}
